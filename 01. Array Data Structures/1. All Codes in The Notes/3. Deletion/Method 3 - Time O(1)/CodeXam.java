import java.util.Arrays;
class CodeXam {
    public static void main(String[] args) {
        int[] arr = {1, 20, 5, 78, 30};
        int removeElement = 20;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == removeElement) {
                arr[i] = arr[arr.length - 1];
                arr = Arrays.copyOf(arr, arr.length - 1);
            }
        }
        System.out.println(Arrays.toString(arr));
   }
}
