package apex.advance.java;

public class VariableTestClient implements VariableTest {

	@Override
	public void printString() {
		// TODO Auto-generated method stub
		System.out.println(VariableTest.string);
		//VariableTest.string = "Kashfia";
		System.out.println(VariableTest.string);

	}

	public static void main(String[] args) {
		VariableTestClient variableTestClient = new VariableTestClient();
		variableTestClient.printString();
	}
}