
/**
 * Write a description of class Tumpukan here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.math.BigInteger;
import java.util.Stack;

public class Tumpukan
{
    private Node atas;
    private Node bawah;
    
    public Tumpukan(){
        atas=null;
        bawah=null;
    }
    
    public void tumpuk(BigInteger data){
        Node nodeBaru=new Node (data);
        nodeBaru.berikut=null;
        
        if(atas==null){
            atas =nodeBaru;
            bawah =nodeBaru;
        } else{
            atas.berikut=nodeBaru;
            atas=nodeBaru;
        }
    }

    
    
        public BigInteger ambil(){
        if (atas != null ){
            BigInteger dataAtas = atas.data;
            atas = atas.berikut;
            return dataAtas;
        }else{
            return null;
        }
   }
 
    
    public BigInteger atas(){
        // kalau stack tidak kosong
        if(atas!=null)
            
        return atas.data;
        
        else {
        return null;    
        }
    }
    
    public BigInteger bawah(){
        // Periksa elemen stack mulai dari paling atas
        
        // ambil data pada node paling bawah
        if(bawah!=null)
            return bawah.data;
        else{
            return null;
        }
    }
   
}