# assertX_Island_Perimeter
In this assignment, you will be given a map which is represented by a 2-dimensional array (array of arrays).  Each cell in the 2-dimensional array stores either 0 or 1 where 1 represents land and 0 represents water.

In this assignment, you can assume that all the following conditions are true:

•Grid cells are connected horizontally and vertically (not diagonally).

•The grid is completely surrounded by water.

•There is exactly 1 island (1 set of connected land cells).

•The island does not have "lakes" (water inside that is not connected to the water around the island).

•Each cell is a square with side length 1.

•The grid is rectangular.

In this assignment, you are going to write a Java program that reads in a 2-dimensional array (representing land/water) from an input file, calculates the perimeter of the island, and writes the result to an output file.

•The input file is a plain text file (filename: island.txt).

•First row in the input file contains 2 positive integers, which are the number of rows and number of columns in the grid (in that order).

•After the first row, values in the grid are listed in the input file (in row-major order).

•Please note that you cannot assume (or guess) the dimensions of the grid.  In other words, no matter how large the grid is, your program should correctly process it.
