package tn.onesquare.demo.demo10.services;

import javax.ejb.Local;

import tn.onesquare.demo.demo10.entities.User;
import tn.onesquare.demo.demo10.utilities.IGenericDAO;

@Local
public interface UserServiceLocal extends IGenericDAO<User> {

	User login(String login, String password);

}
