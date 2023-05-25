package javaLearn;

public class lets_have_mtr {
	boolean have_mtr;
	String Avail_mtr="Nayanthara";
	String Like_Fig="Seetha";
	
	public void available_fig(){
		if(Avail_mtr.equalsIgnoreCase("Seetha")) {
		System.out.println("seetha");
	}else if(Avail_mtr.equalsIgnoreCase("Anjali")) {
		System.out.println("Anjali");
	}else if(Avail_mtr.equalsIgnoreCase("abitha")) {
		System.out.println("Nayanthara");
	}else {
		System.out.println("No one can available all");
	}
		
	}
	
	public void super_fig() {
		switch (Like_Fig) {
		case "Nayanthara":
			System.out.println("I like Nayanthara");
			
			//break;
         case "Abitha":
        	 System.out.println("I like abitha");
			
			//break;
         case "Anjali":
        	 System.out.println("I like abitha");
 			//break;

		default:
			System.out.println("No one like to");
			break;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		lets_have_mtr mtr=new lets_have_mtr();
		lets_have_mtr avaitm=new lets_have_mtr();
		lets_have_mtr like_gir=new lets_have_mtr();
		avaitm.available_fig();
		like_gir.super_fig();
		
		if(mtr.have_mtr==true) {
			System.out.println("Currently available ");
			
		}else {
			System.out.println("Currently have mtr");
		}

	}

}
