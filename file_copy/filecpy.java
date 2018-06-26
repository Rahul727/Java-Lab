
package prct_28;
import java.io.* ;
        
public class filecpy 
{
    public static void main(String[] args) throws FileNotFoundException, IOException
    {
       String s; 
      
       FileReader fr1 = new FileReader("C:\\Users\\Global  
                                     \\Desktop\\R7\\fr.txt");  
       BufferedReader br = new BufferedReader(fr1); 
      
       FileWriter fr = new FileWriter("C:\\Users\\Global
                                    \\Desktop\\R7\\fr_1.txt");        
       BufferedWriter fw = new BufferedWriter(fr);
       
       while((s=br.readLine())!= null)
       {
          
          fw.write(s);
        //     fw.write(System.getProperty("line.separator"));
          fw.newLine();
        
          System.out.println(s);
          
       }    
       br.close();
       fr1.close();
       
       fw.close();
       fr.close();
    }       
}
