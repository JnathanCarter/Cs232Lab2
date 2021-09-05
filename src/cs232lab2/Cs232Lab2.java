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
    static ArrayList<Integer>scoreResult= new ArrayList<Integer>();
      public static void main(String[] args) {
        File inputFile = new File("lab2_input-1.txt");
        ArrayList<Integer>numbers = readFileIntoArrayList();
        for(int i = 0;i<8; i++){
            scoreResult.add(0);
        }
       
       
        CountGrades(numbers);
        for (int j =0; j < scoreResult.size(); j++){
            System.out.println(scoreResult.get(j));
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

    // does fancy shit but it works
    public static void CountGrades(ArrayList<Integer> input_array ){
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

    } 
}

