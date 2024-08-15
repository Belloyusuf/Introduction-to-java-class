import java.lang.Math;

public class Calculate {
    public static void main(String[] args){
        // return maximum number 
        int total = Math.max(5, 10);
        System.out.println(total);

        // return square root of the given number
        System.out.println(Math.sqrt(64));

        // return absolute value of the number
        System.out.println("Absolute value of  `-2.3` " + Math.abs(-2.3));

        // return a random number
        System.out.println(Math.random());
        System.out.println((int)(Math.random() * 100 ));



    }
}
