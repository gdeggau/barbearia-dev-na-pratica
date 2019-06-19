/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import java.util.function.Supplier;

import br.com.senior.messaging.Message;
import br.com.senior.messaging.IMessenger;
import br.com.senior.messaging.utils.DtoJsonConverter;
import br.com.senior.sdl.user.UserIdentifier;

import java.util.concurrent.CompletableFuture;
import br.com.senior.furb.basico.HelloWorldInput;
import br.com.senior.furb.basico.HelloWorldOutput;
import br.com.senior.furb.basico.ObterUrlUploadFotoInput;
import br.com.senior.furb.basico.ObterUrlUploadFotoOutput;
import br.com.senior.furb.basico.GravarFotoInput;
import br.com.senior.furb.basico.GravarFotoOutput;
import br.com.senior.furb.basico.ObterUrlDownloadFotoInput;
import br.com.senior.furb.basico.ObterUrlDownloadFotoOutput;
import br.com.senior.furb.basico.GetMetadataInput;
import br.com.senior.furb.basico.GetMetadataOutput;
import br.com.senior.furb.basico.GetDependenciesOutput;
import br.com.senior.furb.basico.ServiceStartedPayload;
import br.com.senior.furb.basico.NotifyUserEventPayload;

import br.com.senior.furb.basico.BasicoValidator;
import br.com.senior.furb.basico.BasicoException;
import br.com.senior.furb.basico.BasicoConstants;

/**
* 
*/
public class BasicoStubImpl  implements BasicoStub {

	protected final Supplier<IMessenger> messengerSupplier;
	protected final UserIdentifier userId;
	protected final Supplier<Message> messageSupplier;

	/**
	 * Use {@link #BasicoStubImpl(MessengerSupplier, UserIdentifier, MessageSupplier)} instead.
	 */
	@Deprecated
	public BasicoStubImpl(IMessenger messenger, UserIdentifier userId) {
		this(new InstanceMessengerSupplier(messenger), userId, null);
	}

	/**
	 * @param messengerSupplier Supplies current service messenger.
	 * @param userId Provides tenant and user name to send or publish messages.
	 * @param messageSupplier Supplies current message being processed by service. Used to send messages by foolowup.
	 */
	public BasicoStubImpl(Supplier<IMessenger> messengerSupplier, UserIdentifier userId, Supplier<Message> messageSupplier) {
		this.messengerSupplier = messengerSupplier;
		this.userId = userId;
		this.messageSupplier = messageSupplier;
	}

	/**
	 * Chamada síncrona para o método helloWorld
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public HelloWorldOutput helloWorld(HelloWorldInput input, long timeout) {
		br.com.senior.furb.basico.impl.HelloWorldImpl impl = new br.com.senior.furb.basico.impl.HelloWorldImpl(messengerSupplier, userId, messageSupplier);
		return impl.helloWorld(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método helloWorld
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 */
	@Override
	public void helloWorld(HelloWorldInput input) {
		br.com.senior.furb.basico.impl.HelloWorldImpl impl = new br.com.senior.furb.basico.impl.HelloWorldImpl(messengerSupplier, userId, messageSupplier);
		impl.helloWorld(input);
	}
	
	/**
	 * Chamada assíncrona para o método helloWorld
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 */
	@Override
	public CompletableFuture<HelloWorldOutput> helloWorldRequest(HelloWorldInput input) {
		br.com.senior.furb.basico.impl.HelloWorldImpl impl = new br.com.senior.furb.basico.impl.HelloWorldImpl(messengerSupplier, userId, messageSupplier);
		return impl.helloWorldRequest(input);
	}
	/**
	 * Chamada síncrona para o método obterUrlUploadFoto
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * Obtém a URL para upload da foto
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public ObterUrlUploadFotoOutput obterUrlUploadFoto(ObterUrlUploadFotoInput input, long timeout) {
		br.com.senior.furb.basico.impl.ObterUrlUploadFotoImpl impl = new br.com.senior.furb.basico.impl.ObterUrlUploadFotoImpl(messengerSupplier, userId, messageSupplier);
		return impl.obterUrlUploadFoto(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método obterUrlUploadFoto
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * Obtém a URL para upload da foto
	 */
	@Override
	public void obterUrlUploadFoto(ObterUrlUploadFotoInput input) {
		br.com.senior.furb.basico.impl.ObterUrlUploadFotoImpl impl = new br.com.senior.furb.basico.impl.ObterUrlUploadFotoImpl(messengerSupplier, userId, messageSupplier);
		impl.obterUrlUploadFoto(input);
	}
	
