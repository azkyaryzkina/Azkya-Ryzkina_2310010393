# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi pengolahan data pasien menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menerima input berupa nama, umur, penyakit, dan kode pasien, dan memberikan output berupa informasi detail dari kode tersebut seperti jenis pasien, kategori usia, dan nomor registrasi.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `Pasien`, `PasienDetail`, dan `PasienBeraksi` adalah contoh dari class.

```bash
public class Pasien {
    ...
}

public class PasienDetail extends Pasien {
    ...
}

public class PasienBeraksi {
    ...
}
```

2. **Object** adalah instance dari class. Pada kode ini, `dataPasien[i] = new PasienDetail(nama, umur, penyakit, kodePasien);` adalah contoh pembuatan object.

```bash
dataPasien[i] = new PasienDetail(nama, umur, penyakit, kodePasien);
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `nama`, `umur`, `penyakit`, dan `kodePasien` adalah contoh atribut.

```bash
String nama;
int umur;
String penyakit;
String kodePasien;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `Pasien` dan `PasienDetail`.

```bash
public Pasien(String nama, int umur, String penyakit) {
    this.nama = nama;
    this.umur = umur;
    this.penyakit = penyakit;
}

public PasienDetail(String nama, int umur, String penyakit, String kodePasien) {
    super(nama, umur, penyakit);
    this.kodePasien = kodePasien;
}
```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setNama`, `setUmur`, `setPenyakit`, dan `setKodePasien` adalah contoh method mutator.

```bash
public void setNama(String nama) {
    this.nama = nama;
}

public void setUmur(int umur) {
    this.umur = umur;
}

public void setPenyakit(String penyakit) {
    this.penyakit = penyakit;
}

public void setKodePasien(String kodePasien) {
    this.kodePasien = kodePasien;
}
```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getNama`, `getUmur`, `getPenyakit`, `getKodePasien`, `getJenisPasien`, `getKategoriUsia`, dan `getNomorRegistrasi` adalah contoh method accessor.

```bash
public String getNama() {
    return nama;
}

public int getUmur() {
    return umur;
}

public String getPenyakit() {
    return penyakit;
}

public String getKodePasien() {
    return kodePasien;
}
```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut `nama`, `umur`, `penyakit`, dan `kodePasien` dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

```bash
private String nama;
private int umur;
private String penyakit;
private String kodePasien;
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `PasienDetail` mewarisi `Pasien` dengan sintaks `extends`.

```bash
public class PasienDetail extends Pasien {
    ...
}
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding. Pada kode ini, method `displayInfo` di `PasienDetail` merupakan override dari method `displayInfo` di `Pasien`.

```bash
@Override
public String displayInfo() {
    ...
}
```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi `if else` dalam method `getKategoriUsia` dan seleksi `switch` dalam method `getJenisPasien`.

```bash
public String getKategoriUsia() {
    if (getUmur() <= 12) {
        return "Anak-anak";
    } else if (getUmur() <= 25) {
        return "Remaja";
    } else if (getUmur() <= 60) {
        return "Dewasa";
    } else {
        return "Lansia";
    }
}

public String getJenisPasien() {
    switch(getKodePasien().substring(0, 2)) {
        case "IN":
            return "Rawat Inap";
        case "RJ":
            return "Rawat Jalan";
        default:
            return "Jenis Tidak Diketahui";
    }
}
```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop `for` untuk meminta input dan menampilkan data.

```bash
for (int i = 0; i < dataPasien.length; i++) {
    ...
}
```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk menerima input dan method `System.out.println` untuk menampilkan output.

```bash
Scanner scanner = new Scanner(System.in);
System.out.print("Masukkan Nama Pasien ke-" + (i + 1) + ": ");
String nama = scanner.nextLine();

System.out.println("\nData Pasien:");
System.out.println(pasien.displayInfo());
```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, `PasienDetail[] dataPasien = new PasienDetail[2];` adalah contoh penggunaan array.

```bash
PasienDetail[] dataPasien = new PasienDetail[2];
```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `try catch` untuk menangani error saat input umur.

```bash
int umur = 0;
boolean valid = false;
while (!valid) {
    try {
        System.out.print("Masukkan umur pasien: ");
        umur = Integer.parseInt(scanner.nextLine());
        valid = true;
    } catch (NumberFormatException e) {
        System.out.println("Umur harus berupa angka. Silakan coba lagi.");
    }
}
```

## Usulan nilai

|  No | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |    10   |
|  10 | Seleksi        |    5    |
|  11 | Perulangan     |    5    |
|  12 | IO Sederhana   |    10   |
|  13 | Array          |    15   |
|  14 | Error Handling |    15   |
|     | **TOTAL**      | **100** |

## Pembuat

Nama: Azkya Ryzkina
NPM: 2310010393
Kelas: 4D PBO1 - Teknik Informatika UNISKA
