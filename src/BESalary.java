public class BESalary implements ICalculateSalary{
    @Override
    public double ComputeSalary() {
        double basic = 1000 ;
        double BE = 0.35 * basic ;
        double Transportation = 0.05 * basic ;
        return basic + BE + Transportation ;
    }
}
