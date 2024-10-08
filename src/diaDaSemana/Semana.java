package diaDaSemana;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    public static String findDay(int month, int day, int year) {
        Calendar c = Calendar.getInstance();
        c.set(year, month-1, day);
        int dayNum = c.get(Calendar.DAY_OF_WEEK);
        
        if(dayNum == 1) return "Domingo";
        if(dayNum == 2) return "Segunda Feira";
        if(dayNum == 3) return "Terça Feira";
        if(dayNum == 4) return "Quarta Feira";
        if(dayNum == 5) return "Quinta Feira";
        if(dayNum == 6) return "Sexta Feira";
        if(dayNum == 7) return "Sabado";
        
        return "DAY IS UNDEFINED";
    }

}

public class Semana {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int month = Integer.parseInt(firstMultipleInput[0]);

        int day = Integer.parseInt(firstMultipleInput[1]);

        int year = Integer.parseInt(firstMultipleInput[2]);

        String res = Result.findDay(month, day, year);

        bufferedWriter.write(res);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

