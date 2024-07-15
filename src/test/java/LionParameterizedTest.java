import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class LionParameterizedTest {
    private final String sex;
    private final boolean hasMane;

    public LionParameterizedTest(String sex,boolean hasMane) {
        this.sex=sex;
        this.hasMane=hasMane;
    }

    @Parameterized.Parameters
    public static Object[] getLionData() {
        return new Object[][] {
                {"Самец",true},
                {"Самка",false},
        };
    }

    @Test
    public void doesHaveManeTest() throws Exception {
        Lion lion = new Lion(sex);
        boolean hasManeCheck = lion.doesHaveMane();
        assertEquals(hasManeCheck,hasMane);
    }
}
