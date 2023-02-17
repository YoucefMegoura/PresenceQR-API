package com.youcefmegoura.presenceqr;

import com.youcefmegoura.presenceqr.controller.AdRoleController;
import com.youcefmegoura.presenceqr.service.AdRoleService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.sql.*;

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


    @Value("${spring.datasource.url}")
    private String databaseUrl;

    @Value("${spring.datasource.username}")
    private String databaseUsername;

    @Value("${spring.datasource.password}")
    private String databasePassword;


    // TESTS
    @Bean
    CommandLineRunner run(AdRoleController adRoleController) {
        return args -> {
            //log.info(adRoleController.findAll().toString());
            Connection connection = null;
            PreparedStatement selectStatement = null;
            PreparedStatement updateStatement = null;
            ResultSet resultSet = null;


            try {
                // Establish a connection to the database
                connection = DriverManager.getConnection(databaseUrl, databaseUsername, databasePassword);

                // Create a SELECT statement and execute it
                selectStatement = connection.prepareStatement("SELECT ad_user_uid, password, password_backup FROM ad_user");
                resultSet = selectStatement.executeQuery();

                // Process the result set
                while (resultSet.next()) {
                    String uid = resultSet.getString("ad_user_uid");
                    String password = resultSet.getString("password");
                    String passwordbackup = resultSet.getString("password_backup");

                    // Hash password

                    BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
                    String hashedPassword = passwordEncoder.encode(password);


                    updateStatement = connection.prepareStatement("UPDATE ad_user SET password_backup = ? , password = ? WHERE ad_user_uid = ?");
                    updateStatement.setString(1, password); // set the new value of age
                    updateStatement.setString(2, hashedPassword); // set the value of the parameter
                    updateStatement.setString(3, uid); // set the value of the parameter
                    int rowsAffected = updateStatement.executeUpdate();
                    System.out.println("Rows affected by update: " + rowsAffected);

                }

            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                // Close all resources
                try {
                    resultSet.close();
                } catch (Exception e) { /* ignored */ }
                try {
                    selectStatement.close();
                } catch (Exception e) { /* ignored */ }
                try {
                    updateStatement.close();
                } catch (Exception e) { /* ignored */ }
                try {
                    connection.close();
                } catch (Exception e) { /* ignored */ }
            }
        };
    }

}
