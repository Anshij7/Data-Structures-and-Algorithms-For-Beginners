import java.util.Arrays;
class CodeXam {
    public static void main(String[] args) {
        int[] arr = {12, 212, 30, 44, 56};//unsorted array of integers
        int pos = 3;//position of the element to be removed from the array (index starts from 0)
        System.out.println("Before deletion" + Arrays.toString(arr));//print the array before deletion of the element at the given position
        int[] newArr = new int[arr.length - 1];//create a new array of size one less than the original array to store the elements after deletion of the element at the given position
        for (int i = 0; i < pos - 1; i++) {//copy the elements from the original array to the new array till the given position - 1 (index starts from 0)
            newArr[i] = arr[i];//copy the elements from the original array to the new array till the given position - 1 (index starts from 0)
        }
        for (int i = pos; i < arr.length; i++) {//copy the elements from the original array to the new array from the given position (index starts from 0)
            newArr[i - 1] = arr[i];//i-1 because the new array is of size one less than the original array and we want to copy the elements from the original array to the new array from the given position (index starts from 0)
        }
        System.out.println("After deletion" + Arrays.toString(newArr));//print the array after deletion of the element at the given position
    }
}