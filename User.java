
public class User {
	
    private String name;
    private String PW;
    
    public User (String nombre, String PW){
        this.name = nombre;
        this.PW = PW;
    }
    
    public String getName(){
        return this.name;
    }
    
    public String getPW(){
        return this.PW;
    }
    
   
}
