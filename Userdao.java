package com.fauxy.dao;

public interface Userdao {

	boolean isValidUser(String username, String password);

	boolean register(Userr user);
}
