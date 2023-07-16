package com.test.Instagram_App.repository;

import com.test.Instagram_App.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepo extends JpaRepository<User,Long> {

    User findFirstByEmail(String newEmail);
}
