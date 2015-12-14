/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tecnologiaweb.service;

/**
 *
 * @author arturo
 */
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.tecnologiaweb.dao.ContactDAO;
import com.tecnologiaweb.form.Contact;

@Service
public class ContactServiceImpl implements ContactService {

 @Autowired
 private ContactDAO contactDAO;

 @Transactional
 public void addContact(Contact contact) {
    contactDAO.addContact(contact);
    }

 @Transactional
 public List<Contact> listContact() {

    return contactDAO.listContact();
    }

 @Transactional
 public void removeContact(Integer id) {
    contactDAO.removeContact(id);
     }
}
