package com.example.happybirthday

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.happybirthday.ui.theme.HappyBirthdayTheme

class TaskManagerCompleteScreen : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HappyBirthdayTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {

                }
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview2() {
    HappyBirthdayTheme {

        Column(
            modifier = Modifier
                .fillMaxHeight()
                .fillMaxWidth(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            ComposeImage(
                painter = painterResource(id = R.drawable.ic_task_completed),
                ContentScale.None
            )
            ComposeText(
                message = stringResource(R.string.all_tasks_completed),
                modifier = Modifier
                    .padding(0.dp, 24.dp, 0.dp, 8.dp),
                fontSize = 14.sp,
                textALign = TextAlign.Start,
                FontWeight.Bold
            )
            ComposeText(
                message = stringResource(R.string.nice_work),
                modifier = Modifier,
                fontSize = 16.sp,
                textALign = TextAlign.Start,
                fontweight = FontWeight.Normal
            )

        }
    }
}