package HW2;

public class FractionNumberImplements implements FractionNumber{
private int divident;
private int divisor;

    public FractionNumberImplements(int divident, int divisor) {
        this.divident = divident;
        setDivisor(divisor);
    }

    public FractionNumberImplements() {
    }

    @Override
    public int getDivident() {

        return divident;
    }

    @Override
    public int getDivisor() {

        return divisor;
    }

    @Override
    public void setDivident(int divident) {
this.divident=divident;
    }

    @Override
    public void setDivisor(int divisor) {
if (divisor==0){
    this.divisor=DEFAULT_DIVISOR_VALUE;
}else {
    this.divisor=divisor;
}
    }

    @Override
    public double value() {
        return (double) divident/divisor;
    }

    @Override
    public String toString() {

        return divident+"/"+divisor;
    }
}
