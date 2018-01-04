package com.horbatiuk88.restaurantvoter.service;

import com.horbatiuk88.restaurantvoter.AuthorizedUser;
import com.horbatiuk88.restaurantvoter.entity.User;
import com.horbatiuk88.restaurantvoter.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Objects.requireNonNull(username, "Username can not be null");
        final User loadedUser = userRepository.findOneByName(username);
        if (Objects.isNull(loadedUser)) {
            throw new UsernameNotFoundException(String.format("User with username %s not exist", username));
        }

        return new AuthorizedUser(loadedUser);
    }
}
