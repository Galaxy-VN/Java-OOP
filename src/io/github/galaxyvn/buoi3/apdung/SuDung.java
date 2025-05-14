package io.github.galaxyvn.buoi3.apdung;

import io.github.galaxyvn.buoi3.congty.BienChe;
import io.github.galaxyvn.buoi3.congty.HopDong;
import io.github.galaxyvn.buoi3.congty.NhanVien;

import java.util.Arrays;
import java.util.Scanner;

public class SuDung {

    public NhanVien arr[];

    public void inputListNhanVien() {
        Scanner scn = new Scanner(System.in);
        System.out.println("Nhap so luong nhan vien: ");
        int n = scn.nextInt();
        arr = new NhanVien[n];
        // Quy dinh: loai nhan vien = 0 -> BienChe
        //           loai nhan vien = 1 -> HopDong
        int loaiNV;
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap loai nhan vien: ");
            loaiNV = scn.nextInt();
            switch (loaiNV) {
                case 0 -> {
                    arr[i] = new BienChe();
                    arr[i].input();
                }
                case 1 -> {
                    arr[i] = new HopDong();
                    arr[i].input();
                }
                default -> System.out.println("Khong co loai nhan vien nay");
            }
        }
//        scn.close();
    }

    public void outputListNhanVien() {
        Arrays.stream(arr).forEach(nv -> {
            nv.output();
            System.out.println();
        });
    }

    public static void main(String[] args) {
        SuDung suDung = new SuDung();
        suDung.inputListNhanVien();
        System.out.println("Danh sach nhan vien sau khi nhap la:");
        suDung.outputListNhanVien();
    }
}
