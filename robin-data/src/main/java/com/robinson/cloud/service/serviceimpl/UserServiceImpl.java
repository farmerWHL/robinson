package com.robinson.cloud.service.serviceimpl;

import com.robinson.cloud.model.SecurUser;
import com.robinson.cloud.service.UserService;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {

        return new SecurUser(s,s,null);
    }
}
