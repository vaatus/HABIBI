public abstract class ActiveElement {

    protected int id ;
    protected WaterTank water_tank;

    public abstract int TransferWater();
    public int getCurrentWaterLevel(){
        System.out.println("getCurrentWaterLevel()");
        return water_tank.getCurrentWaterLevel();
    }
}