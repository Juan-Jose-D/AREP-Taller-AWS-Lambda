
package co.edu.escuelaing.lambda;


class User {
    private String username;
    private String password;
    
    public User(){}
    
    public String getUsername(){
        return username;
    }
    
    public void serUsername(String username){
        this.username = username;
    }
    
    public String getPassword(){
        return password;
    }
    
    public void setPassword(String password){
        this.password = password;
    }
}
