package WhatsappProject;

import java.util.Map;

public class Chats {
	int MessageId;
	String Msg;
	String Sender;
	String Receiver;

	Contact contact = new Contact();
	Getter get = new Getter();

//Default Constructor
	public Chats() {
	}

//Constructor
	public Chats(String Msg, String Sender, String Receiver) {
		this.Msg = Msg;
		this.Sender = Sender;
		this.Receiver = Receiver;
	}

// Get Message Id
	static int id = 1;
	public int getMessageId() {
		return ++id;
	}
//Message
	public void Message(User object) {
		while (true) {
			System.out.println(" 1. View Old Chats");
			System.out.println(" 2. Chat");
			System.out.println(" 3. Exit");

			System.out.print("Enter your Choice: ");
			int choice = get.getInt();

			switch (choice) {
			case 1:
				System.out.print("Enter the name: ");
				String str = get.getString();

				Contact contactObject = contact.checkContactName(object, str);
				if (contactObject == null) {
					System.out.println("This name isn't your contact..");
				} else {
					viewOldChats(object, contactObject);
				}
				break;
			case 2:
				chat(object);
				break;
			case 3:
			default:
				System.out.println("Exit Chat..!!");
				break;
			}
		}
	}

//View Old Chats
	public void viewOldChats(User object, Contact contactObject) {
		if(contactObject.chat != null) {
			for (Map.Entry<Integer,Chats> entry : contactObject.chat.entrySet()) {
				if((object.getName()).equals(entry.getValue().Sender)) {
					System.out.println(entry.getValue().Msg);
				}else {
					System.out.println("\t\t" + entry.getValue().Msg);
				}
			}
		}else {
			System.out.println("No msgs...");
		}
		

	}

	public void chat(User object) {
			contact.viewWhatsAppContact(object);
			System.out.print("Enter the Person You message to: ");
			String toMessage = get.getString();
			Contact contactObject = contact.checkContactName(object, toMessage);
			if (contactObject == null) {
				System.out.println("This name isn't your contact..");
			} else {
				boolean flag = true;
				while(flag) {
					System.out.print("Enter the Message to: ");
					String str = get.getString();
					if(str.equals("Mmm")) {
						flag = false;
					}else {
						Chats chats = new Chats(str, object.getName(), contactObject.Name);
						if(contactObject.chat != null) {
							contactObject.chat.put(Integer.valueOf(getMessageId()), chats);							
						}else {
							contactObject.chat.put(Integer.valueOf(1), chats);
						}
					}
				}
			}
	}

}
