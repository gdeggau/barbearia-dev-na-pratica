/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import java.util.concurrent.CompletableFuture;

import br.com.senior.furb.basico.HelloWorldInput;
import br.com.senior.furb.basico.HelloWorldOutput;
import br.com.senior.furb.basico.TotalReceitasInput;
import br.com.senior.furb.basico.TotalReceitasOutput;
import br.com.senior.furb.basico.TotalDespesasInput;
import br.com.senior.furb.basico.TotalDespesasOutput;
import br.com.senior.furb.basico.TotalLucroInput;
import br.com.senior.furb.basico.TotalLucroOutput;
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

/**
* 
*/
public interface BasicoStub {

	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	HelloWorldOutput helloWorld(HelloWorldInput input, long timeout);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 * Chamada assíncrona
	 */
	void helloWorld(HelloWorldInput input);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<HelloWorldOutput> helloWorldRequest(HelloWorldInput input);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	TotalReceitasOutput totalReceitas(TotalReceitasInput input, long timeout);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 * Chamada assíncrona
	 */
	void totalReceitas(TotalReceitasInput input);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<TotalReceitasOutput> totalReceitasRequest(TotalReceitasInput input);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	TotalDespesasOutput totalDespesas(TotalDespesasInput input, long timeout);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 * Chamada assíncrona
	 */
	void totalDespesas(TotalDespesasInput input);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<TotalDespesasOutput> totalDespesasRequest(TotalDespesasInput input);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	TotalLucroOutput totalLucro(TotalLucroInput input, long timeout);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 * Chamada assíncrona
	 */
	void totalLucro(TotalLucroInput input);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * 
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<TotalLucroOutput> totalLucroRequest(TotalLucroInput input);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * Obtém a URL para upload da foto
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	ObterUrlUploadFotoOutput obterUrlUploadFoto(ObterUrlUploadFotoInput input, long timeout);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * Obtém a URL para upload da foto
	 * Chamada assíncrona
	 */
	void obterUrlUploadFoto(ObterUrlUploadFotoInput input);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * Obtém a URL para upload da foto
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<ObterUrlUploadFotoOutput> obterUrlUploadFotoRequest(ObterUrlUploadFotoInput input);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * Grava a foto que foi upada
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	GravarFotoOutput gravarFoto(GravarFotoInput input, long timeout);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * Grava a foto que foi upada
	 * Chamada assíncrona
	 */
	void gravarFoto(GravarFotoInput input);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * Grava a foto que foi upada
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<GravarFotoOutput> gravarFotoRequest(GravarFotoInput input);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * Obtém a URL para download da foto
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	ObterUrlDownloadFotoOutput obterUrlDownloadFoto(ObterUrlDownloadFotoInput input, long timeout);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * Obtém a URL para download da foto
	 * Chamada assíncrona
	 */
	void obterUrlDownloadFoto(ObterUrlDownloadFotoInput input);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * Obtém a URL para download da foto
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<ObterUrlDownloadFotoOutput> obterUrlDownloadFotoRequest(ObterUrlDownloadFotoInput input);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * Default 'getMetadata' query. Every service must handle this command and return metadata in the format requested.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	GetMetadataOutput getMetadata(GetMetadataInput input, long timeout);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * Default 'getMetadata' query. Every service must handle this command and return metadata in the format requested.
	 * Chamada assíncrona
	 */
	void getMetadata(GetMetadataInput input);
	
	/**
	 * Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	 * Default 'getMetadata' query. Every service must handle this command and return metadata in the format requested.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<GetMetadataOutput> getMetadataRequest(GetMetadataInput input);
	
	/**
	 * This is a public operation
	 * 
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	ImportFreguesOutput importFregues(ImportFreguesInput input, long timeout);
	
	/**
	 * This is a public operation
	 * 
	 * Chamada assíncrona
	 */
	void importFregues(ImportFreguesInput input);
	
