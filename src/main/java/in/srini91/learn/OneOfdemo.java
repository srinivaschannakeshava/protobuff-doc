package in.srini91.learn;

import in.srini91.learn.protos.test.Credentials;
import in.srini91.learn.protos.test.EmailCredential;
import in.srini91.learn.protos.test.PhoneCredential;

public class OneOfdemo {

	public static void main(String[] args) {
		EmailCredential emailCred = EmailCredential.newBuilder().setEmail("test").setPwd("test").build();
		PhoneCredential phoneCred = PhoneCredential.newBuilder().setPhoneNo(89717539).setOtp(1234).build();

		Credentials cred = Credentials.newBuilder().setEmailMode(emailCred).setPhoneMode(phoneCred).build();
		Login(cred);
	}

	private static void Login(Credentials cred) {
		switch (cred.getModeCase()) {
		case EMAILMODE:
			System.out.println(cred.getEmailMode());
			break;
		case PHONEMODE:
			System.out.println(cred.getPhoneMode());
			break;

		}

	}
}
