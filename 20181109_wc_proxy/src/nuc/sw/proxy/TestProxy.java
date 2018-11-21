package nuc.sw.proxy;

import java.lang.reflect.InvocationTargetException;

public class TestProxy {
	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException, InvocationTargetException {
		// TODO Auto-generated method stub
		ShopOnline shop = new ShopOnline();
//		shop.saleBook();
		shop.invoke();
	}
}
