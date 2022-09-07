import com.example.Alex;
import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.mockito.Mock;

import java.util.List;
import static org.junit.Assert.assertEquals;

public class AlexTest {
    @Mock
    Feline feline;
    @Test
    public void checkPlaceOfLivingIsNewYorkZoo() throws Exception {
        Alex alex = new Alex(feline);
        assertEquals("Нью-Йоркский зоопарк", alex.getPlaceOfLiving());}

    @Test
    public void checkFriendsAreMartieGloriaMelman() throws Exception {
        Alex alex = new Alex(feline);
        assertEquals(List.of("Марти", "Глория", "Мелман"), alex.getFriends());}

    @Test
    public void getKittensAlexZeroAmountShowsOk() throws Exception {
        Alex alex = new Alex(feline);
        assertEquals(0, alex.getKittens());}
}
