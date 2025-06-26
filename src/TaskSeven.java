import java.util.Scanner;

public class TaskSeven {
    //TODO: Дано целое число A. Проверить истинность высказывания:
    // «Число A является положительным».
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Введите целое число А");

        if (!scan.hasNextInt()) {
            System.out.println("Вы ввели не целое число");
        }
        else {
            int numb = scan.nextInt();
            boolean isPositive = numb > 0;

            if (isPositive) {
                System.out.println("Число A является положительным");
            }
            else {
                System.out.println("Число A не является положительным");
            }
        }
    }
}
