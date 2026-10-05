package com.example.calculadoracarrinho.data

import android.util.Log

fun gerarRelatorio() {

    val produtosComDesconto = carrinho.filter {
        it.produto.descontoPercentual > 0
    }

    val valoresComDesconto = produtosComDesconto.map {
        it.produto.nome to it.calcularTotal()
    }

    val valoresOrdenados = valoresComDesconto.sortedByDescending {
        it.second
    }

    val totalComDesconto = valoresOrdenados
        .map { it.second }
        .reduce { acumulador, valor ->
            acumulador + valor
        }

    Log.d("CARRINHO", "=== PRODUTOS COM DESCONTO ===")

    valoresOrdenados.forEach { (nome, valor) ->
        Log.d(
            "CARRINHO",
            "$nome - Valor final: R$ %.2f".format(valor)
        )
    }

    Log.d(
        "CARRINHO",
        "Total dos produtos com desconto: R$ %.2f".format(totalComDesconto)
    )
}