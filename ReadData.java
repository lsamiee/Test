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

public static void main(String args[]) throws Exception{
  File map = new java.io.File("map1.txt");
  Scanner myFileScanner = new Scanner(map);
  int mapSide = 0;
  mapSide = myFileScanner.nextLine().length();
  char [][] mapText = new char[mapSide][mapSide];
  while (myFileScanner.hasNextLine()) {
    String currentline = myFileScanner.nextLine();
    for (int i = 0; i < currentLine.length; i++) {
      mapText[mapSide][i] = myFileScanner.toCharArray();
    }
  lineCount++;
 }                                 
 return matrix;
}
  // if Trap is in mapText[x][y]
  // xPosition of the trap = trapPositions[0][trapCounter]
  // yPosition of the trap = trapPositions[1][trapCounter]
  int [][] trapPositions = new int[2][mapSide*mapSide];
  public int trapCounter = -1;
    
  //read file to 2d array
  //do
  //method, solve for first route; save path
  //find first trap, replace with obstacle in array; solve method again; save new path
  //while there are still traps on the map
  
  
 //assuming all maps are square
  //' ' is where the monster can move
  // '+', '-'. '|' are obstacles
  //'N' is start position
  //'G' is goal
  //'P' is potential trap location
  //x is column, y is row
  //mark the path in the maze via symbol 'S'
  //if x = <0, or y<0 or x||y>mapSide (out of bounds) return false
  if ((x < 0) || (y < 0) || (x > mapSide) || (y > mapSide){
    return false;
  }
  //if value of mapText[x][y] == '+' || '-' || '|' (obstacle) return false
    if (mapText[x][y] == '|' || mapText[x][y] == '+' || mapText[x][y] == '-'){
   return false;
  }
  //if value of mapText[x][y] == 'G' return true
    if (mapText[x][y] == 'G') {
   return true;
    }
  //once conditions fulfiled, mapText[x][y] = 'S'
      if (mapText[x][y] == 'P'){
         trapCounter++; 
         trapPositions[0][trapCounter] = x;
         trapPositions[1][trapCounter] = y;
      }
  //if any directional cell returns true, method returns true
  //for each direction which returns false, unmark 'S';  mapText[x][y] = 'Z'
  //else return false

  
  }
 }
}
