public class pustakawan {
    private int id_pustakawan;
    private String nama;
    private String email;
    private String level;
    private String no_tlp;
    private String j_kel;
    private String password;
    private String username;

    public pustakawan(){
    }
    public pustakawan(int id_pustakawan, String nama, String email, String level, String no_tlp, String j_kel,
            String password, String username) {
        this.id_pustakawan = id_pustakawan;
        this.nama = nama;
        this.email = email;
        this.level = level;
        this.no_tlp = no_tlp;
        this.j_kel = j_kel;
        this.password = password;
        this.username = username;
    }
    
    public int getId_pustakawan() {
        return id_pustakawan;
    }
    public void setId_pustakawan(int id_pustakawan) {
        this.id_pustakawan = id_pustakawan;
    }
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getLevel() {
        return level;
    }
    public void setLevel(String level) {
        this.level = level;
    }
    public String getNo_tlp() {
        return no_tlp;
    }
    public void setNo_tlp(String no_tlp) {
        this.no_tlp = no_tlp;
    }
    public String getJ_kel() {
        return j_kel;
    }
    public void setJ_kel(String j_kel) {
        this.j_kel = j_kel;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }

    
}
