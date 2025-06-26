public class TaskThree {
    //TODO: Даны стороны прямоугольника a и b. Найти его площадь S=a*b и периметр P=2*(a+b).
    public static void main(String[] args) {
        double sideOne = 7, sideTwo = 2.5;
        double perimeter = 2 * (sideOne + sideTwo);
        double area = sideOne * sideTwo;
        System.out.println("Площадь: " + area);
        System.out.println("Периметр: " + perimeter);
    }
}
