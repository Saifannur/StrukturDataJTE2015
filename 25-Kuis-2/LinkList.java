import java.math.BigDecimal;
/**
 * Write a description of class Linklist here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LinkList
{
    public LinkList() {
        kepala=null;
    }
    
    public Node kepala() {
        return kepala;
    }
    
    public void tambah(BigDecimal data){
        Node nodeBaru = new Node(data);
        
        if (kepala == null)
        kepala=nodeBaru;
        else{
            Node sekarang=kepala;
            while (sekarang.berikut != null)
            sekarang=sekarang.berikut;
            sekarang.berikut=nodeBaru;
            
        }
    }
    
    private Node kepala;
}
