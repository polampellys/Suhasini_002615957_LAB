/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Dell
 */
public class Address {
    String PStName, PAptNo, PCity, PZipcode,CStName, CAptNo, CCity, CZipcode;
    
    //FOR PERMANENT ADDRESS
    public String getPStName(){
         return PStName;
    }
    
    public void setPStName(String PStName){
           this.PStName= PStName;
    }
    
    public String getPAptNo(){
         return PAptNo;
    }
    
    public void setPAptNo(String PAptNo){
           this.PAptNo= PAptNo;
    }
    
    public String getPCity(){
         return PCity;
    }
    
    public void setPCity(String PCity){
           this.PCity= PCity;
    }
    
    public String getPZipcode(){
         return PZipcode;
    }
    
    public void setPZipcode(String PZipcode){
           this.PZipcode= PZipcode;
    }
    
    //Current Address
    
    //FOR PERMANENT ADDRESS
    public String getCStName(){
         return CStName;
    }
    
    public void setCStName(String CStName){
           this.CStName= CStName;
    }
    
    public String getCAptNo(){
         return CAptNo;
    }
    
    public void setCAptNo(String CAptNo){
           this.CAptNo= CAptNo;
    }
    
    public String getCCity(){
         return CCity;
    }
    
    public void setCCity(String CCity){
           this.CCity= CCity;
    }
    
    public String getCZipcode(){
         return CZipcode;
    }
    
    public void setCZipcode(String CZipcode){
           this.CZipcode= CZipcode;
    }
}