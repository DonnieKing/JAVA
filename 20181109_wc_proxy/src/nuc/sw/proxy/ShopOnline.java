package nuc.sw.proxy;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ShopOnline implements ISaleBook {
	
	private Publisher publisher = new Publisher();
	public void preSaleBook(){
		System.out.println("卖书前宣传！");
	}
	public void postSaleBook(){
		System.out.println("卖书后售后！");
	}
	
	@Override
	public void saleBook() throws IllegalArgumentException, IllegalAccessException, InvocationTargetException {
		// TODO Auto-generated method stub
		/*this.preSaleBook();
		publisher.saleBook();
		this.postSaleBook();*/
		this.invoke();
	}
	
	public void invoke() throws IllegalArgumentException, IllegalAccessException, InvocationTargetException{
		//Method[] methods = Publisher.class.getDeclaredMethods();
		Method[] methods = publisher.getClass().getMethods();
		for (Method m : methods){
			if("saleBook".equals(m.getName())){
				this.preSaleBook();
				m.invoke(publisher);
				this.postSaleBook();
			}else{
				m.invoke(publisher);
			}
		}
	}

}
