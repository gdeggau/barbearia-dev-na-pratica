/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import java.util.List;
import br.com.senior.furb.basico.Servico.Id;
import br.com.senior.messaging.customspringdata.EntityInfo;
import br.com.senior.springbatchintegration.importer.CrudService;
import org.springframework.data.domain.Page;

public interface ServicoCrudService extends CrudService<ServicoEntity> {
	
	public ServicoEntity createServico(ServicoEntity toCreate);
	
	@Deprecated
	public ServicoEntity createMergeServico(ServicoEntity toCreateMerge);
	
	public ServicoEntity updateServico(ServicoEntity toUpdate);
	
	@Deprecated
	public ServicoEntity updateMergeServico(ServicoEntity toUpdateMerge);
	
	public void deleteServico(Id id);
	
	public ServicoEntity retrieveServico(Id id);
	
	@Deprecated
	public List<ServicoEntity> listServico(int skip, int top);
	
	public Page<ServicoEntity> listServicoPageable(int skip, int top);
	
	public Page<ServicoEntity> listServicoPageable(int skip, int top, String orderBy);
	
	public Page<ServicoEntity> listServicoPageable(int skip, int top, String orderBy, String filter);
	
	public Page<ServicoEntity> listServicoPageable(int skip, int top, String orderBy, String filter, EntityInfo parentEntity);
	
	public void createBulkServico(List<ServicoEntity> entities);

	public ServicoBaseRepository getRepository();
	
}
