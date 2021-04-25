package basic.practice1;

public class Task3b {
    int a, b, c;

    public Task3b(int a, int b, int c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    public int sum(){
        return a+b+c;
    }

    public static void main(String[] args) {
        Task3b calc1= new Task3b(45, 89, 6754);
        System.out.println("The sum is = "+calc1.sum());

        Task3b calc2= new Task3b(77, 8999, 6);
        System.out.println("The sum is = "+calc2.sum());
    }
}
