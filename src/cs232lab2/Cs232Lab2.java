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
    static File inputFile = new File("lab2_input-1.txt");
    int num_items = 0;
    public static void main(String[] args) {
       File inputFile = new File("lab2_input-1.txt");
       ArrayList<Integer>numbers = readFileIntoArrayList();
       for(int i = 0; i< numbers.size();i++){
           System.out.println(numbers.get(i));
       }
        
    }
    public static ArrayList<Integer> readFileIntoArrayList(){
        ArrayList<Integer>numbers = new ArrayList<Integer>();
        
        try{
            Scanner sc = new Scanner(inputFile);
            while(sc.hasNextLine()){
                int temp =  sc.nextInt();
                numbers.add(temp);
            }
        
            for (int i = 0 ; i < numbers.size(); i++){
            System.out.println(numbers.get(i));               
            }
            sc.close();
            
        //System.out.println(temp);
        }
        catch(FileNotFoundException e){
            System.out.println("An error has occured");
            e.printStackTrace();
        }
        catch(NoSuchElementException e){
            //System.out.println("All of file read");
        }   
        return numbers;
    }   
}

