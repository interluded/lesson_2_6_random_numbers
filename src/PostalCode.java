import java.util.Scanner;

public class PostalCode {
    public static void main(String[] args){
        char x = (char)(int)(26 * Math.random() + 65);
        int y = (int)(10 * Math.random());
        char z = (char)(int)(26 * Math.random() + 65);
        int x1 = (int)(10 * Math.random());
        char y1 = (char)(int)(26 * Math.random() + 65);
        int z1 = (int)(10 * Math.random());
        System.out.println("" + x + y + z + " " + x1 + y1 + z1);
    }
}
