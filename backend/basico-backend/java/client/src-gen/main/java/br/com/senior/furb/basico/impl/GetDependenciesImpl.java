/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico.impl;

import java.util.function.Supplier;

import br.com.senior.messaging.ErrorCategory;
import br.com.senior.messaging.ErrorPayload;
import br.com.senior.messaging.IMessenger;
import br.com.senior.messaging.Message;
import br.com.senior.messaging.utils.DtoJsonConverter;
import br.com.senior.sdl.user.UserIdentifier;			

import br.com.senior.furb.basico.*;
import java.util.concurrent.CompletableFuture;

import br.com.senior.messaging.model.ServiceContext;
import br.com.senior.messaging.model.ServiceException;
import br.com.senior.messaging.model.ServiceRunner;
import br.com.senior.furb.basico.GetDependenciesOutput;

/**
 * 
 */
public class GetDependenciesImpl {

	private final Supplier<IMessenger> messengerSupplier;

	private final UserIdentifier userId;

	private final Supplier<Message> messageSupplier;

	public GetDependenciesImpl(Supplier<IMessenger> messengerSupplier, UserIdentifier userId, Supplier<Message> messageSupplier) {
		this.messengerSupplier = messengerSupplier;
		this.userId = userId;
		this.messageSupplier = messageSupplier;
	}

	private Message createMessage() {
		if (messageSupplier != null && messageSupplier.get() != null) {
			return messageSupplier.get().followUp( //
				BasicoConstants.DOMAIN, //
				BasicoConstants.SERVICE, //
				BasicoConstants.Commands.GET_DEPENDENCIES, //
				new byte[0]);
		}
		return new Message(userId.getTenant(), //
			BasicoConstants.DOMAIN, //
			BasicoConstants.SERVICE, //
			BasicoConstants.Commands.GET_DEPENDENCIES, //
			new byte[0]);
	}
	
	/**
	* Chamada síncrona para o método getDependencies
	* This is a public operation
	* Returns a list with all dependencies from this service, along with their respective versions 
	* @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	*/
	public GetDependenciesOutput getDependencies(long timeout) {
		Message message = createMessage();
		Message resultMessage; 
		try {
			addMessageHeaders(message);
			resultMessage = messengerSupplier.get().requestSync(message, timeout);
			messengerSupplier.get().ack(resultMessage);
		} catch (Exception e) {
			throw new BasicoException("Erro ao enviar a mensagem", e);
		}
		
		if (resultMessage == null) {
			throw new BasicoException("Retorno inválido");
		}
		
		if (resultMessage.isError()) {
			ErrorPayload error = DtoJsonConverter.toDTO(resultMessage.getContent(), ErrorPayload.class);
			throw new BasicoMessageException(resultMessage.getErrorCategory(), error.getMessage(), error.getErrorCode());
		}
		GetDependenciesOutput output = DtoJsonConverter.toDTO(resultMessage.getContent(), GetDependenciesOutput.class);
		if (output == null) {
			throw new BasicoException("Contéudo do retorno inválido");
		}
		return output;
	}
	
	/**
	* Chamada assíncrona para o método getDependencies
	* This is a public operation
	* Returns a list with all dependencies from this service, along with their respective versions
	*/
	public void getDependencies() {
		Message message = createMessage();
		try {
			addMessageHeaders(message);
			messengerSupplier.get().send(message);
		} catch (Exception e) {
			throw new BasicoException("Erro ao enviar a mensagem", e);
		}
	}
	
	/**
	* Chamada assíncrona para o método getDependencies
	* This is a public operation
	* Returns a list with all dependencies from this service, along with their respective versions
	*/
	public CompletableFuture<GetDependenciesOutput> getDependenciesRequest() {
	
		if (ServiceContext.get() == null) {
			throw new ServiceException(ErrorCategory.INTERNAL_ERROR, "Service Context não iniciado. Erro ao efetuar request da mensagem");
		}
		ServiceRunner serviceRunner = ServiceContext.get().getCurrentServiceRunner();
		Message message = createMessage();
		addMessageHeaders(message);
		return serviceRunner.request(message, GetDependenciesOutput.class);
	}
	private void addMessageHeaders(Message message) {
		message.setUsername(userId.getUsername());
		if (userId.isTrusted()) {
			message.addHeader("trusted", true);
		}
	}
}
