public class SwitchCase {
    public static void main(String[] args){
        int grade = 5;
        switch(grade){
            case 1:
                System.out.println("First Class");
                break;
            case 2:
                System.out.println("Second Class");
                break;
            case 3:
                System.out.println("Lower Class");
                break;
            default:
                System.out.println("Failed, come back next year");
        }
    }
}
