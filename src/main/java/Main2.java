import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main2 {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("SecondFile.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String str = bufferedReader.readLine();
        while ((str= bufferedReader.readLine())!=null){
            System.out.println(str);
        }
    }
}
