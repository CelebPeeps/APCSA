import java.util.ArrayList;

public class ServiceArea
{
    private ArrayList<Building> allBuildings;   // a list of all buildings

    public ServiceArea()
    {
        allBuildings = new ArrayList();
    }

    public double totalSales()
    {
        double total = 0;
        for(Building val: allBuildings)
        {
            total += val.amountOwed();
        }
        return total;
    }
}