	/**
	 * This is a public operation
	 * 
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<ImportFreguesOutput> importFreguesRequest(ImportFreguesInput input);
	
	/**
	 * This is a public operation
	 * 
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	ExportFreguesOutput exportFregues(ExportFreguesInput input, long timeout);
	
	/**
	 * This is a public operation
	 * 
	 * Chamada assíncrona
	 */
	void exportFregues(ExportFreguesInput input);
	
	/**
	 * This is a public operation
	 * 
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<ExportFreguesOutput> exportFreguesRequest(ExportFreguesInput input);
	
	/**
	 * This is a public operation
	 * 
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	ImportFuncionarioOutput importFuncionario(ImportFuncionarioInput input, long timeout);
	
	/**
	 * This is a public operation
	 * 
	 * Chamada assíncrona
	 */
	void importFuncionario(ImportFuncionarioInput input);
	
	/**
	 * This is a public operation
	 * 
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<ImportFuncionarioOutput> importFuncionarioRequest(ImportFuncionarioInput input);
	
	/**
	 * This is a public operation
	 * 
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	ExportFuncionarioOutput exportFuncionario(ExportFuncionarioInput input, long timeout);
	
	/**
	 * This is a public operation
	 * 
	 * Chamada assíncrona
	 */
	void exportFuncionario(ExportFuncionarioInput input);
	
	/**
	 * This is a public operation
	 * 
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<ExportFuncionarioOutput> exportFuncionarioRequest(ExportFuncionarioInput input);
	
	/**
	 * This is a public operation
	 * 
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	ImportServicoOutput importServico(ImportServicoInput input, long timeout);
	
	/**
	 * This is a public operation
	 * 
	 * Chamada assíncrona
	 */
	void importServico(ImportServicoInput input);
	
	/**
	 * This is a public operation
	 * 
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<ImportServicoOutput> importServicoRequest(ImportServicoInput input);
	
	/**
	 * This is a public operation
	 * 
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	ExportServicoOutput exportServico(ExportServicoInput input, long timeout);
	
	/**
	 * This is a public operation
	 * 
	 * Chamada assíncrona
	 */
	void exportServico(ExportServicoInput input);
	
	/**
	 * This is a public operation
	 * 
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<ExportServicoOutput> exportServicoRequest(ExportServicoInput input);
	
	/**
	 * This is a public operation
	 * 
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	ImportAtendimentoOutput importAtendimento(ImportAtendimentoInput input, long timeout);
	
	/**
	 * This is a public operation
	 * 
	 * Chamada assíncrona
	 */
	void importAtendimento(ImportAtendimentoInput input);
	
	/**
	 * This is a public operation
	 * 
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<ImportAtendimentoOutput> importAtendimentoRequest(ImportAtendimentoInput input);
	
	/**
	 * This is a public operation
	 * 
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	ExportAtendimentoOutput exportAtendimento(ExportAtendimentoInput input, long timeout);
	
	/**
	 * This is a public operation
	 * 
	 * Chamada assíncrona
	 */
	void exportAtendimento(ExportAtendimentoInput input);
	
	/**
	 * This is a public operation
	 * 
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<ExportAtendimentoOutput> exportAtendimentoRequest(ExportAtendimentoInput input);
	
	/**
	 * This is a public operation
	 * The 'list' request primitive for the Fregues entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	Fregues.PagedResults listFregues(Fregues.PageRequest input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'list' request primitive for the Fregues entity.
	 * Chamada assíncrona
	 */
	void listFregues(Fregues.PageRequest input);
	
	/**
	 * This is a public operation
	 * The 'list' request primitive for the Fregues entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Fregues.PagedResults> listFreguesRequest(Fregues.PageRequest input);
	
	/**
	 * This is a public operation
	 * The 'list' request primitive for the Funcionario entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	Funcionario.PagedResults listFuncionario(Funcionario.PageRequest input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'list' request primitive for the Funcionario entity.
	 * Chamada assíncrona
	 */
	void listFuncionario(Funcionario.PageRequest input);
	
