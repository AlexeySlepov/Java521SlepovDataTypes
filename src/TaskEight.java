import java.util.Scanner;

public class TaskEight {
    //TODO: Даны два ненулевых числа. Найти сумму, разность, произведение и
    // частное их квадратов.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double firstNumber, secondNumber;

        System.out.println("Введите первое ненулевое число");

        if (scan.hasNextDouble()) {
             firstNumber = scan.nextDouble();
        }
        else if (scan.hasNextInt()) {
             firstNumber = (double) scan.nextInt();
        }
        else {
            System.out.println("Вы ввели не число");
            return;
        }

        System.out.println("Введите второе ненулевое число");

        if (scan.hasNextDouble()) {
             secondNumber = scan.nextDouble();
        }
        else if (scan.hasNextInt()) {
             secondNumber = (double) scan.nextInt();
        }
        else {
            System.out.println("Вы ввели не число");
            return;
        }

        System.out.println("Сумма квадратов двух чисел: " + (Math.pow(firstNumber, 2) + Math.pow(secondNumber, 2)));
        System.out.println("Разность квадратов двух чисел: " + (Math.pow(firstNumber, 2) - Math.pow(secondNumber, 2)));
        System.out.println("Произведение квадратов двух чисел: " + (Math.pow(firstNumber, 2) * Math.pow(secondNumber, 2)));
        System.out.println("Частное квадратов двух чисел: " + (Math.pow(firstNumber, 2) / Math.pow(secondNumber, 2)));
       }
}
