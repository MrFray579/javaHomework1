import java.util.Arrays;

public class Task2 {

    //На вход некоторому исполнителю подаётся два числа (a, b). У исполнителя есть две команды
    //- команда 1 (к1): увеличить в с раза, а умножается на c
    //- команда 2 (к2): увеличить на d ( +2 ), к a прибавляется d
    //Написать программу, которая выдаёт массив команд, позволяющий число a превратить в число b или сообщить, что это невозможно
    //Пример 1: а = 1, b = 7, c = 1, d = 3
    //ответ: [к1, к1, к1, к1, к1, к1] или [к1, к2, к1, к1, к1] или [к1, к1, к2, к1].
    //Пример 2: а = 11, b = 7, c = 2, d = 1
    //ответ: [].
    public static void main(String[] args) {
        Task2 task2 = new Task2();
        System.out.print(task2.doIt(11, 7, 2, 1));
    }

    public String[] doIt(int a, int b, int c, int d){
        int count_k1 = 0;
        int k1 = a;
        int num = 0;
        if (a < b){
            if (c > 1){
                while (k1<b) {
                    k1 = k1 * c;

                    if (k1 < b) {
                        num = k1;
                        count_k1 = count_k1 + 1;
                        }
                    }
            }
        }
        int k2 = 0;
        if (c<=1){
            k2 = b - a;
        }else{
            k2 = b - num;
        }
        int count_k2 = 0;
        if (k2<d){
            System.out.print("Такого не может быть");
            System.exit(0);
        }
        if (k2 >= d){    
            while (k2>0){
                k2 = k2 - d;
                if (k2 < 0){
                    System.out.println("Такого не может быть");
                    System.exit(0);
                }
                count_k2 = count_k2 + 1;
                if (k2 == 0){
    
                }
            }
        }
        int k = count_k1 + count_k2;
        String[] array = new String[k];
        for (int i = 0; i < count_k1; i++){
            array[i] = "k1";
        }
        for (int i = count_k1; i < count_k2+count_k1; i++){
            array[i] = "k2";
        }
        System.out.println(Arrays.toString(array));
        return new String[]{};
    }

}