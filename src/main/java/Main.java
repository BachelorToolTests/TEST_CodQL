import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {

    private BufferedWriter pbw = null;
    private BufferedReader pbr = null;

    public static void main(String[] args) {

    }

    private void test1() throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("test.txt"));
        bw.write("Hello World");
    }

    private void test2() throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("test.txt"));
        bw.write("Hello World");
        bw.close();
    }

    private void test3() throws IOException {
        BufferedWriter bw = null;
        try {
            bw = new BufferedWriter(new FileWriter("test.txt"));
            bw.write("Hello World");
        }
        catch (Exception e) { }
    }

    private void test4() throws IOException {
        BufferedWriter bw = null;
        try {
            bw = new BufferedWriter(new FileWriter("test.txt"));
            bw.write("Hello World");
        }
        catch (Exception e) { }
        finally {
            bw.close();
        }
    }

    private void test5() throws IOException {
        BufferedWriter bw = null;
        try {
            bw = new BufferedWriter(new FileWriter("test.txt"));
            bw.write("Hello World");
        }
        catch (Exception e) { }
        finally {
            try{
                if(bw != null) {
                    bw.close();
                }
            } catch(Exception e){}
        }
    }

    private void test6() throws IOException {
        BufferedWriter bw = null;
        try {
            bw = new BufferedWriter(new FileWriter("test.txt"));
            bw.write("Hello World");
        }
        catch (Exception e) { }
        finally {
            closeOutputStream(bw);
        }
    }

    private void test7() throws IOException {
        try {
            pbw = new BufferedWriter(new FileWriter("test.txt"));
            pbw.write("Hello World");
        }
        catch (Exception e) { }
        finally {
            closeOutputStream(pbw);
        }
    }

    //===========================================================================

    private void test8() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("test.txt"));
        System.out.println(br.readLine());
    }

    private void test9() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("test.txt"));
        System.out.println(br.readLine());
        br.close();
    }

    private void test10() throws IOException {
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("test.txt"));
            System.out.println(br.readLine());
        }
        catch (Exception e) { }
    }

    private void test11() throws IOException {
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("test.txt"));
            System.out.println(br.readLine());
        }
        catch (Exception e) { }
        finally {
            br.close();
        }
    }

    private void test12() throws IOException {
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("test.txt"));
            System.out.println(br.readLine());
        }
        catch (Exception e) { }
        finally {
            try{
                if(br != null) {
                    br.close();
                }
            } catch(Exception e){}
        }
    }

    private void test13() throws IOException {
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("test.txt"));
            System.out.println(br.readLine());
        }
        catch (Exception e) { }
        finally {
            closeInputStream(br);
        }
    }

    private void test14() throws IOException {
        try {
            pbr = new BufferedReader(new FileReader("test.txt"));
            System.out.println(pbr.readLine());
        }
        catch (Exception e) { }
        finally {
            closeInputStream(pbr);
        }
    }

    //==================================================================================================

    private void test15() throws IOException {
        try {
            try {
                pbr = new BufferedReader(new FileReader("test.txt"));
                System.out.println(pbr.readLine());
            }
            catch(Exception e) {}
        }
        catch (Exception e) { }
        finally {
            closeInputStream(pbr);
        }
    }

    private void test16() throws IOException {
        try {
            try {
                pbw = new BufferedWriter(new FileWriter("test.txt"));
                pbw.write("Hello World");
            }
            catch (Exception e) { }
        }
        catch (Exception e) { }
        finally {
            closeOutputStream(pbw);
        }
    }

    //==================================================================================================

    private Connection conn = null;
    private BufferedWriter pbw2 = null;
    private BufferedReader pbr2 = null;

    private void test17() throws SQLException {
        try{
            conn = DriverManager.getConnection("demo connection");

            conn.createStatement().executeUpdate("DELETE ...");
            conn.createStatement().executeUpdate("INSERT INTO ...");
            conn.createStatement().executeUpdate("INSERT INTO ...");
            conn.commit();
        }
        finally {
            closeConnection();
        }
    }

    private void test18() throws SQLException, IOException {
        try{
            pbw2 = new BufferedWriter(new FileWriter("test.txt"));
            pbw2.write("Hello World");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            closeBufferedWriter();
        }
    }

    private void test19() throws SQLException, IOException {
        try{
            pbr2 = new BufferedReader(new FileReader("test.txt"));
            System.out.println(pbr2.readLine());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            closeBufferedReader();
        }
    }

    //===================================================================================================

    private void closeOutputStream(BufferedWriter writer) throws IOException {
        writer.close();
    }

    private void closeInputStream(BufferedReader reader) throws IOException {
        reader.close();
    }

    private void closeConnection() throws SQLException {
        conn.close();
    }

    private void closeBufferedWriter() throws IOException {
        pbw2.close();
    }

    private void closeBufferedReader() throws IOException {
        pbr2.close();
    }

    //==================================================================================================
    
    private void test20(File file) throws IOException {
        FileInputStream fileStream = new FileInputStream(file);
        int i = fileStream.read();
    }

    private void test21(File file) throws IOException {
        FileInputStream fileStream = null;
        try {
            fileStream = new FileInputStream(file);
            int i = fileStream.read();
        }
        catch (Exception e) { }
    }

    private void test22(File file) throws IOException {
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
