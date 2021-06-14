package Ex25;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    @Test
    void strengthPassword_Very_Weak_Basic(){
        User user = new User();
        int strength = user.strengthPassword("123");
        assertEquals(1,strength);
    }
    @Test
    void strengthPassword_Weak_Basic(){
        User user = new User();
        int strength = user.strengthPassword("abc");
        assertEquals(2,strength);
    }
    @Test
    void strengthPassword_Medicore_Basic(){
        User user = new User();
        int strength = user.strengthPassword("123456789");
        assertEquals(3,strength);
    }
    @Test
    void strengthPassword_Strong_Basic(){
        User user = new User();
        int strength = user.strengthPassword("abc123456");
        assertEquals(4,strength);
    }
    @Test
    void strengthPassword_Very_Strong_Basic(){
        User user = new User();
        int strength = user.strengthPassword("abc123456!");
        assertEquals(5,strength);
    }
    @Test
    void strengthPassword_Very_Weak_Edge(){
        User user = new User();
        int strength = user.strengthPassword("@");
        assertEquals(1,strength);
    }
    @Test
    void strengthPassword_Weak_Edge(){
        User user = new User();
        int strength = user.strengthPassword("a");
        assertEquals(2,strength);
    }
    @Test
    void strengthPassword_Mediocre_Edge(){
        User user = new User();
        int strength = user.strengthPassword("110100100"); // Blaze it
        assertEquals(3,strength);
    }
    @Test
    void strengthPassword_Strong_Edge(){
        User user = new User();
        int strength = user.strengthPassword("abcdefghijklmnopqrstuvwxyz69"); // Nice
        assertEquals(4,strength);
    }
    @Test
    void strengthPassword_Very_Strong_Edge(){
        User user = new User();
        int strength = user.strengthPassword("@Dr.Struggle|COP3330-CV01"); // Nice
        assertEquals(5,strength);
    }
    // Include Test with Exception

}