public abstract class ActiveElement {

    private int id ;
    private WaterTank water_tank;

    public abstract int TransferWater();
    public int getCurrentWaterLevel(){
        System.out.println("getCurrentWaterLevel()");
        return water_tank.getCurrentWaterLevel();
    }
}