import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {

    private static BufferedWriter pbw = null;
    private static BufferedReader pbr = null;

    public static void main(String[] args) throws IOException, SQLException {
        File file = new File("testPath");

        test1();
        test2();
        test3();
        test4();
        test5();
        test6();
        test7();
        test8();
        test9();
        test10();
        test11();
        test12();
        test13();
        test14();
        test15();
        test16();
        test17();
        test18();
        test19();
        test20(file);
        test21(file);
        test22(file);
    }

    private static void test1() throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("test.txt"));
        bw.write("Hello World");
    }

    private static void test2() throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("test.txt"));
        bw.write("Hello World");
        bw.close();
    }

    private static void test3() throws IOException {
        BufferedWriter bw = null;
        try {
            bw = new BufferedWriter(new FileWriter("test.txt"));
            bw.write("Hello World");
        }
        catch (Exception e) { }
    }

    private static void test4() throws IOException {
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

    private static void test5() throws IOException {
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

    private static void test6() throws IOException {
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

    private static void test7() throws IOException {
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

    private static void test8() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("test.txt"));
        System.out.println(br.readLine());
    }

    private static void test9() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("test.txt"));
        System.out.println(br.readLine());
        br.close();
    }

    private static void test10() throws IOException {
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("test.txt"));
            System.out.println(br.readLine());
        }
        catch (Exception e) { }
    }

    private static void test11() throws IOException {
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

    private static void test12() throws IOException {
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

    private static void test13() throws IOException {
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

    private static void test14() throws IOException {
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

    private static void test15() throws IOException {
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

    private static void test16() throws IOException {
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

    private static Connection conn = null;
    private static BufferedWriter pbw2 = null;
    private static BufferedReader pbr2 = null;

    private static void test17() throws SQLException {
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

    private static void test18() throws SQLException, IOException {
        try{
            pbw2 = new BufferedWriter(new FileWriter("test.txt"));
            pbw2.write("Hello World");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            closeBufferedWriter();
        }
    }

    private static void test19() throws SQLException, IOException {
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

    private static void closeOutputStream(BufferedWriter writer) throws IOException {
        writer.close();
    }

    private static void closeInputStream(BufferedReader reader) throws IOException {
        reader.close();
    }

    private static void closeConnection() throws SQLException {
        conn.close();
    }

    private static void closeBufferedWriter() throws IOException {
        pbw2.close();
    }

    private static void closeBufferedReader() throws IOException {
        pbr2.close();
    }

    //==================================================================================================
    
    private static void test20(File file) throws IOException {
        FileInputStream fileStream = new FileInputStream(file);
        int i = fileStream.read();
    }

    private static void test21(File file) throws IOException {
        FileInputStream fileStream = null;
        try {
            fileStream = new FileInputStream(file);
            int i = fileStream.read();
        }
        catch (Exception e) { }
    }

    private static void test22(File file) throws IOException {
        FileInputStream fileStream = null;
        try {
            fileStream = new FileInputStream(file);
            int i = fileStream.read();
        }
        catch (Exception e) {
            fileStream.close();
        }
    }

    private static void test23() {
        try{
            BufferedReader br = new BufferedReader(new FileReader("test"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
