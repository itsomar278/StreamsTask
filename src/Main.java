import java.util.ArrayList;
import java.util.List;
import java.util.Map;
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


        Stream<Employee> stream = employees.stream();
        stream.forEach(employee -> PrintSalary(employee));
    }

    public static void PrintSalary(Employee employee)
    {
        switch (employee.getPosition().toString())
        {
            case "QA":
                System.out.println("1000");
                break;
            case "BE":
                System.out.println("1500");
                break;
            case "FE":
                System.out.println("1300");
                break;
            case "HR":
                System.out.println("1200");
                break;
            default:
                System.out.println("0");

        }
    }
    {

    }
}