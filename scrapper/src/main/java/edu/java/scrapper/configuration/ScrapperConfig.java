package edu.java.scrapper.configuration;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(EnvironmentConfig.class)
public class ScrapperConfig {
    @Bean
    EnvironmentConfig.Scheduler scheduler(EnvironmentConfig environmentConfig) {
        return environmentConfig.scheduler();
    }
}