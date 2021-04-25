package basic.practice1;

public class Task4a {
    //overloading concept: methods
    public int sum(int x, int y){
        return x+y;
    }
    public int sum(int x, int y, int z){
        return x+y+z;
    }
    public double sum(double x, double y){
        return x+y;
    }
    public double sum(double x, double y, double z){
        return x+y+z;
    }
    public static void main(String[] args) {
        Task4a cal1= new Task4a();
        System.out.println("Sum of x and y = "+ cal1.sum(67, 98));
        System.out.println("Sum of x, y and z = "+ cal1.sum(87, 98, 8));
        System.out.println("Sum of x and y = "+ cal1.sum(87.99, 56.76));
        System.out.println("Sum of x, y and z = "+cal1.sum(67.45, 45.9, 45.56));

    }
}
