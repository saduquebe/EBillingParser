package parser;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;

public class ParserUtils {

    public static boolean legacy;

    public static String parseCsv(String a) {
        return a + ";";

    }

    static ArrayList<String> parseBody(BufferedReader body) throws IOException {
        ArrayList<String> data = new ArrayList<>();
        data.add(parseCsv(App.readByLen(2, body)));
        data.add(parseCsv(App.readByLen(legacy ? 3 : 6, body)));
        data.add(parseCsv(App.readByLen(20, body)));
        data.add(parseCsv(App.readByLen(5, body)));
        data.add(parseCsv(App.readByLen(114, body)));
        return data;
    }

    static ArrayList<String> parseDocuments(BufferedReader documents) throws IOException {
        ArrayList<String> data = new ArrayList<>();
        data.add(parseCsv(App.readByLen(2, documents)));
        data.add(parseCsv(App.readByLen(legacy ? 3 : 6, documents)));
        data.add(parseCsv(App.readByLen(20, documents)));
        data.add(parseCsv(App.readByLen(50, documents)));
        data.add(parseCsv(App.readByLen(5407, documents)));
        return data;
    }

    static ArrayList<String> parseResume(BufferedReader resume) throws IOException {
        ArrayList<String> data = new ArrayList<>();
        data.add(parseCsv(App.readByLen(2, resume)));
        data.add(parseCsv(App.readByLen(legacy ? 3 : 6, resume)));
        data.add(parseCsv(App.readByLen(20, resume)));
        data.add(parseCsv(App.readByLen(8, resume)));
        data.add(parseCsv(App.readByLen(5, resume)));
        data.add(parseCsv(App.readByLen(90, resume)));
        data.add(parseCsv(App.readByLen(20, resume)));
        data.add(parseCsv(App.readByLen(17, resume)));
        data.add(parseCsv(App.readByLen(17, resume)));
        data.add(parseCsv(App.readByLen(3, resume)));
        data.add(parseCsv(App.readByLen(legacy ? 2 : 30, resume)));
        data.add(parseCsv(App.readByLen(24, resume)));
        data.add(parseCsv(App.readByLen(6, resume)));
        data.add(parseCsv(App.readByLen(17, resume)));
        data.add(parseCsv(App.readByLen(17, resume)));
        data.add(parseCsv(App.readByLen(17, resume)));
        data.add(parseCsv(App.readByLen(17, resume)));
        data.add(parseCsv(App.readByLen(50, resume)));
        data.add(parseCsv(App.readByLen(250, resume)));
        data.add(parseCsv(App.readByLen(6, resume)));
        data.add(parseCsv(App.readByLen(17, resume)));
        data.add(parseCsv(App.readByLen(17, resume)));
        data.add(parseCsv(App.readByLen(17, resume)));
        data.add(parseCsv(App.readByLen(17, resume)));
        data.add(parseCsv(App.readByLen(4831, resume)));
        return data;
    }

