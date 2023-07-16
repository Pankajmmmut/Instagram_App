package com.test.Instagram_App.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long postId;
    private Timestamp createdDate;
    private Timestamp updatedDate;
    private String postData;
    //(use any dummy string here ex "abcd" . this will be replaced by image link string in class)

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="fk_post_user_id")
    private User user;
}
