package dataTypes;

public class AccessModifiersExample {
    public String name; //Public access
    private double salary; //Private Access
    protected int age; //Protected access
    String department; //default (package - private)

}
class Example{
    public static void main(String[] args){
        AccessModifiersExample obj=new AccessModifiersExample();
        obj.name="Dhana"; //Accessible
        //obj.salary=50000; Not Accessible

    }
}
