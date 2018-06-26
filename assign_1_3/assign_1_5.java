
package assign_1_3;

/**
 * @author Rahul
 */
public class assign_1_5 
{
    public static void main(String[] args)
    {
     String s1 = "Java world";   
     
     char[] s = s1.toCharArray();
     int n = s.length; 

     s[n-1] = Character.toUpperCase(s[n-1]);
     s[n-2] = Character.toUpperCase(s[n-2]);
     s[n-3] = Character.toUpperCase(s[n-3]);
     
      s1 = new String(s);
        System.out.println(s1);
    }
  
}
