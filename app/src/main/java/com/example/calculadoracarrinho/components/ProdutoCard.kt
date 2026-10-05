package com.example.calculadoracarrinho.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import com.example.calculadoracarrinho.model.ItemCarrinho

@Composable
fun ProdutoCard(
    item: ItemCarrinho
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 4.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        ) {

            Text(
                text = item.produto.nome,
                style = MaterialTheme.typography.titleMedium,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis
            )

            Text(
                text = item.produto.descricao ?: "Sem descrição",
                style = MaterialTheme.typography.bodyMedium,
                maxLines = 2,
                overflow = TextOverflow.Ellipsis
            )

            Row {
                Text(
                    text = "R$ %.2f".format(item.produto.preco),
                    style = MaterialTheme.typography.bodyLarge
                )

                Text(
                    text = "   Quantidade: ${item.quantidade}",
                    style = MaterialTheme.typography.bodyLarge
                )
            }

            if (item.produto.descontoPercentual > 0) {
                Text(
                    text = "Desconto: ${item.produto.descontoPercentual}%",
                    style = MaterialTheme.typography.labelMedium
                )
            }
        }
    }
}