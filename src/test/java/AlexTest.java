import com.example.Alex;
import com.example.Lion;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class AlexTest {

    @Test
    public void checkPlaceOfLivingIsNewYorkZoo() throws Exception {
        Alex alex = new Alex("Самец");
        assertEquals(alex.getPlaceOfLiving(), "Нью-Йоркский зоопарк");}

    @Test
    public void getKittensZeroAmountShowsOk() throws Exception {
        Alex alex = new Alex ("Самец");
        assertEquals(alex.getKittens(), 0);}

    @Test
    public void checkFriendsAreMartieGloriaMelman() throws Exception {
        Alex alex = new Alex("Самец");
        assertEquals(alex.getFriends(), List.of("Марти", "Глория", "Мелман"));}
}
