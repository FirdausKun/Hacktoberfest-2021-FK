import java.util.Scanner;

public class PenjualanTas { 
    private final String nama;
    private static int qty;
    private final int harga;

    public PenjualanTas(String nama, int harga) {
        
        this.nama = nama;
        
        this.harga = harga;
    }
    
    public void setQty(int qty) {
        this.qty = qty;
    }

    public String struk() {
        int total_harga;
        total_harga = this.harga * this.qty;
        String tampilStruk = 
            "Nama Tas: " + this.nama + 
            "\nQty: " + this.qty +
            "\nHarga: " + this.harga +
            "\nTotal Harga: " + total_harga;
        
        return tampilStruk;
    }
    
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        
        System.out.println("Masukkan nama tas: ");
        String nama = scanner.nextLine();
        
        System.out.println("Masukkan harga: ");
        int harga = scanner.nextInt();
        
        System.out.println("Masukkan jumlah: ");
        int qty = scanner.nextInt();
                
        PenjualanTas tampil = new PenjualanTas(nama, harga);
        tampil.setQty(qty);
        
        System.out.println("=============================================");
        System.out.println(tampil.struk());
    }
    
}