package com.dennis.loginreg

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.dennis.loginreg.ui.theme.LoginRegTheme
import java.net.PasswordAuthentication

class RegisterActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LoginRegTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
   //                 Greeting("Android")
                    Register()
                }
            }
        }
    }
}
@Composable
fun Register(){
    var name by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var password  by remember { mutableStateOf("") }
    var confirmpassword  by remember { mutableStateOf("") }

    Column (horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(vertical = 15.dp)){

        Text(text = "eMobilis Login",
            color = Color.Cyan,
            fontSize = 28.sp,
        )
        Icon(imageVector = Icons.Default.Person, contentDescription = "per")
        Spacer(modifier = Modifier.height(20.dp)
        )

        OutlinedTextField(value =name ,
            onValueChange ={name=it},
            leadingIcon = { Icon(imageVector = Icons.Default.AccountCircle, contentDescription = "name")},
            label = { Text(text = "Enter Name",
                color = Color.Cyan,
            fontSize = 20.sp)},

            modifier = Modifier.fillMaxWidth()

            )

        Spacer(modifier = Modifier.height(15.dp))

        OutlinedTextField(
            value =email ,
            onValueChange ={email=it},
            leadingIcon = { Icon(imageVector = Icons.Default.Email, contentDescription = "Icon")},
            label = { Text(text = "Enter Email",
                color = Color.Cyan,
                fontSize = 20.sp)},


            modifier = Modifier.fillMaxWidth()


        )
        Spacer(modifier = Modifier.height(15.dp))

        OutlinedTextField(value =password ,
            onValueChange ={password=it},
            leadingIcon = { Icon(imageVector = Icons.Default.Lock,
                contentDescription = "pass")},
            label = { Text(text = "Enter Pass",
                fontSize = 20.sp,
                color = Color.Cyan)},
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(20.dp))
        OutlinedTextField(value = confirmpassword,
            onValueChange ={confirmpassword=it},
            leadingIcon = { Icon(imageVector = Icons.Default.CheckCircle,
                contentDescription = "confirm")},
            label = { Text(text = "Confirm Password",
                fontSize = 20.sp,
                color = Color.Cyan)},
            modifier = Modifier.fillMaxWidth())

        Spacer(modifier = Modifier.height(20.dp))
        OutlinedButton(onClick = { /*TODO*/ },
            modifier = Modifier.fillMaxWidth(),
            colors = ButtonDefaults.buttonColors(Color.Blue)) {
            Text(text = "Register",
                fontSize = 20.sp)
        Spacer(modifier = Modifier.height(20.dp))
            OutlinedButton(onClick = { /*TODO*/ },
                modifier = Modifier.fillMaxWidth(),
                colors = ButtonDefaults.buttonColors(Color.Blue)) {
                Text(
                    text = "Click to Login",
                    fontSize = 20.sp

                )
            }
        }
    }
}

@Preview
@Composable
private fun Registerprev(){
    Register()
}

