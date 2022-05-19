package com.example.movieapp

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.ButtonElevation
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage

@Composable
fun Screen() {
    Column(
        Modifier
            .background(Color.Black)
            .fillMaxSize()
    ) {
        MoviePoster()
    }
}


@Composable
fun MoviePoster(modifier: Modifier = Modifier) {
    Column(
        modifier
            .clip(RoundedCornerShape(20.dp))
            .background(Color.White)
            .padding(20.dp),
            horizontalAlignment =  Alignment.CenterHorizontally
    ) {
        AsyncImage(
            "https://i.etsystatic.com/15963200/r/il/25182b/2045311689/il_794xN.2045311689_7m2o.jpg",
            contentDescription = "Joker",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .width(180.dp)
                .aspectRatio(.674f)
                .clip(RoundedCornerShape(10.dp))
        )
        Text("Joker",
              fontSize = 24.sp,
              color = Color.Black
        )
        Row {
            Chip(label = "Action")
            Chip(label = "Drama")
            Chip(label = "History")
        }
        StarRating(9.0f)
        BuyTicketButton(onClick = { })
    }
}

@Composable
fun BuyTicketButton(modifier: Modifier = Modifier,onClick: () -> Unit) {
    Button(
         onClick = onClick,
         Modifier.background(Color.DarkGray),
         elevation = ButtonDefaults.elevation(0.dp)
    ) {
        Text(text = "Buy Ticket", color = Color.White)
    }
}

@Composable
fun StarRating(rating: Float) {

}

@Composable
fun Chip(label : String, modifier : Modifier = Modifier) {
    Text(
        label,
        fontSize = 12.sp,
        color = Color.Gray,
        modifier = Modifier
            .border(2.dp,Color.Gray,RoundedCornerShape(50))
            .padding(horizontal = 8.dp,vertical = 2.dp)
    )
}