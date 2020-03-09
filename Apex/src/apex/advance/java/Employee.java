package apex.advance.java;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Employee  implements Cloneable{
	int id;
	String name;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	public Employee(int id, String name) {
		// TODO Auto-generated constructor stub
		this.id = id;
		this.name = name;
		
	}
	


	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		
		Employee e1 = new Employee(1, "Kashfia");
		Employee e2 = new Employee(2, "Kashfia");
		Employee e3 = new Employee(1, "Kashfia");
		Employee e4 = e1;
		Employee e5 = (Employee) e1.clone();
		
		
		Set<Employee> eSet = new HashSet<Employee>();
		eSet.add(e1);
		eSet.add(e2);
		eSet.add(e3);
		eSet.add(e4);
		eSet.add(e5);
		
		Iterator<Employee> iterator = eSet.iterator();
		while (iterator.hasNext()){
			System.out.println(iterator.next().toString());
		}
		
	
		

	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}
