package assignment_5;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class IslandPerimeter {
	
	/**
	 * This method will take the values from the array of arrays and calculate the island's perimeter.
	 * @param arr : The values of the integer array of arrays. Example: [[1,2,3,4,5], [5,4,3,2,1]]
	 * @return : The perimeter of the island as an integer.
	 */
	public static int islandPerimeter(int arr[][]) {
		
		
		int perimeter = 0;
		// r means rows and c means columns.
		int r;
		int c;
		// Loops through each row and column to figure out all 4 sides of the cell (square).
		for (r = 0; r < arr.length; ++ r) {
			for (c = 0; c < arr[r].length; ++ c) {
				if (arr[r][c] == 1) {
					int cell = 0;
					// Top side of cell.
					if(r == 0) {
						cell++;
					}else if(arr[r - 1][c] == 0) {
                    	cell++;
                    }
					// Bottom of cell.
                    if(r == arr.length - 1) {
                    	cell++;
                    }else if(arr[r + 1][c] == 0) {
                    	cell++;
                    }
                	// Right of cell.
                    if(c == arr[r].length - 1) {
                    	cell++;
                    }else if(arr[r][c + 1] == 0) {
                    	cell++;
                    }
					// Left of cell.
                    if(c == 0) {
                    	cell++;
                    }else if(arr[r][c - 1] == 0) {
                    	cell++;
                    }
                 perimeter += cell;
                }
            }
        }
		return perimeter;
}
	
	public static void main(String[] args) throws IOException {
		
		// Open files, scanner, and writer.
		FileInputStream inputFile = new FileInputStream("island.txt");
		Scanner scanner = new Scanner(inputFile);
		FileOutputStream outputFile = new FileOutputStream("perimeter.txt");
		PrintWriter writer = new PrintWriter(outputFile);
		
		// This will store the first two integers, row and columns.
		int numberOfRows = scanner.nextInt();
		int numberOfColumns = scanner.nextInt();
		
		// The array of arrays.
		int [][] arr = new int[numberOfRows][numberOfColumns];
		
		// Loop through the file and store values into the double array.
		while (scanner.hasNextInt()) {
			
			// r means rows and c means columns.
			int r;
			int c;
			// Loops through the input file and stores each value in the integer of arrays.
			for (r = 0; r < arr.length; ++ r) {
				for (c = 0; c < arr[r].length; ++ c) {
					int values = scanner.nextInt();
					arr[r][c] = values;
				}
			}
		}
	    // Calls the method and passes the integer of arrays to that method. 
		int perimeter = islandPerimeter(arr);
		
		// Writes the total perimeter to the output file.
		writer.println("Perimeter: " + perimeter);
		
		// Close files and scanners.
		writer.close();
		outputFile.close();
		scanner.close();
		inputFile.close();
			
	}
}




