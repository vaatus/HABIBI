import java.util.ArrayList;

public class PipeSystem {
    private ArrayList<Pipe> pipes; // I changed the table to  an arraylist
    private ArrayList<ActiveElement> elements;// I changed the table to  an arraylist
    private ArrayList<Pump> pumps;// I changed the table to  an arraylist
    private ArrayList<Cistern> cisterns;
    private Spring spring;
    private float leakage;
    private float water_transferred;


    public float GetLeakage() {
        System.out.println("GetTotalLeakage()");
        return leakage;
    }


    public float GetWaterTransferred() {
        for (Cistern c : cisterns){
            water_transferred +=
        }
        return water_transferred;
    }


    public void TransferWater() {
        System.out.println("TransferWater()");
        //Parcouring the arraylit of pumps to transfer the water through eachpump//
        for (Pump pump : pumps) {
            if (pump.working) {
                pump.TransferWater();
            }
        }
    }
}

/*int transferwater() spring
{

    for (pipes las9in feha)
    {
        leakage +=  pipe.end.transferwater();
    }
    return leakage;
}

int transferwater() pump
{
    if pipe.end= punctured or ma3nduch end return 1;
    check water tank;
    return pipe.end.transferwater
}

int transferwater() cistern
{
    water tank yzid;
    return 0;
}*/
