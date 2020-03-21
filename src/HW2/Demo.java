package HW2;

public class Demo {
    public static void main(String[] args) {

    FractionNumberOperationImpl fractionNumberOperation =new FractionNumberOperationImpl();
    FractionNumber a= new FractionNumberImplements(1,2);
    FractionNumber b=new FractionNumberImplements(3,5);

        System.out.println(a.value());
        System.out.println(b.value());

        System.out.println(fractionNumberOperation.mul(a,b));
        System.out.println(fractionNumberOperation.div(a,b));
        System.out.println(fractionNumberOperation.add(a,b));
        System.out.println(fractionNumberOperation.sub(a,b));
}}
