package pl.lublin.wsei.java.cwiczenia.test;
import javax.swing.text.StringContent;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class TestFileRead {
    public static void main(String[] args) throws java.ip.IOException {
        try{
            StringContent = new String(Files.readAllBytes(Paths.get("gusInfoGrapgic.xml")));
            System.out.println("Zawartość pliku gusInfoGrapgic.xml");
            System.out.print(contents);
        }
        catch (IOException e) {
            System.out.println("Błąd wczytywania pliku gusInfoGrapgic.xml => " + e.getLocalizedMessage());
            e.printStackTrace();
        }
    }
}
