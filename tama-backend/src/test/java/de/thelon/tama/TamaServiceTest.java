package de.thelon.tama;

import de.thelon.tama.model.User;
import de.thelon.tama.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@Disabled
@Slf4j
public class TamaServiceTest {

    @Autowired
    UserService userService;

    @Test
    void whenSaveAndReadUser_thenDone(){

        User userPeter = new User("1","Peter");
        userService.saveUser(userPeter);

        log.info(""+userService.getUser("1"));

        assertEquals((User)userService.getUser("1"), userPeter,"String is not Peter.");
    }

}
