package org.study.springbootreactivestudy;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

//@Component
public class RepositoryDatabaseLoader {
    @Bean // <2>
    CommandLineRunner initialize(BlockingItemRepository repository) { // <3>
        return args -> { // <4>
            repository.save(new Item("Alf alarm clock", "kids clock", 19.99));
            repository.save(new Item("Smurf TV tray", "kids TV tray", 24.99));
        };
    }
}
