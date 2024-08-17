public class BreakLoop{
    public static void main(String[] args){
        for (int i = 0; i < 20; i++){
            // loop will stop if it comes to 4
            if ( i == 4 ){
                break;
            }
            System.out.println(i);
        }
    }
}