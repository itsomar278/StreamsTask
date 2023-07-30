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


        Map<Long, Employee> empMap = employees.stream()
                .collect(Collectors.toMap(employee -> employee.getId(), employee -> employee));

        System.out.println(empMap);
    }
}