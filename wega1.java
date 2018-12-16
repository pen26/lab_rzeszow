import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;


public class wega1 {

    public static void main(String[] args) {
        String[] slowa = new String[1000];
        String[] przekaz = new String[25];

        try {
            Scanner sc = new Scanner(new File("c:/sygnaly.txt"));
            for (int i = 0; i < 1000; i++) {
                //String slowo;
                String slowo = sc.nextLine();
                slowa[i] = slowo;
            }
            sc.close();
            for (int i = 0; i < slowa.length; i++) {
                System.out.println(slowa[i] + "%" + i);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Brak pliku sygnaly.txt");
            System.exit(0);
        }
        int i = 39;
        int k = 0;
        while (i < slowa.length) {
            String slowo = slowa[i];
            przekaz[k] = slowo;
            i = i + 40;
            k++;
        }
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@" + "\n\n");
        for (int l = 0; l < przekaz.length; l++) {
            System.out.print(przekaz[l].charAt(9));
        }
        System.out.println("\n*************************");
    }
}