package es.upm.miw.iwvg_devops.code;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UserTest {
    private User user;

    @BeforeEach
    void before() {
        user = new User("1", "bob", "boz", null);
    }

    @Test
    void testUserStringString() {
        assertEquals("1",this.user.getId());
        assertEquals("bob",this.user.getName());
        assertEquals("boz",this.user.getFamilyName());
    }

    @Test
    void testUser() {
        this.user = new User();
        assertEquals(new ArrayList<>(),this.user.getFractions());
    }

    @Test
    void testFullName(){
        assertEquals(this.user.getName()+" "+this.user.getFamilyName(),this.user.fullName());
    }

    @Test
    void testInitials(){
        assertEquals("b.",this.user.initials());
    }
}
