package com.example.backendsitemate.Service;

import com.example.backendsitemate.Repo.IssueRepository;
import com.example.backendsitemate.Entity.Issue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class IssueService {
    @Autowired
    private IssueRepository repository;

    public void saveOrUpdate(Issue issues)
    {
        this.repository.save(issues);
    }

    public Iterable<Issue> listAll()
    {
        return this.repository.findAll();
    }

    public void deleteIssue(String id)
    {
        repository.deleteById(id);
    }

    public Issue getIssueById(String id)
    {
        return repository.findById(id).get();
    }
}
