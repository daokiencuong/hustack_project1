import java.util.Scanner;

public class count_words {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        //StringBuilder được dùng để tạo và xử lý chuỗi có thể thay đổi
        StringBuilder inputText = new StringBuilder();

        // Đọc cho đến khi không còn input
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();

            //append method thêm chuỗi line vào cuối input text, kèm enter xuống dòng
            inputText.append(line);
        }

        String[] r = inputText.toString().split("\\s+");


        System.out.println(r.length);
    }
}
