package java_basic;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Example_ThrowsException {

    public static void main (String args[]){
        try {
            searchforfile();
        }catch (IOException e){
            System.out.println(e);
        }
    }
    public static void searchforfile() throws IOException{
        //File newFile = new File("C:\\Users\\Dinh Le\\IdeaProjects\\junitformaven\\src\\java_basic\\ABCD.txt");// this will not throw any error
        File newFile = new File("ABCD.txt");
        FileInputStream stream = new FileInputStream(newFile);

    }
}
