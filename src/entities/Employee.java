package entities;

/*Se eu quiser que meu Exployee seja ordenável pelo método sort(), eu vou ter que 
 * implementar a interface Comparable, no caso aqui vai ser o Comparable<Employee>*/

public class Employee implements Comparable<Employee> {

	private String name;
	private Double salary;

	public Employee(String name, Double salary) {
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	/*O método (compareTo) serve para comparar um objeto com outro*/
	
	@Override
	public int compareTo(Employee other) {
		return -salary.compareTo(other.getSalary());
	}

}
