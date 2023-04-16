import java.util.ArrayList;

public abstract class ActiveElement {

    private int id ;// the id is for  the pump I did not use it yet  //
    private WaterTank water_tank ;
    private  Pipe outgoing_pipe ;
    private Pipe ingoing_pipe ;

    public void TransferWater(){
        System.out.println("TransferWater()");
        if(ingoing_pipe.working==true && ingoing_pipe.capacity>0 && water_tank.current_water_level<water_tank.capacity){

            water_tank.current_water_level ++;
            ingoing_pipe.capacity--;
        }


        if(outgoing_pipe.has_capacity && water_tank.current_water_level > 0){

            water_tank.current_water_level --;
            outgoing_pipe.capacity++;
        }

    }

}
