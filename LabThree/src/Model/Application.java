/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Dell
 */
public class Application {
    VitalSignHistory history;
    MedicineCatalog catalog;
    
    public Application(){
    this.history=new VitalSignHistory();
    this.catalog=new MedicineCatalog();
}

    public VitalSignHistory getHistory() {
        return history;
    }

    public void setHistory(VitalSignHistory history) {
        this.history = history;
    }

    public MedicineCatalog getCatalog() {
        return catalog;
    }

    public void setCatalog(MedicineCatalog catalog) {
        this.catalog = catalog;
    }
    
}

