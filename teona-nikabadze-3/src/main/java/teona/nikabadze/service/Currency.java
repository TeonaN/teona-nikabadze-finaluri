package teona.nikabadze.service;

import teona.nikabadze.model.CurrencyModel;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@WebService
public class Currency {
    private List<CurrencyModel> currencyModelListList = new ArrayList<CurrencyModel>();

    public List<CurrencyModel> getStatistic(){
        currencyModelListList.add(new CurrencyModel(0.83, "10 United Arab Emirates dirham"));
        currencyModelListList.add(new CurrencyModel(0.0064, "Armenian dram"));

        return currencyModelListList;

    }

    @WebMethod
    public CurrencyModel getCurrency(Double currency) throws Exception {
        for (CurrencyModel i : currencyModelListList) {
            if (i.getCurr().equals(currency)) {
                return i;
            }
        }

        throw new Exception("Error");
    }

    @WebMethod
    public String getCurrencyDescription(Double currency) throws Exception {
        for (CurrencyModel i : currencyModelListList) {
            if (i.getCurr().equals(currency)) {
                return i.getDescription();
            }
        }

        throw new Exception("Error");
    }


    @WebMethod
    public String getDate(){
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        return (formatter.format(date));
    }



}
