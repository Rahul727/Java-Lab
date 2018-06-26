
package assign_1_3;

public class exchange 
{
    public static void main(String[] args) 
    {
     String s1 = "Java";   
     
     char[] s = s1.toCharArray();
     int n = s.length;   
     
     char c = s[0];   
     s[0]=s[n-1];
     s[n-1]=c;
  
      s1 = new String(s);
     System.out.println(s1);
    
    }
    
}
