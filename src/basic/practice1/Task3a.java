package basic.practice1;

public class Task3a {
    //variables
    int StuId, sub1, sub2, sub3;
    String StuName;
    static int classNo=31;// create a separate memory location where the shared info will be stored

    //methods
    public void StuData(int StuId, String StuName) {
        this.StuId = StuId;
        this.StuName = StuName;
        System.out.println("Student ID = " + StuId + " and student name is= " + StuName);
    }

    public void getMarks(int sub1, int sub2, int sub3) {
        this.sub1 = sub1;
        this.sub2 = sub2;
        this.sub3 = sub3;
        System.out.println("Marks for sub1 = " + sub1 + ", marks for sub2= " + sub2 +
                ", mark for sub3= " + sub3);
    }

    public double totalMarks(int sub1, int sub2, int sub3) {
        return sub1 + sub2 + sub3;
    }
    public static void classNumber(){
        System.out.println("The class number is = "+ classNo );
    }
    public static void main(String[] args) {

        Task3a s1 = new Task3a();
        classNumber();
        s1.StuData(12, "Aaron");
        s1.getMarks(88, 67, 78);
        System.out.println("Total marks is " + s1.totalMarks(88, 67, 78));

        Task3a s2= new Task3a();
        classNumber();
        s1.StuData(17, "Rani");
        s1.getMarks(98, 67, 78);
        System.out.println("Total marks is " + s1.totalMarks(98, 67, 78));

        Task3a s3= new Task3a();
        classNumber();
        s1.StuData(34, "Carol");
        s1.getMarks(88, 60, 78);
        System.out.println("Total marks is " + s1.totalMarks(88, 60, 78));
    }
}
