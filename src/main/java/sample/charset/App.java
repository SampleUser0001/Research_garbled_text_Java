package sample.charset;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.stream.Stream;

/**
 * Hello world!
 *
 */
public class App {

    public static void main( String[] args ) throws UnsupportedEncodingException {
        printToBytes(args[0], args[1]);
    }

    public static void printToBytes(String str, String charset) throws UnsupportedEncodingException {
        System.out.println("Origin str : " + str);
        System.out.println("Charset : " + charset);
        System.out.println("canEncode : " + Charset.forName(charset).canEncode());
        for(byte b : str.getBytes(charset)){
            System.out.println(String.format("%02x",b));
        }
        System.out.println();
    }
}
