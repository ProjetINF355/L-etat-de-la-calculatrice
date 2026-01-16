
package com.example.calculatricebasique
data class Cal_etat(

    val firstNumber: String = "0",
    val secondNumber: String = "",
    val currentOperator: Cal_operation = Cal_operation.NONE,
    val calculationExpression: String = "0",
    val answer: String = ""
)
