package service;

import java.util.List;

import dao.RequestDao;
import dao.RequestDaoImpl;
import exception.ApplicationException;
import pojo.RequestPojo;

public class RequestServiceImpl implements RequestService {

RequestDao requestDao;
	
	public RequestServiceImpl() {
		this.requestDao = (RequestDao) new RequestDaoImpl();
	}
	public RequestDao getRequestDao() {
		return requestDao;
	}
	
	public void setRequestDao(RequestDao requestDao) {
		this.requestDao = requestDao;
	}
	
	@Override
	public RequestPojo sendRequest(RequestPojo requestPojo) throws ApplicationException{
		RequestPojo returnRequestPojo = this.requestDao.sendRequest(requestPojo);
		return returnRequestPojo;
	}
	@Override
	public RequestPojo updateRequest(RequestPojo requestPojo) throws ApplicationException{
		RequestPojo returnRequestPojo = this.requestDao.updateRequest(requestPojo);
		return returnRequestPojo;
	}
	@Override
	public List<RequestPojo> getAllRequests()throws ApplicationException{
		List<RequestPojo> allRequests = this.requestDao.getAllRequests();
		return allRequests;
	}
	@Override
	public RequestPojo getARequest(int requestId)throws ApplicationException{
		RequestPojo returnRequestPojo = this.requestDao.getARequest(requestId);
		return returnRequestPojo;
	}

}
