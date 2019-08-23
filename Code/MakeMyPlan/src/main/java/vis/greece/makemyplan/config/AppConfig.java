//package vis.greece.makemyplan.config;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.cache.CacheManager;
//import org.springframework.cache.annotation.CachingConfigurerSupport;
//import org.springframework.cache.annotation.EnableCaching;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.data.mongodb.core.MongoTemplate;
//
//
//@Configuration
//@EnableCaching
//public class AppConfig extends CachingConfigurerSupport {
//
//
//	@Autowired
//	private MongoTemplate mongoTemplate;
//
//	@Bean
//	public CacheManager cacheManager() {
//
//		MongoCacheBuilder cacheSitesDAO =   MongoCacheBuilder.newInstance("AssetsCache", mongoTemplate,
//				"AssetsCache");
//		//cacheSitesDAO.withTTL(600000);
//		List<MongoCacheBuilder> caches = new ArrayList<>();
//		caches.add(cacheSitesDAO);
//		return new MongoCacheManager(caches);
//	}
//}