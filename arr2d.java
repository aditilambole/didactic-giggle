import java.util.*;
public class Solution{
    public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     int iteration_J = n;
     int a = 0; 
     int b=0; 
     int value = 0;
     
     int [][] arr2d = new int[n][n];
     for (int i=0; i<n; i++){
         if(i%2>0)
         a=n-1;
         for (int j=0; j<iteration_J; j++){
             value++;
             if(i%2==0)
             {
                 arr2d[a][b]=value;
                 a++;
             }
             else
             {
                 arr2d[a][b]=value;
                 a--;
             }
         }
         iteration_J--;
         b++;
         a=b;
     }
     //Print the Matrix
     for (int i=0; i<n;i++){
         for (int j=0;j<n;j++){
             if(arr2d[i][j]>0)
             System.out.print(arr2d[i][j] + " ");
         }
         System.out.println();
     }
    }
}