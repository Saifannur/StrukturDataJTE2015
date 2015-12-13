import java.math.BigDecimal;

/**
 * Write a description of class Node here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Node
{
    
    public BigDecimal data;
    public Node berikut;
    
    public Node(BigDecimal data){
        this.data=new BigDecimal("0");
        this.berikut=null;
    }
    
}
