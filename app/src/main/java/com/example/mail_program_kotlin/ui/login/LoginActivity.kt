package com.example.mail_program_kotlin.ui.login

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material3.Button
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
private fun login(
    modifier: Modifier = Modifier
        .fillMaxSize()
){
    var Q = listOf("아이디", "비밀번호")
    Column (
        modifier = modifier.padding(30.dp),
        verticalArrangement = Arrangement.Center
    ){
        Header()
        boxs(titles = Q)
        Row (
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.End
        ){
            ElevatedButton(
                onClick = { /*TODO*/ },
                shape = RoundedCornerShape(5.dp)
            ) {
                Text(text = "로그인")
            }
        }
    }

}

@Composable
private fun Header(
    modifier: Modifier = Modifier.fillMaxWidth()
){
    Text(
        text = "MAIL",
        fontSize = 30.sp,
        modifier = modifier.fillMaxWidth(),
        textAlign = TextAlign.Center
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun box(
    title: String,
    modifier: Modifier = Modifier
        .fillMaxWidth()
        .padding(bottom = 10.dp)
){
    var text by remember { mutableStateOf("text")}

    Column()
    {
        OutlinedTextField(
            value = text,
            onValueChange = { text = it },
            modifier = modifier.fillMaxWidth(),
            label = { Text(text = title)}
        )
    }
}

@Composable
private fun boxs(
    titles: List<String>
){
    for (i in titles){
        box(title = i)
    }
}

@Composable
private fun main(
    modifier: Modifier
){
    Surface {

    }
}

@Preview
@Composable
fun loginPriview(){
    login()
}

@Preview
@Composable
fun BoxPreview(){
    box("인삿말을 써주세요")
}