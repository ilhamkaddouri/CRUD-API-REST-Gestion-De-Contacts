package com.example.contacts;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.contacts.dao.ContactRepository;
import com.example.contacts.entities.*;
@SpringBootApplication
public class ContactsApplication implements CommandLineRunner {
	@Autowired
	private ContactRepository contactRepository;
	public static void main(String[] args) {
		SpringApplication.run(ContactsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		DateFormat df = new SimpleDateFormat("dd/MM/yyy");
		contactRepository.save(new Contact("ilham","kaddouri",df.parse("07/01/1999"),"ilham@gmail.com",56214792,"ilhamjpg"));
		contactRepository.save(new Contact("ayoub","kaddouri",df.parse("13/08/2004"),"ayoub@gmail.com",56214792,"ilhamjpg"));
		contactRepository.save(new Contact("amin","kaddouri",df.parse("03/12/2001"),"amin@gmail.com",56214792,"ilhamjpg"));
		contactRepository.findAll().forEach(c->{
			System.out.println(c.getEmail());
		}
		);
	}

}
