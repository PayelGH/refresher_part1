package basic.practice1;

public class DataTypesAndOperators{
    int a =100;
    int b= 200;
    int c= a;

   public int sum(int a, int b){
       return a+b;
   }
   public int mod(int a, int b){
       return a%b;
   }

    public static void main(String[] args) {
        DataTypesAndOperators ob1= new DataTypesAndOperators();
        System.out.println(ob1.sum(45, 89));
        System.out.println(ob1.mod(67, 5));

    }

}
