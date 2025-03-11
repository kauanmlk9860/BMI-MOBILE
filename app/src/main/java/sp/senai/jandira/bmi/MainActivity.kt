package sp.senai.jandira.bmi

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import br.senai.sp.jandira.BMI.UserDataScreen.UserDataScreen
import sp.senai.jandira.bmi.screens.HomeScreen
import sp.senai.jandira.bmi.ui.theme.BMITheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BMITheme {
               //HomeScreen()
                UserDataScreen()
            }
        }
    }
}

