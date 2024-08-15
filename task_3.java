import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class CheckIsAdultTest {

    private final int age;
    private final boolean expectedResult;

    public CheckIsAdultTest(int age, boolean expectedResult) {
        this.age = age;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters
    public static Object[][] getTestData() {
        return new Object[][] {
            // Класс эквивалентности для 18 лет
            { 17, false }, // 17 лет - не совершеннолетний
            { 18, true },  // 18 лет - совершеннолетний
            { 19, true },  // 19 лет - совершеннолетний
            { 21, true },  // 21 год - совершеннолетний
        };
    }

    @Test
    public void checkIsAdultWhenAgeThenResult() {
        Program program = new Program();
        boolean isAdult = program.checkIsAdult(age); // Передавай возраст в метод
        assertEquals("Проверка для возраста " + age, expectedResult, isAdult); // Сравни полученный и ожидаемый результаты
    }
}



