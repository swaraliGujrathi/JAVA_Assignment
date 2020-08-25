
public class BscStudent extends Student {
	private String stream;
    private String col_name;
    
    public BscStudent() {
		// TODO Auto-generated constructor stub
	}
    
   public BscStudent(int roll,String name,String stream,String col_name){
 	  super(roll,name);
 	  this.stream = stream;
 	  this.col_name = col_name;
   }

	public String getStream() {
		return stream;
	}

	public void setStream(String stream) {
		this.stream = stream;
	}

	public String getCol_name() {
		return col_name;
	}

	public void setCol_name(String col_name) {
		this.col_name = col_name;
	}
   
   @Override
 public String toString() {
 	// TODO Auto-generated method stub
 	return super.toString()+" Stream: "+stream+" College_Name: "+col_name;
 }
   @Override
 public boolean equals(Object obj) {
 	// TODO Auto-generated method stub
 	return (this.getStream().equals(((BscStudent) obj).getStream())) && 
 			(this.getCol_name().equals(((BscStudent) obj).getCol_name())) &&
 			super.equals(obj);
 }
}
