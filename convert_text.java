import java.util.*;
public class convert_text {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //StringBuilder được dùng để tạo và xử lý chuỗi có thể thay đổi
        StringBuilder inputText = new StringBuilder();

        // Đọc cho đến khi không còn input
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();

            //append method thêm chuỗi line vào cuối input text, kèm enter xuống dòng
            inputText.append(line).append("\n");
        }
        
        // Chuyển đổi văn bản thành chữ in hoa
        String upperText = inputText.toString().toUpperCase();
        
        // In ra kết quả
        System.out.println(upperText);

    }
}
