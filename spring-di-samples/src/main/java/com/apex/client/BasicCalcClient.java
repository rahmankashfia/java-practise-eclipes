package com.apex.client;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.apex.server.Calc;

@SuppressWarnings({ "deprecation", "unused" })
public class BasicCalcClient {
	Calc calc = null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BasicCalcClient client = (BasicCalcClient) getBeanFactory().getBean("client");
		client.invokeOperation();

	}

	/**
	 * 
	 */
	public void invokeOperation() {
		//Calc calc = new BasicCalc();
		int var1 = calc.add(4, 2);
		int var2 = calc.add(2, 2);
		int var3 = calc.add(7, 2);
		int var4 = calc.add(9, 2);
		System.out.println("sum " + var1);
		System.out.println("dif " + var2);
		System.out.println("mul " + var3);
		System.out.println("div " + var4);
	}

	/**
	 * @return the calc
	 */
	public Calc getCalc() {
		return calc;
	}

	/**
	 * @param calc the calc to set
	 */
	public void setCalc(Calc calc) {
		this.calc = calc;
	}
	
	public static BeanFactory getBeanFactory() {
		Resource resource = new FileSystemResource("beans.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		return factory;
	}

}
