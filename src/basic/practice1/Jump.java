package basic.practice1;
//break tp suddenly exit when an internal condition is true
// and continue statements: to skip a part when certain condition is true
public class Jump {
    public static void main(String[] args) {
//        //example1: break : to print all odd numbers between 20 and 50, inclusive
//        for(int i=21; i<=50; i=i+2){
//            if(i==35){
//                break; //as long the condition is true , code will exit 35 will not be printed
//            }
//            System.out.println(i);
//        }

        //example2: continue : to print all multiples of 5 between 20 and 50, inclusive
        for(int i=20; i<=50; i=i+5){

            if(i==30||i== 45){
                continue;
            }
            System.out.println(i);
        }
    }



}
