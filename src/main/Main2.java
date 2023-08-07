package main;

import model.Contact;
import model.MobilePhone;

public class Main2 {
    public static void main(String[] args) {
        MobilePhone phone = new MobilePhone("123123123");
        Contact senem = new Contact("senem", "1234");
        Contact ali = new Contact("ali", "12347");
        phone.addNewContact(new Contact("cemre", "123456"));
        phone.addNewContact(new Contact("cemre", "1234567"));
        phone.addNewContact(new Contact("ayşe", "123456"));
        phone.addNewContact(new Contact("melih", "123445"));
        phone.addNewContact(senem);
        phone.addNewContact(ali);
        phone.printContact();

        System.out.println("index " + phone.findContact(senem));
        System.out.println("index string " + phone.findContact(senem.getName()));
        System.out.println("query " + phone.queryContact(senem.getName()));

        phone.removeContact(ali);
        phone.printContact();






    }
}
