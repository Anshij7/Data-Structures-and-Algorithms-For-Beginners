import java.util.*;
// Insert an element at a specific position in an Array in Java
//main idea is first make a new array of size n+1 and then copy all the elements of the old array to the new array and then insert the element at the specific position
class CodeXam {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int pos = 2;
        int val = 10;
        int[] newArr = new int[arr.length + 1];//new array's size is previous array's size + 1 because we are inserting an element in the array so the size of the array will increase by 1

        for (int i = 0; i < pos; i++) {//copying all the elements of the old array to the new array till the position where we want to insert the element in the array
            newArr[i] = arr[i];
        }

        newArr[pos] = val;//inserting the element at the specific position
        for (int i = pos + 1; i < newArr.length; i++) {//copying the remaining elements of the old array to the new array
            newArr[i] = arr[i - 1];//i-1 because we have inserted an element in the array so the size of the array has increased by 1 so the index of the elements of the old array will be i-1 for the new array
        }
        System.out.println(Arrays.toString(newArr));

    }

}