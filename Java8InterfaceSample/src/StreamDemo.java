import java.util.*;

public class StreamDemo {
	public static void main(String[] args) {
		List<String> ls = new ArrayList<String>();
		ls.add("AAA");
		ls.add("AA");
		ls.add("A");
		ls.add("BB");
		ls.add("CCC");
		
		ls.stream().filter(s->s.startsWith("A")).forEach(System.out::println);
		ls.stream().sorted().map(String::toLowerCase).forEach(System.out::println);
		
		//List<String> lscollect = ls.stream().sorted().map(String::toUpperCase)
		
	}
}
