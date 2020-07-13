
import java.util.Random;
import java.util.Scanner;
import static java.lang.System.*;

public class Main {


    public static void main(String[] args) {

        double millisActualTime = System.currentTimeMillis(); // początkowy czas w milisekundach.

        out.println("*********************************************************************");
        out.println("*  Napisz program obliczający wartość średnią n elementów tablicy.  *");
        out.println("*  Wypełnij tablicę losowymi liczbami                               *");
        out.println("*                                                                   *");
        out.println("*  1.    zapytaj ile losowych liczb ma być wczytanych do tablicy    *");
        out.println("*  2.    elementy tablicy powinny być int                           *");
        out.println("*  3.    wynik prawdopodobnie nie będzie wartością całkowitą        *");
        out.println("*  4.    pętla powinna wyświetlić wszystkie elementy tablicy        *");
        out.println("*  5.    na koniec powinna zostać wyświetlona wartość średniej      *");
        out.println("*                                                                   *");
        out.println("*********************************************************************");
        out.print("\n");
        out.print("\n");
        out.print("\n");


        out.print("Podaj ilość losowo generowanych elementów tablicy: ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int[] table = new int [n];
        int tableID = 1;
        int avrDenominator = 0;
        int avrTotal = 0;
        Random r = new Random();


        for (int i = 0; i < n; i++) {
            table[i] = r.nextInt(101);
            out.print("Element tablicy nr #" + tableID++);
            out.print(" -> [" + table[i] + "]\n");
            avrDenominator += table[i];
            ;
        }

        avrTotal = avrDenominator/table.length;
        out.print("\n");
        out.print("Srednia z losowo wypełnionej tablicy =  " + avrTotal);
        out.print("\n");
        out.print("\n");


        /*
            czas wykonania programu
        */
        double executionTime = System.currentTimeMillis() - millisActualTime;
        double total = executionTime/1000;

        out.format("Operacje wykonano w %.2f sekund.",total );
        out.print("\n");
        out.println("PROGRAM ZAKOńCZYł DZIAłANIE.");

    }
}
