package PRctl_13;

import java.util.Scanner;

public class main {

    public static void main(String[] args)
    {
        float r;
        Scanner sc= new Scanner(System.in);
        System.out.println("enter R of Circle");
        
        r = sc.nextInt();
        
        circle c1 = new circle(r);
        triangle t1 = new triangle(10, 5);
        cube c = new cube(7);
        sphere s1 = new sphere(10, 2, 3);

        c1.area();
        t1.area();
        c.volume();
        s1.volume();
        
        c.disp();
        c1.disp();
    }
}
