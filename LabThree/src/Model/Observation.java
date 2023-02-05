/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Dell
 */
public class Observation {
    int observationId;
    private double bloodPressure;
    private double temperature;
    
    private Medicine Medication;
    
    public Observation(){
       this.Medication=new Medicine(); 
    }

    public int getObservationId() {
        return observationId;
    }

    public void setObservationId(int obervationId) {
        this.observationId = obervationId;
    }

    public double getBloodPressure() {
        return bloodPressure;
    }

    public void setBloodPressure(double bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public Medicine getMedication() {
        return Medication;
    }

    public void setMedication(Medicine Medication) {
        this.Medication = Medication;
    }
    
    
    @Override
    public String toString(){
        return String.valueOf(this.observationId);
    }
}
