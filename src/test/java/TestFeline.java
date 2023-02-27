import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

public class TestFeline {
    Feline feline;
    @Test
    public void familyName() {
    Feline feline = new Feline();
    String expectedGetFamily = "Кошачьи";
    String actualGetFamily = feline.getFamily();
    assertEquals(actualGetFamily, expectedGetFamily);
    }

    @Test
    public void kittensCountTest() {
        Feline feline = new Feline();
        int expectedGetKittens = 1;
        int actualGetKittens = feline.getKittens();
        assertEquals(actualGetKittens, expectedGetKittens);
    }
}
