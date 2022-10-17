//Storing User's input data into a 2D array and printing it.
import java.util.Scanner;
class CodeXam{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns");
        int n = sc.nextInt();//number of rows and columns of the 2D array
        int m = sc.nextInt();
        System.out.println("Enter the elements of the array");
        int arr [][] = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j] = sc.nextInt();//storing the elements of the array
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(arr[i][j]+" ");//printing the elements of the array
            }
            System.out.println();
        }
    }
}