import com.example.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import static org.junit.Assert.assertEquals;


@RunWith(MockitoJUnitRunner.class)
public class LionTest {

        @Test
        public void checkLionMaleHasMane() throws Exception {
        Lion lion = new Lion("Самец");
        System.out.println(lion.doesHaveMane());}

        @Test
        public void checkLionFemaleHasNotMane() throws Exception {
        Lion lion = new Lion("Самка");
        System.out.println(lion.doesHaveMane());}

        @Mock
        Feline feline; // создали мок
        @Test
        public void checkLionIsEatingMeat() throws Exception {
                Lion lion = new Lion(feline);
                assertEquals(lion.getFood(), feline.eatMeat());}
        }