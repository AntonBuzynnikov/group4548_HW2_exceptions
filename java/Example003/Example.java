package Example003;

import java.io.FileNotFoundException;

public class Example {
    public static void main(String[] args) throws Exception {
        int a = 90;
        int b = 3;
        int[] abc = { 1, 2 };
        try {
            System.out.println(a / b);
            printSum(23, 234);
            abc[3] = 9;
        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (Throwable ex) {
            System.out.println("Что-то пошло не так...");
        }
    }
    public static void printSum(Integer a, Integer b) throws FileNotFoundException {
        System.out.println(a + b);
    }

}
