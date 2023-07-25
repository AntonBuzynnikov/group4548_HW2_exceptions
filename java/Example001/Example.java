package Example001;


import java.util.InputMismatchException;
import java.util.Scanner;

/*
* Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
* и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения,
* вместо этого, необходимо повторно запросить у пользователя ввод данных.
* */
public class Example {
    public static void main(String[] args) {
        System.out.println(input());
    }
    public static float input() {
        System.out.print("Введите число: ");
        Scanner scan = new Scanner(System.in);
        do{
            try{
                return scan.nextFloat();
            } catch (InputMismatchException e){
                System.out.println("Повторите ввод!");
                scan.nextLine();
            }
        } while (true);
    }
}