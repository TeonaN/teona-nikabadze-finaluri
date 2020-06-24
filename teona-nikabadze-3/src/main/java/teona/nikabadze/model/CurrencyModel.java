package teona.nikabadze.model;


public class CurrencyModel {
    Double curr;
    String Description;

    public CurrencyModel(){

    }

    public CurrencyModel(Double curr, String description) {
        this.curr = curr;
        Description = description;
    }

    public Double getCurr() {
        return curr;
    }

    public void setCurr(Double curr) {
        this.curr = curr;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }


    @Override
    public String toString() {
        return "CurrencyModel{" +
                "curr=" + curr +
                ", Description='" + Description + '\'' +
                '}';
    }
}
