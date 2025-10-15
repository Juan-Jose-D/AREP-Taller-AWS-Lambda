
package co.edu.escuelaing.lambda;

/**
 *
 * @author juan.cancelado-s
 */
public class SecurityUtils {
    public static User login(User u){
        System.out.println("Username: " + u.getUsername());
        System.out.println("password: " + u.getPassword());
        u.setPassword("");
        return u;
    }
    
}
