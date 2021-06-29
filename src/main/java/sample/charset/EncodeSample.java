package sample.charset;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.stream.Stream;

/**
 * 引数で与えられた文字列と文字コードでbyte配列にエンコードする
 * 出力は１バイトずつ16進数出力して、改行で区切る。
 */
public class EncodeSample {

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
