public class Overload {
    static int plusMethod(int x, int y){
        return x + y;
    }

    static double plusMethod(double x, double y){
        return x + y;
    }

    public static void main(String[] args){
        System.out.println(plusMethod(54.5, 6.0));
        System.out.println(plusMethod(4, 6));
    }
}
