package com.example.happybirthday

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.happybirthday.ui.theme.HappyBirthdayTheme

class BusinessCardActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HappyBirthdayTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color(0xFFD1F5E1)
                ) {
                    BusinessCardApp()
                }
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview4() {
    HappyBirthdayTheme {
        BusinessCardApp()
    }
}

@Composable
fun BusinessCardApp() {

    Column(modifier = Modifier.fillMaxSize()) {
        Column(
            modifier = Modifier
                .fillMaxHeight()
                .fillMaxWidth()
                .weight(1f),
            verticalArrangement = Arrangement.Bottom,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            BusinessInfoCard()
        }


        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(bottom = 32.dp)
                .weight(1f),
            verticalArrangement = Arrangement.Bottom
        ) {
            ContactInfoCard()
        }
    }


}

@Composable
fun ContactInfoCard() {

        ContactDetailsInfo(painterResource(id = R.drawable.ic_call_24), stringResource(R.string.business_card_contact_number))
        ContactDetailsInfo(painterResource(id = R.drawable.ic_share_24), stringResource(R.string.business_card_share_id))
        ContactDetailsInfo(painterResource(id = R.drawable.ic_email_24), stringResource(R.string.business_card_email))

}

@Composable
fun ContactDetailsInfo(painter: Painter, text: String) {

    Row (modifier = Modifier
        .padding(8.dp)
        .fillMaxWidth()){
        Icon(painter = painter, contentDescription = null, modifier = Modifier.padding(start = 72.dp), tint = Color(
            0xFF21633E
        )
        )
        Text(text = text,fontSize = 14.sp,modifier = Modifier.padding(start = 16.dp))
    }
}

@Composable
fun BusinessInfoCard() {
    Image(
        painter = painterResource(id = R.drawable.android_logo),
        contentDescription = null,
        Modifier
            .background(Color.Black)
            .height(100.dp)
            .width(100.dp),
        contentScale = ContentScale.FillBounds
    )
    Text(
        text = stringResource(R.string.business_card_full_name),
        fontSize = 32.sp,
        fontWeight = FontWeight.Bold,
        modifier = Modifier.padding(8.dp)
    )

    Text(text = stringResource(R.string.business_card_title), fontWeight = FontWeight.Bold, fontSize = 14.sp,color = Color(0xFF21633E))
}
