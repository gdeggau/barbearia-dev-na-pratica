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
import br.com.senior.furb.basico.ImportFreguesInput;
import br.com.senior.furb.basico.ImportFreguesOutput;
import br.com.senior.furb.basico.ExportFreguesInput;
import br.com.senior.furb.basico.ExportFreguesOutput;
import br.com.senior.furb.basico.ImportFuncionarioInput;
import br.com.senior.furb.basico.ImportFuncionarioOutput;
import br.com.senior.furb.basico.ExportFuncionarioInput;
import br.com.senior.furb.basico.ExportFuncionarioOutput;
import br.com.senior.furb.basico.ImportServicoInput;
import br.com.senior.furb.basico.ImportServicoOutput;
import br.com.senior.furb.basico.ExportServicoInput;
import br.com.senior.furb.basico.ExportServicoOutput;
import br.com.senior.furb.basico.ImportAtendimentoInput;
import br.com.senior.furb.basico.ImportAtendimentoOutput;
import br.com.senior.furb.basico.ExportAtendimentoInput;
import br.com.senior.furb.basico.ExportAtendimentoOutput;
import br.com.senior.furb.basico.GetDependenciesOutput;
import br.com.senior.furb.basico.Fregues;
import br.com.senior.furb.basico.CreateBulkFreguesInput;
import br.com.senior.furb.basico.CreateBulkFreguesOutput;
import br.com.senior.furb.basico.Funcionario;
import br.com.senior.furb.basico.CreateBulkFuncionarioInput;
import br.com.senior.furb.basico.CreateBulkFuncionarioOutput;
import br.com.senior.furb.basico.Servico;
import br.com.senior.furb.basico.CreateBulkServicoInput;
import br.com.senior.furb.basico.CreateBulkServicoOutput;
import br.com.senior.furb.basico.Atendimento;
import br.com.senior.furb.basico.CreateBulkAtendimentoInput;
import br.com.senior.furb.basico.CreateBulkAtendimentoOutput;
import br.com.senior.furb.basico.ServiceStartedPayload;
import br.com.senior.furb.basico.NotifyUserEventPayload;
import br.com.senior.furb.basico.ImportFreguesEventPayload;
import br.com.senior.furb.basico.ExportFreguesEventPayload;
import br.com.senior.furb.basico.ImportFuncionarioEventPayload;
import br.com.senior.furb.basico.ExportFuncionarioEventPayload;
import br.com.senior.furb.basico.ImportServicoEventPayload;
import br.com.senior.furb.basico.ExportServicoEventPayload;
import br.com.senior.furb.basico.ImportAtendimentoEventPayload;
import br.com.senior.furb.basico.ExportAtendimentoEventPayload;

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
	 * Chamada síncrona para o método importFregues
	 * This is a public operation
	 * 
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public ImportFreguesOutput importFregues(ImportFreguesInput input, long timeout) {
		br.com.senior.furb.basico.impl.ImportFreguesImpl impl = new br.com.senior.furb.basico.impl.ImportFreguesImpl(messengerSupplier, userId, messageSupplier);
		return impl.importFregues(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método importFregues
	 * This is a public operation
	 * 
	 */
	@Override
	public void importFregues(ImportFreguesInput input) {
		br.com.senior.furb.basico.impl.ImportFreguesImpl impl = new br.com.senior.furb.basico.impl.ImportFreguesImpl(messengerSupplier, userId, messageSupplier);
		impl.importFregues(input);
	}
	
	/**
	 * Chamada assíncrona para o método importFregues
	 * This is a public operation
	 * 
	 */
	@Override
	public CompletableFuture<ImportFreguesOutput> importFreguesRequest(ImportFreguesInput input) {
		br.com.senior.furb.basico.impl.ImportFreguesImpl impl = new br.com.senior.furb.basico.impl.ImportFreguesImpl(messengerSupplier, userId, messageSupplier);
		return impl.importFreguesRequest(input);
	}
	/**
	 * Chamada síncrona para o método exportFregues
	 * This is a public operation
	 * 
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public ExportFreguesOutput exportFregues(ExportFreguesInput input, long timeout) {
		br.com.senior.furb.basico.impl.ExportFreguesImpl impl = new br.com.senior.furb.basico.impl.ExportFreguesImpl(messengerSupplier, userId, messageSupplier);
		return impl.exportFregues(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método exportFregues
	 * This is a public operation
	 * 
	 */
	@Override
	public void exportFregues(ExportFreguesInput input) {
		br.com.senior.furb.basico.impl.ExportFreguesImpl impl = new br.com.senior.furb.basico.impl.ExportFreguesImpl(messengerSupplier, userId, messageSupplier);
		impl.exportFregues(input);
	}
	
	/**
	 * Chamada assíncrona para o método exportFregues
	 * This is a public operation
	 * 
	 */
	@Override
	public CompletableFuture<ExportFreguesOutput> exportFreguesRequest(ExportFreguesInput input) {
		br.com.senior.furb.basico.impl.ExportFreguesImpl impl = new br.com.senior.furb.basico.impl.ExportFreguesImpl(messengerSupplier, userId, messageSupplier);
		return impl.exportFreguesRequest(input);
	}
	/**
	 * Chamada síncrona para o método importFuncionario
	 * This is a public operation
	 * 
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public ImportFuncionarioOutput importFuncionario(ImportFuncionarioInput input, long timeout) {
		br.com.senior.furb.basico.impl.ImportFuncionarioImpl impl = new br.com.senior.furb.basico.impl.ImportFuncionarioImpl(messengerSupplier, userId, messageSupplier);
		return impl.importFuncionario(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método importFuncionario
	 * This is a public operation
	 * 
	 */
	@Override
	public void importFuncionario(ImportFuncionarioInput input) {
		br.com.senior.furb.basico.impl.ImportFuncionarioImpl impl = new br.com.senior.furb.basico.impl.ImportFuncionarioImpl(messengerSupplier, userId, messageSupplier);
		impl.importFuncionario(input);
	}
	
	/**
	 * Chamada assíncrona para o método importFuncionario
	 * This is a public operation
	 * 
	 */
	@Override
	public CompletableFuture<ImportFuncionarioOutput> importFuncionarioRequest(ImportFuncionarioInput input) {
		br.com.senior.furb.basico.impl.ImportFuncionarioImpl impl = new br.com.senior.furb.basico.impl.ImportFuncionarioImpl(messengerSupplier, userId, messageSupplier);
		return impl.importFuncionarioRequest(input);
	}
	/**
	 * Chamada síncrona para o método exportFuncionario
	 * This is a public operation
	 * 
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public ExportFuncionarioOutput exportFuncionario(ExportFuncionarioInput input, long timeout) {
		br.com.senior.furb.basico.impl.ExportFuncionarioImpl impl = new br.com.senior.furb.basico.impl.ExportFuncionarioImpl(messengerSupplier, userId, messageSupplier);
		return impl.exportFuncionario(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método exportFuncionario
	 * This is a public operation
	 * 
	 */
	@Override
	public void exportFuncionario(ExportFuncionarioInput input) {
		br.com.senior.furb.basico.impl.ExportFuncionarioImpl impl = new br.com.senior.furb.basico.impl.ExportFuncionarioImpl(messengerSupplier, userId, messageSupplier);
		impl.exportFuncionario(input);
	}
	
	/**
	 * Chamada assíncrona para o método exportFuncionario
	 * This is a public operation
	 * 
	 */
	@Override
	public CompletableFuture<ExportFuncionarioOutput> exportFuncionarioRequest(ExportFuncionarioInput input) {
		br.com.senior.furb.basico.impl.ExportFuncionarioImpl impl = new br.com.senior.furb.basico.impl.ExportFuncionarioImpl(messengerSupplier, userId, messageSupplier);
		return impl.exportFuncionarioRequest(input);
	}
	/**
	 * Chamada síncrona para o método importServico
	 * This is a public operation
	 * 
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public ImportServicoOutput importServico(ImportServicoInput input, long timeout) {
		br.com.senior.furb.basico.impl.ImportServicoImpl impl = new br.com.senior.furb.basico.impl.ImportServicoImpl(messengerSupplier, userId, messageSupplier);
		return impl.importServico(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método importServico
	 * This is a public operation
	 * 
	 */
	@Override
	public void importServico(ImportServicoInput input) {
		br.com.senior.furb.basico.impl.ImportServicoImpl impl = new br.com.senior.furb.basico.impl.ImportServicoImpl(messengerSupplier, userId, messageSupplier);
		impl.importServico(input);
	}
	
	/**
	 * Chamada assíncrona para o método importServico
	 * This is a public operation
	 * 
	 */
	@Override
	public CompletableFuture<ImportServicoOutput> importServicoRequest(ImportServicoInput input) {
		br.com.senior.furb.basico.impl.ImportServicoImpl impl = new br.com.senior.furb.basico.impl.ImportServicoImpl(messengerSupplier, userId, messageSupplier);
		return impl.importServicoRequest(input);
	}
	/**
	 * Chamada síncrona para o método exportServico
	 * This is a public operation
	 * 
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public ExportServicoOutput exportServico(ExportServicoInput input, long timeout) {
		br.com.senior.furb.basico.impl.ExportServicoImpl impl = new br.com.senior.furb.basico.impl.ExportServicoImpl(messengerSupplier, userId, messageSupplier);
		return impl.exportServico(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método exportServico
	 * This is a public operation
	 * 
	 */
	@Override
	public void exportServico(ExportServicoInput input) {
		br.com.senior.furb.basico.impl.ExportServicoImpl impl = new br.com.senior.furb.basico.impl.ExportServicoImpl(messengerSupplier, userId, messageSupplier);
		impl.exportServico(input);
	}
	
	/**
	 * Chamada assíncrona para o método exportServico
	 * This is a public operation
	 * 
	 */
	@Override
	public CompletableFuture<ExportServicoOutput> exportServicoRequest(ExportServicoInput input) {
		br.com.senior.furb.basico.impl.ExportServicoImpl impl = new br.com.senior.furb.basico.impl.ExportServicoImpl(messengerSupplier, userId, messageSupplier);
		return impl.exportServicoRequest(input);
	}
	/**
	 * Chamada síncrona para o método importAtendimento
	 * This is a public operation
	 * 
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public ImportAtendimentoOutput importAtendimento(ImportAtendimentoInput input, long timeout) {
		br.com.senior.furb.basico.impl.ImportAtendimentoImpl impl = new br.com.senior.furb.basico.impl.ImportAtendimentoImpl(messengerSupplier, userId, messageSupplier);
		return impl.importAtendimento(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método importAtendimento
	 * This is a public operation
	 * 
	 */
	@Override
	public void importAtendimento(ImportAtendimentoInput input) {
		br.com.senior.furb.basico.impl.ImportAtendimentoImpl impl = new br.com.senior.furb.basico.impl.ImportAtendimentoImpl(messengerSupplier, userId, messageSupplier);
		impl.importAtendimento(input);
	}
	
	/**
	 * Chamada assíncrona para o método importAtendimento
	 * This is a public operation
	 * 
	 */
	@Override
	public CompletableFuture<ImportAtendimentoOutput> importAtendimentoRequest(ImportAtendimentoInput input) {
		br.com.senior.furb.basico.impl.ImportAtendimentoImpl impl = new br.com.senior.furb.basico.impl.ImportAtendimentoImpl(messengerSupplier, userId, messageSupplier);
		return impl.importAtendimentoRequest(input);
	}
	/**
	 * Chamada síncrona para o método exportAtendimento
	 * This is a public operation
	 * 
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public ExportAtendimentoOutput exportAtendimento(ExportAtendimentoInput input, long timeout) {
		br.com.senior.furb.basico.impl.ExportAtendimentoImpl impl = new br.com.senior.furb.basico.impl.ExportAtendimentoImpl(messengerSupplier, userId, messageSupplier);
		return impl.exportAtendimento(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método exportAtendimento
	 * This is a public operation
	 * 
	 */
	@Override
	public void exportAtendimento(ExportAtendimentoInput input) {
		br.com.senior.furb.basico.impl.ExportAtendimentoImpl impl = new br.com.senior.furb.basico.impl.ExportAtendimentoImpl(messengerSupplier, userId, messageSupplier);
		impl.exportAtendimento(input);
	}
	
	/**
	 * Chamada assíncrona para o método exportAtendimento
	 * This is a public operation
	 * 
	 */
	@Override
	public CompletableFuture<ExportAtendimentoOutput> exportAtendimentoRequest(ExportAtendimentoInput input) {
		br.com.senior.furb.basico.impl.ExportAtendimentoImpl impl = new br.com.senior.furb.basico.impl.ExportAtendimentoImpl(messengerSupplier, userId, messageSupplier);
		return impl.exportAtendimentoRequest(input);
	}
	/**
	 * Chamada síncrona para o método listFregues
	 * This is a public operation
	 * The 'list' request primitive for the Fregues entity.
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Fregues.PagedResults listFregues(Fregues.PageRequest input, long timeout) {
		br.com.senior.furb.basico.impl.ListFreguesImpl impl = new br.com.senior.furb.basico.impl.ListFreguesImpl(messengerSupplier, userId, messageSupplier);
		return impl.listFregues(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método listFregues
	 * This is a public operation
	 * The 'list' request primitive for the Fregues entity.
	 */
	@Override
	public void listFregues(Fregues.PageRequest input) {
		br.com.senior.furb.basico.impl.ListFreguesImpl impl = new br.com.senior.furb.basico.impl.ListFreguesImpl(messengerSupplier, userId, messageSupplier);
		impl.listFregues(input);
	}
	
	/**
	 * Chamada assíncrona para o método listFregues
	 * This is a public operation
	 * The 'list' request primitive for the Fregues entity.
	 */
	@Override
	public CompletableFuture<Fregues.PagedResults> listFreguesRequest(Fregues.PageRequest input) {
		br.com.senior.furb.basico.impl.ListFreguesImpl impl = new br.com.senior.furb.basico.impl.ListFreguesImpl(messengerSupplier, userId, messageSupplier);
		return impl.listFreguesRequest(input);
	}
	/**
	 * Chamada síncrona para o método listFuncionario
	 * This is a public operation
	 * The 'list' request primitive for the Funcionario entity.
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Funcionario.PagedResults listFuncionario(Funcionario.PageRequest input, long timeout) {
		br.com.senior.furb.basico.impl.ListFuncionarioImpl impl = new br.com.senior.furb.basico.impl.ListFuncionarioImpl(messengerSupplier, userId, messageSupplier);
		return impl.listFuncionario(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método listFuncionario
	 * This is a public operation
	 * The 'list' request primitive for the Funcionario entity.
	 */
	@Override
	public void listFuncionario(Funcionario.PageRequest input) {
		br.com.senior.furb.basico.impl.ListFuncionarioImpl impl = new br.com.senior.furb.basico.impl.ListFuncionarioImpl(messengerSupplier, userId, messageSupplier);
		impl.listFuncionario(input);
	}
	
	/**
	 * Chamada assíncrona para o método listFuncionario
	 * This is a public operation
	 * The 'list' request primitive for the Funcionario entity.
	 */
	@Override
	public CompletableFuture<Funcionario.PagedResults> listFuncionarioRequest(Funcionario.PageRequest input) {
		br.com.senior.furb.basico.impl.ListFuncionarioImpl impl = new br.com.senior.furb.basico.impl.ListFuncionarioImpl(messengerSupplier, userId, messageSupplier);
		return impl.listFuncionarioRequest(input);
	}
	/**
	 * Chamada síncrona para o método listServico
	 * This is a public operation
	 * The 'list' request primitive for the Servico entity.
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Servico.PagedResults listServico(Servico.PageRequest input, long timeout) {
		br.com.senior.furb.basico.impl.ListServicoImpl impl = new br.com.senior.furb.basico.impl.ListServicoImpl(messengerSupplier, userId, messageSupplier);
		return impl.listServico(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método listServico
	 * This is a public operation
	 * The 'list' request primitive for the Servico entity.
	 */
	@Override
	public void listServico(Servico.PageRequest input) {
		br.com.senior.furb.basico.impl.ListServicoImpl impl = new br.com.senior.furb.basico.impl.ListServicoImpl(messengerSupplier, userId, messageSupplier);
		impl.listServico(input);
	}
	
	/**
	 * Chamada assíncrona para o método listServico
	 * This is a public operation
	 * The 'list' request primitive for the Servico entity.
	 */
	@Override
	public CompletableFuture<Servico.PagedResults> listServicoRequest(Servico.PageRequest input) {
		br.com.senior.furb.basico.impl.ListServicoImpl impl = new br.com.senior.furb.basico.impl.ListServicoImpl(messengerSupplier, userId, messageSupplier);
		return impl.listServicoRequest(input);
	}
	/**
	 * Chamada síncrona para o método listAtendimento
	 * This is a public operation
	 * The 'list' request primitive for the Atendimento entity.
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Atendimento.PagedResults listAtendimento(Atendimento.PageRequest input, long timeout) {
		br.com.senior.furb.basico.impl.ListAtendimentoImpl impl = new br.com.senior.furb.basico.impl.ListAtendimentoImpl(messengerSupplier, userId, messageSupplier);
		return impl.listAtendimento(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método listAtendimento
	 * This is a public operation
	 * The 'list' request primitive for the Atendimento entity.
	 */
	@Override
	public void listAtendimento(Atendimento.PageRequest input) {
		br.com.senior.furb.basico.impl.ListAtendimentoImpl impl = new br.com.senior.furb.basico.impl.ListAtendimentoImpl(messengerSupplier, userId, messageSupplier);
		impl.listAtendimento(input);
	}
	
	/**
	 * Chamada assíncrona para o método listAtendimento
	 * This is a public operation
	 * The 'list' request primitive for the Atendimento entity.
	 */
	@Override
	public CompletableFuture<Atendimento.PagedResults> listAtendimentoRequest(Atendimento.PageRequest input) {
		br.com.senior.furb.basico.impl.ListAtendimentoImpl impl = new br.com.senior.furb.basico.impl.ListAtendimentoImpl(messengerSupplier, userId, messageSupplier);
		return impl.listAtendimentoRequest(input);
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
	 * Chamada síncrona para o método createFregues
	 * This is a public operation
	 * The 'create' request primitive for the Fregues entity.
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Fregues createFregues(Fregues input, long timeout) {
		br.com.senior.furb.basico.impl.CreateFreguesImpl impl = new br.com.senior.furb.basico.impl.CreateFreguesImpl(messengerSupplier, userId, messageSupplier);
		return impl.createFregues(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método createFregues
	 * This is a public operation
	 * The 'create' request primitive for the Fregues entity.
	 */
	@Override
	public void createFregues(Fregues input) {
		br.com.senior.furb.basico.impl.CreateFreguesImpl impl = new br.com.senior.furb.basico.impl.CreateFreguesImpl(messengerSupplier, userId, messageSupplier);
		impl.createFregues(input);
	}
	
	/**
	 * Chamada assíncrona para o método createFregues
	 * This is a public operation
	 * The 'create' request primitive for the Fregues entity.
	 */
	@Override
	public CompletableFuture<Fregues> createFreguesRequest(Fregues input) {
		br.com.senior.furb.basico.impl.CreateFreguesImpl impl = new br.com.senior.furb.basico.impl.CreateFreguesImpl(messengerSupplier, userId, messageSupplier);
		return impl.createFreguesRequest(input);
	}
	/**
	 * Chamada síncrona para o método createBulkFregues
	 * This is a public operation
	 * The 'createBulk' request primitive for the Fregues entity.
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public CreateBulkFreguesOutput createBulkFregues(CreateBulkFreguesInput input, long timeout) {
		br.com.senior.furb.basico.impl.CreateBulkFreguesImpl impl = new br.com.senior.furb.basico.impl.CreateBulkFreguesImpl(messengerSupplier, userId, messageSupplier);
		return impl.createBulkFregues(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método createBulkFregues
	 * This is a public operation
	 * The 'createBulk' request primitive for the Fregues entity.
	 */
	@Override
	public void createBulkFregues(CreateBulkFreguesInput input) {
		br.com.senior.furb.basico.impl.CreateBulkFreguesImpl impl = new br.com.senior.furb.basico.impl.CreateBulkFreguesImpl(messengerSupplier, userId, messageSupplier);
		impl.createBulkFregues(input);
	}
	
	/**
	 * Chamada assíncrona para o método createBulkFregues
	 * This is a public operation
	 * The 'createBulk' request primitive for the Fregues entity.
	 */
	@Override
	public CompletableFuture<CreateBulkFreguesOutput> createBulkFreguesRequest(CreateBulkFreguesInput input) {
		br.com.senior.furb.basico.impl.CreateBulkFreguesImpl impl = new br.com.senior.furb.basico.impl.CreateBulkFreguesImpl(messengerSupplier, userId, messageSupplier);
		return impl.createBulkFreguesRequest(input);
	}
	/**
	 * Chamada síncrona para o método createMergeFregues
	 * This is a public operation
	 * The 'createMerge' request primitive for the Fregues entity.
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Fregues createMergeFregues(Fregues input, long timeout) {
		br.com.senior.furb.basico.impl.CreateMergeFreguesImpl impl = new br.com.senior.furb.basico.impl.CreateMergeFreguesImpl(messengerSupplier, userId, messageSupplier);
		return impl.createMergeFregues(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método createMergeFregues
	 * This is a public operation
	 * The 'createMerge' request primitive for the Fregues entity.
	 */
	@Override
	public void createMergeFregues(Fregues input) {
		br.com.senior.furb.basico.impl.CreateMergeFreguesImpl impl = new br.com.senior.furb.basico.impl.CreateMergeFreguesImpl(messengerSupplier, userId, messageSupplier);
		impl.createMergeFregues(input);
	}
	
	/**
	 * Chamada assíncrona para o método createMergeFregues
	 * This is a public operation
	 * The 'createMerge' request primitive for the Fregues entity.
	 */
	@Override
	public CompletableFuture<Fregues> createMergeFreguesRequest(Fregues input) {
		br.com.senior.furb.basico.impl.CreateMergeFreguesImpl impl = new br.com.senior.furb.basico.impl.CreateMergeFreguesImpl(messengerSupplier, userId, messageSupplier);
		return impl.createMergeFreguesRequest(input);
	}
	/**
	 * Chamada síncrona para o método retrieveFregues
	 * This is a public operation
	 * The 'retrieve' request primitive for the Fregues entity.
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Fregues retrieveFregues(Fregues.Id input, long timeout) {
		br.com.senior.furb.basico.impl.RetrieveFreguesImpl impl = new br.com.senior.furb.basico.impl.RetrieveFreguesImpl(messengerSupplier, userId, messageSupplier);
		return impl.retrieveFregues(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método retrieveFregues
	 * This is a public operation
	 * The 'retrieve' request primitive for the Fregues entity.
	 */
	@Override
	public void retrieveFregues(Fregues.Id input) {
		br.com.senior.furb.basico.impl.RetrieveFreguesImpl impl = new br.com.senior.furb.basico.impl.RetrieveFreguesImpl(messengerSupplier, userId, messageSupplier);
		impl.retrieveFregues(input);
	}
	
	/**
	 * Chamada assíncrona para o método retrieveFregues
	 * This is a public operation
	 * The 'retrieve' request primitive for the Fregues entity.
	 */
	@Override
	public CompletableFuture<Fregues> retrieveFreguesRequest(Fregues.Id input) {
		br.com.senior.furb.basico.impl.RetrieveFreguesImpl impl = new br.com.senior.furb.basico.impl.RetrieveFreguesImpl(messengerSupplier, userId, messageSupplier);
		return impl.retrieveFreguesRequest(input);
	}
	/**
	 * Chamada síncrona para o método updateFregues
	 * This is a public operation
	 * The 'update' request primitive for the Fregues entity.
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Fregues updateFregues(Fregues input, long timeout) {
		br.com.senior.furb.basico.impl.UpdateFreguesImpl impl = new br.com.senior.furb.basico.impl.UpdateFreguesImpl(messengerSupplier, userId, messageSupplier);
		return impl.updateFregues(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método updateFregues
	 * This is a public operation
	 * The 'update' request primitive for the Fregues entity.
	 */
	@Override
	public void updateFregues(Fregues input) {
		br.com.senior.furb.basico.impl.UpdateFreguesImpl impl = new br.com.senior.furb.basico.impl.UpdateFreguesImpl(messengerSupplier, userId, messageSupplier);
		impl.updateFregues(input);
	}
	
	/**
	 * Chamada assíncrona para o método updateFregues
	 * This is a public operation
	 * The 'update' request primitive for the Fregues entity.
	 */
	@Override
	public CompletableFuture<Fregues> updateFreguesRequest(Fregues input) {
		br.com.senior.furb.basico.impl.UpdateFreguesImpl impl = new br.com.senior.furb.basico.impl.UpdateFreguesImpl(messengerSupplier, userId, messageSupplier);
		return impl.updateFreguesRequest(input);
	}
	/**
	 * Chamada síncrona para o método updateMergeFregues
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Fregues entity.
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Fregues updateMergeFregues(Fregues input, long timeout) {
		br.com.senior.furb.basico.impl.UpdateMergeFreguesImpl impl = new br.com.senior.furb.basico.impl.UpdateMergeFreguesImpl(messengerSupplier, userId, messageSupplier);
		return impl.updateMergeFregues(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método updateMergeFregues
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Fregues entity.
	 */
	@Override
	public void updateMergeFregues(Fregues input) {
		br.com.senior.furb.basico.impl.UpdateMergeFreguesImpl impl = new br.com.senior.furb.basico.impl.UpdateMergeFreguesImpl(messengerSupplier, userId, messageSupplier);
		impl.updateMergeFregues(input);
	}
	
	/**
	 * Chamada assíncrona para o método updateMergeFregues
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Fregues entity.
	 */
	@Override
	public CompletableFuture<Fregues> updateMergeFreguesRequest(Fregues input) {
		br.com.senior.furb.basico.impl.UpdateMergeFreguesImpl impl = new br.com.senior.furb.basico.impl.UpdateMergeFreguesImpl(messengerSupplier, userId, messageSupplier);
		return impl.updateMergeFreguesRequest(input);
	}
	/**
	 * Chamada síncrona para o método deleteFregues
	 * This is a public operation
	 * The 'delete' request primitive for the Fregues entity.
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public void deleteFregues(Fregues.Id input, long timeout) {
		br.com.senior.furb.basico.impl.DeleteFreguesImpl impl = new br.com.senior.furb.basico.impl.DeleteFreguesImpl(messengerSupplier, userId, messageSupplier);
		impl.deleteFregues(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método deleteFregues
	 * This is a public operation
	 * The 'delete' request primitive for the Fregues entity.
	 */
	@Override
	public void deleteFregues(Fregues.Id input) {
		br.com.senior.furb.basico.impl.DeleteFreguesImpl impl = new br.com.senior.furb.basico.impl.DeleteFreguesImpl(messengerSupplier, userId, messageSupplier);
		impl.deleteFregues(input);
	}
	
	/**
	 * Chamada síncrona para o método createFuncionario
	 * This is a public operation
	 * The 'create' request primitive for the Funcionario entity.
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Funcionario createFuncionario(Funcionario input, long timeout) {
		br.com.senior.furb.basico.impl.CreateFuncionarioImpl impl = new br.com.senior.furb.basico.impl.CreateFuncionarioImpl(messengerSupplier, userId, messageSupplier);
		return impl.createFuncionario(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método createFuncionario
	 * This is a public operation
	 * The 'create' request primitive for the Funcionario entity.
	 */
	@Override
	public void createFuncionario(Funcionario input) {
		br.com.senior.furb.basico.impl.CreateFuncionarioImpl impl = new br.com.senior.furb.basico.impl.CreateFuncionarioImpl(messengerSupplier, userId, messageSupplier);
		impl.createFuncionario(input);
	}
	
	/**
	 * Chamada assíncrona para o método createFuncionario
	 * This is a public operation
	 * The 'create' request primitive for the Funcionario entity.
	 */
	@Override
	public CompletableFuture<Funcionario> createFuncionarioRequest(Funcionario input) {
		br.com.senior.furb.basico.impl.CreateFuncionarioImpl impl = new br.com.senior.furb.basico.impl.CreateFuncionarioImpl(messengerSupplier, userId, messageSupplier);
		return impl.createFuncionarioRequest(input);
	}
	/**
	 * Chamada síncrona para o método createBulkFuncionario
	 * This is a public operation
	 * The 'createBulk' request primitive for the Funcionario entity.
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public CreateBulkFuncionarioOutput createBulkFuncionario(CreateBulkFuncionarioInput input, long timeout) {
		br.com.senior.furb.basico.impl.CreateBulkFuncionarioImpl impl = new br.com.senior.furb.basico.impl.CreateBulkFuncionarioImpl(messengerSupplier, userId, messageSupplier);
		return impl.createBulkFuncionario(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método createBulkFuncionario
	 * This is a public operation
	 * The 'createBulk' request primitive for the Funcionario entity.
	 */
	@Override
	public void createBulkFuncionario(CreateBulkFuncionarioInput input) {
		br.com.senior.furb.basico.impl.CreateBulkFuncionarioImpl impl = new br.com.senior.furb.basico.impl.CreateBulkFuncionarioImpl(messengerSupplier, userId, messageSupplier);
		impl.createBulkFuncionario(input);
	}
	
	/**
	 * Chamada assíncrona para o método createBulkFuncionario
	 * This is a public operation
	 * The 'createBulk' request primitive for the Funcionario entity.
	 */
	@Override
	public CompletableFuture<CreateBulkFuncionarioOutput> createBulkFuncionarioRequest(CreateBulkFuncionarioInput input) {
		br.com.senior.furb.basico.impl.CreateBulkFuncionarioImpl impl = new br.com.senior.furb.basico.impl.CreateBulkFuncionarioImpl(messengerSupplier, userId, messageSupplier);
		return impl.createBulkFuncionarioRequest(input);
	}
	/**
	 * Chamada síncrona para o método createMergeFuncionario
	 * This is a public operation
	 * The 'createMerge' request primitive for the Funcionario entity.
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Funcionario createMergeFuncionario(Funcionario input, long timeout) {
		br.com.senior.furb.basico.impl.CreateMergeFuncionarioImpl impl = new br.com.senior.furb.basico.impl.CreateMergeFuncionarioImpl(messengerSupplier, userId, messageSupplier);
		return impl.createMergeFuncionario(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método createMergeFuncionario
	 * This is a public operation
	 * The 'createMerge' request primitive for the Funcionario entity.
	 */
	@Override
	public void createMergeFuncionario(Funcionario input) {
		br.com.senior.furb.basico.impl.CreateMergeFuncionarioImpl impl = new br.com.senior.furb.basico.impl.CreateMergeFuncionarioImpl(messengerSupplier, userId, messageSupplier);
		impl.createMergeFuncionario(input);
	}
	
	/**
	 * Chamada assíncrona para o método createMergeFuncionario
	 * This is a public operation
	 * The 'createMerge' request primitive for the Funcionario entity.
	 */
	@Override
	public CompletableFuture<Funcionario> createMergeFuncionarioRequest(Funcionario input) {
		br.com.senior.furb.basico.impl.CreateMergeFuncionarioImpl impl = new br.com.senior.furb.basico.impl.CreateMergeFuncionarioImpl(messengerSupplier, userId, messageSupplier);
		return impl.createMergeFuncionarioRequest(input);
	}
	/**
	 * Chamada síncrona para o método retrieveFuncionario
	 * This is a public operation
	 * The 'retrieve' request primitive for the Funcionario entity.
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Funcionario retrieveFuncionario(Funcionario.Id input, long timeout) {
		br.com.senior.furb.basico.impl.RetrieveFuncionarioImpl impl = new br.com.senior.furb.basico.impl.RetrieveFuncionarioImpl(messengerSupplier, userId, messageSupplier);
		return impl.retrieveFuncionario(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método retrieveFuncionario
	 * This is a public operation
	 * The 'retrieve' request primitive for the Funcionario entity.
	 */
	@Override
	public void retrieveFuncionario(Funcionario.Id input) {
		br.com.senior.furb.basico.impl.RetrieveFuncionarioImpl impl = new br.com.senior.furb.basico.impl.RetrieveFuncionarioImpl(messengerSupplier, userId, messageSupplier);
		impl.retrieveFuncionario(input);
	}
	
	/**
	 * Chamada assíncrona para o método retrieveFuncionario
	 * This is a public operation
	 * The 'retrieve' request primitive for the Funcionario entity.
	 */
	@Override
	public CompletableFuture<Funcionario> retrieveFuncionarioRequest(Funcionario.Id input) {
		br.com.senior.furb.basico.impl.RetrieveFuncionarioImpl impl = new br.com.senior.furb.basico.impl.RetrieveFuncionarioImpl(messengerSupplier, userId, messageSupplier);
		return impl.retrieveFuncionarioRequest(input);
	}
	/**
	 * Chamada síncrona para o método updateFuncionario
	 * This is a public operation
	 * The 'update' request primitive for the Funcionario entity.
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Funcionario updateFuncionario(Funcionario input, long timeout) {
		br.com.senior.furb.basico.impl.UpdateFuncionarioImpl impl = new br.com.senior.furb.basico.impl.UpdateFuncionarioImpl(messengerSupplier, userId, messageSupplier);
		return impl.updateFuncionario(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método updateFuncionario
	 * This is a public operation
	 * The 'update' request primitive for the Funcionario entity.
	 */
	@Override
	public void updateFuncionario(Funcionario input) {
		br.com.senior.furb.basico.impl.UpdateFuncionarioImpl impl = new br.com.senior.furb.basico.impl.UpdateFuncionarioImpl(messengerSupplier, userId, messageSupplier);
		impl.updateFuncionario(input);
	}
	
	/**
	 * Chamada assíncrona para o método updateFuncionario
	 * This is a public operation
	 * The 'update' request primitive for the Funcionario entity.
	 */
	@Override
	public CompletableFuture<Funcionario> updateFuncionarioRequest(Funcionario input) {
		br.com.senior.furb.basico.impl.UpdateFuncionarioImpl impl = new br.com.senior.furb.basico.impl.UpdateFuncionarioImpl(messengerSupplier, userId, messageSupplier);
		return impl.updateFuncionarioRequest(input);
	}
	/**
	 * Chamada síncrona para o método updateMergeFuncionario
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Funcionario entity.
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Funcionario updateMergeFuncionario(Funcionario input, long timeout) {
		br.com.senior.furb.basico.impl.UpdateMergeFuncionarioImpl impl = new br.com.senior.furb.basico.impl.UpdateMergeFuncionarioImpl(messengerSupplier, userId, messageSupplier);
		return impl.updateMergeFuncionario(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método updateMergeFuncionario
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Funcionario entity.
	 */
	@Override
	public void updateMergeFuncionario(Funcionario input) {
		br.com.senior.furb.basico.impl.UpdateMergeFuncionarioImpl impl = new br.com.senior.furb.basico.impl.UpdateMergeFuncionarioImpl(messengerSupplier, userId, messageSupplier);
		impl.updateMergeFuncionario(input);
	}
	
	/**
	 * Chamada assíncrona para o método updateMergeFuncionario
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Funcionario entity.
	 */
	@Override
	public CompletableFuture<Funcionario> updateMergeFuncionarioRequest(Funcionario input) {
		br.com.senior.furb.basico.impl.UpdateMergeFuncionarioImpl impl = new br.com.senior.furb.basico.impl.UpdateMergeFuncionarioImpl(messengerSupplier, userId, messageSupplier);
		return impl.updateMergeFuncionarioRequest(input);
	}
	/**
	 * Chamada síncrona para o método deleteFuncionario
	 * This is a public operation
	 * The 'delete' request primitive for the Funcionario entity.
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public void deleteFuncionario(Funcionario.Id input, long timeout) {
		br.com.senior.furb.basico.impl.DeleteFuncionarioImpl impl = new br.com.senior.furb.basico.impl.DeleteFuncionarioImpl(messengerSupplier, userId, messageSupplier);
		impl.deleteFuncionario(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método deleteFuncionario
	 * This is a public operation
	 * The 'delete' request primitive for the Funcionario entity.
	 */
	@Override
	public void deleteFuncionario(Funcionario.Id input) {
		br.com.senior.furb.basico.impl.DeleteFuncionarioImpl impl = new br.com.senior.furb.basico.impl.DeleteFuncionarioImpl(messengerSupplier, userId, messageSupplier);
		impl.deleteFuncionario(input);
	}
	
	/**
	 * Chamada síncrona para o método createServico
	 * This is a public operation
	 * The 'create' request primitive for the Servico entity.
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Servico createServico(Servico input, long timeout) {
		br.com.senior.furb.basico.impl.CreateServicoImpl impl = new br.com.senior.furb.basico.impl.CreateServicoImpl(messengerSupplier, userId, messageSupplier);
		return impl.createServico(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método createServico
	 * This is a public operation
	 * The 'create' request primitive for the Servico entity.
	 */
	@Override
	public void createServico(Servico input) {
		br.com.senior.furb.basico.impl.CreateServicoImpl impl = new br.com.senior.furb.basico.impl.CreateServicoImpl(messengerSupplier, userId, messageSupplier);
		impl.createServico(input);
	}
	
	/**
	 * Chamada assíncrona para o método createServico
	 * This is a public operation
	 * The 'create' request primitive for the Servico entity.
	 */
	@Override
	public CompletableFuture<Servico> createServicoRequest(Servico input) {
		br.com.senior.furb.basico.impl.CreateServicoImpl impl = new br.com.senior.furb.basico.impl.CreateServicoImpl(messengerSupplier, userId, messageSupplier);
		return impl.createServicoRequest(input);
	}
	/**
	 * Chamada síncrona para o método createBulkServico
	 * This is a public operation
	 * The 'createBulk' request primitive for the Servico entity.
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public CreateBulkServicoOutput createBulkServico(CreateBulkServicoInput input, long timeout) {
		br.com.senior.furb.basico.impl.CreateBulkServicoImpl impl = new br.com.senior.furb.basico.impl.CreateBulkServicoImpl(messengerSupplier, userId, messageSupplier);
		return impl.createBulkServico(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método createBulkServico
	 * This is a public operation
	 * The 'createBulk' request primitive for the Servico entity.
	 */
	@Override
	public void createBulkServico(CreateBulkServicoInput input) {
		br.com.senior.furb.basico.impl.CreateBulkServicoImpl impl = new br.com.senior.furb.basico.impl.CreateBulkServicoImpl(messengerSupplier, userId, messageSupplier);
		impl.createBulkServico(input);
	}
	
	/**
	 * Chamada assíncrona para o método createBulkServico
	 * This is a public operation
	 * The 'createBulk' request primitive for the Servico entity.
	 */
	@Override
	public CompletableFuture<CreateBulkServicoOutput> createBulkServicoRequest(CreateBulkServicoInput input) {
		br.com.senior.furb.basico.impl.CreateBulkServicoImpl impl = new br.com.senior.furb.basico.impl.CreateBulkServicoImpl(messengerSupplier, userId, messageSupplier);
		return impl.createBulkServicoRequest(input);
	}
	/**
	 * Chamada síncrona para o método createMergeServico
	 * This is a public operation
	 * The 'createMerge' request primitive for the Servico entity.
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Servico createMergeServico(Servico input, long timeout) {
		br.com.senior.furb.basico.impl.CreateMergeServicoImpl impl = new br.com.senior.furb.basico.impl.CreateMergeServicoImpl(messengerSupplier, userId, messageSupplier);
		return impl.createMergeServico(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método createMergeServico
	 * This is a public operation
	 * The 'createMerge' request primitive for the Servico entity.
	 */
	@Override
	public void createMergeServico(Servico input) {
		br.com.senior.furb.basico.impl.CreateMergeServicoImpl impl = new br.com.senior.furb.basico.impl.CreateMergeServicoImpl(messengerSupplier, userId, messageSupplier);
		impl.createMergeServico(input);
	}
	
	/**
	 * Chamada assíncrona para o método createMergeServico
	 * This is a public operation
	 * The 'createMerge' request primitive for the Servico entity.
	 */
	@Override
	public CompletableFuture<Servico> createMergeServicoRequest(Servico input) {
		br.com.senior.furb.basico.impl.CreateMergeServicoImpl impl = new br.com.senior.furb.basico.impl.CreateMergeServicoImpl(messengerSupplier, userId, messageSupplier);
		return impl.createMergeServicoRequest(input);
	}
	/**
	 * Chamada síncrona para o método retrieveServico
	 * This is a public operation
	 * The 'retrieve' request primitive for the Servico entity.
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Servico retrieveServico(Servico.Id input, long timeout) {
		br.com.senior.furb.basico.impl.RetrieveServicoImpl impl = new br.com.senior.furb.basico.impl.RetrieveServicoImpl(messengerSupplier, userId, messageSupplier);
		return impl.retrieveServico(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método retrieveServico
	 * This is a public operation
	 * The 'retrieve' request primitive for the Servico entity.
	 */
	@Override
	public void retrieveServico(Servico.Id input) {
		br.com.senior.furb.basico.impl.RetrieveServicoImpl impl = new br.com.senior.furb.basico.impl.RetrieveServicoImpl(messengerSupplier, userId, messageSupplier);
		impl.retrieveServico(input);
	}
	
	/**
	 * Chamada assíncrona para o método retrieveServico
	 * This is a public operation
	 * The 'retrieve' request primitive for the Servico entity.
	 */
	@Override
	public CompletableFuture<Servico> retrieveServicoRequest(Servico.Id input) {
		br.com.senior.furb.basico.impl.RetrieveServicoImpl impl = new br.com.senior.furb.basico.impl.RetrieveServicoImpl(messengerSupplier, userId, messageSupplier);
		return impl.retrieveServicoRequest(input);
	}
	/**
	 * Chamada síncrona para o método updateServico
	 * This is a public operation
	 * The 'update' request primitive for the Servico entity.
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Servico updateServico(Servico input, long timeout) {
		br.com.senior.furb.basico.impl.UpdateServicoImpl impl = new br.com.senior.furb.basico.impl.UpdateServicoImpl(messengerSupplier, userId, messageSupplier);
		return impl.updateServico(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método updateServico
	 * This is a public operation
	 * The 'update' request primitive for the Servico entity.
	 */
	@Override
	public void updateServico(Servico input) {
		br.com.senior.furb.basico.impl.UpdateServicoImpl impl = new br.com.senior.furb.basico.impl.UpdateServicoImpl(messengerSupplier, userId, messageSupplier);
		impl.updateServico(input);
	}
	
	/**
	 * Chamada assíncrona para o método updateServico
	 * This is a public operation
	 * The 'update' request primitive for the Servico entity.
	 */
	@Override
	public CompletableFuture<Servico> updateServicoRequest(Servico input) {
		br.com.senior.furb.basico.impl.UpdateServicoImpl impl = new br.com.senior.furb.basico.impl.UpdateServicoImpl(messengerSupplier, userId, messageSupplier);
		return impl.updateServicoRequest(input);
	}
	/**
	 * Chamada síncrona para o método updateMergeServico
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Servico entity.
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Servico updateMergeServico(Servico input, long timeout) {
		br.com.senior.furb.basico.impl.UpdateMergeServicoImpl impl = new br.com.senior.furb.basico.impl.UpdateMergeServicoImpl(messengerSupplier, userId, messageSupplier);
		return impl.updateMergeServico(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método updateMergeServico
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Servico entity.
	 */
	@Override
	public void updateMergeServico(Servico input) {
		br.com.senior.furb.basico.impl.UpdateMergeServicoImpl impl = new br.com.senior.furb.basico.impl.UpdateMergeServicoImpl(messengerSupplier, userId, messageSupplier);
		impl.updateMergeServico(input);
	}
	
	/**
	 * Chamada assíncrona para o método updateMergeServico
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Servico entity.
	 */
	@Override
	public CompletableFuture<Servico> updateMergeServicoRequest(Servico input) {
		br.com.senior.furb.basico.impl.UpdateMergeServicoImpl impl = new br.com.senior.furb.basico.impl.UpdateMergeServicoImpl(messengerSupplier, userId, messageSupplier);
		return impl.updateMergeServicoRequest(input);
	}
	/**
	 * Chamada síncrona para o método deleteServico
	 * This is a public operation
	 * The 'delete' request primitive for the Servico entity.
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public void deleteServico(Servico.Id input, long timeout) {
		br.com.senior.furb.basico.impl.DeleteServicoImpl impl = new br.com.senior.furb.basico.impl.DeleteServicoImpl(messengerSupplier, userId, messageSupplier);
		impl.deleteServico(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método deleteServico
	 * This is a public operation
	 * The 'delete' request primitive for the Servico entity.
	 */
	@Override
	public void deleteServico(Servico.Id input) {
		br.com.senior.furb.basico.impl.DeleteServicoImpl impl = new br.com.senior.furb.basico.impl.DeleteServicoImpl(messengerSupplier, userId, messageSupplier);
		impl.deleteServico(input);
	}
	
	/**
	 * Chamada síncrona para o método createAtendimento
	 * This is a public operation
	 * The 'create' request primitive for the Atendimento entity.
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Atendimento createAtendimento(Atendimento input, long timeout) {
		br.com.senior.furb.basico.impl.CreateAtendimentoImpl impl = new br.com.senior.furb.basico.impl.CreateAtendimentoImpl(messengerSupplier, userId, messageSupplier);
		return impl.createAtendimento(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método createAtendimento
	 * This is a public operation
	 * The 'create' request primitive for the Atendimento entity.
	 */
	@Override
	public void createAtendimento(Atendimento input) {
		br.com.senior.furb.basico.impl.CreateAtendimentoImpl impl = new br.com.senior.furb.basico.impl.CreateAtendimentoImpl(messengerSupplier, userId, messageSupplier);
		impl.createAtendimento(input);
	}
	
	/**
	 * Chamada assíncrona para o método createAtendimento
	 * This is a public operation
	 * The 'create' request primitive for the Atendimento entity.
	 */
	@Override
	public CompletableFuture<Atendimento> createAtendimentoRequest(Atendimento input) {
		br.com.senior.furb.basico.impl.CreateAtendimentoImpl impl = new br.com.senior.furb.basico.impl.CreateAtendimentoImpl(messengerSupplier, userId, messageSupplier);
		return impl.createAtendimentoRequest(input);
	}
	/**
	 * Chamada síncrona para o método createBulkAtendimento
	 * This is a public operation
	 * The 'createBulk' request primitive for the Atendimento entity.
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public CreateBulkAtendimentoOutput createBulkAtendimento(CreateBulkAtendimentoInput input, long timeout) {
		br.com.senior.furb.basico.impl.CreateBulkAtendimentoImpl impl = new br.com.senior.furb.basico.impl.CreateBulkAtendimentoImpl(messengerSupplier, userId, messageSupplier);
		return impl.createBulkAtendimento(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método createBulkAtendimento
	 * This is a public operation
	 * The 'createBulk' request primitive for the Atendimento entity.
	 */
	@Override
	public void createBulkAtendimento(CreateBulkAtendimentoInput input) {
		br.com.senior.furb.basico.impl.CreateBulkAtendimentoImpl impl = new br.com.senior.furb.basico.impl.CreateBulkAtendimentoImpl(messengerSupplier, userId, messageSupplier);
		impl.createBulkAtendimento(input);
	}
	
	/**
	 * Chamada assíncrona para o método createBulkAtendimento
	 * This is a public operation
	 * The 'createBulk' request primitive for the Atendimento entity.
	 */
	@Override
	public CompletableFuture<CreateBulkAtendimentoOutput> createBulkAtendimentoRequest(CreateBulkAtendimentoInput input) {
		br.com.senior.furb.basico.impl.CreateBulkAtendimentoImpl impl = new br.com.senior.furb.basico.impl.CreateBulkAtendimentoImpl(messengerSupplier, userId, messageSupplier);
		return impl.createBulkAtendimentoRequest(input);
	}
	/**
	 * Chamada síncrona para o método createMergeAtendimento
	 * This is a public operation
	 * The 'createMerge' request primitive for the Atendimento entity.
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Atendimento createMergeAtendimento(Atendimento input, long timeout) {
		br.com.senior.furb.basico.impl.CreateMergeAtendimentoImpl impl = new br.com.senior.furb.basico.impl.CreateMergeAtendimentoImpl(messengerSupplier, userId, messageSupplier);
		return impl.createMergeAtendimento(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método createMergeAtendimento
	 * This is a public operation
	 * The 'createMerge' request primitive for the Atendimento entity.
	 */
	@Override
	public void createMergeAtendimento(Atendimento input) {
		br.com.senior.furb.basico.impl.CreateMergeAtendimentoImpl impl = new br.com.senior.furb.basico.impl.CreateMergeAtendimentoImpl(messengerSupplier, userId, messageSupplier);
		impl.createMergeAtendimento(input);
	}
	
	/**
	 * Chamada assíncrona para o método createMergeAtendimento
	 * This is a public operation
	 * The 'createMerge' request primitive for the Atendimento entity.
	 */
	@Override
	public CompletableFuture<Atendimento> createMergeAtendimentoRequest(Atendimento input) {
		br.com.senior.furb.basico.impl.CreateMergeAtendimentoImpl impl = new br.com.senior.furb.basico.impl.CreateMergeAtendimentoImpl(messengerSupplier, userId, messageSupplier);
		return impl.createMergeAtendimentoRequest(input);
	}
	/**
	 * Chamada síncrona para o método retrieveAtendimento
	 * This is a public operation
	 * The 'retrieve' request primitive for the Atendimento entity.
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Atendimento retrieveAtendimento(Atendimento.Id input, long timeout) {
		br.com.senior.furb.basico.impl.RetrieveAtendimentoImpl impl = new br.com.senior.furb.basico.impl.RetrieveAtendimentoImpl(messengerSupplier, userId, messageSupplier);
		return impl.retrieveAtendimento(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método retrieveAtendimento
	 * This is a public operation
	 * The 'retrieve' request primitive for the Atendimento entity.
	 */
	@Override
	public void retrieveAtendimento(Atendimento.Id input) {
		br.com.senior.furb.basico.impl.RetrieveAtendimentoImpl impl = new br.com.senior.furb.basico.impl.RetrieveAtendimentoImpl(messengerSupplier, userId, messageSupplier);
		impl.retrieveAtendimento(input);
	}
	
	/**
	 * Chamada assíncrona para o método retrieveAtendimento
	 * This is a public operation
	 * The 'retrieve' request primitive for the Atendimento entity.
	 */
	@Override
	public CompletableFuture<Atendimento> retrieveAtendimentoRequest(Atendimento.Id input) {
		br.com.senior.furb.basico.impl.RetrieveAtendimentoImpl impl = new br.com.senior.furb.basico.impl.RetrieveAtendimentoImpl(messengerSupplier, userId, messageSupplier);
		return impl.retrieveAtendimentoRequest(input);
	}
	/**
	 * Chamada síncrona para o método updateAtendimento
	 * This is a public operation
	 * The 'update' request primitive for the Atendimento entity.
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Atendimento updateAtendimento(Atendimento input, long timeout) {
		br.com.senior.furb.basico.impl.UpdateAtendimentoImpl impl = new br.com.senior.furb.basico.impl.UpdateAtendimentoImpl(messengerSupplier, userId, messageSupplier);
		return impl.updateAtendimento(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método updateAtendimento
	 * This is a public operation
	 * The 'update' request primitive for the Atendimento entity.
	 */
	@Override
	public void updateAtendimento(Atendimento input) {
		br.com.senior.furb.basico.impl.UpdateAtendimentoImpl impl = new br.com.senior.furb.basico.impl.UpdateAtendimentoImpl(messengerSupplier, userId, messageSupplier);
		impl.updateAtendimento(input);
	}
	
	/**
	 * Chamada assíncrona para o método updateAtendimento
	 * This is a public operation
	 * The 'update' request primitive for the Atendimento entity.
	 */
	@Override
	public CompletableFuture<Atendimento> updateAtendimentoRequest(Atendimento input) {
		br.com.senior.furb.basico.impl.UpdateAtendimentoImpl impl = new br.com.senior.furb.basico.impl.UpdateAtendimentoImpl(messengerSupplier, userId, messageSupplier);
		return impl.updateAtendimentoRequest(input);
	}
	/**
	 * Chamada síncrona para o método updateMergeAtendimento
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Atendimento entity.
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public Atendimento updateMergeAtendimento(Atendimento input, long timeout) {
		br.com.senior.furb.basico.impl.UpdateMergeAtendimentoImpl impl = new br.com.senior.furb.basico.impl.UpdateMergeAtendimentoImpl(messengerSupplier, userId, messageSupplier);
		return impl.updateMergeAtendimento(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método updateMergeAtendimento
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Atendimento entity.
	 */
	@Override
	public void updateMergeAtendimento(Atendimento input) {
		br.com.senior.furb.basico.impl.UpdateMergeAtendimentoImpl impl = new br.com.senior.furb.basico.impl.UpdateMergeAtendimentoImpl(messengerSupplier, userId, messageSupplier);
		impl.updateMergeAtendimento(input);
	}
	
	/**
	 * Chamada assíncrona para o método updateMergeAtendimento
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Atendimento entity.
	 */
	@Override
	public CompletableFuture<Atendimento> updateMergeAtendimentoRequest(Atendimento input) {
		br.com.senior.furb.basico.impl.UpdateMergeAtendimentoImpl impl = new br.com.senior.furb.basico.impl.UpdateMergeAtendimentoImpl(messengerSupplier, userId, messageSupplier);
		return impl.updateMergeAtendimentoRequest(input);
	}
	/**
	 * Chamada síncrona para o método deleteAtendimento
	 * This is a public operation
	 * The 'delete' request primitive for the Atendimento entity.
	 * @throws BasicoMessageException quando um erro com payload for retornado pela mensageria
	 */
	@Override
	public void deleteAtendimento(Atendimento.Id input, long timeout) {
		br.com.senior.furb.basico.impl.DeleteAtendimentoImpl impl = new br.com.senior.furb.basico.impl.DeleteAtendimentoImpl(messengerSupplier, userId, messageSupplier);
		impl.deleteAtendimento(input, timeout);
	}
	
	/**
	 * Chamada assíncrona para o método deleteAtendimento
	 * This is a public operation
	 * The 'delete' request primitive for the Atendimento entity.
	 */
	@Override
	public void deleteAtendimento(Atendimento.Id input) {
		br.com.senior.furb.basico.impl.DeleteAtendimentoImpl impl = new br.com.senior.furb.basico.impl.DeleteAtendimentoImpl(messengerSupplier, userId, messageSupplier);
		impl.deleteAtendimento(input);
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
	
	/**
	* Chamada assíncrona para o método publishImportFreguesEvent
	* This is a public operation
	*/
	public void publishImportFreguesEvent( ImportFreguesEventPayload input ) {
	
		Message message = new Message(userId.getTenant(), BasicoConstants.DOMAIN, BasicoConstants.SERVICE, BasicoConstants.Events.IMPORT_FREGUES_EVENT, DtoJsonConverter.toJSON(input));
		try {
			addMessageHeaders(message);
			messengerSupplier.get().publish(message);
		} catch (Exception e) {
			throw new BasicoException("Erro ao enviar a mensagem", e);
		}
	}
	
	/**
	* Chamada assíncrona para o método publishExportFreguesEvent
	* This is a public operation
	*/
	public void publishExportFreguesEvent( ExportFreguesEventPayload input ) {
	
		Message message = new Message(userId.getTenant(), BasicoConstants.DOMAIN, BasicoConstants.SERVICE, BasicoConstants.Events.EXPORT_FREGUES_EVENT, DtoJsonConverter.toJSON(input));
		try {
			addMessageHeaders(message);
			messengerSupplier.get().publish(message);
		} catch (Exception e) {
			throw new BasicoException("Erro ao enviar a mensagem", e);
		}
	}
	
	/**
	* Chamada assíncrona para o método publishImportFuncionarioEvent
	* This is a public operation
	*/
	public void publishImportFuncionarioEvent( ImportFuncionarioEventPayload input ) {
	
		Message message = new Message(userId.getTenant(), BasicoConstants.DOMAIN, BasicoConstants.SERVICE, BasicoConstants.Events.IMPORT_FUNCIONARIO_EVENT, DtoJsonConverter.toJSON(input));
		try {
			addMessageHeaders(message);
			messengerSupplier.get().publish(message);
		} catch (Exception e) {
			throw new BasicoException("Erro ao enviar a mensagem", e);
		}
	}
	
	/**
	* Chamada assíncrona para o método publishExportFuncionarioEvent
	* This is a public operation
	*/
	public void publishExportFuncionarioEvent( ExportFuncionarioEventPayload input ) {
	
		Message message = new Message(userId.getTenant(), BasicoConstants.DOMAIN, BasicoConstants.SERVICE, BasicoConstants.Events.EXPORT_FUNCIONARIO_EVENT, DtoJsonConverter.toJSON(input));
		try {
			addMessageHeaders(message);
			messengerSupplier.get().publish(message);
		} catch (Exception e) {
			throw new BasicoException("Erro ao enviar a mensagem", e);
		}
	}
	
	/**
	* Chamada assíncrona para o método publishImportServicoEvent
	* This is a public operation
	*/
	public void publishImportServicoEvent( ImportServicoEventPayload input ) {
	
		Message message = new Message(userId.getTenant(), BasicoConstants.DOMAIN, BasicoConstants.SERVICE, BasicoConstants.Events.IMPORT_SERVICO_EVENT, DtoJsonConverter.toJSON(input));
		try {
			addMessageHeaders(message);
			messengerSupplier.get().publish(message);
		} catch (Exception e) {
			throw new BasicoException("Erro ao enviar a mensagem", e);
		}
	}
	
	/**
	* Chamada assíncrona para o método publishExportServicoEvent
	* This is a public operation
	*/
	public void publishExportServicoEvent( ExportServicoEventPayload input ) {
	
		Message message = new Message(userId.getTenant(), BasicoConstants.DOMAIN, BasicoConstants.SERVICE, BasicoConstants.Events.EXPORT_SERVICO_EVENT, DtoJsonConverter.toJSON(input));
		try {
			addMessageHeaders(message);
			messengerSupplier.get().publish(message);
		} catch (Exception e) {
			throw new BasicoException("Erro ao enviar a mensagem", e);
		}
	}
	
	/**
	* Chamada assíncrona para o método publishImportAtendimentoEvent
	* This is a public operation
	*/
	public void publishImportAtendimentoEvent( ImportAtendimentoEventPayload input ) {
	
		Message message = new Message(userId.getTenant(), BasicoConstants.DOMAIN, BasicoConstants.SERVICE, BasicoConstants.Events.IMPORT_ATENDIMENTO_EVENT, DtoJsonConverter.toJSON(input));
		try {
			addMessageHeaders(message);
			messengerSupplier.get().publish(message);
		} catch (Exception e) {
			throw new BasicoException("Erro ao enviar a mensagem", e);
		}
	}
	
	/**
	* Chamada assíncrona para o método publishExportAtendimentoEvent
	* This is a public operation
	*/
	public void publishExportAtendimentoEvent( ExportAtendimentoEventPayload input ) {
	
		Message message = new Message(userId.getTenant(), BasicoConstants.DOMAIN, BasicoConstants.SERVICE, BasicoConstants.Events.EXPORT_ATENDIMENTO_EVENT, DtoJsonConverter.toJSON(input));
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
