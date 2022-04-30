import static org.junit.Assert.*;
import org.junit.*;

public class SkillDemoTest {
    @Test 
    public void addTest(){
        assertEquals(4, SkillDemo.add(1, 3));
    }
}
