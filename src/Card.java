import java.util.Date;

public class Card {
    String Id ;
    String FingerPrint ;
    Date ExpiryDate ;

    public Card(String id, String fingerPrint, Date expiryDate) {
        Id = id;
        FingerPrint = fingerPrint;
        ExpiryDate = expiryDate;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getFingerPrint() {
        return FingerPrint;
    }

    public void setFingerPrint(String fingerPrint) {
        FingerPrint = fingerPrint;
    }

    public Date getExpiryDate() {
        return ExpiryDate;
    }

    public void setExpiryDate(Date expiryDate) {
        ExpiryDate = expiryDate;
    }


}
