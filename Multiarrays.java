import java.util.concurrent.ThreadLocalRandom;
import java.util.Scanner;
public class Multiarrays {

    public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
    System.out.println("Please enter number of columns ");
    int x = input.nextInt();
    //input.nextInt();
    System.out.println("Please enter number of rows ");
    int y = input.nextInt();

    //System.out.println(x + " " + y);
    
    int [][] matrix = new int [x][y];
    
    //fill matrix with zeroes
    for(int i = 0; i < matrix.length; i++) {
        for(int j = 0; j < matrix[i].length; j++) {
            matrix[i][j] = 0;
        }
    }

    int randomx = ThreadLocalRandom.current().nextInt(0, matrix.length);
    int randomy = ThreadLocalRandom.current().nextInt(0, matrix[0].length);
    //System.out.println(randomx + " " + randomy);
    matrix [randomx][randomy] = 1;
    //finding the 1
    for(int a = 0; a < matrix.length; a++) {
        for(int b = 0; b < matrix[a].length; b++) {
            if (matrix[a][b] != 0) {
                System.out.println("The one is at the locations:\nx = " + a + "\ny = " + b);
                break;
            }
            
        }
    }
        //show matrix 
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}