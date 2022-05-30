package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import exception.ApplicationException;
import pojo.RequestPojo;

public class RequestDaoImpl {
	public RequestPojo sendRequest(RequestPojo requestPojo) throws ApplicationException {
		try {
			Connection conn = DBUtil.makeConnection();
			Statement stmt = conn.createStatement();

			String query = "insert into requests(request_userid, request_amount, request_description)" + "values('"
					+ requestPojo.getRequestUserId() + "','" + requestPojo.getRequestAmount() + "','"
					+ requestPojo.getRequestDescription() + "') returning request_id";

			ResultSet rs = stmt.executeQuery(query);
			rs.next();
			requestPojo.setRequestId(rs.getInt(1));

		} catch (SQLException e) {
			throw new ApplicationException(e.getMessage());
		}
		return requestPojo;
	}

	public RequestPojo updateRequest(RequestPojo requestPojo) throws ApplicationException {
		try {
			Connection conn = DBUtil.makeConnection();
			Statement stmt = conn.createStatement();
			String query = "update requests set request_status=" + requestPojo.getRequestStatus() + " where request_id="
					+ requestPojo.getRequestId();

			int rowsAffected = stmt.executeUpdate(query);
		} catch (SQLException e) {
			throw new ApplicationException(e.getMessage());
		}

		return requestPojo;
	}

	public List<RequestPojo> getAllRequests() throws ApplicationException {
		List<RequestPojo> allRequests = new ArrayList<RequestPojo>();

		Statement stmt;
		try {
			Connection conn = DBUtil.makeConnection();
			stmt = conn.createStatement();
			String query = "select * from requests";
			ResultSet rs = stmt.executeQuery(query);

			while (rs.next()) {
				RequestPojo requestPojo = new RequestPojo(rs.getInt(1), rs.getInt(2), rs.getDouble(3), rs.getString(4),
						rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8));

				allRequests.add(requestPojo);

			}
		} catch (SQLException e) {
			throw new ApplicationException(e.getMessage());
		}

		return allRequests;
	}

	public RequestPojo getARequest(int requestId) throws ApplicationException {
		Statement stmt;
		RequestPojo requestPojo = null;
		try {
			Connection conn = DBUtil.makeConnection();
			stmt = conn.createStatement();
			String query = "select * from requests where request_id=" + requestId;
			ResultSet rs = stmt.executeQuery(query);

			if (rs.next()) {
				requestPojo = new RequestPojo(rs.getInt(1), rs.getInt(2), rs.getDouble(3), rs.getString(4),
						rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8));
			}
		} catch (SQLException e) {
			throw new ApplicationException(e.getMessage());
		}

		return requestPojo;
	}
}

