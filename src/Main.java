import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1L, "Hawash", "Ahmad", Positions.QA, "01.01.1990"));
        employees.add(new Employee(2L, "Ahmad", "Khateeb", Positions.BE, "01.01.1990"));
        employees.add(new Employee(3L, "yassen", "mohammad", Positions.FE, "01.01.1990"));
        employees.add(new Employee(4L, "Amneh", "khaled", Positions.HR, "01.01.1990"));
        employees.add(new Employee(5L, "Walaa", "Ahmad", Positions.QA, "01.01.1990"));

        Supplier<Double> QASalary = () -> QAComputeSalary();
        Supplier<Double> BESalary = () -> BEComputeSalary();
        Supplier<Double> FESalary = () -> FEComputeSalary();
        Supplier<Double> HRSalary = () -> HRComputeSalary();

        HashMap<Positions , Supplier<Double>> salaryMap = new HashMap<>();
        salaryMap.put(Positions.QA, QASalary);
        salaryMap.put(Positions.BE , BESalary);
        salaryMap.put(Positions.FE , FESalary);
        salaryMap.put(Positions.HR , HRSalary);



          employees.stream().forEach(employee -> {
              System.out.println(employee.getFirstName() + " " + employee.getLastName() + " Salary is " + salaryMap.get(employee.getPosition()).get());
          });

    }
    public static double QAComputeSalary() {
        double basic = 1000 ;
        double FE = 0.1 * basic ;
        double Transportation = 0.05 * basic ;
        return basic + FE + Transportation ;
    }
    public static double BEComputeSalary() {
        double basic = 1000 ;
        double FE = 0.35 * basic ;
        double Transportation = 0.05 * basic ;
        return basic + FE + Transportation ;
    }
    public static double FEComputeSalary() {
        double basic = 1000 ;
        double FE = 0.25 * basic ;
        double Transportation = 0.05 * basic ;
        return basic + FE + Transportation ;
    }
    public static double HRComputeSalary() {
        double basic = 1000 ;
        double FE = 0.2 * basic ;
        double Transportation = 0.05 * basic ;
        return basic + FE + Transportation ;
    }


}