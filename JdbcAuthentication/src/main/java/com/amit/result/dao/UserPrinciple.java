package com.amit.result.dao;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.amit.result.entity.User;

public class UserPrinciple implements UserDetails {

	private User v;
	
	public UserPrinciple(User v)
	{
		this.v = v;
	}
	
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		
		return Arrays.asList(new SimpleGrantedAuthority("read"));
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return v.getPassword();
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return v.getUsername();
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}

}
