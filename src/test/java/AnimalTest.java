import com.example.Animal;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class AnimalTest {
    @Test
    public void incorrectAnimalKindShouldThrowException()  {
        Exception e = assertThrows(Exception.class, () -> {
            Animal animal = new Animal();
            animal.getFood("Всеядное");});
        String expected = "Неизвестный вид животного, используйте значение Травоядное или Хищник";
        String actual = e.getMessage();
        assertEquals(expected, actual);}
}
