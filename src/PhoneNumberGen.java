//

import java.util.Scanner;

public class PhoneNumberGen {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int random_1 = (int) (100 + Math.random() * (999 - 100 + 1));
        int random_2 = (int) (100 + Math.random() * (999 - 100 + 1));
        int random_3 = (int) (1000 + Math.random() * (9999 - 1000 + 1));
        System.out.println("The random phone number is: " + "(" + random_1 + ")" + "-" + random_2 + "-" + random_3);
        }


    }

