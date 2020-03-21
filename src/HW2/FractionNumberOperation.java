package HW2;
/**
 * Интерфейс операций с числами FractionNumber.
 * Для вывода ошибок функции могут бросать {@code ArithmeticException}
 */
public interface FractionNumberOperation {

	/**
	 * Вычитание двух чисел {@code FractionNumber}
	 * @param a первое дробное число
	 * @param b второе дробное число
	 */
	FractionNumber sub(FractionNumber a, FractionNumber b);
	
	/**
	 * Умножение двух чисел {@code FractionNumber}
	 * @param a первое дробное число
	 * @param b второе дробное число
	 */
	FractionNumber mul(FractionNumber a, FractionNumber b);
	
	/**
	 * Деление двух чисел {@code FractionNumber}
	 * @param a первое дробное число
	 * @param b второе дробное число
	 */
	FractionNumber div(FractionNumber a, FractionNumber b);
}
