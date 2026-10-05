package com.example.calculadoracarrinho.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.calculadoracarrinho.components.ProdutoCard
import com.example.calculadoracarrinho.data.carrinho
import com.example.calculadoracarrinho.model.calcularDescontoCarrinho
import com.example.calculadoracarrinho.model.calcularSubtotalCarrinho
import com.example.calculadoracarrinho.model.calcularTotalCarrinho

@Composable
fun CarrinhoScreen() {

    val subtotal = calcularSubtotalCarrinho(carrinho)
    val desconto = calcularDescontoCarrinho(carrinho)
    val total = calcularTotalCarrinho(carrinho)

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {

        Text(
            text = "Calculadora de Carrinho",
            style = MaterialTheme.typography.headlineMedium
        )

        LazyColumn(
            modifier = Modifier.weight(1f),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {

            items(carrinho) { item ->
                ProdutoCard(item = item)
            }

        }

        Text(
            text = "Subtotal bruto: R$ %.2f".format(subtotal),
            style = MaterialTheme.typography.bodyLarge
        )

        Text(
            text = "Descontos aplicados: R$ %.2f".format(desconto),
            style = MaterialTheme.typography.bodyLarge
        )

        Text(
            text = "Valor Total Final: R$ %.2f".format(total),
            style = MaterialTheme.typography.titleLarge
        )
    }
}