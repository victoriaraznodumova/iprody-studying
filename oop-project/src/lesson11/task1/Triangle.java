package lesson11.task1;

public class Triangle implements Figure{
    private double a;
    private double b;
    private double c;
    public double findSemiPerimeter(double a, double b, double c){
        return (a + b + c) / 2;
    }
    @Override
    public double findSquare() {
        double p = findSemiPerimeter(a, b, c);
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double getA() {
        return a;
    }
    public double getB() {
        return b;
    }
    public double getC() {
        return c;
    }
}