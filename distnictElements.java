package StreamsBasicPrograms;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class distnictElements {
	public static void main(String[] args) {
		List<Integer>lis=Arrays.asList(1,2,3,4,5,7,8,8,9,10,10);
		List<Integer> collect = lis.stream().distinct().collect(Collectors.toList());
		System.out.println(collect);
		
		
	}

}
