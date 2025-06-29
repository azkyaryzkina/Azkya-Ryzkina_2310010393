package pbo;

// CLASS dan INHERITANCE
public class PasienDetail extends Pasien {
    private String kodePasien;  // ATRIBUT tambahan

    // CONSTRUCTOR
    public PasienDetail(String nama, int umur, String penyakit, String kodePasien) {
        super(nama, umur, penyakit);  // inheritance (superclass Pasien)
        this.kodePasien = kodePasien;
    }

    // MUTATOR (Setter)
    public void setKodePasien(String kodePasien) {
        this.kodePasien = kodePasien;
    }

    // ACCESSOR (Getter)
    public String getKodePasien() {
        return kodePasien;
    }

    // SELEKSI IF
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

    // METODE TAMBAHAN: SELEKSI SWITCH
    public String getJenisPasien() {
        String kode = kodePasien.substring(0, 2);
        switch (kode) {
            case "IN":
                return "Rawat Inap";
            case "RJ":
                return "Rawat Jalan";
            default:
                return "Jenis Tidak Diketahui";
        }
    }

    // METODE TAMBAHAN: MENGGUNAKAN SUBSTRING UNTUK NO REGISTRASI
    public String getNomorRegistrasi() {
        return kodePasien.substring(2);  // contoh: dari IN001 → 001
    }

    // POLYMORPHISM (OVERRIDING) DAN IO SEDERHANA
    @Override
    public String displayInfo() {
        return super.displayInfo() +  // panggil method dari superclass
               "\nJenis Pasien: " + getJenisPasien() +
               "\nKategori Usia: " + getKategoriUsia() +
               "\nNo Registrasi: " + getNomorRegistrasi();
    }
}