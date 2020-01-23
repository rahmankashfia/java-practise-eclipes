/**
 * TestService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.apex.user.service;

public interface TestService extends java.rmi.Remote {
    public int add(int i, int j) throws java.rmi.RemoteException;
    public java.lang.String sayHello() throws java.rmi.RemoteException;
    public java.lang.String sayHelloWithName(java.lang.String s) throws java.rmi.RemoteException;
    public com.apex.user.service.vo.Employee getEmployee() throws java.rmi.RemoteException;
    public java.util.Calendar getServerDate() throws java.rmi.RemoteException;
}
