
package Model;

public class AdminDashboardModel {

    public AdminDashboardModel(String month1, int event) {
        this.month=month1;
        this.Event=event;
    }
    String month;

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    int Event;

    public int getEvent() {
        return Event;
    }

    public void setEvent(int Event) {
        this.Event = Event;
    }
    
    
    
}
