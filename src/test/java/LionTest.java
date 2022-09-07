import com.example.*;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.List;
import static org.junit.Assert.*;

public class LionTest {
        @Mock
        Feline feline;
        @Test
        public void testGetKittensLion() throws Exception {
                //int expectedResult = 1;
                Lion lion = new Lion("Самец", feline);
                Mockito.when(feline.getKittens()).thenReturn(1);
                int actualResult = lion.getKittens();
                assertEquals(1, actualResult);
        }

        @Test
        public void incorrectLionSexShouldThrowException()  {
                Exception e = assertThrows(Exception.class, () -> {Lion lion = new Lion("Male", feline);});
                String expected = "Используйте допустимые значения пола животного - самец или самка";
                String actual = e.getMessage();
                assertEquals(expected, actual);}

        @Test
        public void checkLionIsEatingMeat() throws Exception {
                Lion lion = new Lion("Самец", feline);
                assertEquals(List.of("Животные", "Птицы", "Рыба"), lion.getFood());
                }
        }