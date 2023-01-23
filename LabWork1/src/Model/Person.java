/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Dell
 */
public class Person {
    String fName, lName, cName, Nuid;
    Contact contact;
    Address address;
    
    public Person (){
        this.fName = "";
        this.lName="";
        this.cName= "";
        this.Nuid= "";
        this.contact=new Contact();
        this.address = new Address();
    }
    public String getFName() {
        return fName;
    }
    
    public String getLName() {
        return lName;
    }
    
    public String getCName() {
        return cName;
    }
    
    public String getNuid() {
        return Nuid;
    }

    public Contact getCont(){
        return contact;
    }
    
    public Address getAddr() {
        return address;
    }

    public void setFName(String fName) {
        this.fName = fName;
    }
    
    public void setLName(String lName) {
        this.lName = lName;
    }
    
    public void setCName(String cName) {
        this.cName = cName;
    }
    
    public void setNuid(String Nuid) {
        this.Nuid = Nuid;
    }

    public void setCont(Contact contact) {
        this.contact = contact;
    }
    
    public void setAddr(Address address) {
        this.address = address;
    }

    


    

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        Person obj = new Person();
            obj.setFName("Suhasini");
            obj.setLName("Polampelly");
            obj.setCName("Northeastern");
            obj.setNuid("002615957");
            Contact cont = obj.getCont();
            cont.setPhone1("6174567799");
            cont.setEmail1("suhasini@gmail.com");
            cont.setWPhone("6174556795");
            cont.setWEmail("suhasiniP@gmail.com");
            Address addr = obj.getAddr();
            addr.setPStName("Huntington");
            addr.setPAptNo("1709");
            addr.setPCity("Boston");
            addr.setPZipcode("12023");
            addr.setCStName("Houston");
            addr.setCAptNo("1987");
            addr.setCCity("Houston");
            addr.setCZipcode("47989");
    }
} 
