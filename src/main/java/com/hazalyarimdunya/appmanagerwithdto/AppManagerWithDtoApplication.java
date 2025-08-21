package com.hazalyarimdunya.appmanagerwithdto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = {"com.hazalyarimdunya.appmanagerwithdto"})//entity sinifini uygulamaya tanitmak gerek.
//@ComponentScan(basePackages ={"com.hazalyarimdunya.appmanagerwithdto"} ) //Controller-Service-Repository siniflarini uygulamaya tanitmak gerek.
@EnableJpaRepositories(basePackages = {"com.hazalyarimdunya.appmanagerwithdto"}) //JPA reposunu aktiflestirir.

public class AppManagerWithDtoApplication {

    public static void main(String[] args) {
        SpringApplication.run(AppManagerWithDtoApplication.class, args);
    }
}
