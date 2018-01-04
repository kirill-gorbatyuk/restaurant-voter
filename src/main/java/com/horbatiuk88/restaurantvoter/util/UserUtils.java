package com.horbatiuk88.restaurantvoter.util;

import com.horbatiuk88.restaurantvoter.entity.User;
import com.horbatiuk88.restaurantvoter.to.UserTO;

import java.util.Objects;

public class UserUtils {

    public static UserTO asTo(User user) {
        Objects.requireNonNull(user);
        return new UserTO(user.getId(), user.getName(), user.getEmail(), user.getPassword());
    }
}
