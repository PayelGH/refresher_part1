package basic.practice1;

public class BaseClass {
    String carType;
    int numberPlate;
    final int carPlate= 12;

    public void startCar(){
        System.out.println("car is starting........");
    }
    public int sumMileage(int mil1, int mil2){
        return mil1+mil2;
    }
}
