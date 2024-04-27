public class CD {
    private int KC_CD;
    private String Judul;
    private String Tahun_terbit;
    private String jumlah_total;
    private String jumlah_rusak;
    private String jumlah_tersedia;
    public CD(){
    }
    public CD(int kC_CD, String judul, String tahun_terbit, String jumlah_total, String jumlah_rusak,
            String jumlah_tersedia) {
        KC_CD = kC_CD;
        Judul = judul;
        Tahun_terbit = tahun_terbit;
        this.jumlah_total = jumlah_total;
        this.jumlah_rusak = jumlah_rusak;
        this.jumlah_tersedia = jumlah_tersedia;
    }

    public int getKC_CD() {
        return KC_CD;
    }
    public void setKC_CD(int kC_CD) {
        KC_CD = kC_CD;
    }
    public String getJudul() {
        return Judul;
    }
    public void setJudul(String judul) {
        Judul = judul;
    }
    public String getTahun_terbit() {
        return Tahun_terbit;
    }
    public void setTahun_terbit(String tahun_terbit) {
        Tahun_terbit = tahun_terbit;
    }
    public String getJumlah_total() {
        return jumlah_total;
    }
    public void setJumlah_total(String jumlah_total) {
        this.jumlah_total = jumlah_total;
    }
    public String getJumlah_rusak() {
        return jumlah_rusak;
    }
    public void setJumlah_rusak(String jumlah_rusak) {
        this.jumlah_rusak = jumlah_rusak;
    }
    public String getJumlah_tersedia() {
        return jumlah_tersedia;
    }
    public void setJumlah_tersedia(String jumlah_tersedia) {
        this.jumlah_tersedia = jumlah_tersedia;
    }
}
