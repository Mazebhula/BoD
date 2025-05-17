package org.denzhe.demo1;

public class User{

    public static boolean login(String usnm, String psswrd){
        //hardcoded login details for testing
        String password = "asecret";
        String username = "denje";
        //todo: implement hashing and dbstorage of users
        return usnm.equals(username) && psswrd.equals(password);
    }
}
