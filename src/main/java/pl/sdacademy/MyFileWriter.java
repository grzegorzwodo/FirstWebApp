package pl.sdacademy;

import java.io.BufferedWriter;
import java.io.IOException;

public class MyFileWriter {

    void addRecordToFile(String name, String surname, String pathToFile) throws IOException {
        BufferedWriter writer =
                new BufferedWriter(new java.io.FileWriter(pathToFile, true));
        writer.append(name);
        writer.append(' ');
        writer.append(surname);
        writer.newLine();
        writer.close();
    }
}
