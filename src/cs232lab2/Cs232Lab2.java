
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
    
    public static void main(String[] args) {
        /**Initialize ArrayList to hold the input from file and sets its value to the ArrayList returned by
        * readFileIntoArrayList()
        */
        ArrayList<Integer>numbers = readFileIntoArrayList();

        /**
         * Intialize Arraylist to hold results and fills with zero and inflates to size of 8 elements
         */
        ArrayList<Integer>scoreResult= new ArrayList<Integer>();
        for(int i = 0;i<8; i++){
            scoreResult.add(0);
        }

        //sets the scoreResults Arraylist to hold the counts computed by CountGrades()
        scoreResult = CountGrades(numbers, scoreResult);
        
        //Prints the output results
        System.out.println("[0-24]:"+scoreResult.get(0));
        System.out.println("[25-49]:"+scoreResult.get(1));
        System.out.println("[50-74]:"+scoreResult.get(2));
        System.out.println("[75-99]:"+scoreResult.get(3));
        System.out.println("[100-124]:"+scoreResult.get(4));
        System.out.println("[125-149]:"+scoreResult.get(5));
        System.out.println("[150-174]:"+scoreResult.get(6));
        System.out.println("[175-200]:"+scoreResult.get(7));
       
       
       
    }
    /**
     * This function reads the integers from an input file and stores then in an ArrayList
     * @return returns the Array list "numbers" that holds the integers from input file
     */
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
            System.out.println("File not Found!!");
            e.printStackTrace();
        }
        catch(NoSuchElementException e){
            //System.out.println("All of file read");
        }   
        return numbers;
    }   

    /**
     * This function takes an array of integer scores, counts the number of score in 
     * specific set of ranges and returns an array of the number of scores for each range 
     * @param input_array Holds the scores to be counted
     * @param scoreResult Holds the count of scores in certain ranges
     * @return An ArrayList holding the count of scores in each range
     */
    public static ArrayList<Integer> CountGrades(ArrayList<Integer> input_array, ArrayList<Integer> scoreResult ){
        int amount = input_array.get(0);
        int lowerBoundary = 0;
        int upperBoundary  = 24;
        for(int i = 1; i <= amount; i++){
            lowerBoundary = 0;
            upperBoundary  = 24;
            for(int j = 0; j < 8; j++ ){
                if(input_array.get(i)>= lowerBoundary && input_array.get(i) <= upperBoundary){
                    int temp = scoreResult.get(j);
                    temp+=1;
                    scoreResult.set(j, temp);
                }
                lowerBoundary +=25;
                if(j == 6){
                    upperBoundary +=26;
                }
                else{

                    upperBoundary +=25;
                }
            }
    
        }
        return scoreResult;
    } 
}

