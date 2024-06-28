public class DataBase {
	private static String url = "jdbc:mysql://localhost:3306/website";
	private static String name = "name";
	private static String password = "password";
	
//	static {
//		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
//	}
	
	public static Connection getConnection() throws SQLException
    {
		return DriverManager.getConnection(url,name,password);
	}
}
