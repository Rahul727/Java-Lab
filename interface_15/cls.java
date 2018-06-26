
package prctl_15;

public class cls extends circle implements I1 , I2
{
    float r;
    cls(float n){
      r=n;  
    }
    public float area()
    {
       return PI*r*r;
    }

    public float cir() 
    {
        return 2*PI*r;
    }
      void display(float x) 
    {
        System.out.println("area is " + x); 
       
    }
 
}
