package com.example.calculadoracarrinho.model

data class ItemCarrinho(
    val produto: Produto,
    val quantidade: Int
) : Pagavel {

    override fun calcularTotal(): Double {
        val subtotal = produto.preco * quantidade
        val desconto = subtotal * (produto.descontoPercentual / 100)

        return subtotal - desconto
    }
}