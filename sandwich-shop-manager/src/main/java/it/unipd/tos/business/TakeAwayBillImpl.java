package it.unipd.tos.business;

import java.util.List;

import it.unipd.tos.business.exception.TakeAwayBillException;
import it.unipd.tos.model.MenuItem;

public class TakeAwayBillImpl implements TakeAwayBill{

	public double getOrderPrice(List<MenuItem> itemsOrdered) throws TakeAwayBillException {
		double totale=0;
		int size=itemsOrdered.size();
		
		for(int i=0;i<size;i++) {
			totale+=itemsOrdered.get(i).getPrice();
		}
		return totale;
	}

}
