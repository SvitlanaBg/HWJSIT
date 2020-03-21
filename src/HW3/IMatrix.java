package HW3;

/**
 * Интерфес работы с матрицами
 */
public interface IMatrix {

	public static int DEFAULT_MATRIX_SIZE = 1;

	/**
	 * Возвращает количество строк матрицы
	 */
	int getRows();

	/**
	 * Возвращает количество столбцов матрицы
	 */
	int getColums();

	/**
	 * Возвращает элемент матрицы по индексам
	 */
	double getValueAt(int rowIndex, int colIndex);

	/**
	 * Устанавливает элемент матрицы по индексам
	 */
	void setValueAt(int rowIndex, int colIndex, double value);

	/**
	 * Заполняет текущую матрицу заданным значением
	 */
	void fillMatrix(double value);

	/**
	 * Возвращает сумму текущей матрицы и второго аргумента.
	 * (После выполнения функции текущая матрица не должна быть изменена!
	 * Результат операции - новый объект матрицы)
	 * 
	 * @param otherMatrix - второй аргумент (матрица)
	 * @return сумма матриц(новый объект матрицы)
	 * @throws IllegalArgumentException если текущая матрица и второй аргумент
	 * имеют несовместимое количество строк и (или) столбцов
	 * @throws NullPointerException если второй аргумент null
	 */
	IMatrix add(IMatrix otherMatrix);

	/**
	 * Возвращает разность текущей матрицы и второго аргумента.
	 * (После выполнения функции текущая матрица не должна быть изменена!
	 * Результат операции - новый объект матрицы)
	 * 
	 * @param otherMatrix - второй аргумент (матрица)
	 * @return разность матриц(новый объект матрицы)
	 * @throws IllegalArgumentException если текущая матрица и второй аргумент
	 * имеют несовместимое количество строк и (или) столбцов
	 * @throws NullPointerException если второй аргумент null
	 */
	IMatrix sub(IMatrix otherMatrix);

	/**
	 * Возвращает произведение текущей матрицы и второго аргумента.
	 * (После выполнения функции текущая матрица не должна быть изменена!
	 * Результат операции - новый объект матрицы)
	 * 
	 * @param otherMatrix - второй аргумент (матрица)
	 * @return произведение матриц(новый объект матрицы)
	 * @throws IllegalArgumentException если текущая матрица и второй аргумент
	 * имеют несовместимое количество строк и (или) столбцов
	 * @throws NullPointerException если второй аргумент null
	 */
	IMatrix mul(IMatrix otherMatrix);

	/**
	 * Возвращает произведение текущей матрицы на число.
	 * (После выполнения функции текущая матрица не должна быть изменена!
	 * Результат операции - новый объект матрицы)
	 */
	IMatrix mul(double value);

	/**
	 * Возвращает транспонированную матрицу по отношению к текущей.
	 * 
	 * @return транспонированная матрицу по отношению к текущей.
	 */
	IMatrix transpose();

	/**
	 * Проверяет является ли текущая матрица единичной. Единичная матрица - матрица
	 * у которой на главной диагонали единицы, а остальные элементы нули.
	 * <blockquote>
	 * 
	 * <pre>
	 * 1 0 0 0 
	 * 0 1 0 0 
	 * 0 0 1 0 
	 * 0 0 0 1
	 * </pre>
	 * 
	 * </blockquote>
	 */
	boolean isIdentityMatrix();

	/**
	 * Проверяет является ли текущая матрица нулевой. Нулевая матрица - матрица, у
	 * которой все элементы нули.
	 */
	boolean isNullMatrix();

	/**
	 * Проверяет является ли текущая матрица квадратной.
	 */
	boolean isSquareMatrix();

	void printToConsole();

	String toString();

}