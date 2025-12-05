package dataTypes;

//import java.util.Scanner;

import java.sql.SQLOutput;

public class DataTypesExample {
    //instance Variables
    byte byteValue;
    short shortValue;
    int intValue;
    long longValue;
    float floatValue;
    double doubleValue;
    char charValue;
    boolean booleanValue;

    static int age=21; //Static Variable
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);

        // Primitive Data Types
        /*
        byte byteValue = 10;
        short shortValue = 200;
        int intValue = 25;
        long longValue = 10000L;
        float floatValue = 12.34f;
        double doubleValue = 123.456;
        char charValue = 'A';
        boolean booleanValue = true;

        // Displaying Values
        System.out.println("Byte Value: " + byteValue);
        System.out.println("Short Value: " + shortValue);
        System.out.println("Integer Value: " + intValue);
        System.out.println("Long Value: " + longValue);
        System.out.println("Float Value: " + floatValue);
        System.out.println("Double Value: " + doubleValue);
        System.out.println("Char Value: " + charValue);
        System.out.println("Boolean Value: " + booleanValue);

         */

        DataTypesExample dataTypesExample=new DataTypesExample();
        DataTypesExample obj=new DataTypesExample();

        String name= "Dhana"; //local variable
        System.out.println("Name: "+name);

        System.out.println("Default Values of Data Types in Java:");
        System.out.println("Byte: " + dataTypesExample.byteValue);
        System.out.println("Short: " + dataTypesExample.shortValue);
        System.out.println("Integer: " + dataTypesExample.intValue);
        System.out.println("Long: " + dataTypesExample.longValue);
        System.out.println("Float: " + dataTypesExample.floatValue);
        System.out.println("Double: " + dataTypesExample.doubleValue);
        System.out.println("Char: " + dataTypesExample.charValue);
        System.out.println("Boolean: " + dataTypesExample.booleanValue);

    }
}
