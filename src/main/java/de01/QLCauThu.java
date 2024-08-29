/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package de01;

/**
 *
 * @author ADMIN
 */


import java.util.ArrayList;
import java.util.Collections;

public class QLCauThu {
    private final ArrayList<CauThu> danhSachCauThu;

    public QLCauThu() {
        danhSachCauThu = new ArrayList<>();
        danhSachCauThu.add(new CauThu(1, "Nguyen Van A", 1990, 3000, 500, 200));
        danhSachCauThu.add(new CauThu(2, "Le Thi B", 1992, 3500, 600, 100));
        danhSachCauThu.add(new CauThu(3, "Tran Van C", 1988, 3200, 700, 300));
        danhSachCauThu.add(new CauThu(3, "Tran Van C", 1988, 3200, 700, 300));
        
    }

    // Them cau thu moi
    public void themCauThu(CauThu cauThu) {
        for (CauThu ct : danhSachCauThu) {
            if (ct.getSoao() == cauThu.getSoao()) {
                System.out.println("Số áo đã tồn tại.");
                return;
            }
        }
        danhSachCauThu.add(cauThu);
    }

    // Xuat thong tin
    public void xuatThongTin() {
        double tongLuong = 0;
        for (CauThu cauThu : danhSachCauThu) {
            System.out.println(cauThu);
            tongLuong += cauThu.tinhLuongThucLanh();
        }
        System.out.printf("Tổng tiền lương CLB phải trả: %.2f\n", tongLuong);
    }

    // TIm cau thu luong cao nhat
    public void timCauThuLuongCaoNhat() {
        if (danhSachCauThu.isEmpty()) return;

        double maxLuong = Double.MIN_VALUE;
        for (CauThu cauThu : danhSachCauThu) {
            double luongThucLanh = cauThu.tinhLuongThucLanh();
            if (luongThucLanh > maxLuong) {
                maxLuong = luongThucLanh;
            }
        }
        System.out.println("Cầu thủ có lương thực lãnh cao nhất:");
        for (CauThu cauThu : danhSachCauThu) {
            if (cauThu.tinhLuongThucLanh() == maxLuong) {
                System.out.println(cauThu);
            }
        }
    }

    // Sap xep
    public void sapXepTheoLuong() {
        Collections.sort(danhSachCauThu, (CauThu ct1, CauThu ct2) -> Double.compare(ct1.tinhLuongThucLanh(), ct2.tinhLuongThucLanh()));
        System.out.println("Danh sách cầu thủ sau khi sắp xếp theo lương thực lãnh:");
        xuatThongTin();
    }

    // Luong cung trung binhh
    public void tinhLuongCungTrungBinh() {
        if (danhSachCauThu.isEmpty()) return;
        double tongLuongCung = 0;
        for (CauThu cauThu : danhSachCauThu) {
            tongLuongCung += cauThu.getLuongcung();
        }
        double luongCungTrungBinh = tongLuongCung / danhSachCauThu.size();
        System.out.printf("Lương cứng trung bình của các cầu thủ: ", luongCungTrungBinh);
    }
}