package io.github.galaxyvn.buoi3.congty;

import java.util.Scanner;

public class HopDong extends NhanVien {
    public int soNgayCong;
    public float tienCongMotNgay;

    public HopDong() {
        super();
        soNgayCong = 0;
        tienCongMotNgay = 0.0f;
    }

    public HopDong(String hoTen, long cccd, String phongBan, int soNgayCong, float tienCongMotNgay) {
        super(hoTen, cccd, phongBan);
        this.soNgayCong = soNgayCong;
        this.tienCongMotNgay = tienCongMotNgay;
    }

    public HopDong(HopDong hopDong) {
        super(hopDong.hoTen, hopDong.getCccd(), hopDong.phongBan);
        this.soNgayCong = hopDong.soNgayCong;
        this.tienCongMotNgay = hopDong.tienCongMotNgay;
    }

    @Override
    public void input() {
        super.input();
        Scanner scn = new Scanner(System.in);
        System.out.println("Nhap so ngay cong: ");
        soNgayCong = scn.nextInt();
        System.out.println("Nhap tien cong mot ngay: ");
        tienCongMotNgay = scn.nextFloat();
//        scn.close();
    }

    @Override
    public void output() {
        super.output();
        System.out.println("HopDong [soNgayCong=" + soNgayCong + ", tienCongMotNgay=" + tienCongMotNgay + "]");
    }

    @Override
    public float tinhLuong() {
        return soNgayCong * tienCongMotNgay;
    }

    @Override
    public String toString() {
        return super.toString() + "HopDong [" +
                "soNgayCong=" + soNgayCong +
                ", tienCongMotNgay=" + tienCongMotNgay +
                '}';
    }
}
