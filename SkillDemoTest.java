import static org.junit.Assert.*;
import org.junit.*;

public class SkillDemoTest {
    @Test 
    public void addTest(){
        assertEquals(5, SkillDemo.add(1, 3));
    }
}
