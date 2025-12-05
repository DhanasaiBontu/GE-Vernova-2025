package employeewagecomputation;

// ===== UC1: Check Employee is Present or Absent =====

public class EmployeeWageComputation {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");

        int random=(int)(Math.random() * 2); // gives 0 or 1
        if(random==1){
            System.out.println("Employee is Present");
        }
        else{
            System.out.println("Employee is Absent");
        }
    }
}
