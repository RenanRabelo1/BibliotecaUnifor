package com.example.bibliotecaunifor

import android.R
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.bibliotecaunifor.ui.theme.BibliotecaUniforTheme
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.material3.OutlinedTextField
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.material3.Card
import androidx.compose.ui.layout.ModifierLocalBeyondBoundsLayout
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.material3.CardDefaults
import androidx.compose.ui.Alignment
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.ButtonDefaults
import androidx.compose.foundation.layout.Box
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BibliotecaUniforTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    // Chamamos a nossa nova tela aqui
                    MapScreen(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

// 📱 Esta é a nossa tela em branco onde vamos construir a UI
@Composable
fun MapScreen(modifier: Modifier = Modifier) {
    Scaffold(
        bottomBar = {
            BottomNavBar()
        }
    ) { paddingValues ->


        Column(
            modifier = modifier
                .fillMaxSize()
                .padding(paddingValues)
        ) {

            Row(
                modifier = modifier.fillMaxWidth(), // Faz a Row ocupar toda a largura
                horizontalArrangement = Arrangement.SpaceBetween // Joga os itens para as pontas
            ) {
                // O nosso "Logo" na esquerda
                Text(text = "🎓 Unifriends")

                // O nosso "Sininho" na direita
                Text(text = "🔔")
            }

            OutlinedTextField(
                value = "",
                onValueChange = {/* Vamos salvar o que for digitado aqui */ },
                placeholder = { Text("Pesquisar Localização") },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp)

            )


            Spacer(modifier = Modifier.height(24.dp))

            // 🆕 SELETOR DE ANDAR (Térreo e 1º Andar)
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp),
                horizontalArrangement = Arrangement.spacedBy(12.dp) // Dá um espacinho de 12.dp entre os botões
            ) {
                // Botão Térreo (ATIVO)
                Button(
                    onClick = { },
                    colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF1976D2)) // Cor azul forte
                ) {
                    Text(text = "Térreo", color = Color.White)
                }

                // Botão 1º Andar (INATIVO)
                OutlinedButton(
                    onClick = { },
                    colors = ButtonDefaults.outlinedButtonColors(contentColor = Color(0xFF8B9CB6)) // Cor cinza
                ) {
                    Text(text = "1º Andar")
                }
            }
            Spacer(modifier = Modifier.height(24.dp)) // Espaço após os botões de andar

            // 🆕 PLACEHOLDER DO MAPA (Um Card cinza segurando o lugar da imagem)
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp) // Define uma altura fixa para o mapa
                    .padding(horizontal = 16.dp),
                // Mesma cor cinza de fundo que usamos no card "Indisponível"
                colors = CardDefaults.cardColors(containerColor = Color(0xFFF0F4F8))
            ) {
                Box(
                    modifier = Modifier.fillMaxSize(),
                    contentAlignment = Alignment.Center // Centraliza o texto
                ) {
                    Text(
                        text = "[ Imagem do Mapa Aqui ]",
                        color = Color(0xFF8B9CB6), // Cinza suave
                        fontWeight = FontWeight.Bold
                    )
                }
            }

            Spacer(modifier = Modifier.height(24.dp)) // Espaço antes de "Status da sua prateleira"
            Text(
                text = "Status da sua prateleira",
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(horizontal = 16.dp)

            )
            Spacer(modifier = Modifier.height(16.dp))

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp)
            ) {
                Card(
                    modifier = Modifier.weight(1f)
                ) {
                    Column(
                        modifier = Modifier.padding(16.dp)
                    ) {
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceBetween

                        ) {
                            Text(text = "\uD83D\uDD13")
                            Text(text = "10 LIVRES")
                        }
                        Spacer(modifier = Modifier.height(16.dp))

                        Text(
                            text = "Armários",
                            fontWeight = FontWeight.Bold
                        )

                        Text(text = "Bloco A - Térreo")

                        Spacer(modifier = Modifier.height(16.dp))
                        Button(
                            onClick = {/* Ação futura */ },
                            modifier = Modifier.fillMaxWidth()
                        )
                        {
                            Text(text = "Reserva")
                        }
                    }
                }

                Spacer(modifier = Modifier.width(16.dp))


                Card(
                    modifier = Modifier.weight(1f)
                ) {
                    Column(
                        modifier = Modifier.padding(16.dp)
                    ) {
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceBetween
                        ) {
                            Text(text = "\uD83E\uDDFA")
                            Text(text = "Esgotado")
                        }
                        Spacer(modifier = Modifier.height(16.dp))

                        Text(
                            text = "Armários",
                            fontWeight = FontWeight.Bold
                        )

                        Text(text = "Entrada Principal")

                        Spacer(modifier = Modifier.height(16.dp))

                        Card(
                            modifier = Modifier
                                .fillMaxWidth(),
                            colors = CardDefaults.cardColors(containerColor = Color(0xFFF0F4F8))


                        ) {
                            Text(
                                text = "Indisponível",
                                textAlign = TextAlign.Center,
                                color = Color(0xFF8B9CB6),
                                modifier = Modifier.fillMaxWidth()
                                    .padding(vertical = 12.dp)


                            )
                        }
                    }
                }
            }



            Spacer(modifier = Modifier.height(24.dp)) // Espaço antes da legenda

            // O Cartão principal da Legenda
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp),
                // Deixando o fundo do cartão branco
                colors = CardDefaults.cardColors(containerColor = Color.White)
            ) {
                Column(
                    modifier = Modifier.padding(16.dp)
                ) {
                    // Título da Legenda
                    Text(
                        text = "LEGENDA DO MAPA",
                        fontWeight = FontWeight.Bold,
                        color = Color(0xFF8B9CB6) // Aquele mesmo cinza-azulado
                    )

                    Spacer(modifier = Modifier.height(16.dp))


                    // Primeira Row (Engenharia e Humanas)
                    Row(
                        modifier = Modifier.fillMaxWidth() // 1. Estica a linha principal até o fim
                    ) {
                        // Item 1: Engenharia
                        Row(
                            modifier = Modifier.weight(1f), // 2. Ocupa exatamente a metade esquerda (50%)
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Text(text = "🔵 ")
                            Text(text = "Engenharia")
                        }

                        // Item 2: Humanas
                        Row(
                            modifier = Modifier.weight(1f), // 3. Ocupa exatamente a metade direita (50%)
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Text(text = "🟠 ")
                            Text(text = "Humanas")
                        }
                    }
                    Row(
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Row(
                            modifier = Modifier.weight(1f), // 2. Ocupa exatamente a metade esquerda (50%)
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Text(text = "\uD83D\uDFE3")
                            Text(text = "Direito")
                        }

                        // Item 2: Humanas
                        Row(
                            modifier = Modifier.weight(1f), // 3. Ocupa exatamente a metade direita (50%)
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Text(text = "\uD83D\uDFE2")
                            Text(text = "Salas de Estudo OI")
                        }
                    }
                }
            }
        }
    }
}
@Composable
fun BottomNavBar() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 12.dp),
        horizontalArrangement = Arrangement.SpaceEvenly // Isso divide o espaço igualmente para os 4 itens
    ) {
        Text(text = "🏠 Início")
        Text(text = "🗺️ Mapa")
        Text(text = "📚 Livros")
        Text(text = "👤 Perfil")
    }
}

@Preview(showBackground = true)
@Composable
fun MapScreenPreview() {
    BibliotecaUniforTheme {
        MapScreen()
    }
}


