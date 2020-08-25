
public class Student {
     private int roll;
     private String name;
     
     public Student() {
		// TODO Auto-generated constructor stub
    	 super();
    	 roll =0;
    	 name = null;
	}
     
     public Student(int roll,String name){
    	 super();
    	 this.roll = roll;
    	 this.name = name;
     }

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
     
     @Override
    public String toString() {
    	// TODO Auto-generated method stub
    	return super.toString()+" Roll: "+roll+" Name: "+name;
    }
     
     public boolean equals(Student obj) {
    	// TODO Auto-generated method stub
    	 return (this.getRoll()==obj.getRoll() &&
 				(this.getName().equals(obj.getName())));
    }
}
