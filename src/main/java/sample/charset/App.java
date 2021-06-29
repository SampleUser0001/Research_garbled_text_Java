package sample.charset;

import java.io.UnsupportedEncodingException;
import java.util.stream.Stream;

/**
 * Hello world!
 *
 */
public class App {

    public static final String SHIFT_JIS = "Shift_JIS";
    public static final String CP943C = "Cp943C";

    public static void main( String[] args ) throws UnsupportedEncodingException {
        String str = "－";
        printToBytes(str, SHIFT_JIS);
        printToBytes(str, CP943C);
    }

    public static void printToBytes(String str, String charset) throws UnsupportedEncodingException {
        System.out.println("Origin str : " + str);
        System.out.println("Charset : " + charset);
        for(byte b : str.getBytes(charset)){
            System.out.println(String.format("%02x",b));
        }
    }
}
