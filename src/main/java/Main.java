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

    //===========================================================================

    private void test6() throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("test.txt"));
        bw.write("Hello World");
    }

    private void test7() throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("test.txt"));
        bw.write("Hello World");
        bw.close();
    }

    private void test8() throws IOException {
        BufferedWriter bw = null;
        try {
            bw = new BufferedWriter(new FileWriter("test.txt"));
            bw.write("Hello World");
        }
        catch (Exception e) { }
    }

    private void test9() throws IOException {
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

    private void test10() throws IOException {
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
}
