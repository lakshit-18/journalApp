package net.engineeringdigest.journalApp.service;

import net.engineeringdigest.journalApp.entity.User;
import net.engineeringdigest.journalApp.repository.UserRepository;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ArgumentsSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@Disabled
@SpringBootTest
public class UserServiceTests {

    @Autowired
    UserRepository userRepository;

    @Test
    public void testFindByUserName() {
        assertEquals(4, 2+2);
        User user = userRepository.findByUserName("ram");
        assertNotNull(user);
    }

    @ParameterizedTest
    @ValueSource (strings = {
            "ram",
            "shyam",
            "vipul"
    })
    public void testFindByUserName2() {
        User user = userRepository.findByUserName("ram");
        assertNotNull(user.getJournalEntries());
    }

    @ParameterizedTest
    @ArgumentsSource(UserArgumentProvider.class)
    public void testSaveNewUser() {
        User user = userRepository.findByUserName("ram");
        assertNotNull(user.getJournalEntries());
    }

    @Disabled
    @ParameterizedTest
    @CsvSource({
            "1,1,2",
            "2,2,3",
            "4,5,9"
    })
    public void test(int a, int b, int c) {
        assertEquals(a, b + c);
    }
}
