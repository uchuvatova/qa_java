import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.assertEquals;


@RunWith(Parameterized.class)
public class ManeTest {

    private final String sex;
    private final boolean expectedHasMane;
    Feline feline;

    public ManeTest(String sex, boolean expectedHasMane) {
        this.sex = sex;
        this.expectedHasMane = expectedHasMane;
    }

    @Parameterized.Parameters
    public static Object[][] getManeData() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false},};
    }
    @Test
    public void getFoodSomeAnimalKindShowsFood() throws Exception {
        Lion lion = new Lion(sex, feline);
        boolean actual = lion.doesHaveMane();
        assertEquals(expectedHasMane, actual);
    }
}