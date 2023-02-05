/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author Dell
 */
public class VitalSignHistory {
    
    ArrayList<Observation> vitalSignHistory;
    
    public VitalSignHistory(){
        this.vitalSignHistory = new ArrayList<Observation>();
    }

    public ArrayList<Observation> getVitalSignHistory() {
        return vitalSignHistory;
    }

    public void setVitalSignHistory(ArrayList<Observation> vitalSignHistory) {
        this.vitalSignHistory = vitalSignHistory;
    }
    
    //fetch or find an observation based on ID
    
//    public Observation findObservation(int ID){
//        for(Observation o:this.vitalSignHistory){
//            return 
//        }
//    }
    
    public Observation createObservation(int observationId, double bloodPressure, double temperature){
        Observation observation =  new Observation();
        
        observation.setObservationId(observationId);
        observation.setTemperature(temperature);
        observation.setBloodPressure(bloodPressure);
        
        //add the obersvation object to the arraylist
        this.vitalSignHistory.add(observation);
        
        return observation;  
    }
    
    public Boolean checkObservationIDUnique(int id){
        for(Observation o: this.vitalSignHistory){
            if(o.getObservationId() == id){
                return false;
            }
        }
        
        return true;
    }
}
