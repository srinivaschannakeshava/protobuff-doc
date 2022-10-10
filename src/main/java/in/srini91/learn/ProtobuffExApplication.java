package in.srini91.learn;

import in.srini91.learn.protos.Employee;
import in.srini91.learn.protos.Employee.PhoneNumber;

public class ProtobuffExApplication {

	public static void main(String[] args) {
		Employee srini = Employee.newBuilder().setName("Srini").setId(1).setEmail("srini@gmail")
				.addPhones(PhoneNumber.newBuilder().setNumber("7676258289").build())
				.addPhones(PhoneNumber.newBuilder().setNumber("7676258289").build()).build();

		System.out.println(srini);
	}

}
