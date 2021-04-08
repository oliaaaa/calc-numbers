package com.calc.com;

import java.io.*;

public class Test {
    public static void main(String[] args) throws IOException {
        File file = new File("src/test/resources/numbers.txt");
        FileInputStream fileStream = new FileInputStream(file);
        InputStreamReader input = new InputStreamReader(fileStream);
        BufferedReader reader = new BufferedReader(input);

        String line;

        double count = 0;

        while ((line = reader.readLine()) != null) {
            if (!line.equals("") && !line.startsWith("#")) {
                count = count + Double.parseDouble(line);
            }
        }
        System.out.println(count);
    }
}

