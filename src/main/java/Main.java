import java.io.*;

public class Main {

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

    private void test11() throws IOException {
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

    //===========================================================================

    private void test6() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("test.txt"));
        System.out.println(br.readLine());
    }

    private void test7() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("test.txt"));
        System.out.println(br.readLine());
        br.close();
    }

    private void test8() throws IOException {
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("test.txt"));
            System.out.println(br.readLine());
        }
        catch (Exception e) { }
    }

    private void test9() throws IOException {
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

    private void test10() throws IOException {
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

    private void test12() throws IOException {
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

    private void closeOutputStream(BufferedWriter writer) throws IOException {
        writer.close();
    }

    private void closeInputStream(BufferedReader reader) throws IOException {
        reader.close();
    }
}
