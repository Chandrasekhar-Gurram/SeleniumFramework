package Input;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.annotations.Test;

public class StreamsInJava {
	@Test
	public static void main(String[] args)
	{
	ArrayList<String> names= new ArrayList<String>();
	names.add("Chandu");
	names.add("Sekhar");
	names.add("Gurram");
	names.add("Chandra");
	names.add("Chandrasekhar");
	List<String> elements=Arrays.asList("Robert","Thor","Pull","Cover","Heli");
	//names.stream().filter(s->s.startsWith("c")).limit(4).forEach(s->System.out.println(s));
	//names.stream().filter(y->y.endsWith("r")).forEach(s->System.out.println(s));
	//Stream<String> streams=Stream.concat(names.stream(), elements.stream());
	//streams.sorted().forEach(a->System.out.println(a));
	List<Integer> elements1=Arrays.asList(18,45,25,01,10,07,17,333);
	List<Integer> elements2=Arrays.asList(03,21,33,22,55,64,75,79);
	Stream<Integer> streams1=Stream.concat(elements1.stream(), elements2.stream());
    List<Integer> ele=streams1.sorted().collect(Collectors.toList());
    ele.stream().forEach(s->System.out.println(s));
	//streams1.sorted().forEach(i->System.out.println(i));
	//boolean p=streams1.anyMatch(a->a.equals(85));
	//System.out.println(p);
	}
	
	
}
