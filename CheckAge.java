public class CheckAge {
    static void AgeValidator(int age){

        if ( age < 18 ){
            System.out.println("Access Denied");
        } else{
            System.out.println("Access Granted");
        }
    }

    public static void main(String[] args){
        AgeValidator(20);
    }
}
