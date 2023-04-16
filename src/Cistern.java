import java.util.ArrayList;

public class Cistern extends ActiveElement{
        private ArrayList<Pipe> ingoing;
        private int  pump_supply ;
        private ArrayList<Pipe> pipes;
        public void RemovePump(){
                pump_supply--;
        };
        public void AddPump(){
                pump_supply++;
        };
        public void AddPipe(){
                Pipe p = new Pipe();
                pipes.add(p);
        };

        @Override
        public int TransferWater() {
                return 0;
        }
}