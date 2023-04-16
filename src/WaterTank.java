public class WaterTank {
    private int capacity;
    private int current_water_level;

    public void AddWater(int amount)
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

    public void RemoveWater(int amount)
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

    public int getCurrentWaterLevel(){ return current_water_level; }
}
