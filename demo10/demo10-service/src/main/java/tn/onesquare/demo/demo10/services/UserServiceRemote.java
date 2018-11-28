package tn.onesquare.demo.demo10.services;

import javax.ejb.Remote;

import tn.onesquare.demo.demo10.entities.User;
import tn.onesquare.demo.demo10.utilities.IGenericDAO;

@Remote
public interface UserServiceRemote extends IGenericDAO<User> {

}
