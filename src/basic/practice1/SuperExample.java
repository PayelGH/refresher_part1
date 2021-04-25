package basic.practice1;

public class SuperExample extends BaseChild{
    String colour= "red";
    String name= "Hello";

    public String carDetails(String colour,String name){
       // return colour+ name;
        return super.colour + super.name;
    }
    public void startCar(){
        System.out.println("car is not starting today but tomorrow ........");
        super.startCar();
    }

    public static void main(String[] args) {
        SuperExample ex1 = new SuperExample();
        ex1.startCar();
        System.out.println(ex1.carDetails("red", " "+ "hello"));
    }
}
