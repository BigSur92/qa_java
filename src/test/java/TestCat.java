import com.example.Cat;
import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;
@RunWith(MockitoJUnitRunner.class)
public class TestCat {
    @Mock
    Cat cat;

    Feline feline;

     @Test
      public void getCatsSound() {
        Cat cat = new Cat(feline);
        String expectedSound = "Мяу";
        String actualCatSound = cat.getSound();
        assertEquals(expectedSound, actualCatSound);
    }

    @Test
    public void checkGetFood() throws Exception {
        Feline feline = new Feline();
        Cat cat = new Cat(feline);
        List<String> expectedGetFood = List.of("Животные", "Птицы", "Рыба");
        assertEquals(expectedGetFood, cat.getFood());
    }

    @Test
    public void checkGetSoundWithMock(){
        Mockito.when(cat.getSound()).thenReturn("Гав");
        String expectedSound = "Гав";
        String actualCatSound = cat.getSound();
        assertEquals(expectedSound, actualCatSound);
    }
}
