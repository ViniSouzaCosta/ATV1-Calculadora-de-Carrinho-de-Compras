package com.example.calculadoracarrinho.model

fun calcularSubtotal(item: ItemCarrinho): Double {
    return item.produto.preco * item.quantidade
}

fun calcularDesconto(item: ItemCarrinho): Double {
    val subtotal = calcularSubtotal(item)

    return subtotal * (item.produto.descontoPercentual / 100)
}

fun calcularTotalCarrinho(itens: List<ItemCarrinho>): Double {
    return itens.sumOf { it.calcularTotal() }
}

fun calcularDescontoCarrinho(itens: List<ItemCarrinho>): Double {
    return itens.sumOf { calcularDesconto(it) }
}

fun calcularSubtotalCarrinho(itens: List<ItemCarrinho>): Double {
    return itens.sumOf { calcularSubtotal(it) }
}