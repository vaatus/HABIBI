package src;

public abstract class ActiveElement {

    protected int id ;
    protected WaterTank water_tank;

    public ActiveElement() {
        water_tank=new WaterTank();
    }

    public abstract int TransferWater();
    public int getCurrentWaterLevel(){
        System.out.println("getCurrentWaterLevel()");
        return water_tank.getCurrentWaterLevel();
    }
}