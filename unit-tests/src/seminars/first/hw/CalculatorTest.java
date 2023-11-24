package src.seminars.first.hw;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class CalculatorTest {
    /**
     * test function for calculatingDiscount()
     */
    public static void testCalculatingDiscount(){
        // 1. Positive case check: using 'if'
        if (50 != Calculator.calculatingDiscount(100, 50)) {
            throw new AssertionError("Ошибка в методе");
        }

        // 2. Negative case check: wrong argument and Exception throw
        try {
            Calculator.calculatingDiscount(0, 20);
        } catch (ArithmeticException e) {
            if (!e.getMessage().contains("Недопустимый аргумент в функции")){
                throw new AssertionError("Ошибка в методе");
            }
        }

        // 3. Positive case check: using 'assert'
        assert 45 == Calculator.calculatingDiscount(100, 55): "Ошибка в методе";

        // 4. Positive case check: using AssertJ
        assertThat(Calculator.calculatingDiscount(100, 30)).isEqualTo(70);

        // 5. Check expected Exception: using AssertJ:
        assertThatThrownBy(() ->
                Calculator.calculatingDiscount(100, 101)
        ).isInstanceOf(ArithmeticException.class);

    }
}
