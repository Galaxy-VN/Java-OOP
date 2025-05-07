package io.github.galaxyvn.buoi2;

import java.util.Arrays;

public class SinhVien {
    long maSV;
    public String ten;
    private float diemVan;
    private float diemToan;

    public SinhVien() {
        this.maSV = 100;
        this.ten = "Tran Van Teo";
        this.diemVan = 1.F;
        this.diemToan = 1.F;
    }

    public SinhVien(SinhVien sv) {
        this.maSV = sv.maSV;
        this.ten = sv.ten;
        this.diemVan = sv.diemVan;
        this.diemToan = sv.diemToan;
    }

    public SinhVien(long maSV, String ten, float diemVan, float diemToan) {
        this.maSV = maSV;
        this.ten = ten;
        this.diemVan = diemVan;
        this.diemToan = diemToan;
    }

    public static void main(String[] args) {
        SinhVien sv = new SinhVien();
        System.out.println(sv);
        sv.ten = "Nguyen Thi Hai";
        sv.setDiemToan(5.F);
        sv.setDiemVan(8.F);
        System.out.println(sv);
        System.out.println();

        SinhVien sv1 = new SinhVien(sv);
        System.out.println(sv1);
        sv1.ten = "Nguyen Thi Ba";
        sv1.setDiemVan(7.5F);
        System.out.println(sv1.ten + " " + sv1.getDiemVan());
    }

    public float getDiemVan() {
        return diemVan;
    }

    public void setDiemVan(float diemVan) {
        this.diemVan = diemVan;
    }

    public float getDiemToan() {
        return diemToan;
    }

    public void setDiemToan(float diemToan) {
        this.diemToan = diemToan;
    }

    @Override
    public String toString() {
        return "maSV=" + maSV +
                ", ten='" + ten + '\'' +
                ", diemVan=" + diemVan +
                ", diemToan=" + diemToan +
                ']';
    }
}
