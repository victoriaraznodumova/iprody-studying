package lesson11.task1;

public class Main {
    public static void main(String[] args) {
        Figure[] figures = new Figure[] {new Square(3), new Triangle(2, 4, 3), new Circle(10)};
        System.out.println("Суммарная площадь всех фигур = " + findSumSquare(figures));
    }

    public static double findSumSquare(Figure[] figures){
        double sumSquare = 0;
        for (Figure figure: figures) {
            sumSquare += figure.findSquare();
            System.out.println("Площадь = " + figure.findSquare());
        }
        return sumSquare;
    }
}