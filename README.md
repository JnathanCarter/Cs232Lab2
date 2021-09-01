# Cs232Lab2
Lab 2 Instructions.pdf download

For this lab, you will be writing a program that opens a file named "lab2_input.txt" (lab2_input.txt  download), which contains a list of students' test scores in the range 0-200 (a sample input file is attached).  The first number in the file specifies the number of grades that it contains and should not be included in each of the number ranged bins your program will accumulate the counts for but all numbers on the next line should be counted among those ranges.  Your program should read in all the grades and count up the number of students having scores in each of the following ranges: 0-24, 25-49, 50-74, 75-99, 100-124, 125-149, 150-174, and 175-200.  Finally, your program should output the score ranges and the number of scores within each range.

For example, given the sample file input ...

26
76 89 150 135 200 76 12 100 150 28 178 189 167 200 175 150 87 99 129 149 176 200 87 35 157 189

... the output should resemble the following ...

[0 - 24]: 1
[25 - 49]: 2
[50 - 74]: 0
[75 - 99]: 6
[100 - 124]: 1
[125 - 149]: 3
[150 - 174]: 5
[175 - 200]: 8
