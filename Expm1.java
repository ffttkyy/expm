public class Tabungan {
    private int saldo;
    private String pemilik;
    
    // Constructor
    public Tabungan(int saldo, String pemilik) {
        this.saldo = saldo;
        this.pemilik = pemilik;
    }
    
    // Setter saldo
    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
    
    // Setter pemilik
    public void setPemilik(String pemilik) {
        this.pemilik = pemilik;
    }
    
    // Getter saldo
    public int getSaldo() {
        return saldo;
    }
    
    // Getter pemilik
    public String getPemilik() {
        return pemilik;
    }
    
    // Method untuk menambah saldo
    public void simpanUang(int jumlah) {
        saldo += jumlah;
    }
    
    // Method untuk mengurangi saldo
    public void tarikUang(int jumlah) {
        saldo -= jumlah;
    }
    
    // Main method
    public static void main(String[] args) {
        // Membuat objek tabungan1 dengan saldo 1000 dan pemilik "A"
        Tabungan tabungan1 = new Tabungan(1000, "A");
        
        // Menampilkan saldo dan pemilik objek tabungan1
        System.out.println("Saldo tabungan 1: " + tabungan1.getSaldo());
        System.out.println("Pemilik tabungan 1: " + tabungan1.getPemilik());
        
        // Menambah saldo objek tabungan1 sebesar 500
        tabungan1.simpanUang(500);
        
        // Menampilkan saldo terbaru objek tabungan1
        System.out.println("Saldo tabungan 1 setelah simpan uang: " + tabungan1.getSaldo());
        
        // Mengurangi saldo objek tabungan1 sebesar 200
        tabungan1.tarikUang(200);
        
        // Menampilkan saldo terbaru objek tabungan1
        System.out.println("Saldo tabungan 1 setelah tarik uang: " + tabungan1.getSaldo());
    }
}
