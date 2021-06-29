package sample.charset;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.stream.Stream;
import javax.xml.bind.DatatypeConverter;

/**
 * 引数で与えられた16進数と文字コードでStringにエンコードする
 */
public class DecodeSample {

    public static void main( String[] args ) throws UnsupportedEncodingException {
        printToStrings(args[0], args[1]);
    }

    public static void printToStrings(String str, String charset) throws UnsupportedEncodingException {
        System.out.println("Origin Hex : " + str);
        System.out.println("Charset : " + charset);
        System.out.println("canEncode : " + Charset.forName(charset).canEncode());
        // strには16進しか来ない想定
        System.out.println(new String(DatatypeConverter.parseHexBinary(str), Charset.forName(charset)));
        System.out.println();
    }
}
