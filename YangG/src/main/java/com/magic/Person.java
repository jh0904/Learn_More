package com.magic;

/**
 * com.magic
 *
 * @author jh
 * @date 2018/9/6 8:33
 * description:
 */
public class Person {
	private Integer id;
	private String name;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Person() {
	}

	public Person(String name) {
		this.name = name;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass () != o.getClass ()) return false;

		Person person = (Person) o;

		if (id != null ? !id.equals (person.id) : person.id != null) return false;
		return name != null ? name.equals (person.name) : person.name == null;
	}

	@Override
	public int hashCode() {
		int result = id != null ? id.hashCode () : 0;
		result = 31 * result + (name != null ? name.hashCode () : 0);
		return result;
	}

	@Override
	public String toString() {
		return "Person{" +
				"id=" + id +
				", name='" + name + '\'' +
				'}';
	}
}
