package pbo;

public class Pasien {
    private String nama;
    private int umur;
    private String penyakit;

    // Constructor
    public Pasien(String nama, int umur, String penyakit) {
        this.nama = nama;
        this.umur = umur;
        this.penyakit = penyakit;
    }

    // Setter
    public void setNama(String nama) { this.nama = nama; }
    public void setUmur(int umur) { this.umur = umur; }
    public void setPenyakit(String penyakit) { this.penyakit = penyakit; }

    // Getter
    public String getNama() { return nama; }
    public int getUmur() { return umur; }
    public String getPenyakit() { return penyakit; }

    //polymorohism
    public String displayInfo() {
        return "Nama: " + getNama() + "\nUmur: " + getUmur() + "\nPenyakit: " + getPenyakit();
    }
}