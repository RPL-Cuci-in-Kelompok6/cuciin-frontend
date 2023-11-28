package com.example.cuciin_temp

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Email
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material.icons.outlined.QueryBuilder
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
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
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.tooling.preview.Preview


@OptIn(ExperimentalMaterial3Api::class, ExperimentalFoundationApi::class)
@Composable
fun DashboardPage() {
    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(25.dp,15.dp),
//            verticalArrangement = Arrangement.Center,
//            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Row {
                Box(modifier = Modifier.weight(3F)){
                    Column {
                        Text(
                            text = "Selamat Datang,",
                            style = TextStyle(
                                fontSize = 24.sp,
                                //                fontFamily = FontFamily(Font(R.font.roboto)),
                                fontWeight = FontWeight(300),
                                color = Color(0xFF000000),
                            )
                        )
                        Text(
                            text = "Izzud",
                            style = TextStyle(
                                fontSize = 24.sp,
//                    fontFamily = FontFamily(Font(R.font.fjalla one)),
                                fontWeight = FontWeight(400),
                                color = Color(0xFF000000),
                            )
                        )
                    }
                }
                Box(modifier = Modifier.weight(1F)){
                    Image(
                        painter = painterResource(id = R.drawable.people1),
                        contentDescription = "image description",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .height(57.dp)
                            .width(57.dp)
                            .clip(CircleShape)
                            .align(Alignment.CenterEnd)
                    )
                }
            }

            Spacer(modifier = Modifier.height(20.dp))

            Box (
                modifier = Modifier
                    .clip(shape = RoundedCornerShape(15.dp))
                    .background(Color.White)
                    .padding(20.dp, 4.dp)

            ){
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(1.dp),
                ) {
                    Text(
                        text = "Pesanan Aktif",
                        style = TextStyle(
                            fontSize = 24.sp,
//                            fontFamily = FontFamily(Font(R.font.fjalla one)),
                            fontWeight = FontWeight(400),
                            color = Color(0xFF000000),
                        )
                    )

                    Spacer(modifier = Modifier.height(10.dp))

                    ElevatedCard(
                        elevation = CardDefaults.cardElevation(
                            defaultElevation = 6.dp
                        ),
                        modifier = Modifier
                            .fillMaxWidth(),
                        colors = CardDefaults.cardColors(
                            containerColor = Color.White,
                        )

                    ){
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(5.dp, 5.dp)
                        ) {
                            Spacer(modifier = Modifier.width(10.dp))
                            Image(
                                painter = painterResource(id = R.drawable.mesin),
                                contentDescription = "image description",
                                contentScale = ContentScale.None,
                                modifier = Modifier
                                    .width(41.dp)
                                    .height(50.dp)
                            )
                            Spacer(modifier = Modifier.width(15.dp))
                            Column {
                                Text(
                                    text = "Pesanan No.0002142",
                                    style = TextStyle(
                                        fontSize = 17.sp,
//                                            fontFamily = FontFamily(Font(R.font.fjalla one)),
                                        fontWeight = FontWeight(400),
                                        color = Color(0xFF000000),
                                    )
                                )
                                Text(
                                    text = "Sudah selesai",
                                    style = TextStyle(
                                        fontSize = 17.sp,
//                                            fontFamily = FontFamily(Font(R.font.roboto)),
                                        fontWeight = FontWeight(300),
                                        color = Color(0xFF38822C),
                                    )
                                )
                            }
                        }
                    }

                    Spacer(modifier = Modifier.height(5.dp))
                    ElevatedCard(
                        elevation = CardDefaults.cardElevation(
                            defaultElevation = 6.dp
                        ),
                        modifier = Modifier
                            .fillMaxWidth(),
                        colors = CardDefaults.cardColors(
                            containerColor = Color.White,
                        )

                    ){
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(5.dp, 5.dp)
                        ) {
                            Spacer(modifier = Modifier.width(10.dp))
                            Image(
                                painter = painterResource(id = R.drawable.mesin),
                                contentDescription = "image description",
                                contentScale = ContentScale.None,
                                modifier = Modifier
                                    .width(41.dp)
                                    .height(50.dp)
                            )
                            Spacer(modifier = Modifier.width(15.dp))
                            Column {
                                Text(
                                    text = "Pesanan No.0002142",
                                    style = TextStyle(
                                        fontSize = 17.sp,
//                                            fontFamily = FontFamily(Font(R.font.fjalla one)),
                                        fontWeight = FontWeight(400),
                                        color = Color(0xFF000000),
                                    )
                                )
                                Text(
                                    text = "Masih Dicuci",
                                    style = TextStyle(
                                        fontSize = 17.sp,
//                                            fontFamily = FontFamily(Font(R.font.roboto)),
                                        fontWeight = FontWeight(300),
                                        color = Color(0xFFF50000),
                                    )
                                )
                            }
                        }
                    }

                    Spacer(modifier = Modifier.height(10.dp))
                }
            }

            Spacer(modifier = Modifier.height(10.dp))

            Text(
                text = "PESAN LAGI",
                modifier = Modifier.padding(20.dp,0.dp,0.dp,0.dp),
                style = TextStyle(
                    fontSize = 24.sp,
//                    fontFamily = FontFamily(Font(R.font.fjalla one)),
                    fontWeight = FontWeight(400),
                    color = Color(0xFF000000),

                )
            )

            Spacer(modifier = Modifier.height(6.dp))

            Box (
                modifier = Modifier
                    .clip(shape = RoundedCornerShape(15.dp))
                    .background(Color.White)
                    .padding(20.dp, 4.dp)

            ){
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.toko1),
                        contentDescription = "image description",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(270.dp)
                            .clip(shape = RoundedCornerShape(10.dp))


                    )
                    Spacer(modifier = Modifier.height(20.dp))

                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .background(
                                color = Color(0xFFFFFFFF),
                                shape = RoundedCornerShape(size = 10.dp)
                            )
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.shopping_bag),
                            contentDescription = "image description",
                            modifier = Modifier
                                .height(20.dp)
                                .width(20.dp)
                                .align(Alignment.TopEnd)
                        )
                        Column (
                            verticalArrangement = Arrangement.spacedBy(5.dp)
                        ){
                            Text(
                                text = "Laundry Buddy",
                                style = TextStyle(
                                    fontSize = 18.sp,
                                    lineHeight = 24.sp,
//                                fontFamily = FontFamily(Font(R.font.nunito)),
                                    fontWeight = FontWeight(700),
                                    color = Color(0xFF2B2B43),
                                    letterSpacing = 0.1.sp,
                                )
                            )
                            Row (
                                verticalAlignment = Alignment.CenterVertically
                            ){
                                Icon(Icons.Outlined.QueryBuilder, contentDescription = null)
                                Spacer(modifier = Modifier.width(3.dp))
                                Text(
                                    text = "50-70 min",

                                    style = TextStyle(
                                        fontSize = 12.sp,
                                        lineHeight = 16.sp,
//                                        fontFamily = FontFamily(Font(R.font.nunito)),
                                        fontWeight = FontWeight(600),
                                        color = Color(0xFF83859C),
                                    )
                                )

                                Spacer(modifier = Modifier.width(3.dp))

                                Box(modifier = Modifier
                                    .padding(1.dp)
                                    .width(3.dp)
                                    .height(3.dp)
                                    .background(color = Color(0xFF4E60FF)))

                                Spacer(modifier = Modifier.width(3.dp))

                                Text(
                                    text = "Rp.15.000",

                                    style = TextStyle(
                                        fontSize = 12.sp,
                                        lineHeight = 16.sp,
//                                        fontFamily = FontFamily(Font(R.font.nunito)),
                                        fontWeight = FontWeight(600),
                                        color = Color(0xFF83859C),
                                    )
                                )
                            }

                            Row(
                                horizontalArrangement = Arrangement.spacedBy(8.dp, Alignment.Start),
                                verticalAlignment = Alignment.CenterVertically,
                            ) {
                                Box(
                                    modifier = Modifier
                                        .background(
                                            color = Color(0xFFEDEEF2),
                                            shape = RoundedCornerShape(size = 100.dp)
                                        )
                                        .padding(10.dp, 1.dp)
                                ){
                                    Text(
                                        text = "Cuci",

                                        // Small 2 - semibold 12 (16, 0px)
                                        style = TextStyle(
                                            fontSize = 12.sp,
                                            lineHeight = 16.sp,
//                                            fontFamily = FontFamily(Font(R.font.nunito)),
                                            fontWeight = FontWeight(600),
                                            color = Color(0xFF545563),
                                        )
                                    )
                                }
                                Box(
                                    modifier = Modifier
                                        .background(
                                            color = Color(0xFFEDEEF2),
                                            shape = RoundedCornerShape(size = 100.dp)
                                        )
                                        .padding(10.dp, 1.dp)
                                ){
                                    Text(
                                        text = "Kering",

                                        // Small 2 - semibold 12 (16, 0px)
                                        style = TextStyle(
                                            fontSize = 12.sp,
                                            lineHeight = 16.sp,
//                                            fontFamily = FontFamily(Font(R.font.nunito)),
                                            fontWeight = FontWeight(600),
                                            color = Color(0xFF545563),
                                        )
                                    )
                                }
                            }

                            Spacer(modifier = Modifier.height(10.dp))
                        }

                    }
                }
            }
            
            Text(text = "halo")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun preview() {
    Surface {
        HistoryPage()
    }
}
