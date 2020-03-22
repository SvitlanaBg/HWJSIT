package HW3;

public class IMatrixImpl implements IMatrix {
    private int rows;
    private int colums;
    private double [][] array;

    public IMatrixImpl(int rows, int colums) {
        this.rows=rows;
        this.colums=colums;
        this.array=new double[rows][colums];
    }

    public IMatrixImpl(double[][] array) {
        this.array = array;
        this.rows=array.length;
        this.colums=array[0].length;
    }

    @Override
    public int getRows() {
        return this.rows;
    }

    @Override
    public int getColums() {
        return this.colums;
    }

    @Override
    public double getValueAt(int rowIndex, int colIndex) {
        return array[rowIndex][colIndex];
    }

    @Override
    public void setValueAt(int rowIndex, int colIndex, double value) {
this.array [rowIndex][colIndex]=value;
    }

    @Override
    public void fillMatrix(double value) {
for (int i=0; i<this.rows; i++){
    for (int j=0; j<this.colums; j++){
        this.array [i][j]=value;
    }
}
    }

       public boolean compareMatrix(IMatrix otherMatrix) {
        if (this.getRows()!=otherMatrix.getRows() || this.getColums()!=otherMatrix.getColums()){
            System.out.println("Уou cannot do operations with matrices of different sizes");
            return false;
        }else {
return true;}
    }

    @Override
    public IMatrix add(IMatrix otherMatrix) {
if (this.compareMatrix(otherMatrix)==false){
    return null;
}else {
    IMatrix c = new IMatrixImpl(otherMatrix.getRows(), otherMatrix.getColums());
    for (int i = 0; i < c.getRows(); i++) {
        for (int j = 0; j < this.getColums(); j++) {
            c.setValueAt(i, j, this.getValueAt(i, j) + otherMatrix.getValueAt(i, j));
        }
    }
    return c;
}
    }

    @Override
    public IMatrix sub(IMatrix otherMatrix) {
        if (this.compareMatrix(otherMatrix)==false){
            return null;
        }else {
            IMatrix c = new IMatrixImpl(otherMatrix.getRows(), otherMatrix.getColums());
            for (int i = 0; i < c.getRows(); i++) {
                for (int j = 0; j < this.getColums(); j++) {
                    c.setValueAt(i, j, this.getValueAt(i, j) - otherMatrix.getValueAt(i, j));
                }
            }
            return c;
        }
    }

    @Override
    public IMatrix mul(IMatrix otherMatrix) {
        IMatrix c=new IMatrixImpl(this.getRows(),otherMatrix.getColums());
        for (int i=0; i<c.getRows(); i++){
            for (int j=0; j<c.getColums(); j++){
                double value=0;
                for (int r=0; r<this.getColums(); r++){
                    value+=this.getValueAt(i,r)*otherMatrix.getValueAt(r,j);
                }
                c.setValueAt(i,j,value);
            }
        }
        return c;
    }

    @Override
    public IMatrix mul(double value) {
        IMatrix c=new IMatrixImpl(rows, colums);
        for (int i=0; i<rows; i++){
            for (int j=0; j<colums; j++){
                c.setValueAt(i, j, this.getValueAt(i,j)*value);
            }
        }
        return c;
    }

    @Override
    public IMatrix transpose() {
        IMatrix c=new IMatrixImpl(colums,rows);
        for (int i=0; i<rows; i++){
            for (int j=0; j<colums; j++){
                c.setValueAt(i, j, this.getValueAt(i,j));
            }
        }
        return c;
    }

    @Override
    public boolean isIdentityMatrix() {
if (isSquareMatrix()){
    for (int i=0; i<this.rows; i++) {
        for (int j = 0; j < this.colums; j++) {
            if (i == j && getValueAt(i, j) != 1) {
                return false;
            } else if (i != j && getValueAt(i, j) != 0) {
                return false;
            }
        }
    }
    return true;
}else {
        return false;
    }}

    @Override
    public boolean isNullMatrix() {
        for (int i=0; i<this.rows; i++) {
            for (int j = 0; j < this.colums; j++) {
                if (getValueAt(i, j) != 0) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public boolean isSquareMatrix() {
        return colums==rows;
    }

    @Override
    public void printToConsole() {
        System.out.println(toString());
    }

    public String toString() {
        StringBuilder stringBuilder=new StringBuilder();
        for (int i=0; i<this.rows; i++) {
            for (int j = 0; j < this.colums; j++) {
                stringBuilder.append(array[i][j] + " ");
            }
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }
}
