package com.example.backendsitemate.Repo;

import com.example.backendsitemate.Entity.Issue;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface IssueRepository extends MongoRepository<Issue, String> {
}
