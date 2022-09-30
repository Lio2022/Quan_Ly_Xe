import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        QLFuntion qlFuntion = new QLFuntion();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("----------------MENU--------------");
            System.out.println("0. show");
            System.out.println("1. Thêm xe");
            System.out.println("2. Sửa 1 xe");
            System.out.println("3. Xóa 1 xe");
            System.out.println("4. Tìm phương tiện theo hãng sản xuất và màu");
            System.out.println("5. Sắp xếp theo ID");
            System.out.println("6. Thoát");
            System.out.print("Nhập phím muốn chọn: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 0:
                    qlFuntion.show();
                    break;
                case 1:
                    qlFuntion.add();
                    qlFuntion.show();
                    break;
                case 2:
                    qlFuntion.edit();
                    break;
                case 3:
                    qlFuntion.delete();
                    qlFuntion.show();
                    break;
                case 4:
                    qlFuntion.timkiem();
                    break;
                case 5:
                    qlFuntion.sapxep();
                    qlFuntion.show();
                    break;

            }
        }
    }
}

