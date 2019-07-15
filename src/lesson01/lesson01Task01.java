package lesson01;

public class lesson01Task01 {
    public static void main(String[] args) {
        double mg=50, mm, Fg, Fm, g=9.8;
        Fg = mg * g;
        Fm = 0.16 * Fg;
        mm = Fm / g;
        System.out.println("The weight on the moon = " + mm + " kg");
    }
}

