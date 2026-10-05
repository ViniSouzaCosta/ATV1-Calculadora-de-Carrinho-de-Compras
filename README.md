# Calculadora de Carrinho de Compras

## Aluno

Vinícius de Souza Camargo Costa

## Descrição

Aplicativo Android desenvolvido em Kotlin com Jetpack Compose para calcular os valores de um carrinho de compras.

O aplicativo possui um catálogo de produtos, permite representar os itens adicionados ao carrinho e realiza o cálculo do subtotal, descontos e valor total final.

## Tecnologias utilizadas

- Kotlin
- Android Studio
- Jetpack Compose
- Material 3

## Estrutura do projeto

O projeto foi organizado separando as responsabilidades:

- `model`: contém as entidades e regras relacionadas aos produtos e itens do carrinho.
- `data`: contém o catálogo, os itens do carrinho e a geração do relatório no Logcat.
- `components`: contém componentes visuais reutilizáveis.
- `screens`: contém a tela principal do carrinho.
- `ui.theme`: contém a configuração visual do aplicativo.

## Funcionalidades

- Cadastro de produtos em um catálogo fixo.
- Aplicação de descontos percentuais.
- Cálculo do subtotal.
- Cálculo dos descontos.
- Cálculo do valor total final.
- Exibição dos produtos utilizando Jetpack Compose.
- Geração de relatório dos produtos com desconto no Logcat.
- Ordenação dos produtos com desconto pelo maior valor final.

## Validação

Para validar os cálculos, foi utilizado o seguinte cenário:

- Notebook Dell Inspiron: R$ 3.499,00, desconto de 5%, quantidade 2.
- Mouse sem fio: R$ 89,90, sem desconto, quantidade 1.
- Teclado mecânico RGB: R$ 349,90, sem desconto, quantidade 1.

Resultado esperado:

- Subtotal: R$ 7.437,80
- Descontos: R$ 349,90
- Valor total final: R$ 7.087,90

## Screenshots

### Aplicativo

![Aplicativo funcionando](app/app.png)

### Logcat

![Logcat](app/logcat.png)

## Como executar

1. Abra o projeto no Android Studio.
2. Aguarde a sincronização do Gradle.
3. Execute o aplicativo em um emulador Android.
4. O aplicativo exibirá o carrinho de compras na tela.
5. O relatório dos produtos com desconto será exibido no Logcat.

