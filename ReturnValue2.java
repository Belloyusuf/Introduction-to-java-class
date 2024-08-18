public class ReturnValue2 {
    static  int Mynum(int x , int y, int j){
        return x + y - j;
    }

  
   public static void main(String[] args){

    int TotalValues = Mynum(3, 10, 11);

    System.out.println(TotalValues);
   }
}
