package StreamsBasicPrograms;

import java.util.Arrays;
import java.util.List;



public class findfirstelement {
	public static void main(String[] args) {
		
	List<Integer>lis=Arrays.asList(1,2,3,4,4,5,9);
	  lis.stream().findFirst().ifPresent(System.out::println);
	
	}

}
