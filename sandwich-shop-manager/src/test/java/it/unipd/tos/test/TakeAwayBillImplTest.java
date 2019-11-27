package it.unipd.tos.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;


import it.unipd.tos.business.TakeAwayBillImpl;
import it.unipd.tos.business.exception.TakeAwayBillException;
import it.unipd.tos.model.MenuItem;
import it.unipd.tos.model.MenuItem.ItemType;

public class TakeAwayBillImplTest {
	
	private TakeAwayBillImpl ordine=new TakeAwayBillImpl();
	
	
	@Test
	public void TestSumMenuItem() {
		List<MenuItem> items = new ArrayList<MenuItem>();
		items.add(new MenuItem(ItemType.Panini,"Panino Vegetariano",5.0));
		items.add(new MenuItem(ItemType.Bevande,"Acqua Naturale",1.8));
		items.add(new MenuItem(ItemType.Fritti,"Patate Fritte",3.20));
		double tot=0;
		
		try {
			tot=ordine.getOrderPrice(items);
		} catch (TakeAwayBillException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertEquals(10, tot,0);
	}
	
	@Test
	public void TestSumVoidListOfMenuItem() {
		List<MenuItem> items = new ArrayList<MenuItem>();
		double tot=0;
		
		try {
			tot=ordine.getOrderPrice(items);
		} catch (TakeAwayBillException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertEquals(0, tot,0);
	}


}
