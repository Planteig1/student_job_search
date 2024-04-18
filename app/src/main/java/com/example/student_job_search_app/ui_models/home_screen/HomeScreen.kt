package com.example.student_job_search_app.ui_models.home_screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.student_job_search_app.ui_models.liked_screen.Job
import com.example.student_job_search_app.ui_models.liked_screen.JobCard

@Composable
fun HomeScreen() {
    val job1: Job = Job("Student Software Engineer","Apple","Write some code")
    val job2: Job = Job("Student Doctor","Hvidovre hospital","Save some people")
    val job3: Job = Job("Student database designer","quam","Make a big database please")
    val job4: Job = Job("Student Dsb worker","DSB","Drive train")
    val job5: Job = Job("Student SAS WORKER","SAS","Dont damage the plane")
    val job6: Job = Job("Student SATS Trainer","SATS","Make people fit")
    val job7: Job = Job("Student Teach","Kea","Make the children happy")
    val listOfLikedCompanies: List<Job> = listOf(job1,job2,job3,job4,job5,job6,job7)

    Column {
        Text(text = "All the jobs")
        LazyColumn {
            items(listOfLikedCompanies) { job ->
                JobCard(title = job.title, company = job.company, description = job.description)
                Spacer(Modifier.height(8.dp))
            }
        }
    }
}