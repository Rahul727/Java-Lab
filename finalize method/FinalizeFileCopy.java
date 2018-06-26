package final18;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class FinalizeFileCopy {
    FileWriter fw;
    BufferedWriter bw;

    void fileCopy() throws Exception {

        fw = new FileWriter("Test.txt");

        bw = new BufferedWriter(fw);
        String s;
        s = "This will be written into the file";
        bw.write(String.format(s + "%n"));

        s = s + ", too";
        bw.write(String.format(s + "%n"));

        bw.close();
        fw.close();
    }
    @Override
    protected void finalize() throws Throwable {

        if (bw != null) {
            bw.close();
            bw = null;
        }

        if (fw != null) {
            fw.close();
            fw = null;
        }

        super.finalize();
    }
    public static void main(String[] args) throws Exception {

        FinalizeFileCopy ffc = new FinalizeFileCopy();
        ffc.fileCopy();
    }
}