/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
import java.util.Scanner;

public class bt5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] ten = new String[100];
        double[] diem = new double[100];
        int n = 0;

        int chon;

        do {
            System.out.println("\n===== QUAN LY BANG DIEM SINH VIEN =====");
            System.out.println("1. Nhap danh sach sinh vien");
            System.out.println("2. Hien thi danh sach");
            System.out.println("3. Sap xep theo diem tang dan");
            System.out.println("4. Thong ke xep loai");
            System.out.println("5. Thoat");
            System.out.print("Nhap lua chon: ");

            chon = sc.nextInt();
            sc.nextLine();

            switch (chon) {

                case 1:
                    System.out.print("Nhap so luong sinh vien: ");
                    n = sc.nextInt();
                    sc.nextLine();

                    if (n <= 0 || n > 100) {
                        System.out.println("So luong sinh vien khong hop le!");
                        n = 0;
                        break;
                    }

                    for (int i = 0; i < n; i++) {
                        System.out.println("\nSinh vien thu " + (i + 1));

                        System.out.print("Ho ten: ");
                        ten[i] = sc.nextLine();

                        do {
                            System.out.print("Diem trung binh: ");
                            diem[i] = sc.nextDouble();

                            if (diem[i] < 0 || diem[i] > 10) {
                                System.out.println("Diem phai tu 0 den 10!");
                            }

                        } while (diem[i] < 0 || diem[i] > 10);

                        sc.nextLine();
                    }

                    System.out.println("Nhap danh sach thanh cong!");
                    break;

                case 2:
                    if (n == 0) {
                        System.out.println("Chua co du lieu!");
                        break;
                    }

                    System.out.println("\n===== DANH SACH SINH VIEN =====");

                    for (int i = 0; i < n; i++) {
                        System.out.printf(
                                "%d. %-25s %.2f - %s%n",
                                i + 1,
                                ten[i],
                                diem[i],
                                xepLoai(diem[i])
                        );
                    }
                    break;

                case 3:
                    if (n == 0) {
                        System.out.println("Chua co du lieu!");
                        break;
                    }

                    // Sap xep diem tang dan
                    for (int i = 0; i < n - 1; i++) {
                        for (int j = i + 1; j < n; j++) {

                            if (diem[i] > diem[j]) {

                                // Doi diem
                                double tempDiem = diem[i];
                                diem[i] = diem[j];
                                diem[j] = tempDiem;

                                // Doi ten tuong ung
                                String tempTen = ten[i];
                                ten[i] = ten[j];
                                ten[j] = tempTen;
                            }
                        }
                    }

                    System.out.println("Da sap xep theo diem tang dan!");
                    break;

                case 4:
                    if (n == 0) {
                        System.out.println("Chua co du lieu!");
                        break;
                    }

                    int gioi = 0;
                    int kha = 0;
                    int trungBinh = 0;
                    int yeu = 0;

                    for (int i = 0; i < n; i++) {

                        if (diem[i] >= 8) {
                            gioi++;
                        } else if (diem[i] >= 6.5) {
                            kha++;
                        } else if (diem[i] >= 5) {
                            trungBinh++;
                        } else {
                            yeu++;
                        }
                    }

                    System.out.println("\n===== THONG KE XEP LOAI =====");
                    System.out.println("Gioi: " + gioi);
                    System.out.println("Kha: " + kha);
                    System.out.println("Trung binh: " + trungBinh);
                    System.out.println("Yeu: " + yeu);

                    break;

                case 5:
                    System.out.println("Da thoat chuong trinh!");
                    break;

                default:
                    System.out.println("Lua chon khong hop le!");
            }

        } while (chon != 5);

        sc.close();
    }

    // Ham xep loai
    public static String xepLoai(double diem) {

        if (diem >= 8) {
            return "Gioi";
        } else if (diem >= 6.5) {
            return "Kha";
        } else if (diem >= 5) {
            return "Trung binh";
        } else {
            return "Yeu";
        }
    }
}