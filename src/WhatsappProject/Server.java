package WhatsappProject;

import java.util.ArrayList;
import java.util.List;

public class Server {

//WhatsApp Users List
	static List<User> userDetails = new ArrayList<User>();

//To use The Scanner instead
	Getter get = new Getter();

	
	
	public User isCheckPhoneNumber(long phoneNo) {
		for (int i = 0; i < userDetails.size(); i++) {
			if (userDetails.get(i).getPhoneNumber() == phoneNo) {
				return userDetails.get(i);
			}
		}
		return null;
	}
//Check the phone Number
	public boolean isExistPhoneNumber(long phoneNo) {
		for (int i = 0; i < userDetails.size(); i++) {
			if (userDetails.get(i).getPhoneNumber() == phoneNo) {
				return true;
			}
		}
		return false;
	}

//Add user details to our whatsapp list (To check the phone number is Already exist or not)
	public String AddUserDetails(User object) {
		if (!isExistPhoneNumber(object.getPhoneNumber())) {
			userDetails.add(object);
			
			System.out.print("Did you see your Information:  y/n");
			if (get.getCharacter() == 'y') {
				return showUserDetails(object);
			} else {
				return "Sign Up Successfully!!!";
			}
		} else {
			return "Already Existed PhoneNumber...!!";
		}
	}

//To View User Details  (If SignUp details are correct?)
	private String showUserDetails(User obj) {
		return "User Phone Number: " + obj.getPhoneNumber() + "\n" + "User Name: " + obj.getName() + "\n"
				+ "User Password: " + obj.getPassword();
	}

//For SignIn
	public User checkUserDetails(long phoneNumber, String userName, String password) {
		for (int i = 0; i < userDetails.size(); i++) {
			if (phoneNumber == userDetails.get(i).getPhoneNumber()) {
				if (userName.equals(userDetails.get(i).getName())
						&& password.equals(userDetails.get(i).getPassword())) {
					return userDetails.get(i);
				}
			}
		}
		return null;
	}

}
