/**
 * Created by stutichandra on 10/7/17.
 */
import java.util.*;
public class Main {

    public static  void main(String args[]) {
        printFibonacci obj=new printFibonacci();
        //obj.printFibo(5);
        String cont;
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter value for no of rows and cols  \n");
        System.out.print("no of rows=");
        final int rows = reader.nextInt();
        System.out.print("no of cols=");
        final int cols = reader.nextInt();
        int matrix[][] = new int[rows][cols];
        matrix[0][1] = 1;
        matrix[1][0] = 1;


        obj.printMatrix(matrix,rows,cols);
         try {
             do {
                 System.out.println("Enter row and col position of the matrix to move");
                 int rowUpdate = reader.nextInt();
                 int colUpdate = reader.nextInt();
                 System.out.println("Press u to shift up,Press d to shift down,Press l to move left and Press r to move right");
                 String move = reader.next();

                 if (move.equals("u")) {
                     if(obj.checkNoIsFibonacci(matrix[rowUpdate - 1][colUpdate])&& obj.checkPerfectSquare(matrix[rowUpdate][colUpdate]))
                     matrix[rowUpdate - 1][colUpdate] += matrix[rowUpdate][colUpdate];
                     else
                         matrix[rowUpdate - 1][colUpdate] = matrix[rowUpdate][colUpdate];

                 }
                 if (move.equals("d") )
                 {
                     if(obj.checkNoIsFibonacci(matrix[rowUpdate + 1][colUpdate])&& obj.checkPerfectSquare(matrix[rowUpdate][colUpdate]))
                         matrix[rowUpdate + 1][colUpdate] += matrix[rowUpdate][colUpdate];
                         else
                           matrix[rowUpdate + 1][colUpdate] = matrix[rowUpdate][colUpdate];

                 }
                 if (move.equals("l")) {
                     if(obj.checkNoIsFibonacci(matrix[rowUpdate][colUpdate - 1])&& obj.checkPerfectSquare(matrix[rowUpdate][colUpdate]))
                         matrix[rowUpdate][colUpdate - 1] += matrix[rowUpdate][colUpdate];
                     else
                     matrix[rowUpdate][colUpdate - 1] = matrix[rowUpdate][colUpdate];

                 }
                 if (move.equals("r")) {
                     if(obj.checkNoIsFibonacci(matrix[rowUpdate][colUpdate + 1])&& obj.checkPerfectSquare(matrix[rowUpdate][colUpdate]))
                         matrix[rowUpdate][colUpdate + 1] += matrix[rowUpdate][colUpdate];
                     else
                     matrix[rowUpdate][colUpdate + 1] = matrix[rowUpdate][colUpdate];

                 }

               matrix= obj.generateNumberInRandomCell(matrix, rows, cols, rowUpdate, colUpdate);
                obj.printMatrix(matrix, rows, cols);
                System.out.println("Continue(y/n)?");
                cont = reader.next();
             }
             while (cont.equals("y"));
         }
         catch (ArrayIndexOutOfBoundsException exception )
         {
            System.out.print("Invalid move");
         }
         catch (InputMismatchException exception )
         {
             System.out.print("Invalid Input");
         }

    }

}

