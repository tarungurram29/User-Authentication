package com.fauxy.dao;

import org.apache.catalina.User;

public interface Userdao {

	boolean isValidUser(String username, String password);

	boolean register(Userr user);
}
