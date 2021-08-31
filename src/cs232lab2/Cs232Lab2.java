/*


 */
package cs232lab2;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author johnc
 */
public class Cs232Lab2 {

    public static void main(String[] args) {
       try{
        File inputFile = new File("lab2_input-1.txt");
        Scanner sc = new Scanner(inputFile);


        

       }
       catch(FileNotFoundException e){
            System.out.println("An error has occured");
            e.printStackTrace();
        }



    }
    
}

