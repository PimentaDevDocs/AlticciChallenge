import {Component, OnInit} from '@angular/core';
import {AlticciServiceService} from "../../services/alticci-service.service";
import {FormBuilder, FormControl, FormGroup} from "@angular/forms";

@Component({
  selector: 'app-sequence',
  templateUrl: './sequence.component.html',
  styleUrls: ['./sequence.component.css']
})
export class SequenceComponent implements OnInit {

  form: FormGroup = new FormGroup({
    input: new FormControl(0),
    out: new FormControl({value: 0, disabled: true})
  })

  constructor(
    private service: AlticciServiceService
  ) {
  }


  ngOnInit(): void {


  }

  call() {
    this.service.sequence(this.form.value.input).subscribe((data) => {
      if (data != this.form.get('out')!.value.out)
        this.form.get('out')?.setValue({
          out: data
        });
    });
  }
}
