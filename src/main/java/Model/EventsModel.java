
package Model;

import java.time.LocalDate;


public class EventsModel {

    public EventsModel(int userid) {
        this.userid=userid;
        
    }
   
    public String getEvent_name() {
        return event_name;
    }

    public void setEvent_name(String event_name) {
        this.event_name = event_name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getVanue() {
        return vanue;
    }

    public void setVanue(String vanue) {
        this.vanue = vanue;
    }

    public int getCapacity() {
        return Capacity;
    }

    public void setCapacity(int Capacity) {
        this.Capacity = Capacity;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }
    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }
    private byte[] image;
    private String event_name;
    private String description;
    private int price;
    private String vanue;
    private int Capacity;
    private LocalDate date;
    private int userid;
    public EventsModel(String Eventname, String description, int price, String vanue, int Capacity, LocalDate date, byte[] image){
        this.event_name=Eventname;
        this.description=description;
        this.price=price;
        this.vanue=vanue;
        this.Capacity=Capacity;
        this.date=date;
        this.image=image;
        
    }
    
    
}
