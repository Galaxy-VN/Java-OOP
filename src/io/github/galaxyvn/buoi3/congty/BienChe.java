package io.github.galaxyvn.buoi3.congty;

import java.util.Scanner;

public class BienChe extends NhanVien {
    public float bacLuong;
    public int soNgayCong;

    public BienChe() {
        super(); // -> Call parent constructor
        bacLuong = 2.0f;
        soNgayCong = 0;
    }

    public BienChe(String hoTen, long cccd, String phongBan, float bacLuong, int soNgayCong) {
        super(hoTen, cccd, phongBan);
        this.bacLuong = bacLuong;
        this.soNgayCong = soNgayCong;
    }

    public BienChe(BienChe bc) {
        super(bc.hoTen, bc.getCccd(), bc.phongBan);
        this.bacLuong = bc.bacLuong;
        this.soNgayCong = bc.soNgayCong;
    }

    @Override
    public void input() {
        super.input();
        Scanner scn = new Scanner(System.in);
        System.out.println("Nhap bac luong: ");
        bacLuong = scn.nextFloat();
        System.out.println("Nhap so ngay cong: ");
        soNgayCong = scn.nextInt();
//        scn.close();
    }

    @Override
    public void output() {
        super.output();
        System.out.println("BienChe [bacLuong=" + bacLuong + ", soNgayCong=" + soNgayCong + "]");
    }

    @Override
    public float tinhLuong() {
        float tienLuongMotNgay = bacLuong*2/24;
        return soNgayCong*tienLuongMotNgay;
    }

    @Override
    public String toString() {
        return super.toString() + " BienChe [" +
                "bacLuong=" + bacLuong +
                ", soNgayCong=" + soNgayCong +
                ']';
    }
}
