public class FESalary implements ICalculateSalary{
    @Override
    public double ComputeSalary() {
        double basic = 1000 ;
        double FE = 0.25 * basic ;
        double Transportation = 0.05 * basic ;
        return basic + FE + Transportation ;
    }
}
