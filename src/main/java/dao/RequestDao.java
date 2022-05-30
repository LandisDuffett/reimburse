package dao;

import java.util.List;

import exception.ApplicationException;
import pojo.RequestPojo;

public interface RequestDao {

RequestPojo sendRequest(RequestPojo requestpojo) throws ApplicationException;
	
	RequestPojo updateRequest(RequestPojo requestPojo) throws ApplicationException;
	
	List<RequestPojo> getAllRequests()throws ApplicationException;
	
	RequestPojo getARequest(int requestId)throws ApplicationException;
}
