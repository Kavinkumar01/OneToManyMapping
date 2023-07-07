package hibernatefetch;

public class ResponseObject {
	private Object data;

	
	public ResponseObject() {
	}


	public ResponseObject(Object data) {
		super();
		this.data = data;
	}


	public Object getData() {
		return data;
	}


	public void setData(Object data) {
		this.data = data;
	}


	@Override
	public String toString() {
		return "ResponseObject [data=" + data + "]";
	}
	
	
}