	/**
	 * This is a public operation
	 * The 'list' request primitive for the Funcionario entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Funcionario.PagedResults> listFuncionarioRequest(Funcionario.PageRequest input);
	
	/**
	 * This is a public operation
	 * The 'list' request primitive for the Servico entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	Servico.PagedResults listServico(Servico.PageRequest input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'list' request primitive for the Servico entity.
	 * Chamada assíncrona
	 */
	void listServico(Servico.PageRequest input);
	
	/**
	 * This is a public operation
	 * The 'list' request primitive for the Servico entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Servico.PagedResults> listServicoRequest(Servico.PageRequest input);
	
	/**
	 * This is a public operation
	 * The 'list' request primitive for the Atendimento entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	Atendimento.PagedResults listAtendimento(Atendimento.PageRequest input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'list' request primitive for the Atendimento entity.
	 * Chamada assíncrona
	 */
	void listAtendimento(Atendimento.PageRequest input);
	
	/**
	 * This is a public operation
	 * The 'list' request primitive for the Atendimento entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Atendimento.PagedResults> listAtendimentoRequest(Atendimento.PageRequest input);
	
	/**
	 * This is a public operation
	 * Returns a list with all dependencies from this service, along with their respective versions
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	GetDependenciesOutput getDependencies(long timeout);
	
	/**
	 * This is a public operation
	 * Returns a list with all dependencies from this service, along with their respective versions
	 * Chamada assíncrona
	 */
	void getDependencies();
	
	/**
	 * This is a public operation
	 * Returns a list with all dependencies from this service, along with their respective versions
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<GetDependenciesOutput> getDependenciesRequest();
	
	/**
	 * This is a public operation
	 * The 'create' request primitive for the Fregues entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	Fregues createFregues(Fregues input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'create' request primitive for the Fregues entity.
	 * Chamada assíncrona
	 */
	void createFregues(Fregues input);
	
	/**
	 * This is a public operation
	 * The 'create' request primitive for the Fregues entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Fregues> createFreguesRequest(Fregues input);
	
	/**
	 * This is a public operation
	 * The 'createBulk' request primitive for the Fregues entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	CreateBulkFreguesOutput createBulkFregues(CreateBulkFreguesInput input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'createBulk' request primitive for the Fregues entity.
	 * Chamada assíncrona
	 */
	void createBulkFregues(CreateBulkFreguesInput input);
	
	/**
	 * This is a public operation
	 * The 'createBulk' request primitive for the Fregues entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<CreateBulkFreguesOutput> createBulkFreguesRequest(CreateBulkFreguesInput input);
	
	/**
	 * This is a public operation
	 * The 'createMerge' request primitive for the Fregues entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	Fregues createMergeFregues(Fregues input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'createMerge' request primitive for the Fregues entity.
	 * Chamada assíncrona
	 */
	void createMergeFregues(Fregues input);
	
	/**
	 * This is a public operation
	 * The 'createMerge' request primitive for the Fregues entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Fregues> createMergeFreguesRequest(Fregues input);
	
	/**
	 * This is a public operation
	 * The 'retrieve' request primitive for the Fregues entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	Fregues retrieveFregues(Fregues.Id input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'retrieve' request primitive for the Fregues entity.
	 * Chamada assíncrona
	 */
	void retrieveFregues(Fregues.Id input);
	
	/**
	 * This is a public operation
	 * The 'retrieve' request primitive for the Fregues entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Fregues> retrieveFreguesRequest(Fregues.Id input);
	
	/**
	 * This is a public operation
	 * The 'update' request primitive for the Fregues entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	Fregues updateFregues(Fregues input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'update' request primitive for the Fregues entity.
	 * Chamada assíncrona
	 */
	void updateFregues(Fregues input);
	
