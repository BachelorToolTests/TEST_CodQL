import java.io.*;

public class Test1 {

    protected void test1() {
        try{
            BufferedReader br = new BufferedReader(new FileReader("test"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    protected void test2(File file) throws IOException {
        FileInputStream fileStream = null;
        try {
            fileStream = new FileInputStream(file);
            int i = fileStream.read();
        }
        catch (Exception e) {
            fileStream.close();
        }
    }
}
