package com.apex.user.service;

public class TestServiceProxy implements com.apex.user.service.TestService {
  private String _endpoint = null;
  private com.apex.user.service.TestService testService = null;
  
  public TestServiceProxy() {
    _initTestServiceProxy();
  }
  
  public TestServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initTestServiceProxy();
  }
  
  private void _initTestServiceProxy() {
    try {
      testService = (new com.apex.user.service.TestServiceServiceLocator()).getTestService();
      if (testService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)testService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)testService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (testService != null)
      ((javax.xml.rpc.Stub)testService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.apex.user.service.TestService getTestService() {
    if (testService == null)
      _initTestServiceProxy();
    return testService;
  }
  
  public int add(int i, int j) throws java.rmi.RemoteException{
    if (testService == null)
      _initTestServiceProxy();
    return testService.add(i, j);
  }
  
  public java.lang.String sayHello() throws java.rmi.RemoteException{
    if (testService == null)
      _initTestServiceProxy();
    return testService.sayHello();
  }
  
  public java.lang.String sayHelloWithName(java.lang.String s) throws java.rmi.RemoteException{
    if (testService == null)
      _initTestServiceProxy();
    return testService.sayHelloWithName(s);
  }
  
  public com.apex.user.service.vo.Employee getEmployee() throws java.rmi.RemoteException{
    if (testService == null)
      _initTestServiceProxy();
    return testService.getEmployee();
  }
  
  public java.util.Calendar getServerDate() throws java.rmi.RemoteException{
    if (testService == null)
      _initTestServiceProxy();
    return testService.getServerDate();
  }
  
  
}