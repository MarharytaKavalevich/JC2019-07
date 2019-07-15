package lesson01;

public class lesson01Task17 {
    public static void main(String[] args) {
       int a[] = {1, 2, 4, 5, 7, 8};
       int max = a[0];
        for (int i = 0; i < a.length; i++) {
            if (max < a[i])
                max = a[i];
            }
        for (double x : a){
            System.out.print(x / max + " ");
        }
    }
}

