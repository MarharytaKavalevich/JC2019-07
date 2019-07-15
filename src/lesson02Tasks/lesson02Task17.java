package lesson02Tasks;

public class lesson02Task17 {
    public static void main(String[] args) {  // Pogram to find the second largest element in an array
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int index = array.length-1;
        while(array[index] == array[array.length-1]){
            index--;
        }
        System.out.println("Second largest element: " + array[index]);
    }
}
