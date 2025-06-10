package iPoutputs;

public class Author {
	private String name;
	private String email;
	
	Author(String name, String email){
		this.name = name;
		this.email = email;
	}
	
	public String getName() 
	{
		return name;
	}
	
	public void setName()
	{
		this.name = name;
	}
	
	public String getEmail()
	{
		return email;
	}
	
	public void setEmail()
	{
		this.email = email;
	}
	
	public String toString() 
	{
		return ("name=" + getName() + ", email=" + getEmail());
	}
}

