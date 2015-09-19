public class Vector3D
{
    /*
     * program untuk unit test 1 bedanya dengan program unit test 2 tambah private
     *  double x;
        double y;
        double z;
     */
    
        private double x;
        private double y;
        private double z;
        
        public Vector3D(double x, double y, double z){

           this.x=x;
           this.y=y;
           this.z=z;
    }

   public double getX(){
       return this.x;
    }
   
   public double getY(){ 
      return this.y;
    }
    
    public double getZ(){ 
      return this.z;
    }
}