	/**
	 * Chamada assíncrona para o método obterUrlUploadFoto
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * Obtém a URL para upload da foto
	 */
	@Override
	public CompletableFuture<ObterUrlUploadFotoOutput> obterUrlUploadFotoRequest(ObterUrlUploadFotoInput input) {
		br.com.senior.furb.basico.impl.ObterUrlUploadFotoImpl impl = new br.com.senior.furb.basico.impl.ObterUrlUploadFotoImpl(messengerSupplier, userId, messageSupplier);
		return impl.obterUrlUploadFotoRequest(input);
	}
	/**
	 * Chamada síncrona para o método gravarFoto
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * Grava a foto que foi upada
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public GravarFotoOutput gravarFoto(GravarFotoInput input, long timeout) {
		br.com.senior.furb.basico.impl.GravarFotoImpl impl = new br.com.senior.furb.basico.impl.GravarFotoImpl(messengerSupplier, userId, messageSupplier);
		return impl.gravarFoto(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método gravarFoto
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * Grava a foto que foi upada
	 */
	@Override
	public void gravarFoto(GravarFotoInput input) {
		br.com.senior.furb.basico.impl.GravarFotoImpl impl = new br.com.senior.furb.basico.impl.GravarFotoImpl(messengerSupplier, userId, messageSupplier);
		impl.gravarFoto(input);
	}
	
	/**
	 * Chamada assíncrona para o método gravarFoto
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * Grava a foto que foi upada
	 */
	@Override
	public CompletableFuture<GravarFotoOutput> gravarFotoRequest(GravarFotoInput input) {
		br.com.senior.furb.basico.impl.GravarFotoImpl impl = new br.com.senior.furb.basico.impl.GravarFotoImpl(messengerSupplier, userId, messageSupplier);
		return impl.gravarFotoRequest(input);
	}
	/**
	 * Chamada síncrona para o método obterUrlDownloadFoto
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * Obtém a URL para download da foto
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public ObterUrlDownloadFotoOutput obterUrlDownloadFoto(ObterUrlDownloadFotoInput input, long timeout) {
		br.com.senior.furb.basico.impl.ObterUrlDownloadFotoImpl impl = new br.com.senior.furb.basico.impl.ObterUrlDownloadFotoImpl(messengerSupplier, userId, messageSupplier);
		return impl.obterUrlDownloadFoto(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método obterUrlDownloadFoto
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * Obtém a URL para download da foto
	 */
	@Override
	public void obterUrlDownloadFoto(ObterUrlDownloadFotoInput input) {
		br.com.senior.furb.basico.impl.ObterUrlDownloadFotoImpl impl = new br.com.senior.furb.basico.impl.ObterUrlDownloadFotoImpl(messengerSupplier, userId, messageSupplier);
		impl.obterUrlDownloadFoto(input);
	}
	
