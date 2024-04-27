public class majalah {
    private int ISBN_ISSN;
    private String judul;
    private String thn_terbit;
    private String edisi;
    private String jns_sampul;
    private int jml_rusak;
    private int jml_pinjam;
    private int jml_tersedia;
    private int jml_total;
    public majalah(){
    }
    
    public majalah(int iSBN_ISSN, String judul, String thn_terbit, String edisi, String jns_sampul, int jml_rusak,
            int jml_pinjam, int jml_tersedia, int jml_total) {
        ISBN_ISSN = iSBN_ISSN;
        this.judul = judul;
        this.thn_terbit = thn_terbit;
        this.edisi = edisi;
        this.jns_sampul = jns_sampul;
        this.jml_rusak = jml_rusak;
        this.jml_pinjam = jml_pinjam;
        this.jml_tersedia = jml_tersedia;
        this.jml_total = jml_total;
    }

    public int getISBN_ISSN() {
        return ISBN_ISSN;
    }

    public void setISBN_ISSN(int iSBN_ISSN) {
        ISBN_ISSN = iSBN_ISSN;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getThn_terbit() {
        return thn_terbit;
    }

    public void setThn_terbit(String thn_terbit) {
        this.thn_terbit = thn_terbit;
    }

    public String getEdisi() {
        return edisi;
    }

    public void setEdisi(String edisi) {
        this.edisi = edisi;
    }

    public String getJns_sampul() {
        return jns_sampul;
    }

    public void setJns_sampul(String jns_sampul) {
        this.jns_sampul = jns_sampul;
    }

    public int getJml_rusak() {
        return jml_rusak;
    }

    public void setJml_rusak(int jml_rusak) {
        this.jml_rusak = jml_rusak;
    }

    public int getJml_pinjam() {
        return jml_pinjam;
    }

    public void setJml_pinjam(int jml_pinjam) {
        this.jml_pinjam = jml_pinjam;
    }

    public int getJml_tersedia() {
        return jml_tersedia;
    }

    public void setJml_tersedia(int jml_tersedia) {
        this.jml_tersedia = jml_tersedia;
    }

    public int getJml_total() {
        return jml_total;
    }

    public void setJml_total(int jml_total) {
        this.jml_total = jml_total;
    }
}
