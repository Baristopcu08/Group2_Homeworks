package Day20;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            int max;
            int min;
            int [] number = new int[10];
            Scanner input= new Scanner(System.in);

            for (int i = 0; i <10; i++) {
                System.out.print((i+1)+". sayi: ?");
                number [i]=input.nextInt();
            }
            max=number[0];
            min=number [0];
            for (int i = 1; i < 10; i++) {
                if (number[i]>max) max=number[i];
                if (number[i]<min) min=number[i];
            }

            System.out.print("Max Number="+max);
            System.out.println();
            System.out.print("Min Number="+min);
    }
}
