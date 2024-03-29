import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';
import { JobService, Job } from 'src/app/services/job.service';
import { SkillService } from 'src/app/services/skill.service';


@Component({
  selector: 'app-add-job',
  templateUrl: './add-job.component.html',
  styleUrls: ['./add-job.component.css']
})
export class AddJobComponent implements OnInit {
  jobForm: FormGroup;
  skills: any[];
  postJob: Job;
  constructor(private route: ActivatedRoute,private jobService: JobService, private router: Router, private fromBuilder: FormBuilder, private skillService: SkillService) { }
  ngOnInit(): void {
    this.postJob = new Job();
    this.skillService.getAllSkills()
      .subscribe(
        data => {
          this.skills = data;
        },
        err => {
          alert(err.error);
        }
      )
    this.jobForm = this.fromBuilder.group({
      name:'',
      jobTitle: '',
      jobDescription: '',
      skills: '',
      salary:'',
      location:''
    })
  }

  onSubmit() {
    this.postJob = new Job();
    
    this.postJob.name = this.jobForm.value.name;
    this.postJob.title = this.jobForm.value.jobTitle;
    this.postJob.role = this.jobForm.value.jobDescription;
    this.postJob.salary = this.jobForm.value.salary;
    this.postJob.location = this.jobForm.value.location;
    this.postJob.recruiterId = Number(localStorage.getItem('recruiterId'));
    this.postJob.freelancerId = Number('2');
    console.log(this.postJob);
    this.jobService.addJob(this.postJob).subscribe(
      data=>{
        //alert(data);
        // alert(data);
        this.router.navigate(['../../jobs'], {relativeTo: this.route}).then(() => { window.location.reload(); });
      },
      err=>{
        // alert(err.error);
        console.warn(err.error);  
      }
    )
  }


}
//Job {name: undefined, title: 'dasads', role: '', salary: undefined, recruiterId: 0, …}