package sp.senai.jandira.bmi

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import sp.senai.jandira.bmi.ui.theme.BMITheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BMITheme {
                //HomeScreen()
                //UserDataScreen()
                BMIResultScreen()
            }
        }
    }
}

@Composable
fun BMIResultScreen() {
    androidx.compose.material3.Text(text = "Resultado do IMC")
}



