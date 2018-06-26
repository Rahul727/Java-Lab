
package PRctl_13;

public class sphere extends Thr_D
{
    sphere(float a, float b ,float c)
    {
        l=a;
        super.b=b;
        h=c;
    }
    
    void volume()
    {
        System.out.println(" area of sphere is = " + ((4/3)*3.14*l*b*h));  
    }

    
}