    static ArrayList<String> parseDetail(BufferedReader detail) throws IOException {
        ArrayList<String> data = new ArrayList<>();
        data.add(parseCsv(App.readByLen(2, detail)));
        data.add(parseCsv(App.readByLen(legacy ? 3 : 6, detail)));
        data.add(parseCsv(App.readByLen(20, detail)));
        data.add(parseCsv(App.readByLen(50, detail)));
        data.add(parseCsv(App.readByLen(25, detail)));
        data.add(parseCsv(App.readByLen(3, detail)));
        data.add(parseCsv(App.readByLen(3, detail)));
        data.add(parseCsv(App.readByLen(12, detail)));
        data.add(parseCsv(App.readByLen(20, detail)));
        data.add(parseCsv(App.readByLen(12, detail)));
        data.add(parseCsv(App.readByLen(20, detail)));
        data.add(parseCsv(App.readByLen(12, detail)));
        data.add(parseCsv(App.readByLen(20, detail)));
        data.add(parseCsv(App.readByLen(12, detail)));
        data.add(parseCsv(App.readByLen(20, detail)));
        data.add(parseCsv(App.readByLen(12, detail)));
        data.add(parseCsv(App.readByLen(30, detail)));
        data.add(parseCsv(App.readByLen(30, detail)));
        data.add(parseCsv(App.readByLen(30, detail)));
        data.add(parseCsv(App.readByLen(30, detail)));
        data.add(parseCsv(App.readByLen(30, detail)));
        data.add(parseCsv(App.readByLen(90, detail)));
        data.add(parseCsv(App.readByLen(20, detail)));
        data.add(parseCsv(App.readByLen(legacy ? 2 : 30, detail)));
        data.add(parseCsv(App.readByLen(50, detail)));
        data.add(parseCsv(App.readByLen(17, detail)));
        data.add(parseCsv(App.readByLen(17, detail)));
        data.add(parseCsv(App.readByLen(12, detail)));
        data.add(parseCsv(App.readByLen(12, detail)));
        data.add(parseCsv(App.readByLen(12, detail)));
        data.add(parseCsv(App.readByLen(3, detail)));
        data.add(parseCsv(App.readByLen(6, detail)));
        data.add(parseCsv(App.readByLen(17, detail)));
        data.add(parseCsv(App.readByLen(3, detail)));
        data.add(parseCsv(App.readByLen(legacy ? 2 : 30, detail)));
        data.add(parseCsv(App.readByLen(24, detail)));
        data.add(parseCsv(App.readByLen(6, detail)));
        data.add(parseCsv(App.readByLen(17, detail)));
        data.add(parseCsv(App.readByLen(17, detail)));
        data.add(parseCsv(App.readByLen(17, detail)));
        data.add(parseCsv(App.readByLen(17, detail)));
        data.add(parseCsv(App.readByLen(17, detail)));
        data.add(parseCsv(App.readByLen(legacy ? 2 : 30, detail)));
        data.add(parseCsv(App.readByLen(114, detail)));
        data.add(parseCsv(App.readByLen(25, detail)));
        data.add(parseCsv(App.readByLen(10, detail)));
        data.add(parseCsv(App.readByLen(legacy ? 2 : 5, detail)));
        data.add(parseCsv(App.readByLen(50, detail)));
        data.add(parseCsv(App.readByLen(12, detail)));
        // DOS DOS - 50
        data.add(parseCsv(App.readByLen(legacy ? 2 : 4, detail)));
        data.add(parseCsv(App.readByLen(50, detail)));
        // CUATRO CUATRO - 52
        data.add(parseCsv(App.readByLen(legacy ? 4 : 4, detail)));
        data.add(parseCsv(App.readByLen(50, detail)));
        data.add(parseCsv(App.readByLen(9, detail)));
        data.add(parseCsv(App.readByLen(12, detail)));
        data.add(parseCsv(App.readByLen(25, detail)));
        data.add(parseCsv(App.readByLen(65, detail)));
        data.add(parseCsv(App.readByLen(16, detail)));
        data.add(parseCsv(App.readByLen(5, detail)));
        data.add(parseCsv(App.readByLen(2, detail)));
        data.add(parseCsv(App.readByLen(8, detail)));
        data.add(parseCsv(App.readByLen(8, detail)));
        data.add(parseCsv(App.readByLen(2, detail)));
        data.add(parseCsv(App.readByLen(90, detail)));
        data.add(parseCsv(App.readByLen(2, detail)));
        data.add(parseCsv(App.readByLen(90, detail)));
        data.add(parseCsv(App.readByLen(legacy ? 4 : 12, detail)));
        data.add(parseCsv(App.readByLen(65, detail)));
        data.add(parseCsv(App.readByLen(2, detail)));
        data.add(parseCsv(App.readByLen(90, detail)));
        data.add(parseCsv(App.readByLen(3, detail)));
        data.add(parseCsv(App.readByLen(40, detail)));
        data.add(parseCsv(App.readByLen(8, detail)));
        data.add(parseCsv(App.readByLen(6, detail)));
        data.add(parseCsv(App.readByLen(8, detail)));
        data.add(parseCsv(App.readByLen(6, detail)));
        data.add(parseCsv(App.readByLen(legacy ? 2 : 7, detail)));
        data.add(parseCsv(App.readByLen(legacy ? 3 : 7, detail)));
        data.add(parseCsv(App.readByLen(5, detail)));
        data.add(parseCsv(App.readByLen(5, detail)));
        data.add(parseCsv(App.readByLen(13, detail)));
        data.add(parseCsv(App.readByLen(12, detail)));
        // UNO UNO - 83
        data.add(parseCsv(App.readByLen(legacy ? 1 : 1, detail)));
        data.add(parseCsv(App.readByLen(legacy ? 1 : 2, detail)));
        data.add(parseCsv(App.readByLen(50, detail)));
        data.add(parseCsv(App.readByLen(50, detail)));
        data.add(parseCsv(App.readByLen(50, detail)));
        data.add(parseCsv(App.readByLen(legacy ? 6 : 12, detail)));
        data.add(parseCsv(App.readByLen(65, detail)));
        data.add(parseCsv(App.readByLen(legacy ? 4 : 12, detail)));
        data.add(parseCsv(App.readByLen(65, detail)));
        data.add(parseCsv(App.readByLen(50, detail)));
        data.add(parseCsv(App.readByLen(50, detail)));
        // SEIS SEIS
        data.add(parseCsv(App.readByLen(legacy ? 6 : 6, detail)));
        data.add(parseCsv(App.readByLen(65, detail)));
        data.add(parseCsv(App.readByLen(legacy ? 4 : 12, detail)));
        data.add(parseCsv(App.readByLen(65, detail)));
        data.add(parseCsv(App.readByLen(50, detail)));
        data.add(parseCsv(App.readByLen(50, detail)));
        data.add(parseCsv(App.readByLen(1, detail)));
        data.add(parseCsv(App.readByLen(50, detail)));
        data.add(parseCsv(App.readByLen(1, detail)));
        data.add(parseCsv(App.readByLen(90, detail)));
        data.add(parseCsv(App.readByLen(legacy ? 3 : 6, detail)));
        data.add(parseCsv(App.readByLen(50, detail)));
        data.add(parseCsv(App.readByLen(legacy ? 3 : 8, detail)));
        data.add(parseCsv(App.readByLen(40, detail)));
        data.add(parseCsv(App.readByLen(90, detail)));
        data.add(parseCsv(App.readByLen(250, detail)));
        data.add(parseCsv(App.readByLen(6, detail)));
        data.add(parseCsv(App.readByLen(17, detail)));
        data.add(parseCsv(App.readByLen(21, detail)));
        data.add(parseCsv(App.readByLen(10, detail)));
        data.add(parseCsv(App.readByLen(2, detail)));
        data.add(parseCsv(App.readByLen(17, detail)));
        return data;
    }

