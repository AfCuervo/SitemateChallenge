import { Component } from '@angular/core';
import { issueService} from './dbConnection.service';
import { Issue } from './Issue';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
title = 'Sitemate Interview, Frontend Site';

constructor(private issueService:issueService){}
//issue1 = new Issue("id1","title1","description1");

AddIssue1()
{
  let issue1={
    "_id" : "id1",
    "title": "Title1",
    "description": "Description1"
  };
  this.issueService.saveIssue(issue1);
  console.log('Issue saved');
  console.log(issue1);
}

GetIssue1()
{
  this.issueService.getIssueById("id1");
}
UpdateIssue1()
{
  let issue1={
    "_id" : "id1",
    "title": "Title1",
    "description": "Description111111"
  };
  this.issueService.updateIssue(issue1);
  console.log('Issue updated');
  console.log(issue1);
}
DeleteIssue1()
{
  this.issueService.saveIssue("id1");
}
}
