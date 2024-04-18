package com.example.student_job_search_app.ui_models.my_profile

import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun MyPage() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        // Profile name row
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(bottom = 16.dp)
        ) {
            Text(
                text = "Mads Jensen",
                style = TextStyle(fontSize = 24.sp, fontWeight = FontWeight.Bold)
            )
            Spacer(modifier = Modifier.width(8.dp))
            Icon(
                imageVector = Icons.Default.AccountCircle,
                contentDescription = "My account"
            )
        }

        // Profile details inside a gray box
        Surface(
            color = Color.LightGray,
            shape = MaterialTheme.shapes.medium,
            modifier = Modifier.padding(8.dp)
        ) {
            Column(Modifier.padding(16.dp)) {
                Text(text = "Email: MadsJensen@mail.com")
                Spacer(modifier = Modifier.height(8.dp))
                Text(text = "Phone: +451234567")
                Spacer(modifier = Modifier.height(8.dp))
                Text(text = "Address: Richard Mortensens Vej 28E")
            }
        }

        // Gap between profile details and application section
        Spacer(modifier = Modifier.height(16.dp))

        // Application section
        Row(verticalAlignment = Alignment.CenterVertically) {
            Text(text = "Din ansøgning")
            Spacer(modifier = Modifier.width(8.dp))
            Icon(
                imageVector = Icons.Default.AddCircle,
                contentDescription = "Add"
            )
        }
        Spacer(modifier = Modifier.height(8.dp)) // Add some space between the sections
        Row(verticalAlignment = Alignment.CenterVertically) {
            Text(text = "Dit CV")
            Spacer(modifier = Modifier.width(8.dp))
            Icon(
                imageVector = Icons.Default.AddCircle,
                contentDescription = "Add"
            )
        }
    }
}
