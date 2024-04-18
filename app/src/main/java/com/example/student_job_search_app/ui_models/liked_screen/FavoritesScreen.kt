package com.example.student_job_search_app.ui_models.liked_screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun FavoritesScreen() {
    val job1: Job = Job("Student Software Engineer","Apple","Write some code")
    val job2: Job = Job("Student Doctor","Hvidovre hospital","Save some people")
    val job3: Job = Job("Student database designer","quam","Make a big database please")
    val listOfLikedCompanies: List<Job> = listOf(job1,job2,job3)

    Column {
        Text(text = "Your saved jobs!")
        LazyColumn {
            items(listOfLikedCompanies) { job ->
                JobCard(title = job.title, company = job.company, description = job.description)
                Spacer(Modifier.height(8.dp))
            }
        }
    }
}