package lesson01;

public class lesson01Task02 {
    public static void main(String[] args) {
        int [][] intp = {
                {1, 2, 4},
                {2, 5, 8}
        };
        for (int[]  anInt : intp){
            for (double o : anInt){
                o = o * 1.1;
                System.out.print(o + " ");
            }
        }
    }
}
