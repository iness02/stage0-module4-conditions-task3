package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public void calculateSalary(double salary) {
        if(salary >= 0 && salary <= 10000) System.out.println(Double.valueOf(salary - salary * 15 / 100));
        else if(salary > 10000 && salary <= 20000) System.out.println(Double.valueOf(salary - salary * 18 / 100));
        else if(salary > 20000) System.out.println(Double.valueOf(salary - salary * 20 / 100));
        else System.out.println("wrong input!");
    }
}
