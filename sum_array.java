import java.util.Scanner;

public class sum_array {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        // Đọc số phần tử n
        int n = myObj.nextInt();
        
        // Khởi tạo mảng với kích thước n
        int[] myArray = new int[n];

        int sum = 0;

        // Nhập từng phần tử của mảng và tính tổng
        for(int i = 0; i < n; i++){
            myArray[i] = myObj.nextInt();
            sum += myArray[i];
        }

        // In ra tổng
        System.out.println(sum);
    }
}
