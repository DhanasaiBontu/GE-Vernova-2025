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
    }
}
