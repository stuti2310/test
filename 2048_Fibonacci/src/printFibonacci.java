/**
 * Created by stutichandra on 10/6/17.
 */
public class printFibonacci
{
       int n=30;

       public int[] printFibo(int n) {
           int fibo[] = new int[n];
           fibo[0] = 1;
           fibo[1] = 1;

           for (int i = 2; i < n; i++) {
               fibo[i] = fibo[i - 1] + fibo[i - 2];
           }

           for (int i = 0; i < n; i++) {
               System.out.print(fibo[i]);
               System.out.print('\n');
           }

           return fibo;
       }

       public boolean checkNoIsFibonacci(int num)
       {


            return checkPerfectSquare(5*num*num+4 )||checkPerfectSquare(5*num*num-4);


       }

        public boolean checkPerfectSquare(int num)
        {
           int s= (int) Math.sqrt(num);
           return (s*s ==num);

        }

       public void printMatrix(int matrix[][],int rows,int cols)
       {


           for (int i = 0; i < rows; i++) {
               for (int j = 0; j < cols; j++) {

                   System.out.print(matrix[i][j] + " ");
               }
               System.out.println();
           }

       }

       public int[][] generateNumberInRandomCell(int matrix[][],int rows,int cols,int rowUpdate,int colUpdate)
       {
           matrix[rowUpdate][colUpdate]=0;

           outerloop:
           for (int i = 0; i < rows; i++) {
               for (int j = 0; j < cols; j++) {

                   if(matrix[i][j]==0)
                   {
                       matrix[i][j] = 1;
                       break outerloop;
                   }

               }

           }
           return matrix;

       }


}
