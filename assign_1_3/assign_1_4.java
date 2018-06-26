
package assign_1_3;

public class assign_1_4 
{
    public static void main(String[] args) 
    {
     String s1 = "Java";   
     int n = s1.length();
     char c = s1.charAt(n-1);
     StringBuffer s2 = new StringBuffer(s1); 
     s2.insert(0, c);
     s2.insert(n-1, c);          
     s1 = s2.toString();
     System.out.println(s1);
    }
}