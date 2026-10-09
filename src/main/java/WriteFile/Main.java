package WriteFile;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args){

        // How to write a file using Java
        // FileWriter myfile = new FileWriter("File.txt);


        String location = "Dockerfile";
        String content = """
                WORKDIR app/
                
                COPY target/
                """;

        try(FileWriter file = new FileWriter(location)){
            file.write(content);
            System.out.println("File is created Successfully!");
        }

        catch (IOException e) {
            System.out.println("Fail to create file !");;
        }
    }
}
