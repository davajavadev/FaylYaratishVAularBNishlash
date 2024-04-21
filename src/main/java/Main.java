import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

       if (!Files.exists(Path.of("SecondFile.txt"))){
            Files.createFile(Path.of("SecondFile.txt"));
        }

        String str = "Mening ismim Davlatbek";
        File file = new File("SecondFile.txt");
        FileWriter fileWriter = new FileWriter(file);
        fileWriter.write(str);
        fileWriter.close();



    }
}
