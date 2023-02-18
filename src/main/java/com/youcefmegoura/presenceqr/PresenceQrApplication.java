package com.youcefmegoura.presenceqr;

import com.youcefmegoura.presenceqr.controller.AdRoleController;
import com.youcefmegoura.presenceqr.service.AdRoleService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * @author youcefmegoura
 * @created 11/02/2023
 */
@Slf4j
@SpringBootApplication
public class PresenceQrApplication {

    public static void main(String[] args) {
        SpringApplication.run(PresenceQrApplication.class, args);
    }


    // TESTS
    @Bean
    CommandLineRunner run(AdRoleController adRoleController) {
        return args -> {
            //log.info(adRoleController.findAll().toString());
        };
    }

}
