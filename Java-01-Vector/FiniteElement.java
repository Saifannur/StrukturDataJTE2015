public class FiniteElement
{
    private Gaya [] gaya;
    
    public FiniteElement (){
 
    }
    
    public FiniteElement ( Gaya[] gaya){
        this.gaya = gaya;
    }
    
    public Gaya [] daftarGaya(){
        return gaya;
        
    }
}
