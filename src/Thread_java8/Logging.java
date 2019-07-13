package Thread_java8;

public interface Logging {
	String Oracle="Oracle Database";
	String MySQL="MySQL Database";
	void logInfo(String message);
	void logWarn(String messsage);
	void logError(String message);
	void logFatal(String message);
	void getConnection();
	void closeConnection();

}
