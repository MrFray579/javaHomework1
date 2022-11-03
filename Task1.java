import java.util.Scanner;

public class Task1 {

    //Реализовать функцию возведения числа а в степень b. a, b – целые числа.
    //
    //Пример 1: а = 3, b = 2, ответ: 9
    //Пример 2: а = 2, b = -2, ответ: 0.25
    //Пример 3: а = 3, b = 0, ответ: 1
    public static void main(String[] args) {
        Task1 task1 = new Task1();
        Scanner isScanner = new Scanner(System.in);
        System.out.printf("a = ");
        int a = Integer.parseInt(isScanner.nextLine());
        System.out.printf("b = ");
        int b = Integer.parseInt(isScanner.nextLine());
        System.out.printf("a^b = %.0f", task1.exponentiation(a, b));
        isScanner.close();
    }

    public double exponentiation(int a, int b){
        return (Math.pow(a, b));
    }
}
