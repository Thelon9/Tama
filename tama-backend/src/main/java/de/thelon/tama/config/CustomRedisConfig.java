package de.thelon.tama.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;
import org.springframework.data.redis.connection.RedisStandaloneConfiguration;

@Configuration
public class CustomRedisConfig {

    @Bean
    public RedisConnectionFactory redisConnectionFactory() {
        RedisStandaloneConfiguration config = new RedisStandaloneConfiguration();
        config.setHostName("redis"); // Set your Redis server host here
        config.setPort(6379); // Set your Redis server port here
        //config.setPassword("your-redis-password"); // Optional: set password if required
        return new LettuceConnectionFactory(config);
    }



}
