package br.senai.sp.jandira.bmi.screens


import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.material3.VerticalDivider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import sp.senai.jandira.bmi.R

@Composable
fun BMIResultScreen(
    navController: NavHostController?
) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                brush = Brush.linearGradient(
                    listOf(
                        Color(0xFF982CC9),
                        Color(0xFF67326E)
                    )
                )
            )
    ) {
        Column (
            modifier = Modifier
                .fillMaxSize(),
            verticalArrangement = Arrangement.Bottom
        ){

            Text(
                modifier = Modifier
                    .weight(1f)
                    .padding(20.dp),
                text = stringResource(R.string.titleYourBMIResult),
                fontSize = 34.sp,
                color = Color.White,

                )
            Card (
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(9f)
                    .padding(0.dp, 10.dp, 0.dp, 0.dp),
                colors = CardDefaults.cardColors(Color(0xFFE5BBE8)),
                shape = RoundedCornerShape(48.dp, 48.dp)

            ){
                Column (
                    modifier = Modifier
                        .padding(32.dp, 0.dp, 32.dp, 32.dp)
                        .weight(1f),
                    verticalArrangement = Arrangement.SpaceAround,
                    horizontalAlignment = Alignment.CenterHorizontally
                ){

                    Column (
                        modifier = Modifier,
                        verticalArrangement = Arrangement.SpaceAround,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Card(
                            modifier = Modifier
                                .size(140.dp),
                            shape = CircleShape,
                            colors = CardDefaults.cardColors(Color(0xFFffffff)),
                            border = BorderStroke(
                                5.dp,
                                brush = Brush.linearGradient(
                                    listOf(
                                        Color(0xFFB942D3),
                                        Color(0xFFBA88FF)
                                    )
                                )),
                            elevation = CardDefaults.elevatedCardElevation(5.dp)
                        ) {
                            Column(
                                modifier = Modifier
                                    .fillMaxSize(),
                                verticalArrangement = Arrangement.SpaceAround,
                                horizontalAlignment = Alignment.CenterHorizontally
                            ) {
                                Text(
                                    text = stringResource(R.string.circleNumber),
                                    fontSize = 40.sp,
                                    fontWeight = FontWeight.Bold
                                )
                            }

                        }
                        Text(
                            text = stringResource(R.string.YouHaveClassIObesity),
                            fontSize = 28.sp,
                        )
                        Card (
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(90.dp),
                            colors = CardDefaults.cardColors(Color(0x9F6B1FC9)),
                            shape = RoundedCornerShape(20.dp)
                        ){
                            Row (
                                modifier = Modifier
                                    .fillMaxSize()
                                    .height(100.dp)
                                    .padding(10.dp),
                                horizontalArrangement = Arrangement.SpaceAround
                            ){
                                Column(
                                    modifier = Modifier
                                        .fillMaxHeight(),
                                    horizontalAlignment = Alignment.CenterHorizontally,
                                    verticalArrangement = Arrangement.SpaceAround
                                ) {
                                    Text(
                                        text = stringResource(R.string.Age),
                                        fontSize = 20.sp,
                                    )
                                    Text(
                                        text = stringResource(R.string.ageNumber),
                                        fontSize = 22.sp,
                                        fontWeight = FontWeight.Bold
                                    )
                                }
                                VerticalDivider()
                                Column (
                                    modifier = Modifier
                                        .fillMaxHeight(),
                                    horizontalAlignment = Alignment.CenterHorizontally,
                                    verticalArrangement = Arrangement.SpaceAround
                                ){
                                    Text(
                                        text = stringResource(R.string.Weight),
                                        fontSize = 20.sp,
                                    )
                                    Text(
                                        text = stringResource(R.string.weigthNumber),
                                        fontSize = 22.sp,
                                        fontWeight = FontWeight.Bold
                                    )
                                }
                                VerticalDivider()
                                Column(
                                    modifier = Modifier
                                        .fillMaxHeight(),
                                    horizontalAlignment = Alignment.CenterHorizontally,
                                    verticalArrangement = Arrangement.SpaceAround
                                ) {
                                    Text(
                                        text = stringResource(R.string.Height),
                                        fontSize = 20.sp,
                                    )
                                    Text(
                                        text = stringResource(R.string.highNumber),
                                        fontSize = 22.sp,
                                        fontWeight = FontWeight.Bold
                                    )
                                }
                            }
                        }

                        Column(
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(300.dp)
                                .background(Color(0xFF0800FF)),
                        ) {  }
                        HorizontalDivider()

                    }
                    Button(
                        onClick = {
                        },
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(50.dp),
                        border = BorderStroke(
                            2.dp,
                            brush = Brush.linearGradient(
                                listOf(
                                    Color(0xFF5608A4),
                                    Color(0xFFBA88FF)
                                )
                            )),
                        elevation = ButtonDefaults.buttonElevation(5.dp),
                        colors = ButtonDefaults.buttonColors(Color(0xFF5608A4)),
                        shape = RoundedCornerShape(10.dp)
                    ){
                        Text(
                            text = stringResource(R.string.buttonNewCalc),
                            fontSize = 30.sp,
                        )
                    }
                }
            }
        }
    }
}

@Preview(showSystemUi = true)
@Composable
private fun BMIResultScreenPreview() {
    BMIResultScreen(null)
}