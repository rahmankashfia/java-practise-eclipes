package com.apex.user.service;
import java.rmi.RemoteException;

import com.apex.user.service.TestServiceProxy;
public class UserServiceClient {
	
	public static void main(String[] args) throws RemoteException {
		TestServiceProxy pr = new TestServiceProxy();
		System.out.println(pr.sayHello());
		System.out.println(pr.sayHelloWithName("Kashfia"));
		System.out.println(pr.add(3, 4));
		
	}
}
