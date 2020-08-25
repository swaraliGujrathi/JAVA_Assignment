
public class TestStudent {
    public static boolean search(Student students[], Student s1){
    	for(Student s: students){
    		if(s.getClass()==s1.getClass()){
    			if(s.equals(s1)){
    				return true;
    			}
    		}
    	}
    	return false;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Student[] students = new Student[7];
       students[0] = new EnggStudent(01,"Swarali","Computer","AISSMS");
       students[1] = new EnggStudent(02,"Anushka","Civil","COEP");
       students[2] = new EnggStudent(03,"Pranali","Mechanical","SPPU");
       students[3] = new BscStudent(04,"Piyush","Zoo","UGA");
       students[4] = new BscStudent(05,"Aditi","Micro","VIT");
       students[5] = new CommerceStudent(06,"Prakrut","Accounts","VIIT");
       students[6] = new CommerceStudent(07,"Rahul","Economics","MIT");
       
       CommerceStudent c = new CommerceStudent(06,"Prakrut","Accounts","VIIT");
       if(search(students,c)){
    	   System.out.println("Commerce Student Found!!");
       }
       else{
    	   System.out.println("Not Found!!");
       }
       
       EnggStudent e = new EnggStudent(04,"Piyush","Zoo","UGA");
       if(search(students,e)){
    	   System.out.println("Engineering Student Found!!");
       }
       else{
    	   System.out.println("Engineering Student not Found!!");
       }
	}

}
