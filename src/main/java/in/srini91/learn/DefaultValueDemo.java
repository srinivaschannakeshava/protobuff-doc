package in.srini91.learn;

import in.srini91.learn.protos.test.Person;

public class DefaultValueDemo {

	public static void main(String[] args) {
		Person person = Person.newBuilder().build();
		System.out.println("City : " + person.getAddress().getCity());
		System.out.println(person.getCarCount());
		;
	}
}
