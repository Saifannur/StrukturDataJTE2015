import java.util.Date;

public class Utama {
    public static void main(String[] argumen) {
        Transaksi trans1 = new Transaksi(new Date(), 0l, 100000l);
        Transaksi trans2 = new Transaksi(new Date(), 0l, 200000l);
        Transaksi trans3 = new Transaksi(new Date(), 500000l, 0l);
        
        System.out.println("Tanggal                      Debit  Kredit");
        System.out.println("==========================================");
        System.out.printf("%28s %6d %6d\n", trans1.kapan().toString(), 
                                            trans1.debit().longValue(), 
                                            trans1.kredit().longValue());
        System.out.printf("%28s %6d %6d\n", trans2.kapan().toString(), 
                                            trans2.debit().longValue(), 
                                            trans2.kredit().longValue());
        System.out.printf("%28s %6d %6d\n", trans3.kapan().toString(), 
                                            trans3.debit().longValue(), 
                                            trans3.kredit().longValue());
    }
}