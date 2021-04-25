package basic.practice1;

public class BaseChild extends BaseClass{
    String colour = "blue";
    String name= "Corolla";

    public void startCar(){
        System.out.println("car is starting today........");
    }

    public String carDetails(String colour,String name){
        return colour+ name;
    }
    public static void main(String[] args) {

        BaseClass car1= new BaseChild();
        car1.startCar();
        car1.carType= "sedan";
        car1.numberPlate= 76;
        car1.sumMileage(78,98);
        System.out.println(car1.carPlate);
        System.out.println(car1.carType+ " "+car1.numberPlate+ " "+car1.sumMileage(78, 98));

        BaseChild car2= new BaseChild();
        car2.startCar();
        car2.carDetails("Red", "Corolla");
        car2.carType=" hatchback";
        car2.sumMileage(67, 98);
        System.out.println(car2.carDetails("Red", "Corolla")+ " "+car2.carType+ " "+car2.sumMileage(67, 98));




    }
}
