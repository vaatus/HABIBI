package src;

import src.Cistern;
import src.Pump;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Random;

public class PipeSystem {
    private ArrayList<Pump> pumps;// I changed the table to  an arraylist
    private ArrayList <Cistern> cisterns;
    private Spring spring;
    private float leakage;
    private float water_transferred;

    //PipeSystem class constructor
    public PipeSystem() {
        pumps = new ArrayList<>();
        Pipe p1=new Pipe();
        Pipe p2=new Pipe();
        Pump pump=new Pump(p1,p2);
        pumps.add(pump);
        cisterns = new ArrayList<>();
        cisterns.add(new Cistern());
        spring = new Spring();
        p1.SetIncoming(spring);
        p2.SetOutgoing(cisterns.get(0));
        p1.SetOutgoing(pump);
        p2.SetIncoming(pump);
        pump.SetPumpDirection(p1,p2);
    }


    public float GetLeakage() {
        System.out.println("GetTotalLeakage()");
        return leakage;
    }


    public float GetWaterTransferred() {
        System.out.println("GetWaterTransferred()");
        for (Cistern c : cisterns){
            water_transferred += c.getCurrentWaterLevel();
        }
        return water_transferred;
    }


    public void TransferWater() {
        System.out.println("TransferWater()");
        //Parcouring the arraylit of pumps to transfer the water through eachpump//
        leakage += spring.TransferWater();
    }

    public void Break(int randomNumber) {
        pumps.get(randomNumber % pumps.size()).GoOutOfOrder();
    }

    public void AddPipe(){
        Random random = new Random();
        int randomNumber = random.nextInt(4);
        cisterns.get(randomNumber % cisterns.size()).AddPipe();
    }
}

