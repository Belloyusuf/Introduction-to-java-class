
public class Condition{
    public static void main(String[] args){
        // condition

        int x = 12;
        int y = 100;
        if (x > y){
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        // one line condition 
        boolean checkGreater = (277 < 25) ? true : false; // return false
        System.out.println(checkGreater);

        // time zone sample
        int time = 18;
        String timeZone = (time < 20 ) ?  "Good morning" : "Good evening";
        System.out.println(timeZone);

    }
}