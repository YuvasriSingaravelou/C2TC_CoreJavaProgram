package entityclassassignment2;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;

public class Demo {
    public static void main(String[] args) throws IOException {
        
        URL resource = Demo.class.getResource("C67.txt");

        
        if (resource == null) {
            System.err.println("File not found");
            return;
        }

        
        File file = new File(resource.getFile());

        
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
        }

       
        bufferedReader.close();
    }
}
