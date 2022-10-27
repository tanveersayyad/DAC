class operation2{
	double a1;
	
	int multi(int a,int b){
	return a*b;
	 
	}
	double multi(int a,float b,double c){
	return (double)a*b*c;
	
	}
	float multi(float a,float b){
	return (float)a*b;
	 
	}
	
	}
	
class operation1{
	
		public static void main(String args[]){
		operation2 op2=new operation2();
		
		 System.out.println(op2.multi(124,4));
		
	 	 System.out.println(op2.multi(4,2.5f,142.21d));
		 
		 System.out.println(op2.multi(2.5f,7.5f));
		 
		
		}


}
