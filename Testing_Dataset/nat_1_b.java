import java.util.*;

public class nat_1_b{
	
	public static int value;
	
	public static void main(String[] args){	
		if (isTerminated()) {
			setValue(1);
	   	}
	}
	public static Boolean isTerminated(){
		return (value==0);
	}
	public static void setValue(int n){
		value = n;
	}
	
}
