package com.example.calculadoracarrinho.data

import com.example.calculadoracarrinho.model.Produto

val catalogo = listOf(
    Produto(
        nome = "Notebook Dell Inspiron",
        preco = 3499.00,
        descricao = "Notebook Dell para uso profissional",
        descontoPercentual = 5.0
    ),

    Produto(
        nome = "Mouse sem fio",
        preco = 89.90,
        descricao = "Mouse sem fio ergonômico"
    ),

    Produto(
        nome = "Teclado mecânico RGB",
        preco = 349.90,
        descricao = "Teclado mecânico com iluminação RGB"
    ),

    Produto(
        nome = "Monitor Gamer Ultrawide de Alta Resolução",
        preco = 1899.90,
        descricao = "Monitor ultrawide para jogos",
        descontoPercentual = 10.0
    ),

    Produto(
        nome = "Webcam",
        preco = 299.90,
        descricao = null
    ),

    Produto(
        nome = "Headset Gamer",
        preco = 499.90,
        descricao = "Headset com microfone"
    )
)
