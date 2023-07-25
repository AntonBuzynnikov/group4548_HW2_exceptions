package Example004;

import java.util.Scanner;

/*Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
Пользователю должно показаться сообщение, что пустые строки вводить нельзя.*/
public class Example {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        if(scan.nextLine().equals("")){
            System.err.println("Пустые строки вводить нельзя!");
            throw new Exception();
        }else{
            System.out.println("Успешно!");
        }
    }
}
