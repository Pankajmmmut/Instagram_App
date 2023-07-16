package com.test.Instagram_App.service;

import com.test.Instagram_App.repository.IPostRepo;
import com.test.Instagram_App.repository.IUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostService {
    @Autowired
    IPostRepo postRepo;
}
