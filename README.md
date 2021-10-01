# Cs232Lab2
- Simple java program
- Reads data from ".txt" file and Counts the numbers of grades in specific scores ranges

# Description

This program opens a file named "lab2_input.txt" (lab2_input.txt  download), which contains a list of students' test scores in the range 0-200 (a sample input file is attached).  The first number in the file specifies the number of grades that it contains, and the subsequent line contain the grade data. This program then reads in all the grades and count up the number of students having scores in each of the following ranges: 0-24, 25-49, 50-74, 75-99, 100-124, 125-149, 150-174, and 175-200.  Then the program outputs the score ranges and the number of scores within each range.

The program start by opening the input file "lab2_input_1.txt" , reading the data, and inserts it into the integer ArrayList "numbers". A seperate integer ArrayList "scoreResults" is also defined. Each index of this array coresponds to a grade range category, and the elements within is an integer representation of how many grades are within that range. The initial values are all set to zero to size the ArrayList appropriately. The "CountGrades" function take two intger ArrayList as arguments and returns another ArrayList . These two arrays are "numbers" and "scoreResults". The functions computes the number of grades in each score range and then the sets the value to the according index in "scoreResults", this is then returned by the function. Line 37 the previous function is called and sets the ArrayList "scoreResults" to the ArrayList that is returned. "scoreResults" now contains the data computed by the function, each index is a score range and the value of each index is the number of scores within that range. The results are then printed to the console for the user to view. 


# Code Example

![ScreenshotOutput](https://user-images.githubusercontent.com/89806393/135565394-4b9457a9-4853-471e-8930-0170b7ebe421.png)
