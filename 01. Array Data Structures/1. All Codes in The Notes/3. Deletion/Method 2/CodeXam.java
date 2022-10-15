import java.util.Arrays;
class CodeXam {
    public static void main(String[] args) {
        int[] arr = {12, 212, 30, 40, 56};
        //Delete an element from the array  with time complexity O(1) place the last element in the place of the deleted element
        int pos = 3;
        int n = arr.length;
        int[] arr1 = new int[n - 1];//new array with size of original array -1
        for (int i = 0; i < n - 1; i++) {//loop to copy elements from original array to new array except the element at position pos
            if (i < pos - 1) {//if i is less than pos-1 then copy the element from original array to new array  at index i
                arr1[i] = arr[i];
            } else {
                arr1[i] = arr[i + 1];//if i is greater than pos-1 then copy the element from original array to new array at index i+1
            }
        }
        System.out.println(Arrays.toString(arr1));
    }
}