package StreamsBasicPrograms;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class duplicateElements {
	public static void main(String[] args) {
		List<Integer>lis=Arrays.asList(1,2,3,4,4,55,55);
		Set<Integer>s=new HashSet<Integer>();
		List<Integer> co = lis.stream().filter(n->!s.add(n)).collect(Collectors.toList());
		System.out.println(co);
		//System.out.println(lis);
	}

}
