package com.example.realestate.ui.theme.screens.dashboard

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.realestate.R
import com.example.realestate.navigation.ROUT_DETAIL
import com.example.realestate.navigation.ROUT_HOME
import com.example.realestate.navigation.ROUT_INTENT
import com.example.realestate.navigation.ROUT_PROPERTY
import com.example.realestate.ui.theme.babyblue


@Composable
fun DashboardScreen(navController: NavController){
    Column(
        modifier = Modifier
        .fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally

    ) {

        Spacer(modifier = Modifier.height(10.dp))



        Image(
            painter = painterResource(id = R.drawable.dashimg),
            contentDescription ="home image",
            modifier = Modifier
                .size(100.dp)
                .clip(shape = CircleShape),
            contentScale = ContentScale.Crop


        )

        Spacer(modifier = Modifier.height(5.dp))

        Text(
            text = "Manage your properties with ease " ,
            fontSize = 25.sp ,
            color = Color.Black
        )

        Spacer(modifier = Modifier.height(15.dp))

        Column(modifier = Modifier.verticalScroll(rememberScrollState())) {

            //main card

            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(700.dp),
                shape = RoundedCornerShape(topStart = 50.dp, topEnd = 50.dp),
                colors = CardDefaults.cardColors(babyblue)
                ) {

                //row1
                Row (modifier = Modifier.padding(20.dp)){
                    //Card1
                    Card(modifier = Modifier
                        .clickable { navController.navigate(ROUT_HOME) }
                        .height(180.dp)
                        .width(160.dp)) {
                        Column {
                            Spacer(modifier = Modifier.height(15.dp))

                            Box(
                                modifier = Modifier.fillMaxWidth(),
                                contentAlignment = Alignment.Center
                            ) {
                                androidx.compose.foundation.Image(
                                    painter = androidx.compose.ui.res.painterResource(id = R.drawable.house),
                                    contentDescription = "",
                                    modifier = Modifier.size(70.dp)
                                )

                            }
                            Spacer(modifier = Modifier.height(15.dp))

                            Text(
                                text = "HOME " ,
                                fontSize = 15.sp ,
                                color = Color.Black,
                                modifier = Modifier.fillMaxWidth(),
                                textAlign = TextAlign.Center
                            )


                        }


                    }
                    //End of card
                    Spacer(modifier = Modifier.width(15.dp))

                    //Card2
                    Card(modifier = Modifier
                        .clickable { navController.navigate(ROUT_PROPERTY) }
                        .height(180.dp)
                        .width(160.dp)) {
                        Column {
                            Spacer(modifier = Modifier.height(15.dp))

                            Box(
                                modifier = Modifier.fillMaxWidth(),
                                contentAlignment = Alignment.Center
                            ) {
                                androidx.compose.foundation.Image(
                                    painter = androidx.compose.ui.res.painterResource(id = R.drawable.prop2),
                                    contentDescription = "",
                                    modifier = Modifier.size(70.dp)
                                )

                            }
                            Spacer(modifier = Modifier.height(15.dp))

                            Text(
                                text = "PROPERTY" ,
                                fontSize = 15.sp ,
                                color = Color.Black,
                                modifier = Modifier.fillMaxWidth(),
                                textAlign = TextAlign.Center
                            )


                        }


                    }
                    //End of card


                }
                //end of row 1

                //row2

                Row (modifier = Modifier.padding(20.dp)){
                    //Card3
                    Card(modifier = Modifier
                        .clickable { navController.navigate(ROUT_DETAIL) }
                        .height(180.dp)
                        .width(160.dp)) {
                        Column {
                            Spacer(modifier = Modifier.height(15.dp))

                            Box(
                                modifier = Modifier.fillMaxWidth(),
                                contentAlignment = Alignment.Center
                            ) {
                                androidx.compose.foundation.Image(
                                    painter = androidx.compose.ui.res.painterResource(id = R.drawable.property),
                                    contentDescription = "",
                                    modifier = Modifier.size(70.dp)
                                )

                            }
                            Spacer(modifier = Modifier.height(15.dp))

                            Text(
                                text = "DETAILS " ,
                                fontSize = 15.sp ,
                                color = Color.Black,
                                modifier = Modifier.fillMaxWidth(),
                                textAlign = TextAlign.Center
                            )


                        }


                    }
                    //End of card
                    Spacer(modifier = Modifier.width(15.dp))

                    //Card4
                    Card(modifier = Modifier
                        . clickable { navController.navigate(ROUT_INTENT) }
                        .height(180.dp)
                        .width(160.dp)) {
                        Column {
                            Spacer(modifier = Modifier.height(15.dp))

                            Box(
                                modifier = Modifier.fillMaxWidth(),
                                contentAlignment = Alignment.Center
                            ) {
                                androidx.compose.foundation.Image(
                                    painter = androidx.compose.ui.res.painterResource(id = R.drawable.prop3),
                                    contentDescription = "",
                                    modifier = Modifier.size(70.dp)
                                )

                            }
                            Spacer(modifier = Modifier.height(15.dp))

                            Text(
                                text = "INTENT" ,
                                fontSize = 15.sp ,
                                color = Color.Black,
                                modifier = Modifier.fillMaxWidth(),
                                textAlign = TextAlign.Center
                            )


                        }


                    }
                    //End of card


                }
                //end of row 2

                Row (modifier = Modifier.padding(20.dp)){
                    //Card5
                    Card(modifier = Modifier
                        .height(180.dp)
                        .width(160.dp)) {
                        Column {
                            Spacer(modifier = Modifier.height(15.dp))

                            Box(
                                modifier = Modifier.fillMaxWidth(),
                                contentAlignment = Alignment.Center
                            ) {
                                androidx.compose.foundation.Image(
                                    painter = androidx.compose.ui.res.painterResource(id = R.drawable.settings),
                                    contentDescription = "",
                                    modifier = Modifier.size(70.dp)
                                )

                            }
                            Spacer(modifier = Modifier.height(15.dp))

                            Text(
                                text = "SETTINGS " ,
                                fontSize = 15.sp ,
                                color = Color.Black,
                                modifier = Modifier.fillMaxWidth(),
                                textAlign = TextAlign.Center
                            )


                        }


                    }
                    //End of card
                    Spacer(modifier = Modifier.width(15.dp))

                    //Card6
                    Card(modifier = Modifier
                        .height(180.dp)
                        .width(160.dp)) {
                        Column {
                            Spacer(modifier = Modifier.height(15.dp))

                            Box(
                                modifier = Modifier.fillMaxWidth(),
                                contentAlignment = Alignment.Center
                            ) {
                                androidx.compose.foundation.Image(
                                    painter = androidx.compose.ui.res.painterResource(id = R.drawable.house),
                                    contentDescription = "",
                                    modifier = Modifier.size(70.dp)
                                )

                            }
                            Spacer(modifier = Modifier.height(15.dp))

                            Text(
                                text = "HOME " ,
                                fontSize = 15.sp ,
                                color = Color.Black,
                                modifier = Modifier.fillMaxWidth(),
                                textAlign = TextAlign.Center
                            )


                        }


                    }
                    //End of card


                }
                //end of row 3






            }
            //end of  main card

        }




    }
}

@Composable
@Preview(showBackground = true)
fun DashboardScreenPreview(){
    DashboardScreen(rememberNavController())

}