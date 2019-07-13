package Thread_java8;

final class LogOracle implements Logging {

	@Override
	public void logInfo(String message) {
		getConnection();
		System.out.println("Log message"+"INFO");
		closeConnection();
		}

	@Override
	public void logWarn(String messsage) {
		getConnection();
		System.out.println("Log message"+" WARN");
		closeConnection();
	}

	@Override
	public void logError(String message) {
		getConnection();
	      System.out.println("Log Message : " + " ERROR");
	      closeConnection();
		
	}

	@Override
	public void logFatal(String message) {
		getConnection();
	      System.out.println("Log Message : " + " FATAL");
	      closeConnection();
		
	}

	@Override
	public void getConnection() {
		 System.out.println("Open Database connection");
		
	}

	@Override
	public void closeConnection() {
		System.out.println("Close Database connection");
		
	}

}
