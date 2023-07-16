package com.test.Instagram_App.repository;

import com.test.Instagram_App.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPostRepo extends JpaRepository<Post,Long> {
}
