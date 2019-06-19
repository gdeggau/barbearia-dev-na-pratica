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
    }
    
}
