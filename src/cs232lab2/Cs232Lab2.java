/*


 */
package cs232lab2;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 * 
 * @author johnc
 */
public class Cs232Lab2 {
    int num_items = 0;
  //  ArrayList<int> numbers = new ArrayList<int>();
    public static void main(String[] args) {
       try{
        File inputFile = new File("lab2_input-1.txt");
        Scanner sc = new Scanner(inputFile);
        while(sc.hasNextLine()){
            int temp =  sc.nextInt();


            System.out.println(temp);
        }
        sc.close();

       }
       catch(FileNotFoundException e){
            System.out.println("An error has occured");
            e.printStackTrace();
        }
        catch(NoSuchElementException e){
            //System.out.println("All of file read");
        }
        /*
        int temp =  sc.nextline;
        System.out.println(temp);
        */


    }
    
}

