public class QASalary implements ICalculateSalary{
    @Override
    public double ComputeSalary() {
        double basic = 1000 ;
        double QA = 0.1 * basic ;
        double Transportation = 0.05 * basic ;
        return basic + QA + Transportation ;
    }
}
