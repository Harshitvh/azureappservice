package Cloud.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@CrossOrigin
@RestController
@Slf4j
public class AzureWebAppController {
    
    @Autowired
    SuperHeroRepository superHeroRepository;
    
    @GetMapping("/hope")
    public String testAzureCloud()
    {
        return "Yep, It Worked";
    }
    
    @PostMapping("/save")
    public SuperHero saveSuperHero(@RequestBody SuperHero superHero)
    {
        log.info("SuperHero {} is being saved",superHero);
        return superHeroRepository.save(superHero);
    }
    
    @PostMapping("/find")
    public SuperHero getSuperHero(@RequestBody String superHero)
    {
        log.info("SuperHero {} is  being found",superHero);
        return superHeroRepository.findById(superHero).get();
    }


}
