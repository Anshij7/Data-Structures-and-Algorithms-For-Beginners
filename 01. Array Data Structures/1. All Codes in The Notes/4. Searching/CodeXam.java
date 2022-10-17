import java.util.Scanner;
class CodeXam{
    public static void main(String[] args) {
        int[]arr = { 1 , 2 , 3 , 4 , 5};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element to be searched");
        int element = sc.nextInt();
        int index = -1;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == element){
                index = i;
                break;
            }
        }
        if(index == -1){

            System.out.println("Element not found");


        }
        else{



            System.out.println("Element found at index " + index);
        }
    }
}