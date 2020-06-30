package tp.data;

/* Utilisateur */
public class User {
	private String username;
	private boolean connecte;
	//...
	
	public User(String username, boolean connecte) {
		super();
		this.username = username;
		this.connecte = connecte;
	}
	
	
	public User() {
		super();
	}


	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	public boolean isConnecte() {
		return connecte;
	}
	public void setConnecte(boolean connecte) {
		this.connecte = connecte;
	}
	
	
}
