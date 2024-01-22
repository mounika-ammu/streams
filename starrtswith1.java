package StreamsBasicPrograms;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class starrtswith1 {
	public static void main(String[] args) {
		List<Integer>lis=Arrays.asList(1,2,3,19,30,20);
		 List<String> collect = lis.stream().map(s->s+"").filter(s->s.startsWith("1")).collect(Collectors.toList());
		 System.out.println(collect);
		
		
	}

}
