package vis.greece.makemyplan.repository;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import vis.greece.makemyplan.dto.sales.CMSAddon;


public interface CMSAddonsRepo extends MongoRepository<CMSAddon,ObjectId>{

	public List<CMSAddon> findByStatus(String status);
	
	public List<CMSAddon> findByAiosCode(String aiosCode);
	
	public List<CMSAddon> findByAiosCodeAndSpeed(String aiosCode,String speed);
	
	public List<CMSAddon> findByAiosCodeIn(List<String> offsetList);
}
