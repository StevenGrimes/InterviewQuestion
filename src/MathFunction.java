
class MathFunction {

	    public static String  mathFunction( int num1,int num2, int num3)
	    {

	    if(num1 + num2 == num3){

	        if(num1 + num2 == num3){
	            return "+";
	        }

	        return "+";
	    }
	    if(num1*num2 == num3) {
	        return  "*";
	    }

	    if(num1-num2 == num3) {
	            return  "-";
	        }
	    if(num1/num2 == num3) {
	            return  "/";
	        }

	    return  "None";

	    }


	    public static void main(String[] args) {

	        String E1,E2,E3,E4,E5,E6;
	        E1 =  mathFunction(4,5,9);
	        E2 =  mathFunction(7,3,4);
	        E3 =  mathFunction(4,4,16);
	        E4 =  mathFunction(16,8,2);
	        E5 =  mathFunction(3,-3,0);
	        E6 =  mathFunction(7,5,4);

	      System.out.println( E1 );
	      System.out.println( E2 );
	      System.out.println( E3 );
	      System.out.println( E4 );
	      System.out.println( E5 );
	      System.out.println( E6 );

	    }
	}
