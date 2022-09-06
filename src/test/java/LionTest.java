import com.example.*;
import org.junit.Test;
import java.util.List;
import static org.junit.Assert.*;

public class LionTest {

        @Test
        public void checkLionMaleHasMane() throws Exception {
        Lion lion = new Lion("Самец");
        assertEquals(lion.doesHaveMane(), true);}

        @Test
        public void checkLionFemaleHasNotMane() throws Exception {
        Lion lion = new Lion("Самка");
        assertEquals(lion.doesHaveMane(), false);}

        @Test
        public void getKittensFemaleOneAmountShowsOk() throws Exception {
                Lion lion = new Lion("Самка");
                assertEquals(lion.getKittens(), 1);}

        @Test
        public void getKittensMaleZeroAmountShowsOk() throws Exception {
                Lion lion = new Lion("Самец");
                assertEquals(lion.getKittens(), 0);}

        @Test
        public void incorrectLionSexShouldThrowException()  {
                Exception e = assertThrows(Exception.class, () -> {Lion lion = new Lion("Male");});
                String expected = "Используйте допустимые значения пола животного - самец или самка";
                String actual = e.getMessage();
                assertEquals(expected, actual);}

        @Test
        public void checkLionIsEatingMeat() throws Exception {
                Lion lion = new Lion("Самец");
                assertEquals(List.of("Животные", "Птицы", "Рыба"), lion.eatMeat());
                }
        }