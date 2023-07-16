package com.test.Instagram_App.repository;

import com.test.Instagram_App.model.AuthenticationToken;
import org.springframework.boot.autoconfigure.neo4j.Neo4jProperties;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAuthenticationRepo extends JpaRepository<AuthenticationToken,Long> {


    AuthenticationToken findFirstByTokenValue(String authTokenValue);
}
