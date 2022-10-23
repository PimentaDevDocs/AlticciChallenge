import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";

@Injectable({
  providedIn: 'root'
})
export class AlticciServiceService {

  url = 'http://localhost:8080/alticci/'

  constructor(
    private http: HttpClient
  ) { }

  sequence(value: number){

    return this.http.get<number>(this.url + value);

  }

}
