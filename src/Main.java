import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Cup cup1 = new Cup("Pierwszy Kubek", 500);
        Cup cup2 = new Cup("Drugi Kubek", 500);
        Cup cup3 = new Cup("Trzeci Kubek", 500);
        Cup cup4 = new Cup("Czwarty Kubek", 450);
        Cup cup5 = new Cup("Trzeci Kubek", 450);
        Cup cup6 = new Cup("Czwarty Kubek", 450);


        Cup[] oldArray = {cup1, cup2, cup3, cup1, cup5, cup2};

        Cup[] cups = new Cup[6];

      if(checkIfExist(cup1,cups)){
          cups[0] = cup1;
      }
       if(checkIfExist(cup2,cups)){
           cups[1] = cup2;
       }
       if(checkIfExist(cup3,cups)){
           cups[2] = cup3;
       }
       if (checkIfExist(cup1,cups)){
           cups[3] = cup1;
       }
       if (checkIfExist(cup2,cups)){
           cups[4] = cup2;
       }
       if(checkIfExist(cup5,cups)){
           cups[5] = cup5;
       }


        System.out.println(Arrays.toString(cups));
    }

    //ta metoda sprawdzi czy sprawdzany komputer znajduje sie w tej tabeli.
//    jesli juz taki jest, to zwraca false;
    static boolean checkIfExist(Cup c, Cup[] cups) {
        for (Cup cup : cups) {
            if (c.equals(cup)) {
                return false;
            }

        }
        return true;
    }

//    static void compareCups(Cup c, Cup[] cups) {
//        for (int i = 0; i < cups.length; i++) {
//            if (checkIfExist(c, cups)) {
//                cups[i] = c;
//            }
//            else
//                cups[i] = null;
//        }
//    }
}