	/**
	 * This is a public operation
	 * The 'update' request primitive for the Fregues entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Fregues> updateFreguesRequest(Fregues input);
	
	/**
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Fregues entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	Fregues updateMergeFregues(Fregues input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Fregues entity.
	 * Chamada assíncrona
	 */
	void updateMergeFregues(Fregues input);
	
	/**
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Fregues entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Fregues> updateMergeFreguesRequest(Fregues input);
	
	/**
	 * This is a public operation
	 * The 'delete' request primitive for the Fregues entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	void deleteFregues(Fregues.Id input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'delete' request primitive for the Fregues entity.
	 * Chamada assíncrona
	 */
	void deleteFregues(Fregues.Id input);
	
	/**
	 * This is a public operation
	 * The 'create' request primitive for the Funcionario entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	Funcionario createFuncionario(Funcionario input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'create' request primitive for the Funcionario entity.
	 * Chamada assíncrona
	 */
	void createFuncionario(Funcionario input);
	
	/**
	 * This is a public operation
	 * The 'create' request primitive for the Funcionario entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Funcionario> createFuncionarioRequest(Funcionario input);
	
	/**
	 * This is a public operation
	 * The 'createBulk' request primitive for the Funcionario entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	CreateBulkFuncionarioOutput createBulkFuncionario(CreateBulkFuncionarioInput input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'createBulk' request primitive for the Funcionario entity.
	 * Chamada assíncrona
	 */
	void createBulkFuncionario(CreateBulkFuncionarioInput input);
	
	/**
	 * This is a public operation
	 * The 'createBulk' request primitive for the Funcionario entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<CreateBulkFuncionarioOutput> createBulkFuncionarioRequest(CreateBulkFuncionarioInput input);
	
	/**
	 * This is a public operation
	 * The 'createMerge' request primitive for the Funcionario entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	Funcionario createMergeFuncionario(Funcionario input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'createMerge' request primitive for the Funcionario entity.
	 * Chamada assíncrona
	 */
	void createMergeFuncionario(Funcionario input);
	
	/**
	 * This is a public operation
	 * The 'createMerge' request primitive for the Funcionario entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Funcionario> createMergeFuncionarioRequest(Funcionario input);
	
	/**
	 * This is a public operation
	 * The 'retrieve' request primitive for the Funcionario entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	Funcionario retrieveFuncionario(Funcionario.Id input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'retrieve' request primitive for the Funcionario entity.
	 * Chamada assíncrona
	 */
	void retrieveFuncionario(Funcionario.Id input);
	
	/**
	 * This is a public operation
	 * The 'retrieve' request primitive for the Funcionario entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Funcionario> retrieveFuncionarioRequest(Funcionario.Id input);
	
	/**
	 * This is a public operation
	 * The 'update' request primitive for the Funcionario entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	Funcionario updateFuncionario(Funcionario input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'update' request primitive for the Funcionario entity.
	 * Chamada assíncrona
	 */
	void updateFuncionario(Funcionario input);
	
	/**
	 * This is a public operation
	 * The 'update' request primitive for the Funcionario entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Funcionario> updateFuncionarioRequest(Funcionario input);
	
	/**
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Funcionario entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	Funcionario updateMergeFuncionario(Funcionario input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Funcionario entity.
	 * Chamada assíncrona
	 */
	void updateMergeFuncionario(Funcionario input);
	
	/**
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Funcionario entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Funcionario> updateMergeFuncionarioRequest(Funcionario input);
	
	/**
	 * This is a public operation
	 * The 'delete' request primitive for the Funcionario entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	void deleteFuncionario(Funcionario.Id input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'delete' request primitive for the Funcionario entity.
	 * Chamada assíncrona
	 */
	void deleteFuncionario(Funcionario.Id input);
	
	/**
	 * This is a public operation
	 * The 'create' request primitive for the Servico entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	Servico createServico(Servico input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'create' request primitive for the Servico entity.
	 * Chamada assíncrona
	 */
	void createServico(Servico input);
	
