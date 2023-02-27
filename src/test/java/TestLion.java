import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class TestLion {
    private String checkSex;
    private boolean checkHasMane;
    public TestLion(String checkSex, boolean checkHasMane) {
        this.checkSex = checkSex;
        this.checkHasMane = checkHasMane;
    }
    @Parameterized.Parameters //параметаризируем данные вопросы/ответы
    public static Object[][] answers() {
        return new Object[][]{
                {"Самец",true},
                {"Самка",false},
        };
    }
    @Test
    public void checkLionIf() throws Exception{
        Feline feline = new Feline();
        Lion lion = new Lion(checkSex, feline);
        boolean expectedHasMain = checkHasMane;
        assertEquals(expectedHasMain, lion.doesHaveMane());
    }
    @Test(expected = Exception.class)
    public void checkExceptionLion() throws Exception{
        Feline feline = new Feline();
        Lion lion = new Lion("Самурай", feline);
    }

    @Test
    public void checkGetFood() throws Exception {
        Feline feline = new Feline();
        Lion lion = new Lion("Самец", feline);
        List<String> expectedGetFood = List.of("Животные", "Птицы", "Рыба");
        assertEquals(expectedGetFood, lion.getFood());
    }
    @Test
    public void checkHasMane() throws Exception {
        Feline feline = new Feline();
        Lion lion = new Lion("Самец", feline);
        boolean expectedHasMain = true;
        assertEquals(expectedHasMain, lion.doesHaveMane());
    }
    @Test
    public void checkGetKittens() throws Exception {
        Feline feline = new Feline();
        Lion lion = new Lion("Самец", feline);
        int expectedGetKittens = 1;
        int actualGetKittens = lion.getKittens();
        assertEquals(actualGetKittens, expectedGetKittens);
    }
}
