package HW3;

public class DemoMatrix {
    public static void main(String[] args) {
        IMatrix a=new IMatrixImpl(5, 5);
        a.setValueAt(1,1,25);
        System.out.println(a.getValueAt(1,1));

 IMatrix b=new IMatrixImpl(5,5);
b.fillMatrix(5.3);
        System.out.println(b.getValueAt(2,2));

        System.out.println(a.add(b));
        System.out.println(a);

        System.out.println(a.mul(15));
        System.out.println(a.mul(b));
        System.out.println(a.compareMatrix(b));
        System.out.println(a.isIdentityMatrix());
        System.out.println(a.isNullMatrix());
        System.out.println(a.sub(b));

    }
}