	/**
	 * This is a public operation
	 * The 'create' request primitive for the Servico entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Servico> createServicoRequest(Servico input);
	
	/**
	 * This is a public operation
	 * The 'createBulk' request primitive for the Servico entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	CreateBulkServicoOutput createBulkServico(CreateBulkServicoInput input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'createBulk' request primitive for the Servico entity.
	 * Chamada assíncrona
	 */
	void createBulkServico(CreateBulkServicoInput input);
	
	/**
	 * This is a public operation
	 * The 'createBulk' request primitive for the Servico entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<CreateBulkServicoOutput> createBulkServicoRequest(CreateBulkServicoInput input);
	
	/**
	 * This is a public operation
	 * The 'createMerge' request primitive for the Servico entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	Servico createMergeServico(Servico input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'createMerge' request primitive for the Servico entity.
	 * Chamada assíncrona
	 */
	void createMergeServico(Servico input);
	
	/**
	 * This is a public operation
	 * The 'createMerge' request primitive for the Servico entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Servico> createMergeServicoRequest(Servico input);
	
	/**
	 * This is a public operation
	 * The 'retrieve' request primitive for the Servico entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	Servico retrieveServico(Servico.Id input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'retrieve' request primitive for the Servico entity.
	 * Chamada assíncrona
	 */
	void retrieveServico(Servico.Id input);
	
	/**
	 * This is a public operation
	 * The 'retrieve' request primitive for the Servico entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Servico> retrieveServicoRequest(Servico.Id input);
	
	/**
	 * This is a public operation
	 * The 'update' request primitive for the Servico entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	Servico updateServico(Servico input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'update' request primitive for the Servico entity.
	 * Chamada assíncrona
	 */
	void updateServico(Servico input);
	
	/**
	 * This is a public operation
	 * The 'update' request primitive for the Servico entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Servico> updateServicoRequest(Servico input);
	
	/**
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Servico entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	Servico updateMergeServico(Servico input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Servico entity.
	 * Chamada assíncrona
	 */
	void updateMergeServico(Servico input);
	
	/**
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Servico entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Servico> updateMergeServicoRequest(Servico input);
	
	/**
	 * This is a public operation
	 * The 'delete' request primitive for the Servico entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	void deleteServico(Servico.Id input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'delete' request primitive for the Servico entity.
	 * Chamada assíncrona
	 */
	void deleteServico(Servico.Id input);
	
	/**
	 * This is a public operation
	 * The 'create' request primitive for the Atendimento entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	Atendimento createAtendimento(Atendimento input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'create' request primitive for the Atendimento entity.
	 * Chamada assíncrona
	 */
	void createAtendimento(Atendimento input);
	
	/**
	 * This is a public operation
	 * The 'create' request primitive for the Atendimento entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Atendimento> createAtendimentoRequest(Atendimento input);
	
	/**
	 * This is a public operation
	 * The 'createBulk' request primitive for the Atendimento entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	CreateBulkAtendimentoOutput createBulkAtendimento(CreateBulkAtendimentoInput input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'createBulk' request primitive for the Atendimento entity.
	 * Chamada assíncrona
	 */
	void createBulkAtendimento(CreateBulkAtendimentoInput input);
	
	/**
	 * This is a public operation
	 * The 'createBulk' request primitive for the Atendimento entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<CreateBulkAtendimentoOutput> createBulkAtendimentoRequest(CreateBulkAtendimentoInput input);
	
	/**
	 * This is a public operation
	 * The 'createMerge' request primitive for the Atendimento entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	Atendimento createMergeAtendimento(Atendimento input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'createMerge' request primitive for the Atendimento entity.
	 * Chamada assíncrona
	 */
	void createMergeAtendimento(Atendimento input);
	
