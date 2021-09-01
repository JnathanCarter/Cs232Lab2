/*


 */
package cs232lab2;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.ArrayList;

/**
 * 
 * @author johnc
 */
public class Cs232Lab2 {
    int num_items = 0;
    static ArrayList<Integer> numbers = new ArrayList<Integer>();
    public static void main(String[] args) {
       try{
        File inputFile = new File("lab2_input-1.txt");
        Scanner sc = new Scanner(inputFile);
        while(sc.hasNextLine()){
            int temp =  sc.nextInt();
            numbers.add(temp);

            //System.out.println(temp);
            for (int i = 0 ; i < numbers.size(); i++){
                System.out.println(numbers.get(i));
            }
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

