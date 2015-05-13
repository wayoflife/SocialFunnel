package de.dhbw.socialfunnel.security;

import java.util.ArrayList;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class UserService implements UserDetailsService {
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
		authorities.add(new SimpleGrantedAuthority("CLIENT"));
		return new User("guest", "password", true, true, false, false, authorities);
		
		
		// fetch user from e.g. DB
		// hier frage an Datenbank nach user
		// wenn kein user, exception schmeissen
//		String[] userinfo = new String[] {null,null};
//		try {
//			userinfo = new DBHelper().getUserByName(username);
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		if(userinfo[0] == null){
//			return null;
//		} else {
//			authorities.add(new SimpleGrantedAuthority("CLIENT"));
//			User user = new User(userinfo[0], userinfo[1], true, true, false, false, authorities);
//			return user;
//		}
		
//		if ("client".equals(username)) {
//			authorities.add(new SimpleGrantedAuthority("CLIENT"));
//			User user = new User(username, "pass", true, true, false, false,
//					authorities);
//			return user;
//		}
//		if ("admin".equals(username)) {
//			authorities.add(new SimpleGrantedAuthority("ADMIN"));
//			User user = new User(username, "pass", true, true, false, false,
//					authorities);
//			return user;
//		} else {
//			return null;
//		}
	}
}
