package org.denzhe.demo1;
import org.mindrot.jbcrypt.BCrypt;
public class User{

    public static boolean login(String usnm, String psswrd){
        //hardcoded login details for testing
        String password = "a";
        String username = "admin";
        //todo: implement hashing and dbstorage of users
        return usnm.equals(username) && psswrd.equals(password);
    }
    public static String hashPassword(String password) {
        // Hash the password with a work factor of 12
        return BCrypt.hashpw(password, BCrypt.gensalt(12));

    }
    public static boolean verifyPassword(String password, String hashedPassword) {
        // Verify the password against the hash
        return BCrypt.checkpw(password, hashedPassword);
    }
}