	/**
	 * This is a public operation
	 * The 'createMerge' request primitive for the Atendimento entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Atendimento> createMergeAtendimentoRequest(Atendimento input);
	
	/**
	 * This is a public operation
	 * The 'retrieve' request primitive for the Atendimento entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	Atendimento retrieveAtendimento(Atendimento.Id input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'retrieve' request primitive for the Atendimento entity.
	 * Chamada assíncrona
	 */
	void retrieveAtendimento(Atendimento.Id input);
	
	/**
	 * This is a public operation
	 * The 'retrieve' request primitive for the Atendimento entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Atendimento> retrieveAtendimentoRequest(Atendimento.Id input);
	
	/**
	 * This is a public operation
	 * The 'update' request primitive for the Atendimento entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	Atendimento updateAtendimento(Atendimento input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'update' request primitive for the Atendimento entity.
	 * Chamada assíncrona
	 */
	void updateAtendimento(Atendimento input);
	
	/**
	 * This is a public operation
	 * The 'update' request primitive for the Atendimento entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Atendimento> updateAtendimentoRequest(Atendimento input);
	
	/**
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Atendimento entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	Atendimento updateMergeAtendimento(Atendimento input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Atendimento entity.
	 * Chamada assíncrona
	 */
	void updateMergeAtendimento(Atendimento input);
	
	/**
	 * This is a public operation
	 * The 'updateMerge' request primitive for the Atendimento entity.
	 * Chamada assíncrona utilizando request
	 */
	CompletableFuture<Atendimento> updateMergeAtendimentoRequest(Atendimento input);
	
	/**
	 * This is a public operation
	 * The 'delete' request primitive for the Atendimento entity.
	 * Chamada síncrona, o valor de timeout deve ser informado em ms 
	 */
	void deleteAtendimento(Atendimento.Id input, long timeout);
	
	/**
	 * This is a public operation
	 * The 'delete' request primitive for the Atendimento entity.
	 * Chamada assíncrona
	 */
	void deleteAtendimento(Atendimento.Id input);
	


	/**
	* Chamada assíncrona para o método publishServiceStarted 
	* Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	*/
	void publishServiceStarted( ServiceStartedPayload input );
			
	
	/**
	* Chamada assíncrona para o método publishNotifyUserEvent 
	* Warning: this operation is PRIVATE and may have its behavior changed at any time without notice
	*/
	void publishNotifyUserEvent( NotifyUserEventPayload input );
			
	
	/**
	* Chamada assíncrona para o método publishImportFreguesEvent 
	* This is a public operation
	*/
	void publishImportFreguesEvent( ImportFreguesEventPayload input );
			
	
	/**
	* Chamada assíncrona para o método publishExportFreguesEvent 
	* This is a public operation
	*/
	void publishExportFreguesEvent( ExportFreguesEventPayload input );
			
	
	/**
	* Chamada assíncrona para o método publishImportFuncionarioEvent 
	* This is a public operation
	*/
	void publishImportFuncionarioEvent( ImportFuncionarioEventPayload input );
			
	
	/**
	* Chamada assíncrona para o método publishExportFuncionarioEvent 
	* This is a public operation
	*/
	void publishExportFuncionarioEvent( ExportFuncionarioEventPayload input );
			
	
	/**
	* Chamada assíncrona para o método publishImportServicoEvent 
	* This is a public operation
	*/
	void publishImportServicoEvent( ImportServicoEventPayload input );
			
	
	/**
	* Chamada assíncrona para o método publishExportServicoEvent 
	* This is a public operation
	*/
	void publishExportServicoEvent( ExportServicoEventPayload input );
			
	
	/**
	* Chamada assíncrona para o método publishImportAtendimentoEvent 
	* This is a public operation
	*/
	void publishImportAtendimentoEvent( ImportAtendimentoEventPayload input );
			
	
	/**
	* Chamada assíncrona para o método publishExportAtendimentoEvent 
	* This is a public operation
	*/
	void publishExportAtendimentoEvent( ExportAtendimentoEventPayload input );
			
	

}
