package employeewagecomputation;

public class EmployeeWageComputation {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");

        // ===== UC1: Check Employee is Present or Absent =====
        int random=(int)(Math.random() * 2); // gives 0 or 1
        if(random==1){
            System.out.println("Employee is Present");
        }
        else{
            System.out.println("Employee is Absent");
        }



        // UC2 - Daily Wage Calculation
        int wagePerHour=20;
        int fullDayHours=8;
        int dailyWage = 0;
        if(random==1) {
            dailyWage=wagePerHour*fullDayHours;
        }
        else {
            dailyWage = 0;
        }
        System.out.println("Daily Employee Wage: " + dailyWage);



        // ===== UC3: Add Part-Time Employee & Wage =====
        int partTimeHours=4;
        int empType=(int)(Math.random()*3); // 0, 1, or 2
        int empHours=0;
        if(empType==2){
            System.out.println("Employee is Full-Time");
            empHours=fullDayHours;
        }
        else if(empType==1){
            System.out.println("Employee is Part-Time");
            empHours=partTimeHours;
        }
        else{
            System.out.println("Employee is Absent");
            empHours=0;
        }
        int dailyWageUC3=wagePerHour*empHours;
        System.out.println("Daily Employee Wage (UC3): " + dailyWageUC3);



        // ===== UC4: Employee Wage Using Switch Case =====
        int empTypeUC4=(int)(Math.random()*3); // 0,1,2
        int empHoursUC4;
        switch(empTypeUC4){
            case 2:
                System.out.println("Employee is Full-Time (Switch Case)");
                empHoursUC4=fullDayHours;
                break;
            case 1:
                System.out.println("Employee is Part-Time (Switch Case)");
                empHoursUC4=4;
                break;
            default:
                System.out.println("Employee is Absent (Switch Case)");
                empHoursUC4=0;
        }
        int dailyWageUC4=wagePerHour*empHoursUC4;
        System.out.println("Daily Employee Wage (UC4): " + dailyWageUC4);




    }
}
