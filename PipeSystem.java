import java.util.ArrayList;

public class PipeSystem {
    private ArrayList<Pipe> pipes; // I changed the table to  an arraylist
    private ArrayList<ActiveElement> elements;// I changed the table to  an arraylist
    private ArrayList<Pump> pumps;// I changed the table to  an arraylist
    private float leakage;
    private float water_transferred;


    public float GetTotalLeakage() {
        System.out.println("GetTotalLeakage()");
        float totalleakage = 0;
        //PArcouring the arraylit of pipes to get the leakage of each pipe //
        for (Pipe pipe : pipes) {
            totalleakage += pipe.getLeakage();
        }
        leakage = total_leakage;
        return leakage;
    }


    public float GetWaterTransferred() {
        System.out.println("GetWaterTransferred()");
        float totaltransferredwater = 0;
        //Parcouring the arraylit of pipes to get the transfered water  of each pipe //
        for (Pipe pipe : pipes) {
            totaltransferredwater += pipe.getWaterTransferred();
        }
        water_transferred = totaltransferredwater;
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

