import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number, upNumber;
        System.out.print("Lütfen Üssü Alınacak Sayıyı Giriniz = ");
        number = input.nextInt();
        System.out.print("Lütfem üs Olacak Sayıyı Giriniz = ");
        upNumber = input.nextInt();
        int total = 1;

        for (int i=1; i<= upNumber; i++){
            total *= number;
        }
        System.out.println("Cevap = " + total);

    }
}
