package WhatsappProject;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Contact {

//Variables
	String Name;
	long PhoneNumber;
	User Obj;
	Map<Integer, Chats> chat;
	List<List<Long>> GroupPairContact = new ArrayList<List<Long>>();

//Create an Object For Used methods
	Getter get = new Getter();
	Server serve = new Server();

//Default Constructor
	public Contact() {
	}

//Constructor
	public Contact(String Name, long PhoneNumber, User contactObject, Map<Integer, Chats> chat) {
		this.Name = Name;
		this.PhoneNumber = PhoneNumber;
		this.Obj = contactObject;
		this.chat = chat;
	}
	
	public boolean isExistGroupPairContact(long userPhoneNo, long contactPhoneNo) {
		if(GroupPairContact == null) {
			return true;
		}else {
			for(int i=0; i<GroupPairContact.size(); i++) {
				if(!(userPhoneNo == GroupPairContact.get(i).get(0) && contactPhoneNo == GroupPairContact.get(i).get(1))) {
					return true;
				}
			}
		}
		return false;
	}

	// Create WhatsApp Contact
	public void createWhatsAppContact(User object) {
	//Main Object
		Main main = new Main();
				// Get the name
				System.out.print("Enter the Name: ");
				String name = get.getString();

				// Get the PhoneNumber
				long phoneNumber;
				while (true) {
					System.out.print("Enter the Phone Number: ");
					phoneNumber = get.getLong();

					// Phone Number verification
					if (!main.checkPhoneNumber(phoneNumber)) {
						System.out.println("Please Enter Correct Phone Number...");
					} else {
						break;
					}
				}

				// Add the Contact into User's Contact List
				User contactObject = serve.isCheckPhoneNumber(phoneNumber);

				if (contactObject != null) {
					if(GroupPairContact == null) {
						List<Long> PairContact = new ArrayList<Long>();
						PairContact.add(object.getPhoneNumber());
						PairContact.add(phoneNumber);
						GroupPairContact.add(PairContact);
					}else {
						for(int i=0; i<GroupPairContact.size(); i++) {
							if(!(object.getPhoneNumber() == GroupPairContact.get(i).get(1) && phoneNumber == GroupPairContact.get(i).get(0))) {
								List<Long> PairContact = new ArrayList<Long>();
								PairContact.add(object.getPhoneNumber());
								PairContact.add(phoneNumber);
								GroupPairContact.add(PairContact);
							}
						}
					}
					Map<Integer, Chats> chating = null;
					if(isExistGroupPairContact(object.getPhoneNumber(), PhoneNumber)) {			
						chating = new LinkedHashMap<Integer, Chats>();
					}else {
//						this.chat = contactObject.getContactList().get(0).chat;
						for(int i=0;i<object.getContactList().size(); i++) {
							if(object.getContactList().get(i).PhoneNumber == PhoneNumber ) {
								chating = object.getContactList().get(i).chat;
							}
						}
					}
 					Contact contact = new Contact(name, phoneNumber, contactObject, chating);
					object.getContactList().add(contact);
				} else {
					System.out.println("This PhoneNumber is not use WhatsApp..");
				}
	}

//View WhatsApp Contact
	public void viewWhatsAppContact(User object) {
		List<Contact> list = object.getContactList();
		if (list != null && list.size() != 0) {
			for (int i = 0; i < list.size(); i++) {
				System.out.println("Name: " + list.get(i).Name + "   PhoneNumber: " + list.get(i).PhoneNumber);
			}
		} else {
			System.out.println("No Contacts!!");
		}
	}
	
	public Contact checkContactName(User obj, String name) {
		List<Contact> list = obj.getContactList();
		if(list != null && list.size() != 0) {
			for(int i=0; i<list.size(); i++) {
				if(list.get(i).Name.equals(name)) {
					return list.get(i);
				}
			}
		}
		return null;
	}

}
