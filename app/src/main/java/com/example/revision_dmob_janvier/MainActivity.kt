package com.example.revision_dmob_janvier
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.revision_dmob_janvier.ui.theme.REVISION_DMOB_JANVIERTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            REVISION_DMOB_JANVIERTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background) {
                    RevisionCard()
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun RevisionCard() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.ic_launcher_background),
                contentDescription = null,
                modifier = Modifier
                    .size(40.dp)
                    .clip(CircleShape)
            )
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 16.dp)
            ) {
                Text("Yahia Ben Hassine", style = MaterialTheme.typography.bodyLarge)
                Text("Android Developer", style = MaterialTheme.typography.bodyMedium)
            }

            } // Section Coordonnées
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color.Gray) // Remplacez par la couleur de fond souhaitée
                    .padding(16.dp)
            ) {
                // Ajoutez des composables pour les coordonnées (Text, Icon, etc.)
                Text("Numéro de téléphone : 076 345 84 64 ")
                Text("Adresse e-mail : yahia.bnhss@gmail.com ")
                // Ajoutez d'autres éléments si nécessaire
            }

            // Section avec Bouton
            Button(
                onClick = { /* Action du bouton */ },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 6.dp)
            ) {
                Text("En savoir plus sur moi ")
            }
            var amountInput by remember { mutableStateOf("") }
            TextField(
                value = "Entrez votre message",
                onValueChange = { /* La valeur a changé */ },
                label = { Text("Message : ") },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 6.dp)
            )
            Button(
                onClick = { /* Action du bouton */ },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 6.dp)
            ) {
                Text("Envoyer")
            }









        }

    }

@Preview(showBackground = true)
@Composable
fun RevisionCardPreview() {
    REVISION_DMOB_JANVIERTheme {
        RevisionCard()
    }
}