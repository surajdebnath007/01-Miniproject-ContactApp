package in.ashokit.service;

import java.util.List;

import in.ashokit.entities.Contact;

public interface ContactService {

	public String upsert(Contact contact);

	public List<Contact> getAllContacts();

	public Contact getContact(int cid);

	public String deleteContact(int cid);
}
