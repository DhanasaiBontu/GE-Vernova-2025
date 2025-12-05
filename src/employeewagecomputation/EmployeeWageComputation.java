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

        // ===== UC5: Calculate Monthly Wage for 20 Days =====
        int workingDaysPerMonth=20;
        int monthlyWage=workingDaysPerMonth*dailyWageUC4;
        System.out.println("Monthly Wage (UC5): " + monthlyWage);

        // UC6 : Calculate total wage till total hours = 100 or total working days = 20
        int totalHours=0;
        int totalDays=0;
        int totalSalary=0;
        while(totalHours<100 && totalDays<20) {
            totalDays++;
            int check=(int)(Math.random() * 3); // 0-Absent,1-Part time,2-Full time
            int hours=0;
            switch(check) {
                case 2:
                    System.out.println("Full Time Employee");
                    hours=8;
                    break;
                case 1:
                    System.out.println("Part Time Employee");
                    hours=4;
                    break;
                default:
                    System.out.println("Employee Absent");
                    hours=0;
                    break;
            }
            totalHours=totalHours+hours;
            int oneDaySalary=hours*wagePerHour;
            totalSalary=totalSalary+oneDaySalary;
            System.out.println("Day : " + totalDays +
                    "   Hours Worked : " + hours +
                    "   Today's Salary : " + oneDaySalary +
                    "   Total Hours : " + totalHours);
        }
        System.out.println("UC6 Final Results");
        System.out.println("Total Working Days : " + totalDays);
        System.out.println("Total Working Hours : " + totalHours);
        System.out.println("Total Salary Earned : " + totalSalary);
    }
}
