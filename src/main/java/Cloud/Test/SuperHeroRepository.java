package Cloud.Test;

import com.microsoft.azure.spring.data.cosmosdb.repository.DocumentDbRepository;

public interface SuperHeroRepository  extends DocumentDbRepository<SuperHero, String> { }


