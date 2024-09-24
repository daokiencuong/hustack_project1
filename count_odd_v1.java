import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class count_odd_v1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");
        
        int old = 0, even = 0;

        for(int i = 0; i < n; i++){
            int a = Integer.parseInt(input[i]);
            if(a % 2 == 0){
                even++;
            } else {
                old++;
            }
        }

        // Tạo StringBuilder để tối ưu việc in kết quả
        StringBuilder sb = new StringBuilder();
        sb.append(old).append(" ").append(even);
        System.out.println(sb.toString());
    }
}
