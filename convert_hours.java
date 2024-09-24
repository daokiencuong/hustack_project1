import java.util.*;

public class convert_hours {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String text = scn.nextLine();

        String[] timepart = text.split(":");

        for(int i = 0; i < timepart.length; i++){
            if(timepart[i].length()!=2){
                System.out.println("INCORRECT");
                return;
            }
        }

        int h = Integer.valueOf(timepart[0]);
        int m = Integer.valueOf(timepart[1]);
        int s = Integer.valueOf(timepart[2]);

        if(timepart.length != 3 ){
            System.out.println("INCORRECT");
        } else {
            try {
                if( h< 0 || h > 23 || m < 0 || m > 59 || s < 0 || s > 59){
                    System.out.println("INCORRECT");
                } else{
                    int result = h*3600 + m*60 + s;
                    System.out.println(result);
                }
            } catch (Exception e) {
                System.out.println("INCORRECT");
            }
        }



    }
}
