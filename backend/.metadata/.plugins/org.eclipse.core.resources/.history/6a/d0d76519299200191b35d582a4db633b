/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import java.util.List;
import br.com.senior.furb.basico.Cliente.Id;
import br.com.senior.springbatchintegration.importer.CrudService;
import org.springframework.data.domain.Page;

public interface ClienteCrudService extends CrudService<ClienteEntity> {
	
	public ClienteEntity createCliente(ClienteEntity toCreate);
	
	@Deprecated
	public ClienteEntity createMergeCliente(ClienteEntity toCreateMerge);
	
	public ClienteEntity updateCliente(ClienteEntity toUpdate);
	
	@Deprecated
	public ClienteEntity updateMergeCliente(ClienteEntity toUpdateMerge);
	
	public void deleteCliente(Id id);
	
	public ClienteEntity retrieveCliente(Id id);
	
	@Deprecated
	public List<ClienteEntity> listCliente(int skip, int top);
	
	public Page<ClienteEntity> listClientePageable(int skip, int top);
	
	public Page<ClienteEntity> listClientePageable(int skip, int top, String orderBy);
	
	public Page<ClienteEntity> listClientePageable(int skip, int top, String orderBy, String filter);
	
	public void createBulkCliente(List<ClienteEntity> entities);

	public ClienteBaseRepository getRepository();
	
}
