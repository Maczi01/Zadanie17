import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Cup cup1 = new Cup("Pierwszy Kubek", 500);
        Cup cup2 = new Cup("Drugi Kubek", 500);
        Cup cup3 = new Cup("Trzeci Kubek", 500);
        Cup cup4 = new Cup("Czwarty Kubek", 450);
        Cup cup5 = new Cup("Trzeci Kubek", 450);
        Cup cup6 = new Cup("Czwarty Kubek", 450);

        Cup[] oldArray = {cup1, cup3, cup3, cup1, cup2, null};

        Cup[] cups = /*new Cup[3];*/
                {cup1, null, null};

        while (!isFull(cups)) {
            insertIntoArray(loadNew(), cups);
        }
        System.out.println(Arrays.toString(cups));
    }

    static int findFirstFreeIndex(Cup[] cups) {
        int freeIndex = 0;
        for (int i = 0; i < cups.length; i++) {
            if (cups[i] == null) {
                freeIndex = i;
                break;
            }
            freeIndex++;
        }
        return freeIndex;
    }


    //  zwraca true, jezeli ten obiekt juz istnieje w tabeli
    static boolean checkIfExistInThisArray(Cup c, Cup[] cups) {
        for (Cup cup : cups) {
            if (c.equals(cup)) {
                System.out.println("juz taki jest !");
                return true;
            }
        }
        return false;
    }

    static Cup loadNew() {
        Cup cup = new Cup();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nazwa");
        cup.setName(scanner.nextLine());
        System.out.println("Pojemnosc w ml");
        cup.setVolumeInml(scanner.nextInt());
        return cup;
    }

    //    wkłada do tablicy
    static void insertIntoArray(Cup c, Cup[] cups) {
        if (!checkIfExistInThisArray(c, cups)) {
            cups[findFirstFreeIndex(cups)] = c;
        }
    }

    //jezeli tablica jest pelna, zwraca true
    static boolean isFull(Cup[] c) {
        for (int i = 0; i < c.length; i++) {
            if ((c[i] == (null))) {
                return false;
            }
        }
        return true;
    }

}

