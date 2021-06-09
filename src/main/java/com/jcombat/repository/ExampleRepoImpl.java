package com.jcombat.repository;

import com.jcombat.beans.User;

import java.util.ArrayList;
import java.util.List;

public class ExampleRepoImpl implements IExampleRepo{
    @Override
    public List<User> getUserDetailsFromDb() {
        List<User> userDetails = new ArrayList<>();

        User u1 = new User("ewe", "we");
        User u2 = new User("we", "we");

        userDetails.add(u1);
        userDetails.add(u2);

        return userDetails;
    }
}
