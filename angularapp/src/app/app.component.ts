import { Component, OnInit } from '@angular/core';
import { Resume } from './resume';
import { ResumeService } from './resume.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {
  resume: Resume;
  constructor(private resumeService: ResumeService) { }

  ngOnInit(): void {
    this.getResume();
  }
  getResume() {
    this.resumeService.getResume().subscribe(
      (data: any) => {
        this.resume = data;
      },
      (error: any) => console.error(error)
    );
  }
}
