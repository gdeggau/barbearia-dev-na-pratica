/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import java.util.List;
import br.com.senior.furb.basico.Funcionario.Id;
import br.com.senior.springbatchintegration.importer.CrudService;
import org.springframework.data.domain.Page;

public interface FuncionarioCrudService extends CrudService<FuncionarioEntity> {
	
	public FuncionarioEntity createFuncionario(FuncionarioEntity toCreate);
	
	@Deprecated
	public FuncionarioEntity createMergeFuncionario(FuncionarioEntity toCreateMerge);
	
	public FuncionarioEntity updateFuncionario(FuncionarioEntity toUpdate);
	
	@Deprecated
	public FuncionarioEntity updateMergeFuncionario(FuncionarioEntity toUpdateMerge);
	
	public void deleteFuncionario(Id id);
	
	public FuncionarioEntity retrieveFuncionario(Id id);
	
	@Deprecated
	public List<FuncionarioEntity> listFuncionario(int skip, int top);
	
	public Page<FuncionarioEntity> listFuncionarioPageable(int skip, int top);
	
	public Page<FuncionarioEntity> listFuncionarioPageable(int skip, int top, String orderBy);
	
	public Page<FuncionarioEntity> listFuncionarioPageable(int skip, int top, String orderBy, String filter);
	
	public void createBulkFuncionario(List<FuncionarioEntity> entities);

	public FuncionarioBaseRepository getRepository();
	
}
