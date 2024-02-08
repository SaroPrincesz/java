package WhatsappProject;

public class Main {
	
//Objects created for using methods
	static Getter get = new Getter();
	Server serve = new Server();
	Chats chat = new Chats();

// Check Phone Number
	public boolean checkPhoneNumber(long tempPhone) {
		long rev = 0;
		int count = 0;
		while (tempPhone != 0) {
			rev = tempPhone % 10;
			tempPhone /= 10;
			count++;
		}
		if (count == 10) {
			return true;
		}
		return false;
	}

//Check Name
	public boolean checkName(String name) {
		for (int i = 0; i < name.length(); i++) {
			if (!Character.isAlphabetic(name.charAt(i)) && name.charAt(i) != ' ') {
				return false;
			}
		}
		return true;
	}

// SignUp
	public User SignUp() {
		// Get user Phone number
		long userPhoneNumber;
		while (true) {
			System.out.print("Enter your Phone Number: ");
			userPhoneNumber = get.getLong();
			// Phone Number verification
			if (!checkPhoneNumber(userPhoneNumber)) {
				System.out.println("Please Enter Correct Phone Number...");
			} else {
				break;
			}
		}

		// Get user Name
		String userName;
		while (true) {
			System.out.print("Enter your name: ");
			userName = get.getString();
			// Name Verification
			if (!checkName(userName)) {
				System.out.println("Enter your Correct name...");
			} else {
				break;
			}
		}

		// Get user Password
		System.out.print("Enter your password: ");
		String userPassword = get.getString();

		// User class OBJECT
		User user = new User(userPhoneNumber, userName, userPassword);

		// Add The object into the server
		System.out.println(serve.AddUserDetails(user));
		System.out.println();
		return user;
	}

//SignIN
	public User SignIn() {
		System.out.print("Enter your Phone Number: ");
		long userPhoneNumber = get.getLong();

		System.out.print("Enter your name: ");
		String userName = get.getString();

		System.out.print("Enter your password: ");
		String userPassword = get.getString();

		User obj = serve.checkUserDetails(userPhoneNumber, userName, userPassword);
		return obj;
	}
	
	public void menu(User object) {
	//Contact Object
		Contact contact = new Contact();
		
		while (true) {
			System.out.println(" 1. Create WhatsApp contact");
			System.out.println(" 2. View WhatsApp Contact");
			System.out.println(" 3. Chat");
			System.out.println(" 4. Exit");
			
			System.out.print("Enter your choice: ");
			int num = get.getInt();
			
			if (num == 1) {
				contact.createWhatsAppContact(object);
			} else if (num == 2) {
				contact.viewWhatsAppContact(object);
			} else if (num == 3) {
				chat.Message(object);
			} else {
				System.out.println("Exit SignIn..!!");
				break;
			}
		}
	}

//main Method
	public static void main(String[] args) {

		Main obj = new Main();
		
		while (true) {
			System.out.println(" 1. SignUp");
			System.out.println(" 2. SignIn");
			System.out.println(" 3. Exit");
			System.out.print("Enter your choice: ");
			int choice = get.getInt();

			if (choice == 1) {
//For SignUp Calling 
				User object = obj.SignUp();
				obj.menu(object);
				
			} else if (choice == 2) {
//For SignIn Calling
				while (true) {
					User object = obj.SignIn();
					if (object != null) {
						System.out.println("SignIn Successfully..!!!");
						obj.menu(object);
						break;
					} else {
						System.out.println("Please check your phoneNumber or Name or Password");
					}
				}
			} else {
				System.out.println("Exit...!!!");
				break;
			}
		}
	}

}
