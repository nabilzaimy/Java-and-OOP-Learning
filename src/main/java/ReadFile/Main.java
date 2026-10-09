package ReadFile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args){

        // How to read a file using Java (3-Options)

        //BufferedReader + FileReader : Best for reading text files line by line
        //FileInputStream : Best for binary files (e.g., images , audi files)
        //RandomAccessFile : Best for read/write specific portions of large file

        String filePath = "/Users/zaimynabil/IdeaProjects/task-platform/k8s/api-gateway-deployment.yaml";

        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))){

            String line;
            while((line = reader.readLine()) != null){
                System.out.println(line);
            }
            System.out.println("The File Exist !");
        }

        catch (IOException e){
            System.out.println("File Does't Exist !");
        }
    }
}
