/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.tut.thread;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JLabel;

/**
 *
 * @author DELL
 */
public class TimeUpdater implements Runnable{

    private JLabel timeLbl;
    private SimpleDateFormat simpleDFt;
    
    public TimeUpdater(JLabel timeLbl,SimpleDateFormat simpleDtf){
    this.timeLbl =timeLbl;
    this.simpleDFt =simpleDtf;
    }
    
     
    
    
    
    
    @Override
    public void run() {
     
        try{
           
           while(true){
           String currentTime =simpleDFt.format(new Date());
           timeLbl.setText(currentTime);
        
           Thread.sleep(1000);
         
           }
        } catch(InterruptedException ie){
        ie.printStackTrace();
        }
        
    }
    
}
