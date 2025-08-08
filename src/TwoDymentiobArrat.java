import java.util.Scanner;

public class TwoDymentiobArrat {
   
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int c = sc.nextInt();
        int[][] arr=new int[a][c];

        for(int i=0;i<a; i++)
        {
            for(int  j=0; j<c; j++)
            {
                int b = sc.nextInt();
                arr[i][j] = b;
            }
        }
       for(int i=0; i<a; i++)
       
       
       {
        for(int j=0; j<c; j++)
          {
            System.out.print(arr[i][j]);
          }
            System.out.println();
       }

       }
    }
    