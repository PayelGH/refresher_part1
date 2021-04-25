package basic.practice1;
//implements methods from A and calc sum of a and b

public class Task6a implements A ,B{//note all abstract methods must be implemented in the class
    static final String deptName= "developers";
    static final int deptId= 10;

    public int sum(int a, int b){
        return a+b;
    }
    public int mul(int x, int y){
        return x*y;
    }

    public static void main(String[] args) {
        A example1= new Task6a();
        System.out.println("Dept name =" +deptName);
        System.out.println("Dept name =" +deptId);
        System.out.println(example1.sum(67, 98));//only print A method not B as it declared with interface A


        //alternate
        Task6a example2 = new Task6a();
        System.out.println("Dept name =" +deptName);
        System.out.println("Dept name =" +deptId);
        System.out.println(example2.sum(84, 90));
        System.out.println(example2.mul(88, 90));//can print both methods from A and B


    }

}
