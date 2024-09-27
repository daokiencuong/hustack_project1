import java.util.*;

public class extract_year {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String day = scn.nextLine();

        String[] array = day.split("-");
        
        if(array.length != 3 || array[0].length() != 4 || array[1].length() != 2 || array[2].length() != 2){
            System.out.println("INCORRECT");
            return;
        }else{
            int m = Integer.parseInt(array[1]);
            int d = Integer.parseInt(array[2]);
            if(m < 1 || m > 12 || d < 1 || d > 31){
                System.out.println("INCORRECT");
                return;
            } else {
                System.out.println(array[0] + " " + m + " " + d);
            }
        }
    }
}
