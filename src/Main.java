import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("3 ve 4 bolünebilen sayiların ortalamasi \n istenen sayiyi giriniz");
        int k = input.nextInt();
        int total = 0;
        double avarage;


        int adet = 0; //3'e ve 4'e bölünen sayi adedi;

        for (int i = 0; i <= k; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                total += i;
                adet++;

            }


        }
        avarage=total/adet;
        
        System.out.println("Ortalama: " + avarage);

    }
}