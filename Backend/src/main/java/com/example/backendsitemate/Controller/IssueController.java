package com.example.backendsitemate.Controller;

import com.example.backendsitemate.Service.IssueService;
import com.example.backendsitemate.Entity.Issue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("api/v1/issue")
public class IssueController {
    @Autowired
    private IssueService issueService;

    @PostMapping(value = "/save")
    public String saveIssue(@RequestBody Issue issue)
    {
        issueService.saveOrUpdate(issue);
        System.out.println(issue.toString());
        String response = "{_id=" + issue.get_id() + "}";
        return response;
    }
    @GetMapping(value = "/getAll")
    public Iterable<Issue>getIssues()
    {
        return issueService.listAll();
    }

    @PutMapping(value = "edit/{id}")
    public Issue update(@RequestBody Issue issue, @PathVariable(name="id")String _id)
    {
        Issue previous = issueService.getIssueById(_id);
        System.out.println("Updated issue from: " + previous.toString());
        issue.set_id(_id);
        issueService.saveOrUpdate(issue);
        System.out.println("To: " + issue.toString());
        return issue;
    }

    @DeleteMapping(value = "/delete/{id}")
    public void deleteIssue(@PathVariable("id") String _id)
    {
        issueService.deleteIssue(_id);
        System.out.println("Deleted item with id:" +_id);
    }

    @RequestMapping("/search/{id}")
    private Issue getIssue(@PathVariable(name="id") String _id)

    {
        return issueService.getIssueById(_id);
    }
}
