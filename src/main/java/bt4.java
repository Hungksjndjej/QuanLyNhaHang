/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

public class bt4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhập số lượng phần tử
        int n;
        do {
            System.out.print("Nhap so luong phan tu n: ");
            n = sc.nextInt();

            if (n <= 0) {
                System.out.println("n phai > 0. Vui long nhap lai!");
            }
        } while (n <= 0);

        // Khai báo mảng động
        double[] diem = new double[n];

        // Nhập điểm
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap diem thu " + (i + 1) + ": ");
            diem[i] = sc.nextDouble();
        }

        // Tính tổng
        double tong = 0;
        for (int i = 0; i < n; i++) {
            tong += diem[i];
        }

        // Tính điểm trung bình
        double trungBinh = tong / n;

        // Tìm điểm cao nhất, thấp nhất và vị trí điểm cao nhất
        double caoNhat = diem[0];
        double thapNhat = diem[0];
        int viTriCaoNhat = 0;

        for (int i = 1; i < n; i++) {
            if (diem[i] > caoNhat) {
                caoNhat = diem[i];
                viTriCaoNhat = i;
            }

            if (diem[i] < thapNhat) {
                thapNhat = diem[i];
            }
        }

        // Xuất kết quả
        System.out.println("\n===== KET QUA =====");
        System.out.println("Tong diem: " + tong);
        System.out.printf("Diem trung binh: %.2f%n", trungBinh);
        System.out.println("Diem cao nhat: " + caoNhat);
        System.out.println("Diem thap nhat: " + thapNhat);
        System.out.println("Vi tri diem cao nhat: " + viTriCaoNhat);
    }
}