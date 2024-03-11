import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class issueService {
  constructor(private http: HttpClient) {}

  updateIssue(Issue: any) {
    return this.http.put('http://localhost:8080/api/v1/issue/edit/', Issue, {responseType: 'text'}).subscribe((resultData:any)=>
    {
      console.log(resultData);
    });
  }
  
  getAll(){
    return this.http.get('http://localhost:8080/api/v1/issue/getAll');
  }
  
  saveIssue(Issue: any)
  {
    return this.http.post('http://localhost:8080/api/v1/issue/save', Issue, {responseType: 'text'}).subscribe((resultData:any)=>
    {
      console.log(resultData)
      alert("Note added succesfully");
    });
  }
  getIssueById(issueId: string)
  {
    return this.http.get('http://localhost:8080/api/v1/issue/search' + "/" + issueId, {responseType: 'text'}).subscribe((resultData:any)=>
    {
      console.log(resultData);
    });
  }
  deleteIssue(Issue: any)
  {
    return this.http.delete('http://localhost:8080/api/v1/issue/delete'+ "/" + Issue, {responseType: 'text'}).subscribe((resultData:any)=>
    {
      console.log(resultData)
      alert("Issue deleted succesfully");
    });
  }
}