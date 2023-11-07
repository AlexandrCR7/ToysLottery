package View;

import java.io.IOException;

public class View {
    public void loggi(String string) {
        try (java.io.FileWriter fw = new java.io.FileWriter("file.txt", true)) {
            fw.append(string);
            fw.append('\n');
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