    static ArrayList<String> parseTaxes(BufferedReader taxes) throws IOException {
        ArrayList<String> data = new ArrayList<>();
        data.add(parseCsv(App.readByLen(2, taxes)));
        data.add(parseCsv(App.readByLen(legacy ? 3 : 6, taxes)));
        data.add(parseCsv(App.readByLen(20, taxes)));
        data.add(parseCsv(App.readByLen(3, taxes)));
        data.add(parseCsv(App.readByLen(24, taxes)));
        data.add(parseCsv(App.readByLen(6, taxes)));
        data.add(parseCsv(App.readByLen(17, taxes)));
        data.add(parseCsv(App.readByLen(17, taxes)));
        data.add(parseCsv(App.readByLen(17, taxes)));
        data.add(parseCsv(App.readByLen(17, taxes)));
        data.add(parseCsv(App.readByLen(17, taxes)));
        data.add(parseCsv(App.readByLen(114, taxes)));
        data.add(parseCsv(App.readByLen(legacy ? 2 : 30, taxes)));
        data.add(parseCsv(App.readByLen(legacy ? 2 : 30, taxes)));
        data.add(parseCsv(App.readByLen(6, taxes)));
        data.add(parseCsv(App.readByLen(17, taxes)));
        data.add(parseCsv(App.readByLen(17, taxes)));
        data.add(parseCsv(App.readByLen(15, taxes)));
        data.add(parseCsv(App.readByLen(17, taxes)));
        data.add(parseCsv(App.readByLen(5146, taxes)));
        return data;
    }

