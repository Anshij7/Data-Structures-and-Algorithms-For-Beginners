//Update operation - This operation is performed to update an existing array element located at the given index.
import java.util.Arrays;
class CodeXam{
    public static void main(String[] args) {
        int[]arr = { 1 , 2 , 3 , 4 , 5};
        int index = 2;//index of the element to be updated
        int newValue = 6;//new value to be updated
        System.out.println("Before update: "+Arrays.toString(arr));//
        for(int i=0; i<arr.length; i++){
            if(i == index){//if index matches with the given index then update the value at that index with the new value 
                arr[i] = newValue;
                break;
            }
        }
        System.out.println("After update: "+Arrays.toString(arr));
    }
}