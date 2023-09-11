package katarem.genshin.backend;

public class ReturnException {
	private String name, message;
	private int errorCode;
	public ReturnException(Exception e, int errorCode) {
		this.name = e.getClass().toString();
		this.message = e.getMessage();
		this.errorCode = errorCode;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public int getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}
	
	
	
	
}

