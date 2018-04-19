/* Soroush Hashemloo
 * Map Solving Project
 * 
 */
import java.io.File; //imports input output function
import java.util.Scanner; //Imports scanner function
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadData {
//read file to 2d array
//do
//method, solve for first route; save path
//find first trap, replace with obstacle in array; solve method again; save new path
//while there are still traps on the map
  
public static void main(String args[]) throws Exception {
  try { 
    //File map = new java.io.File(args[1]);
    System.out.println("filename to read is " +  arg[1]);
    public char [][] matrix = filetoMatrix("map1.txt");
    int matrixSize = matix[0].length();
    System.out.println("matrix size is " +  matrixSize + "\n");

    for (int i = 0; i < matrixSize; i++) {
      for (int j = 0; j < matrixSize; j++) {
        System.out.print(matrix[i][j]);
      }
      System.out.print("\n");
    } 
    // if Trap is in mapText[x][y]
    // xPosition of the trap = trapPositions[0][trapCounter]
    // yPosition of the trap = trapPositions[1][trapCounter]
    // public int [][] trapPositions = new int[2][mapSide*mapSide];
    // public int trapCounter = -1;
    // method Solve
  } catch (Exception e) {
    System.out.println("Exception occurred");
  } 
}
  
public char [][] fileToMatrx (String filename) throws Exception {
  try {
    Scanner myFileScanner = new Scanner(map);
    File map = new java.io.File(filename);
    int mapSide = 0;
    String currentLine;
  
    currentLine = myFileScanner.nextLine();
    mapSide = currentLine.length();
    public char [][] mapText = new char[mapSide][mapSide];
    mapText[0] = currentLine.toCharArray();
    System.out.println("currentline at 0 is " +  currentLine);
    int linecounter = 1;

    while (myFileScanner.hasNextLine()) {
      currentLine = myFileScanner.nextLine();
      System.out.println("currentline at " + linecounter + " is " +  currentLine);
      mapText[linecounter] = currentLine.toCharArray();
      for (int i = 0; i < mapSide; i++) {
        System.out.println("mapText at " + linecounter + " and " + i + " is " +  mapText[linecounter][i]);
      }
      linecounter++;
    }
    System.out.print("Done filling the Array \n");
    // make sure our array is correct;  
    for (int i = 0; i < mapSide; i++) {
      for (int j = 0; j < mapSide; j++) {
        System.out.print(mapText[i][j]);
      }
      System.out.print("\n");
    } 
    return mapText;
 } catch (Exception e) {
    System.out.println("Exception occurred");
 } // catch 
} // filetoMatrix 

public void boolean tryToSolveThis (int x, int y) {
  if (walkTheMaze(x, y) == true) {
    //mark the path in the maze via symbol 'S'
    mapText[x][y] = 'S'
  }
}
  
public boolean walkTheMaze (int x, int y) 
{
    //assuming all maps are square
    //' ' is where the monster can move
    // '+', '-'. '|' are obstacles
    //'N' is start position
    //'G' is goal
    //'P' is potential trap location
    //x is column, y is row
    
    //if x = < 0, or y < 0 or x or y > mapSide (out of bounds) return false
    if ((x < 0) || (y < 0) || (x > mapSide) || (y > mapSide) {
      return false;
    }
    //if value of mapText[x][y] == '+' || '-' || '|' (obstacle) return false
    if (mapText[x][y] == '|' || mapText[x][y] == '+' || mapText[x][y] == '-'){
      return false;
    }
    //if value of mapText[x][y] == 'G' return true got to the goal
    if (mapText[x][y] == 'G') {
      return true;
    }
    mapText[x][y] = 'S';
    boolean result; 
    result = walkTheMaze(x, y+1);        
    //once conditions are fullfiled, mapText[x][y] = 'S' any Potential Trap is considered a possible path
    if (mapText[x][y] == 'P') {
      trapCounter++; 
      trapPositions[0][trapCounter] = x;
      trapPositions[1][trapCounter] = y;
    }
    if (result == true) {
        return true;
    }
    // Step Right
    result = walkTheMaze(x, y+1);        
    //once conditions are fullfiled, mapText[x][y] = 'S' any Potential Trap is considered a possible path
    if (mapText[x][y+1] == 'P') {
      trapCounter++; 
      trapPositions[0][trapCounter] = x;
      trapPositions[1][trapCounter] = y+1;
    }
    if (result == true) {
        return true;
    }
    // Step Up
    result = walkTheMaze(x-1, y);        
    //once conditions are fullfiled, mapText[x][y] = 'S' any Potential Trap is considered a possible path
    if (mapText[x-1][y] == 'P') {
      trapCounter++; 
      trapPositions[0][trapCounter] = x-1;
      trapPositions[1][trapCounter] = y;
    }
    if (result == true) {
        return true;
    }
    // Step Left
    result = walkTheMaze(x, y-1);        
    //once conditions are fullfiled, mapText[x][y] = 'S' any Potential Trap is considered a possible path
    if (mapText[x][y-1] == 'P') {
      trapCounter++; 
      trapPositions[0][trapCounter] = x;
      trapPositions[1][trapCounter] = y-1;
    }
    if (result == true) {
        return true;
    }
    // step Down
    result = walkTheMaze(x+1, y);        
    //once conditions are fullfiled, mapText[x][y] = 'S' any Potential Trap is considered a possible path
    if (mapText[x+1][y] == 'P') {
      trapCounter++; 
      trapPositions[0][trapCounter] = x+1;
      trapPositions[1][trapCounter] = y;
    }
    if (result == true) {
        return true;
    }    
    //if any directional cell returns true, method returns true
    //for each direction which returns false, unmark 'S';  mapText[x][y] = 'Z'
    //else return false
  }
} // Class
