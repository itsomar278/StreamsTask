public class HRSalary implements ICalculateSalary{
    @Override
    public double ComputeSalary() {
        double basic = 1000 ;
        double HR = 0.2 * basic ;
        double Transportation = 0.05 * basic ;
        return basic + HR + Transportation ;
    }
}
