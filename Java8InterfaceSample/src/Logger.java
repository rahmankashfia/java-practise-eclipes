
public class Logger {
	private StringBuilder  contents = new StringBuilder();
	
	public void log(String message){
		contents.append(System.currentTimeMillis());
		contents.append(":");
		contents.append(Thread.currentThread().getName());
		contents.append(message);
		contents.append("\n");
	}
	
	public String getContents() {
		return contents.toString();
	}
	
	public static void main(String[] args) {
		Logger logger = new Logger();
		if (true & true) {
			System.out.println("l");
		}
		
	}

}
