package com.study.pointwallet;

import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Configuration;
import org.testcontainers.containers.MySQLContainer;
import org.testcontainers.utility.DockerImageName;

@Configuration
public class TestcontainersConfiguration {

    private static final MySQLContainer<?> mySqlContainer;

    static {
        mySqlContainer = new MySQLContainer<>(DockerImageName.parse("mysql:8.0"))
                .withDatabaseName("pointWallet")
                .withUsername("application")
                .withPassword("application");
        mySqlContainer.start();

        System.setProperty("spring.datasource.url", mySqlContainer.getJdbcUrl() + "?characterEncoding=UTF-8&serverTimezone=UTC");
        System.setProperty("spring.datasource.username", mySqlContainer.getUsername());
        System.setProperty("spring.datasource.password", mySqlContainer.getPassword());
    }

    @PreDestroy
    public void preDestroy() {
        if (mySqlContainer.isRunning()) {
            mySqlContainer.stop();
        }
    }
}
