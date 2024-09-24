import java.util.Scanner;

public class count_odd {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int old = 0, even = 0;

        for(int i = 0; i < n ; i++){
            int a = scn.nextInt();
            if(a%2 == 0){
                even++;
            } else {
                old++;
            }
        }

        System.out.println(old + " " + even);
    }
}
