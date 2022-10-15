import java.util.Scanner;
class CodeXam {
    public static void main(String args[]) {
        int n;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");
        n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter all the elements:");
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
        System.out.println("Elements in array are:");
        for (int i = 0; i < n; i++) {
            System.out.println(a[i]);
        }
    }
}
