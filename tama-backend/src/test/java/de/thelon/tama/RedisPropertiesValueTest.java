package de.thelon.tama;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@ActiveProfiles("dev")
@Slf4j
public class RedisPropertiesValueTest {

    static final String EXPECTED_REDIS_HOST = "localhost";
    static final String EXPECTED_REDIS_PORT = "6379";
    @Value("${redis.host}")
    private String redisHost;

    @Value("${redis.port}")
    private String redisPort;

    @Test
    public void whenFilePropertyProvided_thenProperlyInjected() {
        log.info("Redis Host: {} Redis Port: {}", redisHost, redisPort);
        assertEquals(redisHost, EXPECTED_REDIS_HOST);
        assertEquals(redisPort, EXPECTED_REDIS_PORT);
    }

}

