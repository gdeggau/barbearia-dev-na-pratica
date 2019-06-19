/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 */
package br.com.senior.furb.basico;

import java.util.List;
import br.com.senior.furb.basico.Fregues.Id;
import br.com.senior.springbatchintegration.importer.CrudService;
import org.springframework.data.domain.Page;

public interface FreguesCrudService extends CrudService<FreguesEntity> {
	
	public FreguesEntity createFregues(FreguesEntity toCreate);
	
	@Deprecated
	public FreguesEntity createMergeFregues(FreguesEntity toCreateMerge);
	
	public FreguesEntity updateFregues(FreguesEntity toUpdate);
	
	@Deprecated
	public FreguesEntity updateMergeFregues(FreguesEntity toUpdateMerge);
	
	public void deleteFregues(Id id);
	
	public FreguesEntity retrieveFregues(Id id);
	
	@Deprecated
	public List<FreguesEntity> listFregues(int skip, int top);
	
	public Page<FreguesEntity> listFreguesPageable(int skip, int top);
	
	public Page<FreguesEntity> listFreguesPageable(int skip, int top, String orderBy);
	
	public Page<FreguesEntity> listFreguesPageable(int skip, int top, String orderBy, String filter);
	
	public void createBulkFregues(List<FreguesEntity> entities);

	public FreguesBaseRepository getRepository();
	
}
