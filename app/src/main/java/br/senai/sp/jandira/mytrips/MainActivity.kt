package br.senai.sp.jandira.mytrips

import android.graphics.drawable.Icon
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.mytrips.ui.theme.MyTripsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyTripsTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {

                    Greeting()

                }
            }
        }
    }
}

@Composable
fun Greeting() {

    Column(modifier = Modifier
        .fillMaxSize()) {

        Column (modifier = Modifier
            .height(height = 50.dp)
            .width(width = 160.dp)
            .background(
                color = Color(0xFFCF06F0),
                shape = RoundedCornerShape(0.dp, 0.dp, 0.dp, 20.dp)
            )
            .align(Alignment.End)
            ) {

        }

        Text(text = "Login",
            fontSize = 55.sp,
            fontWeight = FontWeight.ExtraBold,
            color = Color(0xFFCF06F0),
            modifier = Modifier
                .padding(top = 150.dp, start = 20.dp)
        )

        Text(text = "Please sign in to continue.",
            color = Color(0xFFA09C9C),
            fontSize = 19.sp,
            letterSpacing = 0.sp,
            modifier = Modifier
                .padding(start = 20.dp))

        OutlinedTextField(value = "teste@email.com", onValueChange = {}, label = { Text(text = "E-mail")},
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .padding(top = 60.dp)
                .width(350.dp)
                .height(66.dp),
            colors = OutlinedTextFieldDefaults.colors(
            unfocusedBorderColor = Color(0xFFCF06F0),
                focusedBorderColor = Color(0xFFCF06F0)
                ),
            shape = RoundedCornerShape(15.dp),
            leadingIcon = {
                Icon(imageVector = Icons.Filled.Email, contentDescription = "",
                    tint = Color(0xFFCF06F0))
            }


        )

        OutlinedTextField(
            value = "************", onValueChange = {}, label = { Text(text = "Password")},
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .padding(top = 20.dp)
                .width(350.dp)
                .height(66.dp),
            colors = OutlinedTextFieldDefaults.colors(
                unfocusedBorderColor = Color(0xFFCF06F0),
                focusedBorderColor = Color(0xFFCF06F0)

            ),
            shape = RoundedCornerShape(15.dp),
            leadingIcon = {
                Icon(imageVector = Icons.Filled.Lock, contentDescription = "",
                    tint = Color(0xFFCF06F0))
            }



            )

        Button(onClick = { /*TODO*/ },
            shape = RoundedCornerShape(20.dp),
            colors = ButtonDefaults.buttonColors(Color(0xFFCF06F0)),
            modifier = (Modifier
                .align(Alignment.End)
                .width(width = 160.dp)
                .height(height = 90.dp)
                .padding(top = 30.dp, end = 20.dp)
                    )
        ) {
            Text(text = "SIGN IN ->", fontSize = 19.sp
            , fontWeight = FontWeight.ExtraBold)


        }

        Row {

        Text(text = "Don't have an account?",
            color = Color(0xFFA09C9C),
            fontSize = 15.sp,
            letterSpacing = 0.sp,
            modifier = Modifier
                .padding(top = 20.dp ,start = 160.dp))

            Text(text = "Sign up",
                color = Color(0xFFCF06F0),
                fontSize = 15.sp,
                letterSpacing = 0.sp,
                fontWeight = FontWeight.ExtraBold,
                modifier = Modifier
                    .padding(top = 20.dp, start = 5.dp))
        }
        Column (modifier = Modifier
            .height(height = 50.dp)
            .width(width = 160.dp)
            .offset(y = 86.dp)
            .background(
                color = Color(0xFFCF06F0),
                shape = RoundedCornerShape(0.dp, 20.dp, 0.dp, 0.dp),
            )
            .align(Alignment.Start)
        ) {

        }
    }


}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    MyTripsTheme {
        Greeting()
    }
}