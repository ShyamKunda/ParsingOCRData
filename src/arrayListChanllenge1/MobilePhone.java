package arrayListChanllenge1;

import java.util.ArrayList;
import java.util.Iterator;

public class MobilePhone {	
	private static ArrayList<Contacts> allContacts = new ArrayList<Contacts>();
	
	public void addNewContact(String name, String phoneNumber){		
		if (!findContact(name)){
			Contacts newContact = new Contacts(name,phoneNumber);
			allContacts.add(newContact);			
		}
		else{
			System.out.println("Contact with name : " + name + " already exists");
		}
		
	}
	public static boolean findContact(String name){		
		return allContacts.contains(name);		
	}
	public static void printListOfContacts(){
		Iterator<Contacts> itr=allContacts.iterator();  
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}
	public static void removeContact(String name){
		int index = allContacts.indexOf(name);
		if (index>=0){
			allContacts.remove(index);
		}
	}
	public static void updateContact(String name){
		int index = allContacts.indexOf(name);
		if (index>=0){
			
		}
	}
	
}
