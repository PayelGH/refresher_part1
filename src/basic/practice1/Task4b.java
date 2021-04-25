package basic.practice1;
public class Task4b {
    //overloading constructor
    public Task4b(int x, int y){
        x=x;
        y=y;
    }
    public int sum(int x, int y){
        return x+y;
    }
    public Task4b(int x, int y, int z){
        x=x;
        y=y;
        z=z;
    }

    public static void main(String[] args) {
        Task4b cal2= new Task4b(56, 98);
        System.out.println(cal2.sum(56, 98));
    }

}
