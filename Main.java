import java.util.Arrays;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
        System.out.print("\033[H\033[2J");
        System.out.println("Задание 1");
        int year = 2026;
        Scanner in = new Scanner(System.in);
        System.out.print("Какой ваш год рожджения:");
        int age1 = in.nextInt();
        int age2 = 2026 - age1;
        System.out.println("Ваш возраст: " + age2);
        if(age1 > year) {
            System.out.println("[i] Ошибка ввода года рождения, введите заново !");
        } else if (age2 < 18) {
            System.out.println("Вы несовершеннолетний !");
        } else if (age2 <= 65){
            System.out.println("Вы взрослый!");
        } else if (age2 > 65) {
            System.out.println("Вы пенсионер!");
        }
        System.out.println("");
    }

    public static void task2() {
        System.out.println("Задание 2");
        int[] num = {2, 76, 84, 3, 7, 65, 3, 9, 4, 8};
        System.out.println(Arrays.toString(num));

        int res = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] % 2 == 0) {
                res = res + num[i];
            }
        }
        System.out.println("Сумма чет элементов в масиве: " + res);

        for (int i = 0; i < num.length; i++) {
            if (num[i] % 2 == 0) {
                System.out.print(num[i] + " ");
            }
        } 
        System.out.println();
        for (int i = 0; i < num.length; i++) {
            if (num[i] % 2 != 0) {
                System.out.print(num[i] + " ");
            }
        }   
        System.out.println("");
        System.out.println("");
    }

    public static void task3() {
        System.out.println("Задание 3");
        
        for( int x= 1; x < 6; x++){
            for(int i = 1; i < 6; i++){
            System.out.println(x + " * " + i + " = " + x * i + "  ");
        }
        }
    }

}


        
