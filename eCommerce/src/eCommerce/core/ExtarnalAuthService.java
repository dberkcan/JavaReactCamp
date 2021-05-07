package eCommerce.core;

import eCommerce.entities.concretes.LoginDto;

public interface ExtarnalAuthService {
	void register(String email);
	boolean userExists(String email);
	void login(LoginDto dto);
}
