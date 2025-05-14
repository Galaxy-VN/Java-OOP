package io.github.galaxyvn.buoi3.congty;

import java.util.Scanner;

public class NhanVien {
    public String hoTen;
    private long cccd;
    public String phongBan;

    public NhanVien() {
        hoTen = "";
        cccd = 0;
        phongBan = "";
    }

    public NhanVien(String hoTen, long cccd, String phongBan) {
        this.hoTen = hoTen;
        this.cccd = cccd;
        this.phongBan = phongBan;
    }

    public NhanVien(NhanVien nhanVien) {
        this.hoTen = nhanVien.hoTen;
        this.cccd = nhanVien.cccd;
        this.phongBan = nhanVien.phongBan;
    }

    public void input() {
        Scanner scn = new Scanner(System.in);
        System.out.println("Nhap ten nhan vien: ");
        hoTen = scn.nextLine();
        System.out.println("Nhap cccd: ");
        cccd = scn.nextLong();
        System.out.println("Nhap phong ban: ");
        phongBan = scn.next();
//        scn.close(); -> Error cause by close System.in
    }

    public void output() {
        System.out.println("NhanVien [hoten=" + hoTen + ", cccd=" + cccd + ", phongban=" + phongBan + "]");
    }

    public float tinhLuong() {
        return 0.0f;
    }

    public long getCccd() {
        return cccd;
    }

    public void setCccd(long cccd) {
        this.cccd = cccd;
    }

    @Override
    public String toString() {
        return "NhanVien [" +
                "hoTen='" + hoTen + '\'' +
                ", cccd=" + cccd +
                ", phongBan='" + phongBan + '\'' +
                ']';
    }
}
