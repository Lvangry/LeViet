/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package de01;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Program {
    public static void main(String[] args) {
        QLCauThu qlCauThu = new QLCauThu();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Chọn chức năng:");
            System.out.println("1. Xuất thông tin danh sách cầu thủ");
            System.out.println("2. Thêm cầu thủ mới");
            System.out.println("3. Tìm cầu thủ có lương thực lãnh cao nhất");
            System.out.println("4. Sắp xếp danh sách cầu thủ theo lương thực lãnh");
            System.out.println("5. Tính lương cứng trung bình");
            System.out.println("0. Thoát");

            int chon = scanner.nextInt();
            scanner.nextLine(); 
            switch (chon) {
                case 1:
                    qlCauThu.xuatThongTin();
                    break;
                case 2:
                    System.out.println("Nhập số áo:");
                    int soao = scanner.nextInt();
                    scanner.nextLine(); // consume newline
                    System.out.println("Nhập họ tên:");
                    String hoten = scanner.nextLine();
                    System.out.println("Nhập năm sinh:");
                    int namsinh = scanner.nextInt();
                    System.out.println("Nhập lương cứng:");
                    double luongcung= scanner.nextDouble();
                    System.out.println("Nhập tiền thưởng:");
                    double tienthuong = scanner.nextDouble();
                    System.out.println("Nhập tiền phạt:");
                    double tienphat = scanner.nextDouble();
                    CauThu cauThu = new CauThu(soao, hoten, namsinh, luongcung, tienthuong, tienphat);
                    qlCauThu.themCauThu(cauThu);
                    break;
                case 3:
                    qlCauThu.timCauThuLuongCaoNhat();
                    break;
                case 4:
                    qlCauThu.sapXepTheoLuong();
                    break;
                case 5:
                    qlCauThu.tinhLuongCungTrungBinh();
                    break;
                case 0:
                    System.out.println("Thoát chương trình.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
            }
        }
    }
}
