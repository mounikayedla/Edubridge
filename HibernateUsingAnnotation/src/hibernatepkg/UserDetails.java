package hibernatepkg;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity      //to generate table
public class UserDetails {
@Id   // to generate primary key
	private int id;
	private String name;
	public int getId(){
		return id;
	}
	public void setId(int id){
		this.id=id;
	}
public String getName(){
	return name;
	
}
public void setName(String name){
	this.name=name;
}
@Override
public String toString(){
	return "UserDetails[id=" +id+",name="+name+"]";
}
}
