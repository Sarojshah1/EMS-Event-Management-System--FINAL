
package Model;

import java.sql.Date;

public class PaymentModel {

    public PaymentModel(String card_number, int cvc, String card_holder_name, Date date) {
        this.card_number = card_number;
        this.cvc = cvc;
        this.card_holder_name = card_holder_name;
        this.date = date;
    }

    public String getCard_number() {
        return card_number;
    }

    public int getCvc() {
        return cvc;
    }

    public String getCard_holder_name() {
        return card_holder_name;
    }

    public Date getDate() {
        return date;
    }
    private String card_number;
    private int cvc;
    private String card_holder_name;
    private Date date;
    
}
