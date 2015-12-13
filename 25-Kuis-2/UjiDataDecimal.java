import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.IOException;

import java.math.BigDecimal;

public class UjiDataDecimal {
    public UjiDataDecimal() { }

    @Before
    public void setUp() { 
        dataDecimal = new DataDecimal();
    }

    @After
    public void tearDown() { }
    
    @Test
    public void berkasKosong() throws FileNotFoundException, IOException {
        // Buat berkas uji yang isinya kosong
        buatBerkasUji(0);
        
        //Muat
        LinkList hasil = dataDecimal.muat(NAMA_BERKAS);
        //Uji
        assertNotNull(hasil);
        assertNull(hasil.kepala());
    }
    
    @Test
    public void berkasSatuBaris() throws FileNotFoundException, IOException {
        // Buat berkas uji yang isinya satu baris
        buatBerkasUji(1);
        
        //Muat
        LinkList hasil = dataDecimal.muat(NAMA_BERKAS);
        //Uji
        assertNotNull(hasil);
        bandingkanIsiBerkasDenganNode(hasil.kepala());
    }
    
    @Test
    public void berkasSeratusBaris() throws FileNotFoundException, IOException {
        // Buat berkas uji yang isinya satu baris
        buatBerkasUji(100);
        
        //Muat
        LinkList hasil = dataDecimal.muat(NAMA_BERKAS);
        //Uji
        assertNotNull(hasil);
        bandingkanIsiBerkasDenganNode(hasil.kepala());
    }
    
    @Test
    public void berkasSeribuBaris() throws FileNotFoundException, IOException {
        // Buat berkas uji yang isinya satu baris
        buatBerkasUji(1000);
        
        //Muat
        LinkList hasil = dataDecimal.muat(NAMA_BERKAS);
        //Uji
        assertNotNull(hasil);
        bandingkanIsiBerkasDenganNode(hasil.kepala());
    }
    
    @Test
    public void berkasSepuluhSeribuBaris() throws FileNotFoundException, IOException {
        // Buat berkas uji yang isinya satu baris
        buatBerkasUji(10000);
        
        //Muat
        LinkList hasil = dataDecimal.muat(NAMA_BERKAS);
        //Uji
        assertNotNull(hasil);
        bandingkanIsiBerkasDenganNode(hasil.kepala());
    }
    
    private void buatBerkasUji(int baris) throws IOException {
        // Buat berkas uji
        FileWriter berkasUji = new FileWriter(NAMA_BERKAS, false);
        
        // Tulis datanya 
        for (int cnt=0; cnt<baris; ++cnt) {
            // Bangkitkan
            double leftComma = ((double)cnt)*5.0;
            double rightComma = ((double)cnt)/5.0;
            BigDecimal data = new BigDecimal(leftComma + rightComma);
            
            // Tulis
            berkasUji.write(data.toString());
            berkasUji.write("\n");
        }
        
        // Tutup berkas
        berkasUji.flush();
        berkasUji.close();
    }
    
    private void bandingkanIsiBerkasDenganNode(Node kepala) throws IOException {
        // Buka berkas
        FileReader berkasUji = new FileReader(NAMA_BERKAS);
        BufferedReader buffBerkasUji = new BufferedReader(berkasUji);
        String satuBaris = buffBerkasUji.readLine();
        // Baca per baris
        while (satuBaris != null) {
            // Pastikan masih ada data
            assertNotNull(kepala);
            // Uji data sama apa tidak
            assertEquals(kepala.data.toString(), satuBaris);
            // Baca baris berikut
            satuBaris = buffBerkasUji.readLine();
            // Majukan pointer
            kepala = kepala.berikut;
        }
        // Tutup berkas
        buffBerkasUji.close();
        // Pastikan masih tidak ada data
        assertNull(kepala);
    }
    
    private DataDecimal dataDecimal;
    
    private static String NAMA_BERKAS = "berkas.uji";
}
