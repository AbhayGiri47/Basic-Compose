package com.example.happybirthday

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.happybirthday.ui.theme.HappyBirthdayTheme

class ComposeQuadrantActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HappyBirthdayTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    ComposeQuadrantApp()
                }
            }
        }
    }
}

@Composable
fun ComposeQuadrantApp() {
    Column(modifier = Modifier.fillMaxWidth()) {
        Row(modifier = Modifier.weight(1f)) {
            ComposableInfoCard(stringResource(R.string.first_title), stringResource(R.string.first_description), Color(0xFFEADDFF), modifier = Modifier.weight(1f))
            ComposableInfoCard(stringResource(R.string.second_title), stringResource(R.string.second_description), Color(0xFFD0BCFF), modifier = Modifier.weight(1f))
        }

        Row(modifier = Modifier.weight(1f)) {
            ComposableInfoCard(stringResource(R.string.third_title), stringResource(R.string.third_description), Color(0xFFB69DF8), modifier = Modifier.weight(1f))
            ComposableInfoCard(stringResource(R.string.fourth_title), stringResource(R.string.fourth_description), Color(0xFFF6EDFF), modifier = Modifier.weight(1f))
        }
    }
}

@Composable
fun ComposableInfoCard(
    title: String,
    description: String,
    backgroundColor: Color,
    modifier: Modifier = Modifier
) {

    Column(
        modifier = modifier
            .fillMaxSize()
            .background(backgroundColor)
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text(
            text = title,
            modifier = Modifier.padding(bottom = 16.dp),
            fontWeight = FontWeight.Bold
        )

        Text(text = description, textAlign = TextAlign.Justify)
    }

}


@Preview(showBackground = true)
@Composable
fun DefaultPreview3() {
    HappyBirthdayTheme {
        Column() {
            ComposeQuadrantApp()
        }
    }
}