    static ArrayList<String> parseExpiration(BufferedReader expiration) throws IOException {
        ArrayList<String> data = new ArrayList<>();
        data.add(parseCsv(App.readByLen(2, expiration)));
        data.add(parseCsv(App.readByLen(legacy ? 3 : 6, expiration)));
        data.add(parseCsv(App.readByLen(20, expiration)));
        data.add(parseCsv(App.readByLen(12, expiration)));
        data.add(parseCsv(App.readByLen(17, expiration)));
        return data;
    }

    static ArrayList<String> parseHeader(BufferedReader header) throws IOException {
        ArrayList<String> data = new ArrayList<String>();
        data.add(parseCsv(App.readByLen(2, header)));
        data.add(parseCsv(App.readByLen(legacy ? 3 : 6, header)));
        data.add(parseCsv(App.readByLen(20, header)));
        data.add(parseCsv(App.readByLen(20, header)));
        data.add(parseCsv(App.readByLen(3, header)));
        data.add(parseCsv(App.readByLen(12, header)));
        data.add(parseCsv(App.readByLen(12, header)));
        data.add(parseCsv(App.readByLen(12, header)));
        data.add(parseCsv(App.readByLen(3, header)));
        data.add(parseCsv(App.readByLen(15, header)));
        data.add(parseCsv(App.readByLen(12, header)));
        data.add(parseCsv(App.readByLen(2, header)));
        data.add(parseCsv(App.readByLen(2, header)));
        data.add(parseCsv(App.readByLen(17, header)));
        data.add(parseCsv(App.readByLen(17, header)));
        data.add(parseCsv(App.readByLen(17, header)));
        data.add(parseCsv(App.readByLen(17, header)));
        data.add(parseCsv(App.readByLen(17, header)));
        data.add(parseCsv(App.readByLen(17, header)));
        data.add(parseCsv(App.readByLen(17, header)));
        data.add(parseCsv(App.readByLen(17, header)));
        data.add(parseCsv(App.readByLen(17, header)));
        data.add(parseCsv(App.readByLen(17, header)));
        data.add(parseCsv(App.readByLen(17, header)));
        data.add(parseCsv(App.readByLen(80, header)));
        data.add(parseCsv(App.readByLen(6, header)));
        data.add(parseCsv(App.readByLen(17, header)));
        data.add(parseCsv(App.readByLen(17, header)));
        data.add(parseCsv(App.readByLen(17, header)));
        data.add(parseCsv(App.readByLen(17, header)));
        data.add(parseCsv(App.readByLen(1, header)));
        data.add(parseCsv(App.readByLen(1, header)));
        data.add(parseCsv(App.readByLen(2, header)));
        data.add(parseCsv(App.readByLen(35, header)));
        // CORRECCION DESFASE
        data.add(parseCsv(App.readByLen(legacy ? 96 : 95, header)));
        data.add(parseCsv(App.readByLen(40, header)));
        // direccEf
        data.add(parseCsv(App.readByLen(legacy ? 81 : 80, header)));
        data.add(parseCsv(App.readByLen(10, header)));
        data.add(parseCsv(App.readByLen(50, header)));
        data.add(parseCsv(App.readByLen(40, header)));
        data.add(parseCsv(App.readByLen(3, header)));
        data.add(parseCsv(App.readByLen(20, header)));
        data.add(parseCsv(App.readByLen(20, header)));
        data.add(parseCsv(App.readByLen(20, header)));
        data.add(parseCsv(App.readByLen(20, header)));
        data.add(parseCsv(App.readByLen(20, header)));
        data.add(parseCsv(App.readByLen(20, header)));
        data.add(parseCsv(App.readByLen(15, header)));
        data.add(parseCsv(App.readByLen(15, header)));
        data.add(parseCsv(App.readByLen(60, header)));
        data.add(parseCsv(App.readByLen(40, header)));
        data.add(parseCsv(App.readByLen(1, header)));
        data.add(parseCsv(App.readByLen(1, header)));
        data.add(parseCsv(App.readByLen(2, header)));
        data.add(parseCsv(App.readByLen(35, header)));
        data.add(parseCsv(App.readByLen(80, header)));
        data.add(parseCsv(App.readByLen(40, header)));
        // direccRf
        data.add(parseCsv(App.readByLen(legacy ? 149 : 148, header)));
        data.add(parseCsv(App.readByLen(10, header)));
        data.add(parseCsv(App.readByLen(50, header)));
        // provRf
        data.add(parseCsv(App.readByLen(legacy ? 41 : 40, header)));
        data.add(parseCsv(App.readByLen(3, header)));
        data.add(parseCsv(App.readByLen(25, header)));
        data.add(parseCsv(App.readByLen(80, header)));
        // DireccionRecep
        data.add(parseCsv(App.readByLen(legacy ? 150 : 148, header)));
        data.add(parseCsv(App.readByLen(10, header)));
        data.add(parseCsv(App.readByLen(50, header)));
        // provRecep
        data.add(parseCsv(App.readByLen(legacy ? 41 : 40, header)));
        data.add(parseCsv(App.readByLen(3, header)));
        data.add(parseCsv(App.readByLen(80, header)));
        data.add(parseCsv(App.readByLen(40, header)));
        data.add(parseCsv(App.readByLen(10, header)));
        data.add(parseCsv(App.readByLen(80, header)));
        data.add(parseCsv(App.readByLen(80, header)));
        data.add(parseCsv(App.readByLen(10, header)));
        data.add(parseCsv(App.readByLen(50, header)));
        data.add(parseCsv(App.readByLen(40, header)));
        data.add(parseCsv(App.readByLen(3, header)));
        data.add(parseCsv(App.readByLen(40, header)));
        data.add(parseCsv(App.readByLen(40, header)));
        data.add(parseCsv(App.readByLen(20, header)));
        data.add(parseCsv(App.readByLen(20, header)));
        data.add(parseCsv(App.readByLen(2, header)));
        data.add(parseCsv(App.readByLen(50, header)));
        data.add(parseCsv(App.readByLen(35, header)));
        data.add(parseCsv(App.readByLen(253, header)));
        data.add(parseCsv(App.readByLen(12, header)));
        data.add(parseCsv(App.readByLen(12, header)));
        data.add(parseCsv(App.readByLen(1, header)));
        data.add(parseCsv(App.readByLen(1, header)));
        data.add(parseCsv(App.readByLen(30, header)));
        data.add(parseCsv(App.readByLen(80, header)));
        data.add(parseCsv(App.readByLen(40, header)));
        data.add(parseCsv(App.readByLen(80, header)));
        data.add(parseCsv(App.readByLen(10, header)));
        data.add(parseCsv(App.readByLen(50, header)));
        data.add(parseCsv(App.readByLen(40, header)));
        data.add(parseCsv(App.readByLen(3, header)));
        data.add(parseCsv(App.readByLen(253, header)));
        data.add(parseCsv(App.readByLen(35, header)));
        data.add(parseCsv(App.readByLen(35, header)));
        data.add(parseCsv(App.readByLen(4, header)));
        data.add(parseCsv(App.readByLen(35, header)));
        data.add(parseCsv(App.readByLen(35, header)));
        data.add(parseCsv(App.readByLen(50, header)));
        data.add(parseCsv(App.readByLen(12, header)));
        data.add(parseCsv(App.readByLen(114, header)));
        data.add(parseCsv(App.readByLen(50, header)));
        data.add(parseCsv(App.readByLen(8, header)));
        data.add(parseCsv(App.readByLen(1, header)));
        // delegco
        data.add(parseCsv(App.readByLen(legacy ? 3 : 8, header)));
        // desdeleg
        data.add(parseCsv(App.readByLen(legacy ? 91 : 90, header)));
        // dirdeleg
        data.add(parseCsv(App.readByLen(legacy ? 82 : 80, header)));
        data.add(parseCsv(App.readByLen(14, header)));
        data.add(parseCsv(App.readByLen(14, header)));
        // division
        data.add(parseCsv(App.readByLen(legacy ? 3 : 4, header)));
        data.add(parseCsv(App.readByLen(40, header)));
        data.add(parseCsv(App.readByLen(25, header)));
        data.add(parseCsv(App.readByLen(2, header)));
        data.add(parseCsv(App.readByLen(50, header)));
        // desdSe
        data.add(parseCsv(App.readByLen(legacy ? 102 : 100, header)));
        // rmercant
        data.add(parseCsv(App.readByLen(legacy ? 122 : 120, header)));
        data.add(parseCsv(App.readByLen(1, header)));
        data.add(parseCsv(App.readByLen(2, header)));
        data.add(parseCsv(App.readByLen(2, header)));
        data.add(parseCsv(App.readByLen(legacy ? 2 : 18, header)));
        data.add(parseCsv(App.readByLen(50, header)));
        data.add(parseCsv(App.readByLen(100, header)));
        data.add(parseCsv(App.readByLen(legacy ? 2 : 17, header)));
        data.add(parseCsv(App.readByLen(65, header)));
        data.add(parseCsv(App.readByLen(legacy ? 10 : 100, header)));
        data.add(parseCsv(App.readByLen(legacy ? 3 : 8, header)));
        data.add(parseCsv(App.readByLen(legacy ? 3 : 100, header)));
        data.add(parseCsv(App.readByLen(legacy ? 20 : 100, header)));
        data.add(parseCsv(App.readByLen(5, header)));
        data.add(parseCsv(App.readByLen(5, header)));
        data.add(parseCsv(App.readByLen(2, header)));
        data.add(parseCsv(App.readByLen(11, header)));
        data.add(parseCsv(App.readByLen(4, header)));
        data.add(parseCsv(App.readByLen(11, header)));
        data.add(parseCsv(App.readByLen(1, header)));
        data.add(parseCsv(App.readByLen(50, header)));
        data.add(parseCsv(App.readByLen(50, header)));
        data.add(parseCsv(App.readByLen(20, header)));
        data.add(parseCsv(App.readByLen(13, header)));
        data.add(parseCsv(App.readByLen(7, header)));
        data.add(parseCsv(App.readByLen(10, header)));
        data.add(parseCsv(App.readByLen(10, header)));
        data.add(parseCsv(App.readByLen(10, header)));
        data.add(parseCsv(App.readByLen(10, header)));
        data.add(parseCsv(App.readByLen(10, header)));
        data.add(parseCsv(App.readByLen(35, header)));
        data.add(parseCsv(App.readByLen(35, header)));
        data.add(parseCsv(App.readByLen(8, header)));
        data.add(parseCsv(App.readByLen(legacy ? 3 : 18, header)));
        data.add(parseCsv(App.readByLen(240, header)));
        data.add(parseCsv(App.readByLen(100, header)));
        data.add(parseCsv(App.readByLen(9, header)));
        data.add(parseCsv(App.readByLen(17, header)));
        data.add(parseCsv(App.readByLen(35, header)));
        data.add(parseCsv(App.readByLen(10, header)));
        data.add(parseCsv(App.readByLen(15, header)));
        data.add(parseCsv(App.readByLen(269, header)));
        data.add(parseCsv(App.readByLen(30, header)));
        data.add(parseCsv(App.readByLen(255, header)));
        data.add(parseCsv(App.readByLen(30, header)));
        data.add(parseCsv(App.readByLen(7, header)));
        data.add(parseCsv(App.readByLen(4, header)));
        data.add(parseCsv(App.readByLen(256, header)));
        data.add(parseCsv(App.readByLen(5, header)));
        data.add(parseCsv(App.readByLen(10, header)));
        data.add(parseCsv(App.readByLen(50, header)));
        data.add(parseCsv(App.readByLen(50, header)));
        data.add(parseCsv(App.readByLen(70, header)));
        return data;
    }
}
