import java.util.Scanner;

public class TextReplace {
    public static void main(String[] args) {
        String strP1, strP2, strT;
        Scanner scn = new Scanner(System.in);

        strP1 = scn.nextLine();
        strP2 = scn.nextLine();
        strT = scn.nextLine();

        StringBuilder result = new StringBuilder();


        int lenstrP1 = strP1.length();
        int lenstrT = strT.length();

        for (int i = 0; i < lenstrT;) {

            if (i + lenstrP1 <= lenstrT && strT.substring(i, i + lenstrP1).equals(strP1)) {
                result.append(strP2);
                i += lenstrP1; 
            } else {
                result.append(strT.charAt(i));
                i++;
            }
        }

        System.out.println(result.toString());
    }
}
