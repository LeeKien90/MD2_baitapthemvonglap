import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String studentId = "";
        String studentName = "";
        int namsinh = 0;
        boolean sex = true;
        String email = "";
        int soDienThoai = 0;
        String address = "";
        do {
            System.out.println("1. Nhập thông tin sinh viên");
            System.out.println("2. Hiển thị thông tin sinh viên");
            System.out.println("3. Tính tuổi sinh viên");
            System.out.println("4. Thoát");

            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Mã Sinh viên");
                    studentId = sc.nextLine();
                    System.out.println("Tên sinh viên");
                    studentName = sc.nextLine();
                    System.out.println("Năm sinh");
                    namsinh = Integer.parseInt(sc.nextLine());
                    System.out.println("Giói tính sinh viên");
                    sex = Boolean.parseBoolean(sc.nextLine());
                    System.out.println("Email sinh viên");
                    email = sc.nextLine();
                    System.out.println("Số điện thoại sinh viên");
                    soDienThoai = Integer.parseInt(sc.nextLine());
                    System.out.println("Địa chỉ sinh viên");
                    address = sc.nextLine();
                    break;
                case 2:
                    System.out.println("*******************STUDENT INFORMATION******************");
                    System.out.printf("%15s%7s%15s%30s%7s%15d\n","Student ID:",studentId,"Student Name:", studentName, "Sinh năm:", namsinh);
                    System.out.printf("%15s%7b%15s%30s%7s%15s\n", "Gender:", sex, "Email:", email, "Số điện thoại:", soDienThoai);
                    System.out.printf("Address: %s",address);
                    break;
                case 3:
                    int age = 2022 - namsinh;
                    System.out.println("Tuổi của sinh viên là: " + age);
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.err.println("Vui long nhap tu 1-4");
            }
        }while (true);
    }
}