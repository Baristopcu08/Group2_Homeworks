package Day22;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();
        int priceOne = random.nextInt(20000)+20000;
        int priceTwo = random.nextInt(30000)+50000;
        int priceThree = random.nextInt(50000)+100000;

        String [] cars={"Honda","Toyoto","Nissan","BMV","Mercedes","Porsche","Ferrari"};
        Scanner imput=new Scanner(System.in);
        int secim=0;

        do {
            for (int i = 0; i < cars.length; i++) {                
                System.out.printf("%d - %s\n",i+1,cars[i]);
            }
            System.out.print("Seçiminiz:? ");
            secim=imput.nextInt();

            switch (secim) {
                case 1, 2, 3 -> System.out.printf("Seçtiğiniz Araba %s, fiyatı %d. İyi Günlerde Kullanın",cars[secim-1],priceOne);
                case 4, 5 -> System.out.printf("Seçtiğiniz Araba %s, fiyatı %d. İyi Günlerde Kullanın",cars[secim-1],priceTwo);
                case 6, 7 -> System.out.printf("Seçtiğiniz Araba %s, fiyatı %d. İyi Günlerde Kullanın",cars[secim-1],priceThree);
                default -> {
                    System.out.println("-".repeat(30));
                    System.err.print("Lütfen listedeki bir aracı seçiniz\n");
                }
            }
        }while (secim<=0 | secim>=8);

    }
}
