package package1;

public class ParentSuper {
	ParentSuper(){
		
		System.out.println("2 - From ParentSuper Constructor - Without Parameter");
	}
	
	ParentSuper(String k){
		this();
		System.out.println("1 - From ParentSuper Constructor - With Parameter" + k);
	}
	
}
