package pbo;

import java.util.Scanner; //Perbaiki: Scanmer -> Scanner

public class PasienBeraksi {
    public static void main(String[] args) {
        //objek
        //asien pasien1 = new PasienDetail("Azkya Ryzkina", 20, "Demam", "Banjarbaru");

        //System.out.println(pasien1.displayInfo());
        //Scanmer scanmer = new Scmnmer(System.in);
        
        // IO SEDERHANA & ERROR HANDLING
        Scanner scanner = new Scanner(System.in);
        
        // ARRAY
        PasienDetail[] dataPasien = new PasienDetail[2];

        for (int i = 0; i < dataPasien.length; i++) {
            System.out.println("=== Input Pasien ke-" + (i+1) + " ===");
            System.out.print("Masukkan nama pasien: ");
            String nama = scanner.nextLine();

            int umur = 0;
            boolean valid = false;

            // ERROR HANDLING
            while (!valid) {
                try {
                    System.out.print("Masukkan umur pasien: ");
                    umur = Integer.parseInt(scanner.nextLine()); // error handling berlaku di sini
                    valid = true;
                } catch (NumberFormatException e) {
                    System.out.println("Umur harus berupa angka. Silakan coba lagi.");
                }
            }

            System.out.print("Masukkan penyakit pasien: ");
            String penyakit = scanner.nextLine();

            System.out.print("Masukkan kode pasien (contoh IN001 atau RJ002): ");
            String kode = scanner.nextLine();

            // OBJECT & CONSTRUCTOR
            dataPasien[i] = new PasienDetail(nama, umur, penyakit, kode);
        }

        System.out.println("\n=== DATA PASIEN ===");
        for (int i = 0; i < dataPasien.length; i++) {
            System.out.println("Pasien ke-" + (i+1));
            System.out.println(dataPasien[i].displayInfo());
        }

        PasienDetail[] pasien1 = new PasienDetail[2]; // tetap dipertahankan seperti di aslinya
    }
}