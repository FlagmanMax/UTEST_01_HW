package src.seminars.first.hw;

import static src.seminars.first.hw.CalculatorTest.testCalculatingDiscount;

public class Calculator {
    public static void main(String[] args) {

        // Task1

        // Tests for method calculatingDiscount()
        testCalculatingDiscount();

        double resultTask1 = 0;
        resultTask1 = calculatingDiscount(100, 20);
        System.out.println("\tTask1: result = " + resultTask1 );
    }


    /**
     * @param purchaseAmount сумма покупки
     * @param discountAmount размер скидки
     * @return возвращает сумму покупки с учетом скидки
     *         Задание 1.
     *         ** В классе Calculator создайте метод calculateDiscount,
     *         который принимает сумму покупки и процент скидки
     *         и возвращает сумму с учетом скидки.
     *         Ваша задача - проверить этот метод с использованием
     *         библиотеки AssertJ.
     *         Если метод calculateDiscount получает недопустимые аргументы,
     *         он должен выбрасывать исключение ArithmeticException.
     *         Не забудьте написать тесты для проверки этого поведения.
     */
    public static double calculatingDiscount(double purchaseAmount, int discountAmount)
    {
        // Check that purchaseAmount > 0
        if (purchaseAmount <= 0) {
            throw new ArithmeticException("Недопустимый аргумент в функции: 'сумма покупки' = " + purchaseAmount);
        }

        // Check that 0 discountAmount >= 0
        if (discountAmount < 0 || discountAmount > 100) {
            throw new ArithmeticException("Недопустимый аргумент в функции: 'размер скидки' = " + discountAmount);
        }

        return purchaseAmount*(double)(100-discountAmount)/100;
    }
}
