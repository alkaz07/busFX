import com.example.busfx.BridgesChecker;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test1 {
    @Test
    public void test1(){
        Assertions.assertEquals(false, BridgesChecker.check(new int[]{300}));
        Assertions.assertEquals(true, BridgesChecker.check(new int[]{500}));
        Assertions.assertEquals(false, BridgesChecker.check(new int[]{437}));

        Assertions.assertEquals(true, BridgesChecker.check(new int[]{500, 438, 600}));
        Assertions.assertEquals(false, BridgesChecker.check(new int[]{500, 437, 600}));

    }

    @Test
    public void test2(){
        Assertions.assertEquals(1, BridgesChecker.findCrash(new int[]{300}));
        Assertions.assertEquals(-1, BridgesChecker.findCrash(new int[]{500}));
        Assertions.assertEquals(1, BridgesChecker.findCrash(new int[]{437}));

        Assertions.assertEquals(-1, BridgesChecker.findCrash(new int[]{500, 438, 600}));
        Assertions.assertEquals(2, BridgesChecker.findCrash(new int[]{500, 437, 600}));

    }
}
