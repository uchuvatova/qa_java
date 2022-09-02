import com.example.Cat;
import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {

    @Mock
    Feline feline; // создали мок
    @Test
    public void checkCatIsEatingMeat() throws Exception {
       Cat cat = new Cat(feline);
        assertEquals(cat.getFood(), feline.eatMeat());}


    @Test
    public void checkCatGetSoundMeow() {
        Cat cat = new Cat(feline);
        assertEquals(cat.getSound(), "Мяу");}


}