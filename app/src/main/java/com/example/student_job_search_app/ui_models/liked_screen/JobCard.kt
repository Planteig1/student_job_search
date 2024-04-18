package com.example.student_job_search_app.ui_models.liked_screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

@Composable
fun JobCard(title: String, company: String, description: String) {
    Box(modifier = Modifier
        .fillMaxWidth()
        .background(Color.LightGray),

    ) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Row(
                horizontalArrangement = Arrangement.SpaceEvenly,
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                Text(
                    text = title,
                    modifier = Modifier
                )
                Text(
                    text = company
                )
            }
            Text(text = description)
        }
    }

}