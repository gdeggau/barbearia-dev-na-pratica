/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

public interface BasicoConstants {
    String DOMAIN = "furb";
    String SERVICE = "basico";
    
    interface Commands {
    	/**
    	 * @see HelloWorldInput the request payload
    	 */
    	String HELLO_WORLD = "helloWorld";
    	/**
    	 * The success response primitive for helloWorld.
    	 *
    	 * @see #HELLO_WORLD the request primitive
    	 * @see HelloWorldOutput the response payload
    	 */
    	String HELLO_WORLD_RESPONSE = "helloWorldResponse";
    	/**
    	 * An error response primitive for helloWorld.
    	 *
    	 * @see #HELLO_WORLD the request primitive
    	 */
    	String HELLO_WORLD_ERROR = "helloWorldError";
    	/**
    	 * Obtém a URL para upload da foto
    	 * @see ObterUrlUploadFotoInput the request payload
    	 */
    	String OBTER_URL_UPLOAD_FOTO = "obterUrlUploadFoto";
    	/**
    	 * The success response primitive for obterUrlUploadFoto.
    	 *
    	 * @see #OBTER_URL_UPLOAD_FOTO the request primitive
    	 * @see ObterUrlUploadFotoOutput the response payload
    	 */
    	String OBTER_URL_UPLOAD_FOTO_RESPONSE = "obterUrlUploadFotoResponse";
    	/**
    	 * An error response primitive for obterUrlUploadFoto.
    	 *
    	 * @see #OBTER_URL_UPLOAD_FOTO the request primitive
    	 */
    	String OBTER_URL_UPLOAD_FOTO_ERROR = "obterUrlUploadFotoError";
    	/**
    	 * Grava a foto que foi upada
    	 * @see GravarFotoInput the request payload
    	 */
    	String GRAVAR_FOTO = "gravarFoto";
    	/**
    	 * The success response primitive for gravarFoto.
    	 *
    	 * @see #GRAVAR_FOTO the request primitive
    	 * @see GravarFotoOutput the response payload
    	 */
    	String GRAVAR_FOTO_RESPONSE = "gravarFotoResponse";
    	/**
    	 * An error response primitive for gravarFoto.
    	 *
    	 * @see #GRAVAR_FOTO the request primitive
    	 */
    	String GRAVAR_FOTO_ERROR = "gravarFotoError";
    	/**
    	 * Obtém a URL para download da foto
    	 * @see ObterUrlDownloadFotoInput the request payload
    	 */
    	String OBTER_URL_DOWNLOAD_FOTO = "obterUrlDownloadFoto";
    	/**
    	 * The success response primitive for obterUrlDownloadFoto.
    	 *
    	 * @see #OBTER_URL_DOWNLOAD_FOTO the request primitive
    	 * @see ObterUrlDownloadFotoOutput the response payload
    	 */
    	String OBTER_URL_DOWNLOAD_FOTO_RESPONSE = "obterUrlDownloadFotoResponse";
    	/**
    	 * An error response primitive for obterUrlDownloadFoto.
    	 *
    	 * @see #OBTER_URL_DOWNLOAD_FOTO the request primitive
    	 */
    	String OBTER_URL_DOWNLOAD_FOTO_ERROR = "obterUrlDownloadFotoError";
    	/**
    	 * Default 'getMetadata' query. Every service must handle this command and return metadata in the format requested.
    	 * @see GetMetadataInput the request payload
    	 */
    	String GET_METADATA = "getMetadata";
    	/**
    	 * The success response primitive for getMetadata.
    	 *
    	 * @see #GET_METADATA the request primitive
    	 * @see GetMetadataOutput the response payload
    	 */
    	String GET_METADATA_RESPONSE = "getMetadataResponse";
    	/**
    	 * An error response primitive for getMetadata.
    	 *
    	 * @see #GET_METADATA the request primitive
    	 */
    	String GET_METADATA_ERROR = "getMetadataError";
    	/**
    	 * @see ImportFreguesInput the request payload
    	 */
    	String IMPORT_FREGUES = "importFregues";
    	/**
    	 * The success response primitive for importFregues.
    	 *
    	 * @see #IMPORT_FREGUES the request primitive
    	 * @see ImportFreguesOutput the response payload
    	 */
    	String IMPORT_FREGUES_RESPONSE = "importFreguesResponse";
    	/**
    	 * An error response primitive for importFregues.
    	 *
    	 * @see #IMPORT_FREGUES the request primitive
    	 */
    	String IMPORT_FREGUES_ERROR = "importFreguesError";
    	/**
    	 * @see ExportFreguesInput the request payload
    	 */
    	String EXPORT_FREGUES = "exportFregues";
    	/**
    	 * The success response primitive for exportFregues.
    	 *
    	 * @see #EXPORT_FREGUES the request primitive
    	 * @see ExportFreguesOutput the response payload
    	 */
    	String EXPORT_FREGUES_RESPONSE = "exportFreguesResponse";
    	/**
    	 * An error response primitive for exportFregues.
    	 *
    	 * @see #EXPORT_FREGUES the request primitive
    	 */
    	String EXPORT_FREGUES_ERROR = "exportFreguesError";
    	/**
    	 * @see ImportFuncionarioInput the request payload
    	 */
    	String IMPORT_FUNCIONARIO = "importFuncionario";
    	/**
    	 * The success response primitive for importFuncionario.
    	 *
    	 * @see #IMPORT_FUNCIONARIO the request primitive
    	 * @see ImportFuncionarioOutput the response payload
    	 */
    	String IMPORT_FUNCIONARIO_RESPONSE = "importFuncionarioResponse";
    	/**
    	 * An error response primitive for importFuncionario.
    	 *
    	 * @see #IMPORT_FUNCIONARIO the request primitive
    	 */
    	String IMPORT_FUNCIONARIO_ERROR = "importFuncionarioError";
    	/**
    	 * @see ExportFuncionarioInput the request payload
    	 */
    	String EXPORT_FUNCIONARIO = "exportFuncionario";
    	/**
    	 * The success response primitive for exportFuncionario.
    	 *
    	 * @see #EXPORT_FUNCIONARIO the request primitive
    	 * @see ExportFuncionarioOutput the response payload
    	 */
    	String EXPORT_FUNCIONARIO_RESPONSE = "exportFuncionarioResponse";
    	/**
    	 * An error response primitive for exportFuncionario.
    	 *
    	 * @see #EXPORT_FUNCIONARIO the request primitive
    	 */
    	String EXPORT_FUNCIONARIO_ERROR = "exportFuncionarioError";
    	/**
    	 * @see ImportServicoInput the request payload
    	 */
    	String IMPORT_SERVICO = "importServico";
    	/**
    	 * The success response primitive for importServico.
    	 *
    	 * @see #IMPORT_SERVICO the request primitive
    	 * @see ImportServicoOutput the response payload
    	 */
    	String IMPORT_SERVICO_RESPONSE = "importServicoResponse";
    	/**
    	 * An error response primitive for importServico.
    	 *
    	 * @see #IMPORT_SERVICO the request primitive
    	 */
    	String IMPORT_SERVICO_ERROR = "importServicoError";
    	/**
    	 * @see ExportServicoInput the request payload
    	 */
    	String EXPORT_SERVICO = "exportServico";
    	/**
    	 * The success response primitive for exportServico.
    	 *
    	 * @see #EXPORT_SERVICO the request primitive
    	 * @see ExportServicoOutput the response payload
    	 */
    	String EXPORT_SERVICO_RESPONSE = "exportServicoResponse";
    	/**
    	 * An error response primitive for exportServico.
    	 *
    	 * @see #EXPORT_SERVICO the request primitive
    	 */
    	String EXPORT_SERVICO_ERROR = "exportServicoError";
    	/**
    	 * @see ImportAtendimentoInput the request payload
    	 */
    	String IMPORT_ATENDIMENTO = "importAtendimento";
    	/**
    	 * The success response primitive for importAtendimento.
    	 *
    	 * @see #IMPORT_ATENDIMENTO the request primitive
    	 * @see ImportAtendimentoOutput the response payload
    	 */
    	String IMPORT_ATENDIMENTO_RESPONSE = "importAtendimentoResponse";
    	/**
    	 * An error response primitive for importAtendimento.
    	 *
    	 * @see #IMPORT_ATENDIMENTO the request primitive
    	 */
    	String IMPORT_ATENDIMENTO_ERROR = "importAtendimentoError";
    	/**
    	 * @see ExportAtendimentoInput the request payload
    	 */
    	String EXPORT_ATENDIMENTO = "exportAtendimento";
    	/**
    	 * The success response primitive for exportAtendimento.
    	 *
    	 * @see #EXPORT_ATENDIMENTO the request primitive
    	 * @see ExportAtendimentoOutput the response payload
    	 */
    	String EXPORT_ATENDIMENTO_RESPONSE = "exportAtendimentoResponse";
    	/**
    	 * An error response primitive for exportAtendimento.
    	 *
    	 * @see #EXPORT_ATENDIMENTO the request primitive
    	 */
    	String EXPORT_ATENDIMENTO_ERROR = "exportAtendimentoError";
    	/**
    	 * The 'list' request primitive for the Fregues entity.
    	 * @see fregues.pageRequest the request payload
    	 */
    	String LIST_FREGUES = "listFregues";
    	/**
    	 * The success response primitive for listFregues.
    	 *
    	 * @see #LIST_FREGUES the request primitive
    	 * @see Fregues.PagedResults the response payload
    	 */
    	String LIST_FREGUES_RESPONSE = "listFreguesResponse";
    	/**
    	 * An error response primitive for listFregues.
    	 *
    	 * @see #LIST_FREGUES the request primitive
    	 */
    	String LIST_FREGUES_ERROR = "listFreguesError";
    	/**
    	 * The 'list' request primitive for the Funcionario entity.
    	 * @see funcionario.pageRequest the request payload
    	 */
    	String LIST_FUNCIONARIO = "listFuncionario";
    	/**
    	 * The success response primitive for listFuncionario.
    	 *
    	 * @see #LIST_FUNCIONARIO the request primitive
    	 * @see Funcionario.PagedResults the response payload
    	 */
    	String LIST_FUNCIONARIO_RESPONSE = "listFuncionarioResponse";
    	/**
    	 * An error response primitive for listFuncionario.
    	 *
    	 * @see #LIST_FUNCIONARIO the request primitive
    	 */
    	String LIST_FUNCIONARIO_ERROR = "listFuncionarioError";
    	/**
    	 * The 'list' request primitive for the Servico entity.
    	 * @see servico.pageRequest the request payload
    	 */
    	String LIST_SERVICO = "listServico";
    	/**
    	 * The success response primitive for listServico.
    	 *
    	 * @see #LIST_SERVICO the request primitive
    	 * @see Servico.PagedResults the response payload
    	 */
    	String LIST_SERVICO_RESPONSE = "listServicoResponse";
    	/**
    	 * An error response primitive for listServico.
    	 *
    	 * @see #LIST_SERVICO the request primitive
    	 */
    	String LIST_SERVICO_ERROR = "listServicoError";
    	/**
    	 * The 'list' request primitive for the Atendimento entity.
    	 * @see atendimento.pageRequest the request payload
    	 */
    	String LIST_ATENDIMENTO = "listAtendimento";
    	/**
    	 * The success response primitive for listAtendimento.
    	 *
    	 * @see #LIST_ATENDIMENTO the request primitive
    	 * @see Atendimento.PagedResults the response payload
    	 */
    	String LIST_ATENDIMENTO_RESPONSE = "listAtendimentoResponse";
    	/**
    	 * An error response primitive for listAtendimento.
    	 *
    	 * @see #LIST_ATENDIMENTO the request primitive
    	 */
    	String LIST_ATENDIMENTO_ERROR = "listAtendimentoError";
    	/**
    	 * Returns a list with all dependencies from this service, along with their respective versions
    	 */
    	String GET_DEPENDENCIES = "getDependencies";
    	/**
    	 * The success response primitive for getDependencies.
    	 *
    	 * @see #GET_DEPENDENCIES the request primitive
    	 * @see GetDependenciesOutput the response payload
    	 */
    	String GET_DEPENDENCIES_RESPONSE = "getDependenciesResponse";
    	/**
    	 * An error response primitive for getDependencies.
    	 *
    	 * @see #GET_DEPENDENCIES the request primitive
    	 */
    	String GET_DEPENDENCIES_ERROR = "getDependenciesError";
    	/**
    	 * The 'create' request primitive for the Fregues entity.
    	 * @see Fregues the request payload
    	 */
    	String CREATE_FREGUES = "createFregues";
    	/**
    	 * The success response primitive for createFregues.
    	 *
    	 * @see #CREATE_FREGUES the request primitive
    	 */
    	String CREATE_FREGUES_RESPONSE = "createFreguesResponse";
    	/**
    	 * An error response primitive for createFregues.
    	 *
    	 * @see #CREATE_FREGUES the request primitive
    	 */
    	String CREATE_FREGUES_ERROR = "createFreguesError";
    	/**
    	 * The 'createBulk' request primitive for the Fregues entity.
    	 * @see CreateBulkFreguesInput the request payload
    	 */
    	String CREATE_BULK_FREGUES = "createBulkFregues";
    	/**
    	 * The success response primitive for createBulkFregues.
    	 *
    	 * @see #CREATE_BULK_FREGUES the request primitive
    	 * @see CreateBulkFreguesOutput the response payload
    	 */
    	String CREATE_BULK_FREGUES_RESPONSE = "createBulkFreguesResponse";
    	/**
    	 * An error response primitive for createBulkFregues.
    	 *
    	 * @see #CREATE_BULK_FREGUES the request primitive
    	 */
    	String CREATE_BULK_FREGUES_ERROR = "createBulkFreguesError";
    	/**
    	 * The 'createMerge' request primitive for the Fregues entity.
    	 * @see Fregues the request payload
    	 */
    	String CREATE_MERGE_FREGUES = "createMergeFregues";
    	/**
    	 * The success response primitive for createMergeFregues.
    	 *
    	 * @see #CREATE_MERGE_FREGUES the request primitive
    	 */
    	String CREATE_MERGE_FREGUES_RESPONSE = "createMergeFreguesResponse";
    	/**
    	 * An error response primitive for createMergeFregues.
    	 *
    	 * @see #CREATE_MERGE_FREGUES the request primitive
    	 */
    	String CREATE_MERGE_FREGUES_ERROR = "createMergeFreguesError";
    	/**
    	 * The 'retrieve' request primitive for the Fregues entity.
    	 * @see Fregues.Id the request payload
    	 */
    	String RETRIEVE_FREGUES = "retrieveFregues";
    	/**
    	 * The success response primitive for retrieveFregues.
    	 *
    	 * @see #RETRIEVE_FREGUES the request primitive
    	 */
    	String RETRIEVE_FREGUES_RESPONSE = "retrieveFreguesResponse";
    	/**
    	 * An error response primitive for retrieveFregues.
    	 *
    	 * @see #RETRIEVE_FREGUES the request primitive
    	 */
    	String RETRIEVE_FREGUES_ERROR = "retrieveFreguesError";
    	/**
    	 * The 'update' request primitive for the Fregues entity.
    	 * @see Fregues the request payload
    	 */
    	String UPDATE_FREGUES = "updateFregues";
    	/**
    	 * The success response primitive for updateFregues.
    	 *
    	 * @see #UPDATE_FREGUES the request primitive
    	 */
    	String UPDATE_FREGUES_RESPONSE = "updateFreguesResponse";
    	/**
    	 * An error response primitive for updateFregues.
    	 *
    	 * @see #UPDATE_FREGUES the request primitive
    	 */
    	String UPDATE_FREGUES_ERROR = "updateFreguesError";
    	/**
    	 * The 'updateMerge' request primitive for the Fregues entity.
    	 * @see Fregues the request payload
    	 */
    	String UPDATE_MERGE_FREGUES = "updateMergeFregues";
    	/**
    	 * The success response primitive for updateMergeFregues.
    	 *
    	 * @see #UPDATE_MERGE_FREGUES the request primitive
    	 */
    	String UPDATE_MERGE_FREGUES_RESPONSE = "updateMergeFreguesResponse";
    	/**
    	 * An error response primitive for updateMergeFregues.
    	 *
    	 * @see #UPDATE_MERGE_FREGUES the request primitive
    	 */
    	String UPDATE_MERGE_FREGUES_ERROR = "updateMergeFreguesError";
    	/**
    	 * The 'delete' request primitive for the Fregues entity.
    	 * @see Fregues.Id the request payload
    	 */
    	String DELETE_FREGUES = "deleteFregues";
    	/**
    	 * The success response primitive for deleteFregues.
    	 *
    	 * @see #DELETE_FREGUES the request primitive
    	 */
    	String DELETE_FREGUES_RESPONSE = "deleteFreguesResponse";
    	/**
    	 * An error response primitive for deleteFregues.
    	 *
    	 * @see #DELETE_FREGUES the request primitive
    	 */
    	String DELETE_FREGUES_ERROR = "deleteFreguesError";
    	/**
    	 * The 'create' request primitive for the Funcionario entity.
    	 * @see Funcionario the request payload
    	 */
    	String CREATE_FUNCIONARIO = "createFuncionario";
    	/**
    	 * The success response primitive for createFuncionario.
    	 *
    	 * @see #CREATE_FUNCIONARIO the request primitive
    	 */
    	String CREATE_FUNCIONARIO_RESPONSE = "createFuncionarioResponse";
    	/**
    	 * An error response primitive for createFuncionario.
    	 *
    	 * @see #CREATE_FUNCIONARIO the request primitive
    	 */
    	String CREATE_FUNCIONARIO_ERROR = "createFuncionarioError";
    	/**
    	 * The 'createBulk' request primitive for the Funcionario entity.
    	 * @see CreateBulkFuncionarioInput the request payload
    	 */
    	String CREATE_BULK_FUNCIONARIO = "createBulkFuncionario";
    	/**
    	 * The success response primitive for createBulkFuncionario.
    	 *
    	 * @see #CREATE_BULK_FUNCIONARIO the request primitive
    	 * @see CreateBulkFuncionarioOutput the response payload
    	 */
    	String CREATE_BULK_FUNCIONARIO_RESPONSE = "createBulkFuncionarioResponse";
    	/**
    	 * An error response primitive for createBulkFuncionario.
    	 *
    	 * @see #CREATE_BULK_FUNCIONARIO the request primitive
    	 */
    	String CREATE_BULK_FUNCIONARIO_ERROR = "createBulkFuncionarioError";
    	/**
    	 * The 'createMerge' request primitive for the Funcionario entity.
    	 * @see Funcionario the request payload
    	 */
    	String CREATE_MERGE_FUNCIONARIO = "createMergeFuncionario";
    	/**
    	 * The success response primitive for createMergeFuncionario.
    	 *
    	 * @see #CREATE_MERGE_FUNCIONARIO the request primitive
    	 */
    	String CREATE_MERGE_FUNCIONARIO_RESPONSE = "createMergeFuncionarioResponse";
    	/**
    	 * An error response primitive for createMergeFuncionario.
    	 *
    	 * @see #CREATE_MERGE_FUNCIONARIO the request primitive
    	 */
    	String CREATE_MERGE_FUNCIONARIO_ERROR = "createMergeFuncionarioError";
    	/**
    	 * The 'retrieve' request primitive for the Funcionario entity.
    	 * @see Funcionario.Id the request payload
    	 */
    	String RETRIEVE_FUNCIONARIO = "retrieveFuncionario";
    	/**
    	 * The success response primitive for retrieveFuncionario.
    	 *
    	 * @see #RETRIEVE_FUNCIONARIO the request primitive
    	 */
    	String RETRIEVE_FUNCIONARIO_RESPONSE = "retrieveFuncionarioResponse";
    	/**
    	 * An error response primitive for retrieveFuncionario.
    	 *
    	 * @see #RETRIEVE_FUNCIONARIO the request primitive
    	 */
    	String RETRIEVE_FUNCIONARIO_ERROR = "retrieveFuncionarioError";
    	/**
    	 * The 'update' request primitive for the Funcionario entity.
    	 * @see Funcionario the request payload
    	 */
    	String UPDATE_FUNCIONARIO = "updateFuncionario";
    	/**
    	 * The success response primitive for updateFuncionario.
    	 *
    	 * @see #UPDATE_FUNCIONARIO the request primitive
    	 */
    	String UPDATE_FUNCIONARIO_RESPONSE = "updateFuncionarioResponse";
    	/**
    	 * An error response primitive for updateFuncionario.
    	 *
    	 * @see #UPDATE_FUNCIONARIO the request primitive
    	 */
    	String UPDATE_FUNCIONARIO_ERROR = "updateFuncionarioError";
    	/**
    	 * The 'updateMerge' request primitive for the Funcionario entity.
    	 * @see Funcionario the request payload
    	 */
    	String UPDATE_MERGE_FUNCIONARIO = "updateMergeFuncionario";
    	/**
    	 * The success response primitive for updateMergeFuncionario.
    	 *
    	 * @see #UPDATE_MERGE_FUNCIONARIO the request primitive
    	 */
    	String UPDATE_MERGE_FUNCIONARIO_RESPONSE = "updateMergeFuncionarioResponse";
    	/**
    	 * An error response primitive for updateMergeFuncionario.
    	 *
    	 * @see #UPDATE_MERGE_FUNCIONARIO the request primitive
    	 */
    	String UPDATE_MERGE_FUNCIONARIO_ERROR = "updateMergeFuncionarioError";
    	/**
    	 * The 'delete' request primitive for the Funcionario entity.
    	 * @see Funcionario.Id the request payload
    	 */
    	String DELETE_FUNCIONARIO = "deleteFuncionario";
    	/**
    	 * The success response primitive for deleteFuncionario.
    	 *
    	 * @see #DELETE_FUNCIONARIO the request primitive
    	 */
    	String DELETE_FUNCIONARIO_RESPONSE = "deleteFuncionarioResponse";
    	/**
    	 * An error response primitive for deleteFuncionario.
    	 *
    	 * @see #DELETE_FUNCIONARIO the request primitive
    	 */
    	String DELETE_FUNCIONARIO_ERROR = "deleteFuncionarioError";
    	/**
    	 * The 'create' request primitive for the Servico entity.
    	 * @see Servico the request payload
    	 */
    	String CREATE_SERVICO = "createServico";
    	/**
    	 * The success response primitive for createServico.
    	 *
    	 * @see #CREATE_SERVICO the request primitive
    	 */
    	String CREATE_SERVICO_RESPONSE = "createServicoResponse";
    	/**
    	 * An error response primitive for createServico.
    	 *
    	 * @see #CREATE_SERVICO the request primitive
    	 */
    	String CREATE_SERVICO_ERROR = "createServicoError";
    	/**
    	 * The 'createBulk' request primitive for the Servico entity.
    	 * @see CreateBulkServicoInput the request payload
    	 */
    	String CREATE_BULK_SERVICO = "createBulkServico";
    	/**
    	 * The success response primitive for createBulkServico.
    	 *
    	 * @see #CREATE_BULK_SERVICO the request primitive
    	 * @see CreateBulkServicoOutput the response payload
    	 */
    	String CREATE_BULK_SERVICO_RESPONSE = "createBulkServicoResponse";
    	/**
    	 * An error response primitive for createBulkServico.
    	 *
    	 * @see #CREATE_BULK_SERVICO the request primitive
    	 */
    	String CREATE_BULK_SERVICO_ERROR = "createBulkServicoError";
    	/**
    	 * The 'createMerge' request primitive for the Servico entity.
    	 * @see Servico the request payload
    	 */
    	String CREATE_MERGE_SERVICO = "createMergeServico";
    	/**
    	 * The success response primitive for createMergeServico.
    	 *
    	 * @see #CREATE_MERGE_SERVICO the request primitive
    	 */
    	String CREATE_MERGE_SERVICO_RESPONSE = "createMergeServicoResponse";
    	/**
    	 * An error response primitive for createMergeServico.
    	 *
    	 * @see #CREATE_MERGE_SERVICO the request primitive
    	 */
    	String CREATE_MERGE_SERVICO_ERROR = "createMergeServicoError";
    	/**
    	 * The 'retrieve' request primitive for the Servico entity.
    	 * @see Servico.Id the request payload
    	 */
    	String RETRIEVE_SERVICO = "retrieveServico";
    	/**
    	 * The success response primitive for retrieveServico.
    	 *
    	 * @see #RETRIEVE_SERVICO the request primitive
    	 */
    	String RETRIEVE_SERVICO_RESPONSE = "retrieveServicoResponse";
    	/**
    	 * An error response primitive for retrieveServico.
    	 *
    	 * @see #RETRIEVE_SERVICO the request primitive
    	 */
    	String RETRIEVE_SERVICO_ERROR = "retrieveServicoError";
    	/**
    	 * The 'update' request primitive for the Servico entity.
    	 * @see Servico the request payload
    	 */
    	String UPDATE_SERVICO = "updateServico";
    	/**
    	 * The success response primitive for updateServico.
    	 *
    	 * @see #UPDATE_SERVICO the request primitive
    	 */
    	String UPDATE_SERVICO_RESPONSE = "updateServicoResponse";
    	/**
    	 * An error response primitive for updateServico.
    	 *
    	 * @see #UPDATE_SERVICO the request primitive
    	 */
    	String UPDATE_SERVICO_ERROR = "updateServicoError";
    	/**
    	 * The 'updateMerge' request primitive for the Servico entity.
    	 * @see Servico the request payload
    	 */
    	String UPDATE_MERGE_SERVICO = "updateMergeServico";
    	/**
    	 * The success response primitive for updateMergeServico.
    	 *
    	 * @see #UPDATE_MERGE_SERVICO the request primitive
    	 */
    	String UPDATE_MERGE_SERVICO_RESPONSE = "updateMergeServicoResponse";
    	/**
    	 * An error response primitive for updateMergeServico.
    	 *
    	 * @see #UPDATE_MERGE_SERVICO the request primitive
    	 */
    	String UPDATE_MERGE_SERVICO_ERROR = "updateMergeServicoError";
    	/**
    	 * The 'delete' request primitive for the Servico entity.
    	 * @see Servico.Id the request payload
    	 */
    	String DELETE_SERVICO = "deleteServico";
    	/**
    	 * The success response primitive for deleteServico.
    	 *
    	 * @see #DELETE_SERVICO the request primitive
    	 */
    	String DELETE_SERVICO_RESPONSE = "deleteServicoResponse";
    	/**
    	 * An error response primitive for deleteServico.
    	 *
    	 * @see #DELETE_SERVICO the request primitive
    	 */
    	String DELETE_SERVICO_ERROR = "deleteServicoError";
    	/**
    	 * The 'create' request primitive for the Atendimento entity.
    	 * @see Atendimento the request payload
    	 */
    	String CREATE_ATENDIMENTO = "createAtendimento";
    	/**
    	 * The success response primitive for createAtendimento.
    	 *
    	 * @see #CREATE_ATENDIMENTO the request primitive
    	 */
    	String CREATE_ATENDIMENTO_RESPONSE = "createAtendimentoResponse";
    	/**
    	 * An error response primitive for createAtendimento.
    	 *
    	 * @see #CREATE_ATENDIMENTO the request primitive
    	 */
    	String CREATE_ATENDIMENTO_ERROR = "createAtendimentoError";
    	/**
    	 * The 'createBulk' request primitive for the Atendimento entity.
    	 * @see CreateBulkAtendimentoInput the request payload
    	 */
    	String CREATE_BULK_ATENDIMENTO = "createBulkAtendimento";
    	/**
    	 * The success response primitive for createBulkAtendimento.
    	 *
    	 * @see #CREATE_BULK_ATENDIMENTO the request primitive
    	 * @see CreateBulkAtendimentoOutput the response payload
    	 */
    	String CREATE_BULK_ATENDIMENTO_RESPONSE = "createBulkAtendimentoResponse";
    	/**
    	 * An error response primitive for createBulkAtendimento.
    	 *
    	 * @see #CREATE_BULK_ATENDIMENTO the request primitive
    	 */
    	String CREATE_BULK_ATENDIMENTO_ERROR = "createBulkAtendimentoError";
    	/**
    	 * The 'createMerge' request primitive for the Atendimento entity.
    	 * @see Atendimento the request payload
    	 */
    	String CREATE_MERGE_ATENDIMENTO = "createMergeAtendimento";
    	/**
    	 * The success response primitive for createMergeAtendimento.
    	 *
    	 * @see #CREATE_MERGE_ATENDIMENTO the request primitive
    	 */
    	String CREATE_MERGE_ATENDIMENTO_RESPONSE = "createMergeAtendimentoResponse";
    	/**
    	 * An error response primitive for createMergeAtendimento.
    	 *
    	 * @see #CREATE_MERGE_ATENDIMENTO the request primitive
    	 */
    	String CREATE_MERGE_ATENDIMENTO_ERROR = "createMergeAtendimentoError";
    	/**
    	 * The 'retrieve' request primitive for the Atendimento entity.
    	 * @see Atendimento.Id the request payload
    	 */
    	String RETRIEVE_ATENDIMENTO = "retrieveAtendimento";
    	/**
    	 * The success response primitive for retrieveAtendimento.
    	 *
    	 * @see #RETRIEVE_ATENDIMENTO the request primitive
    	 */
    	String RETRIEVE_ATENDIMENTO_RESPONSE = "retrieveAtendimentoResponse";
    	/**
    	 * An error response primitive for retrieveAtendimento.
    	 *
    	 * @see #RETRIEVE_ATENDIMENTO the request primitive
    	 */
    	String RETRIEVE_ATENDIMENTO_ERROR = "retrieveAtendimentoError";
    	/**
    	 * The 'update' request primitive for the Atendimento entity.
    	 * @see Atendimento the request payload
    	 */
    	String UPDATE_ATENDIMENTO = "updateAtendimento";
    	/**
    	 * The success response primitive for updateAtendimento.
    	 *
    	 * @see #UPDATE_ATENDIMENTO the request primitive
    	 */
    	String UPDATE_ATENDIMENTO_RESPONSE = "updateAtendimentoResponse";
    	/**
    	 * An error response primitive for updateAtendimento.
    	 *
    	 * @see #UPDATE_ATENDIMENTO the request primitive
    	 */
    	String UPDATE_ATENDIMENTO_ERROR = "updateAtendimentoError";
    	/**
    	 * The 'updateMerge' request primitive for the Atendimento entity.
    	 * @see Atendimento the request payload
    	 */
    	String UPDATE_MERGE_ATENDIMENTO = "updateMergeAtendimento";
    	/**
    	 * The success response primitive for updateMergeAtendimento.
    	 *
    	 * @see #UPDATE_MERGE_ATENDIMENTO the request primitive
    	 */
    	String UPDATE_MERGE_ATENDIMENTO_RESPONSE = "updateMergeAtendimentoResponse";
    	/**
    	 * An error response primitive for updateMergeAtendimento.
    	 *
    	 * @see #UPDATE_MERGE_ATENDIMENTO the request primitive
    	 */
    	String UPDATE_MERGE_ATENDIMENTO_ERROR = "updateMergeAtendimentoError";
    	/**
    	 * The 'delete' request primitive for the Atendimento entity.
    	 * @see Atendimento.Id the request payload
    	 */
    	String DELETE_ATENDIMENTO = "deleteAtendimento";
    	/**
    	 * The success response primitive for deleteAtendimento.
    	 *
    	 * @see #DELETE_ATENDIMENTO the request primitive
    	 */
    	String DELETE_ATENDIMENTO_RESPONSE = "deleteAtendimentoResponse";
    	/**
    	 * An error response primitive for deleteAtendimento.
    	 *
    	 * @see #DELETE_ATENDIMENTO the request primitive
    	 */
    	String DELETE_ATENDIMENTO_ERROR = "deleteAtendimentoError";
    }
    
    interface Events {
    	/**
    	 * Default 'serviceStarted' event.
    	 */
    	String SERVICE_STARTED = "serviceStarted";
    	/**
    	 * Default 'notifyUser' event.
    	 */
    	String NOTIFY_USER_EVENT = "notifyUserEvent";
    	String IMPORT_FREGUES_EVENT = "importFreguesEvent";
    	String EXPORT_FREGUES_EVENT = "exportFreguesEvent";
    	String IMPORT_FUNCIONARIO_EVENT = "importFuncionarioEvent";
    	String EXPORT_FUNCIONARIO_EVENT = "exportFuncionarioEvent";
    	String IMPORT_SERVICO_EVENT = "importServicoEvent";
    	String EXPORT_SERVICO_EVENT = "exportServicoEvent";
    	String IMPORT_ATENDIMENTO_EVENT = "importAtendimentoEvent";
    	String EXPORT_ATENDIMENTO_EVENT = "exportAtendimentoEvent";
    }
    
}
