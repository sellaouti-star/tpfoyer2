package tn.esprit.tpfoyer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class Tpfoyer2Application {

    public static void main(String[] args) {
        SpringApplication.run(Tpfoyer2Application.class, args);
    }

}
