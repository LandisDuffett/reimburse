package pojo;

public class RequestPojo {
	private int requestId;
	private int requestUserId;
	private double requestAmount;
	private String requestDescription;
	private String requestStatus;
	private String requestImageURL;
	private String requestRequestTime;
	private String requestResolvedTime;

	public RequestPojo() {
		super();
	}

	public RequestPojo(int requestId, int requestUserId, double requestAmount, String requestDescription,
			String requestStatus, String requestImageURL, String requestRequestTime, String requestResolvedTime) {
		super();
		this.requestId = requestId;
		this.requestUserId = requestUserId;
		this.requestAmount = requestAmount;
		this.requestDescription = requestDescription;
		this.requestStatus = requestStatus;
		this.requestImageURL = requestImageURL;
		this.requestRequestTime = requestRequestTime;
		this.requestResolvedTime = requestResolvedTime;
	}

	public int getRequestId() {
		return requestId;
	}

	public void setRequestId(int requestId) {
		this.requestId = requestId;
	}

	public int getRequestUserId() {
		return requestUserId;
	}

	public void setRequestUserId(int requestUserId) {
		this.requestUserId = requestUserId;
	}

	public double getRequestAmount() {
		return requestAmount;
	}

	public void setRequestAmount(double requestAmount) {
		this.requestAmount = requestAmount;
	}

	public String getRequestDescription() {
		return requestDescription;
	}

	public void setRequestDescription(String requestDescription) {
		this.requestDescription = requestDescription;
	}

	public String getRequestStatus() {
		return requestStatus;
	}

	public void setRequestStatus(String requestStatus) {
		this.requestStatus = requestStatus;
	}

	public String getRequestImageURL() {
		return requestImageURL;
	}

	public void setRequestImageURL(String requestImageURL) {
		this.requestImageURL = requestImageURL;
	}

	public String getRequestRequestTime() {
		return requestRequestTime;
	}

	public void setRequestRequestTime(String requestRequestTime) {
		this.requestRequestTime = requestRequestTime;
	}

	public String getRequestResolvedTime() {
		return requestResolvedTime;
	}

	public void setRequestResolvedTime(String requestResolvedTime) {
		this.requestResolvedTime = requestResolvedTime;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(requestAmount);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((requestDescription == null) ? 0 : requestDescription.hashCode());
		result = prime * result + requestId;
		result = prime * result + ((requestImageURL == null) ? 0 : requestImageURL.hashCode());
		result = prime * result + ((requestRequestTime == null) ? 0 : requestRequestTime.hashCode());
		result = prime * result + ((requestResolvedTime == null) ? 0 : requestResolvedTime.hashCode());
		result = prime * result + ((requestStatus == null) ? 0 : requestStatus.hashCode());
		result = prime * result + requestUserId;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RequestPojo other = (RequestPojo) obj;
		if (Double.doubleToLongBits(requestAmount) != Double.doubleToLongBits(other.requestAmount))
			return false;
		if (requestDescription == null) {
			if (other.requestDescription != null)
				return false;
		} else if (!requestDescription.equals(other.requestDescription))
			return false;
		if (requestId != other.requestId)
			return false;
		if (requestImageURL == null) {
			if (other.requestImageURL != null)
				return false;
		} else if (!requestImageURL.equals(other.requestImageURL))
			return false;
		if (requestRequestTime == null) {
			if (other.requestRequestTime != null)
				return false;
		} else if (!requestRequestTime.equals(other.requestRequestTime))
			return false;
		if (requestResolvedTime == null) {
			if (other.requestResolvedTime != null)
				return false;
		} else if (!requestResolvedTime.equals(other.requestResolvedTime))
			return false;
		if (requestStatus == null) {
			if (other.requestStatus != null)
				return false;
		} else if (!requestStatus.equals(other.requestStatus))
			return false;
		if (requestUserId != other.requestUserId)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "RequestPojo [requestId=" + requestId + ", requestUserId=" + requestUserId + ", requestAmount="
				+ requestAmount + ", requestDescription=" + requestDescription + ", requestStatus=" + requestStatus
				+ ", requestImageURL=" + requestImageURL + ", requestRequestTime=" + requestRequestTime
				+ ", requestResolvedTime=" + requestResolvedTime + "]";
	}
	
}
