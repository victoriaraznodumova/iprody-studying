package lesson11.task1;

public class Square implements Figure{
    private double a;
    @Override
    public double findSquare() {
        return a * a;
    }
    public Square(double a) {
        this.a = a;
    }
    public double getA() {
        return a;
    }
}