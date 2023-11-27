package com.example.happybirthday

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.happybirthday.ui.theme.HappyBirthdayTheme

class ComposeArticle2 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HappyBirthdayTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {

                    ComposeArticleApp()

                }
            }
        }
    }
}

@Composable
private fun ComposeArticleApp() {
    Column() {

        ComposeImage(
            painter = painterResource(id = R.drawable.bg_compose_background),
            contentScale = ContentScale.FillWidth
        )
        ComposeText(
            message = stringResource(R.string.article_title),
            modifier = Modifier.padding(16.dp),
            24.sp,
            TextAlign.Start,
            FontWeight.Bold
        )
        ComposeText(
            message = stringResource(R.string.article_short_description),
            modifier = Modifier.padding(16.dp, 0.dp, 16.dp, 0.dp),
            14.sp,
            TextAlign.Justify,
            FontWeight.Bold
        )
        ComposeText(
            message = stringResource(id = R.string.article_long_description),
            modifier = Modifier.padding(16.dp),
            14.sp,
            TextAlign.Justify,
            FontWeight.Bold
        )

    }
}

@Composable
fun ComposeImage(painter: Painter, contentScale: ContentScale) {

    Image(painter = painter, contentDescription = null, contentScale = contentScale)
}


@Composable
fun ComposeText(
    message: String,
    modifier: Modifier,
    fontSize: TextUnit,
    textALign: TextAlign,
    fontweight: FontWeight
) {
    Text(
        text = message,
        fontSize = fontSize,
        modifier = modifier,
        textAlign = textALign,
        fontWeight = fontweight
    )
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    HappyBirthdayTheme {
        ComposeArticleApp()
    }
}