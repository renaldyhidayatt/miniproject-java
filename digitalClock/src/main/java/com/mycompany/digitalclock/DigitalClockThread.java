/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.digitalclock;

import java.util.Date;

/**
 *
 * @author renaldyhidayatt
 */
public class DigitalClockThread  extends Thread {
    DigitalClock dc;
    String time;
    
    public DigitalClockThread(DigitalClock dc){
        this.dc= dc;
        start();
    }
    
    public void run(){
        while(true){
            time = ""+new Date();
            dc.jlabClock.setText(time);
        }
    }
}
