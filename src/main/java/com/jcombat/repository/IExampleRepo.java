package com.jcombat.repository;

import com.jcombat.beans.User;

import java.util.List;

public interface IExampleRepo {
    public List<User> getUserDetailsFromDb();
}
