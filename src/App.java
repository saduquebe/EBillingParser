import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.StringReader;

public class App {
    public static void main(String[] args) throws IOException {
        File input = new File(args[0]);

        BufferedReader in = new BufferedReader(new FileReader(input));
        String line = in.readLine();
        while (line != null) {
            BufferedReader lineBuffer = new BufferedReader(new StringReader(line));
            if (line.startsWith("01")) {
                parseHeader(lineBuffer);
            }
            else if(line.startsWith("02")){
                parseTaxes(lineBuffer);
            }
            else if(line.startsWith("03")){
                parseExpiration(lineBuffer);
            }
            //TODO
            line = in.readLine();
        }

    }

    private static void parseHeader(BufferedReader header) throws IOException {
        // System.out.println(readByLen(2, header));
        System.out.println(readByLen(2, header));
        System.out.println(readByLen(6, header));
        System.out.println(readByLen(20, header));
        System.out.println(readByLen(20, header));
        System.out.println(readByLen(3, header));
        System.out.println(readByLen(12, header));
        System.out.println(readByLen(12, header));
        System.out.println(readByLen(12, header));
        System.out.println(readByLen(3, header));
        System.out.println(readByLen(15, header));
        System.out.println(readByLen(12, header));
        System.out.println(readByLen(2, header));
        System.out.println(readByLen(2, header));
        System.out.println(readByLen(17, header));
        System.out.println(readByLen(17, header));
        System.out.println(readByLen(17, header));
        System.out.println(readByLen(17, header));
        System.out.println(readByLen(17, header));
        System.out.println(readByLen(17, header));
        System.out.println(readByLen(17, header));
        System.out.println(readByLen(17, header));
        System.out.println(readByLen(17, header));
        System.out.println(readByLen(17, header));
        System.out.println(readByLen(17, header));
        System.out.println(readByLen(80, header));
        System.out.println(readByLen(6, header));
        System.out.println(readByLen(17, header));
        System.out.println(readByLen(17, header));
        System.out.println(readByLen(17, header));
        System.out.println(readByLen(17, header));
        System.out.println(readByLen(1, header));
        System.out.println(readByLen(1, header));
        System.out.println(readByLen(2, header));
        System.out.println(readByLen(35, header));
        System.out.println(readByLen(95, header));
        System.out.println(readByLen(40, header));
        System.out.println(readByLen(80, header));
        System.out.println(readByLen(10, header));
        System.out.println(readByLen(50, header));
        System.out.println(readByLen(40, header));
        System.out.println(readByLen(3, header));
        System.out.println(readByLen(20, header));
        System.out.println(readByLen(20, header));
        System.out.println(readByLen(20, header));
        System.out.println(readByLen(20, header));
        System.out.println(readByLen(20, header));
        System.out.println(readByLen(20, header));
        System.out.println(readByLen(15, header));
        System.out.println(readByLen(15, header));
        System.out.println(readByLen(60, header));
        System.out.println(readByLen(40, header));
        System.out.println(readByLen(1, header));
        System.out.println(readByLen(1, header));
        System.out.println(readByLen(2, header));
        System.out.println(readByLen(35, header));
        System.out.println(readByLen(80, header));
        System.out.println(readByLen(40, header));
        System.out.println(readByLen(148, header));
        System.out.println(readByLen(10, header));
        System.out.println(readByLen(50, header));
        System.out.println(readByLen(40, header));
        System.out.println(readByLen(3, header));
        System.out.println(readByLen(25, header));
        System.out.println(readByLen(80, header));
        System.out.println(readByLen(148, header));
        System.out.println(readByLen(10, header));
        System.out.println(readByLen(50, header));
        System.out.println(readByLen(40, header));
        System.out.println(readByLen(3, header));
        System.out.println(readByLen(80, header));
        System.out.println(readByLen(40, header));
        System.out.println(readByLen(10, header));
        System.out.println(readByLen(80, header));
        System.out.println(readByLen(80, header));
        System.out.println(readByLen(10, header));
        System.out.println(readByLen(50, header));
        System.out.println(readByLen(40, header));
        System.out.println(readByLen(3, header));
        System.out.println(readByLen(40, header));
        System.out.println(readByLen(40, header));
        System.out.println(readByLen(20, header));
        System.out.println(readByLen(20, header));
        System.out.println(readByLen(2, header));
        System.out.println(readByLen(50, header));
        System.out.println(readByLen(35, header));
        System.out.println(readByLen(253, header));
        System.out.println(readByLen(12, header));
        System.out.println(readByLen(12, header));
        System.out.println(readByLen(1, header));
        System.out.println(readByLen(1, header));
        System.out.println(readByLen(30, header));
        System.out.println(readByLen(80, header));
        System.out.println(readByLen(40, header));
        System.out.println(readByLen(80, header));
        System.out.println(readByLen(10, header));
        System.out.println(readByLen(50, header));
        System.out.println(readByLen(40, header));
        System.out.println(readByLen(3, header));
        System.out.println(readByLen(253, header));
        System.out.println(readByLen(35, header));
        System.out.println(readByLen(35, header));
        System.out.println(readByLen(4, header));
        System.out.println(readByLen(35, header));
        System.out.println(readByLen(35, header));
        System.out.println(readByLen(50, header));
        System.out.println(readByLen(12, header));
        System.out.println(readByLen(114, header));
        System.out.println(readByLen(50, header));
        System.out.println(readByLen(8, header));
        System.out.println(readByLen(1, header));
        System.out.println(readByLen(8, header));
        System.out.println(readByLen(90, header));
        System.out.println(readByLen(80, header));
        System.out.println(readByLen(14, header));
        System.out.println(readByLen(14, header));
        System.out.println(readByLen(4, header));
        System.out.println(readByLen(40, header));
        System.out.println(readByLen(25, header));
        System.out.println(readByLen(2, header));
        System.out.println(readByLen(50, header));
        System.out.println(readByLen(100, header));
        System.out.println(readByLen(120, header));
        System.out.println(readByLen(1, header));
        System.out.println(readByLen(2, header));
        System.out.println(readByLen(2, header));
        System.out.println(readByLen(18, header));
        System.out.println(readByLen(50, header));
        System.out.println(readByLen(100, header));
        System.out.println(readByLen(17, header));
        System.out.println(readByLen(65, header));
        System.out.println(readByLen(100, header));
        System.out.println(readByLen(8, header));
        System.out.println(readByLen(100, header));
        System.out.println(readByLen(100, header));
        System.out.println(readByLen(5, header));
        System.out.println(readByLen(5, header));
        System.out.println(readByLen(2, header));
        System.out.println(readByLen(11, header));
        System.out.println(readByLen(4, header));
        System.out.println(readByLen(11, header));
        System.out.println(readByLen(1, header));
        System.out.println(readByLen(50, header));
        System.out.println(readByLen(50, header));
        System.out.println(readByLen(20, header));
        System.out.println(readByLen(13, header));
        System.out.println(readByLen(7, header));
        System.out.println(readByLen(10, header));
        System.out.println(readByLen(10, header));
        System.out.println(readByLen(10, header));
        System.out.println(readByLen(10, header));
        System.out.println(readByLen(10, header));
        System.out.println(readByLen(35, header));
        System.out.println(readByLen(35, header));
        System.out.println(readByLen(8, header));
        System.out.println(readByLen(18, header));
        System.out.println(readByLen(240, header));
        System.out.println(readByLen(100, header));
        System.out.println(readByLen(9, header));
        System.out.println(readByLen(17, header));
        System.out.println(readByLen(35, header));
        System.out.println(readByLen(10, header));
        System.out.println(readByLen(15, header));
        System.out.println(readByLen(269, header));
        System.out.println(readByLen(30, header));
        System.out.println(readByLen(255, header));
        System.out.println(readByLen(30, header));
        System.out.println(readByLen(7, header));
        System.out.println(readByLen(4, header));
        System.out.println(readByLen(256, header));
        System.out.println(readByLen(5, header));
        System.out.println(readByLen(10, header));
        System.out.println(readByLen(50, header));
        System.out.println(readByLen(50, header));
        System.out.println(readByLen(70, header));

    }

    private static void parseTaxes(BufferedReader lineBuffer) {
        //TODO
    }

    private static void parseExpiration(BufferedReader lineBuffer) {
    }

    public static String readByLen(int len, BufferedReader in) throws IOException {
        char[] res = new char[len];
        in.read(res, 0, len);
        return String.valueOf(res);
    }
}
