package basic.practice1;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Task5bChild extends Task5aParent {
    String dept = "Computer Science";
    double salary = 4000.00;
    String designation ="Faculty";
    String collegeName= "Ontario College of Teachers";

    public void designationChange(){
        System.out.println(super.designation);//will print teacher not faculty
    }

    public void does() {
        super.does();
    }

    public double bonus() {
        return (4000*10)/100;
    }

    public static void main(String[] args) {


        Task5bChild case1 = new Task5bChild();
        case1.designationChange();
        case1.does();
        System.out.println(case1.bonus());
    }
}
