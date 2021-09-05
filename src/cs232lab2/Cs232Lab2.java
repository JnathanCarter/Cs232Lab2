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
    int firstGroup= 0;
    int secondGroup= 0;
    int thirdGroup= 0;
    int forthGroup= 0;
    int fiveGroup= 0;
    int sixGroup= 0;
    int sevenGroup= 0;
    int eightGroup= 0;
      public static void main(String[] args) {
       File inputFile = new File("lab2_input-1.txt");
       ArrayList<Integer>numbers = readFileIntoArrayList();
       
       
       
        
    }
    public static ArrayList<Integer> readFileIntoArrayList(){
        ArrayList<Integer>numbers = new ArrayList<Integer>();
        
        try{
            Scanner sc = new Scanner(inputFile);
            while(sc.hasNextLine()){
                int temp =  sc.nextInt();
                numbers.add(temp);
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

    public static void CountGrades(ArrayList<Integer> input_array ){
        int amount = input_array.get(0);
        int lowerBoundary = 0;
        int upperBoundary  = 24;
        int tempcounter = 0;
        for(int i = 1; i <= amount; i++){
            
            for(int j = 0; j < 8; j++ ){
                
            }
       


        }

    } 
}

