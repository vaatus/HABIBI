public class WaterTank {
    private float capacity;
    private float current_water_level;

    public void AddWater(float amount)
    {
        if(current_water_level+amount <capacity)
        {
            current_water_level = current_water_level + amount;
        }
        else
        {
            current_water_level = capacity;
        }
    }

    public void RemoveWater(float amount)
    {
        if(current_water_level-amount > 0)
        {
            current_water_level = current_water_level - amount;
        }
        else
        {
            current_water_level = 0;
        }
    }
}
