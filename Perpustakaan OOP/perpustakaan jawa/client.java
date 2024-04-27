public class client {
    private String Nama;
    private String Prodi;
    private String Fakulitas;
    
    public client(){
    }

    public client(String nama, String prodi, String fakulitas) {
        Nama = nama;
        Prodi = prodi;
        Fakulitas = fakulitas;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String nama) {
        Nama = nama;
    }

    public String getProdi() {
        return Prodi;
    }

    public void setProdi(String prodi) {
        Prodi = prodi;
    }

    public String getFakulitas() {
        return Fakulitas;
    }

    public void setFakulitas(String fakulitas) {
        Fakulitas = fakulitas;
    }
}
