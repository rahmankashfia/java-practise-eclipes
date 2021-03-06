import java.util.NoSuchElementException;
import java.util.Optional;

import org.junit.Test;

public class UserOptionalDemo {
	
	@Test(expected=NoSuchElementException.class)
	public void optionalNull(){
		Optional<User> emp = Optional.empty();
		emp.get();
	}
	
	@Test(expected=NullPointerException.class)
	public void optionalStrNull(){
		String ans2 = null;
		Optional<String> emp1 = Optional.of(ans2);
		emp1.get();
	}
	
	@Test
	public void optionalNullable(){
		User user = null;
		System.out.println(Optional.ofNullable(user));
	}

}
