package HW2;

public class FractionNumberOperationImpl implements FractionNumber {
    public FractionNumber add(FractionNumber a, FractionNumber b) {
        FractionNumber result = new FractionNumberImplements();
        result.setDivident(a.getDivident()*b.getDivisor()+a.getDivisor()*b.getDivident());
        result.setDivisor(a.getDivisor()*b.getDivisor());
        return result;
    }
    public FractionNumber sub(FractionNumber a, FractionNumber b) {
        FractionNumber result = new FractionNumberImplements();
        result.setDivident(a.getDivident()*b.getDivisor()-a.getDivisor()*b.getDivident());
        result.setDivisor(a.getDivisor()*b.getDivisor());
        return result;
    }

    public FractionNumber mul(FractionNumber a, FractionNumber b) {
        FractionNumber result = new FractionNumberImplements();
        result.setDivident(a.getDivident()*b.getDivident());
        result.setDivisor(a.getDivisor()*b.getDivisor());
        return result;
    }

    public FractionNumber div(FractionNumber a, FractionNumber b) {
        return mul(a, new FractionNumberImplements(b.getDivisor(), b.getDivident()));
    }

    @Override
    public int getDivident() {
        return 0;
    }

    @Override
    public int getDivisor() {
        return 0;
    }

    @Override
    public void setDivident(int divident) {

    }

    @Override
    public void setDivisor(int divisor) {

    }

    @Override
    public double value() {
        return 0;
    }
}