	/**
	 * Chamada assíncrona para o método obterUrlDownloadFoto
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * Obtém a URL para download da foto
	 */
	@Override
	public CompletableFuture<ObterUrlDownloadFotoOutput> obterUrlDownloadFotoRequest(ObterUrlDownloadFotoInput input) {
		br.com.senior.furb.basico.impl.ObterUrlDownloadFotoImpl impl = new br.com.senior.furb.basico.impl.ObterUrlDownloadFotoImpl(messengerSupplier, userId, messageSupplier);
		return impl.obterUrlDownloadFotoRequest(input);
	}
	/**
	 * Chamada síncrona para o método getMetadata
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * Default 'getMetadata' query. Every service must handle this command and return metadata in the format requested.
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public GetMetadataOutput getMetadata(GetMetadataInput input, long timeout) {
		br.com.senior.furb.basico.impl.GetMetadataImpl impl = new br.com.senior.furb.basico.impl.GetMetadataImpl(messengerSupplier, userId, messageSupplier);
		return impl.getMetadata(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método getMetadata
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * Default 'getMetadata' query. Every service must handle this command and return metadata in the format requested.
	 */
	@Override
	public void getMetadata(GetMetadataInput input) {
		br.com.senior.furb.basico.impl.GetMetadataImpl impl = new br.com.senior.furb.basico.impl.GetMetadataImpl(messengerSupplier, userId, messageSupplier);
		impl.getMetadata(input);
	}
	
	/**
	 * Chamada assíncrona para o método getMetadata
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * Default 'getMetadata' query. Every service must handle this command and return metadata in the format requested.
	 */
	@Override
	public CompletableFuture<GetMetadataOutput> getMetadataRequest(GetMetadataInput input) {
		br.com.senior.furb.basico.impl.GetMetadataImpl impl = new br.com.senior.furb.basico.impl.GetMetadataImpl(messengerSupplier, userId, messageSupplier);
		return impl.getMetadataRequest(input);
	}
	/**
	 * Chamada síncrona para o método getDependencies
	 * This is a public operation
	 * Returns a list with all dependencies from this service, along with their respective versions
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public GetDependenciesOutput getDependencies(long timeout) {
		br.com.senior.furb.basico.impl.GetDependenciesImpl impl = new br.com.senior.furb.basico.impl.GetDependenciesImpl(messengerSupplier, userId, messageSupplier);
		return impl.getDependencies(timeout);
	}
	
	/**
	 * Chamada assíncrona para o método getDependencies
	 * This is a public operation
	 * Returns a list with all dependencies from this service, along with their respective versions
	 */
	@Override
	public void getDependencies() {
		br.com.senior.furb.basico.impl.GetDependenciesImpl impl = new br.com.senior.furb.basico.impl.GetDependenciesImpl(messengerSupplier, userId, messageSupplier);
		impl.getDependencies();
	}
	
	/**
	 * Chamada assíncrona para o método getDependencies
	 * This is a public operation
	 * Returns a list with all dependencies from this service, along with their respective versions
	 */
	@Override
	public CompletableFuture<GetDependenciesOutput> getDependenciesRequest() {
		br.com.senior.furb.basico.impl.GetDependenciesImpl impl = new br.com.senior.furb.basico.impl.GetDependenciesImpl(messengerSupplier, userId, messageSupplier);
		return impl.getDependenciesRequest();
	}


	/**
	* Chamada assíncrona para o método publishServiceStarted
	* Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	*/
	public void publishServiceStarted( ServiceStartedPayload input ) {
	
		Message message = new Message(userId.getTenant(), BasicoConstants.DOMAIN, BasicoConstants.SERVICE, BasicoConstants.Events.SERVICE_STARTED, DtoJsonConverter.toJSON(input));
		try {
			addMessageHeaders(message);
			messengerSupplier.get().publish(message);
		} catch (Exception e) {
			throw new BasicoException("Erro ao enviar a mensagem", e);
		}
	}
	
	/**
	* Chamada assíncrona para o método publishNotifyUserEvent
	* Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	*/
	public void publishNotifyUserEvent( NotifyUserEventPayload input ) {
	
		Message message = new Message(userId.getTenant(), BasicoConstants.DOMAIN, BasicoConstants.SERVICE, BasicoConstants.Events.NOTIFY_USER_EVENT, DtoJsonConverter.toJSON(input));
		try {
			addMessageHeaders(message);
			messengerSupplier.get().publish(message);
		} catch (Exception e) {
			throw new BasicoException("Erro ao enviar a mensagem", e);
		}
	}
	

	private void addMessageHeaders(Message message) {
		message.setUsername(userId.getUsername());
		if (userId.isTrusted()) {
			message.addHeader("trusted", true);
		}
	}
}
