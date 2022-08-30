import { Injectable } from '@angular/core';
import { environment } from 'src/environments/environment';
import { Resume } from './resume';
import { HttpClient } from '@angular/common/http';


@Injectable({
  providedIn: 'root'
})
export class ResumeService {
  private apiServerUrl = environment.apiBaseUrl;
getResume() {
  return this.http.get<Resume>(`${this.apiServerUrl}/getResume`);
}

constructor(private http: HttpClient) {}
}
