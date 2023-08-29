package Metotlar;
import java.util.Scanner;
public class RecursiveAlistirma {
    static void recursiveMethod(int num) {
        if (num <= 0) {
            System.out.print(" " + num);
            return;
        } else {
            System.out.print(" " + num);
            recursiveMethod(num - 5);
        }
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı girin: ");
        int n = scanner.nextInt();

        recursiveMethod(n);

    }
}
