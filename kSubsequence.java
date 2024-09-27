import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class KSubsequence {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] ab = br.readLine().split(" ");
        int a = Integer.parseInt(ab[0]);
        int b = Integer.parseInt(ab[1]);

        String[] input = br.readLine().split(" ");

        int count = 0;
        int currentSum = 0;

        for (int i = 0; i < b; i++) {
            currentSum += Integer.parseInt(input[i]);
        }
        
        if (currentSum % 2 == 0) {
            count++;
        }

        for (int i = b; i < a; i++) {
            currentSum = currentSum - Integer.parseInt(input[i - b]) + Integer.parseInt(input[i]);
            
            if (currentSum % 2 == 0) {
                count++;
            }
        }

        System.out.println(count);
    }
}
