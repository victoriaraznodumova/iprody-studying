package lesson11.task1;

public class Circle implements Figure{
    private double r;
    @Override
    public double findSquare() {
        return Math.PI * r * r;
    }
    public Circle(double r) {
        this.r = r;
    }
    public double getR() {
        return r;
    }
}