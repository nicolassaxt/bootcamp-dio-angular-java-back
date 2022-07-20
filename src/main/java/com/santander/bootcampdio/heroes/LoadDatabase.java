package com.santander.bootcampdio.heroes;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoadDatabase {

    @Bean
    CommandLineRunner initDatabase(HeroRepository repository){

        return  args -> {
          repository.save(new Hero("Superman", "O homem mais forte do mundo, com diversos poderes"));
          repository.save(new Hero("Batman",  "Rico"));
        };
    };
}
