package basic.practice1;
//try catch for unchecked and throws for checked
public class Task7ExceptionHandling {
    public static void main(String[] args)throws InterruptedException{
        try{
            int a= 67/0;
            System.out.println(a);
           }catch(ArithmeticException e) {
            e.printStackTrace();
        }
            try{
                int arr[]= new int[2]; arr[4]= 56;
                System.out.println(arr[4]);
               }catch (ArrayIndexOutOfBoundsException f) {
                f.printStackTrace();
            }
                 try{
                 String s=null;
                 System.out.println(s.length());
                    }catch (NullPointerException g){
                     g.printStackTrace();
                 }
        System.out.println("All exceptions handled, code is running");
        Thread.sleep(4000);
    }
}
