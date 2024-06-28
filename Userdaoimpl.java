package com.fauxy.dao;

public class Userdaoimpl implements Userdao {

	    public boolean isValidUser(String username, String password) {
	    	 try{
	    		 String query = QueryfDatabase.query();
	    		 Connection connection = DataBase.getConnection();
	    	 
	             PreparedStatement preparedStatement = connection.prepareStatement(query);

	            preparedStatement.setString(1, username);
	            preparedStatement.setString(2, password);

	            ResultSet resultSet = preparedStatement.executeQuery();

	            return resultSet.next();
	        } catch (SQLException e) {
	            e.printStackTrace();
	            return false;
	        }
	    }

		public boolean register(Userr user) {
			try {
				String query = QueryfDatabase.insertquery();
				
				Connection conn = DataBase.getConnection();
				
				PreparedStatement statement = conn.prepareStatement(query);
				statement.setString(1 , user.getUsername());
				statement.setString(2, user.getEmail());
				statement.setString(3, user.getPassword());
				
				int Rows = statement.executeUpdate();
				
				return Rows > 0;
			}catch(SQLException e) {
				e.printStackTrace();
				return false;
			}
		}
	}
