////////////////////////////////////////////////////////////////////
// [Marco] [Nardelotto] [1189563]
////////////////////////////////////////////////////////////////////
package it.unipd.tos.business;

import java.util.List;

import it.unipd.tos.business.exception.TakeAwayBillException;
import it.unipd.tos.model.MenuItem;

public class TakeAwayBillImpl implements TakeAwayBill{

    public double getOrderPrice(List<MenuItem> itemsOrdered) throws TakeAwayBillException {
        double totale=0;
        int size=itemsOrdered.size();
        int nPanini=0,totPaniniFritti=0;
        double minPanino=Integer.MAX_VALUE;
        
        if(size==0)return 0;
        if(size>30)throw new TakeAwayBillException();
        
        for(int i=0;i<size;i++) {
            
            totale+=itemsOrdered.get(i).getPrice();
            switch(itemsOrdered.get(i).getType()) {
            case Panini:
                nPanini++;
                if(itemsOrdered.get(i).getPrice()<minPanino)
                    minPanino=itemsOrdered.get(i).getPrice();
                totPaniniFritti+=itemsOrdered.get(i).getPrice();
                break;
            case Fritti:
                totPaniniFritti+=itemsOrdered.get(i).getPrice();
                break;
            default:
                break;
            }   
        }
        
        if(nPanini>5)totale-=minPanino*0.5;
        if(totPaniniFritti>50)totale-=totale*0.1;
        if(totale<10)totale+=0.5;
        
        return totale;
        
    }

}
