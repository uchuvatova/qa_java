import com.example.Animal;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.List;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

@RunWith(Parameterized.class) // Напиши аннотацию для параметризованных тестов
public class FoodTest {

    private final String animalKind;
    private final List<String> expected;

    public FoodTest(List<String> expected, String animalKind) {
        this.animalKind = animalKind;
        this.expected = expected;}

    @Parameterized.Parameters
    public static Object[][] getFoodData() {
        return new Object[][] {
                { List.of("Трава", "Различные растения"), "Травоядное"},
                { List.of("Животные", "Птицы", "Рыба"), "Хищник"},};
    }
    @Test
    public void getFoodSomeAnimalKindShowsFood() throws Exception {
        Animal animal = new Animal();
        List<String> actual = animal.getFood(animalKind);
        assertEquals(expected, actual);
    }

    @Test
    public void incorrectAnimalKindShouldThrowException()  {
        Exception e = assertThrows(Exception.class, () -> {
            Animal animal = new Animal();
            animal.getFood("Всеядное");});
        String expected = "Неизвестный вид животного, используйте значение Травоядное или Хищник";
        String actual = e.getMessage();
        assertEquals(expected, actual);}
}