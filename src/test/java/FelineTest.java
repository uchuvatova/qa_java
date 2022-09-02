import com.example.*;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class FelineTest {

    @Test
    public void checkFamilyNameIsFeline() {
        Feline feline = new Feline();
        assertEquals(feline.getFamily(), "Кошачьи");}

    @Test
    public void getKittensOneAmountShowsOk() {
        Feline feline = new Feline();
        assertEquals(feline.getKittens(), 1);}
}
