algoritmo "Exercicio9"
    var alturaAnacleto, alturaFelisberto: real
    i: inteiro
inicio
    alturaAnacleto <- 1.50
    alturaFelisberto <- 1.10
    i <- 0
    repita
        i <- i + 1
        alturaAnacleto <- alturaAnacleto + 0.02
        alturaFelisberto <- alturaFelisberto + 0.03
    ate alturaFelisberto > alturaAnacleto
    escreva("Quantidade de anos: ",i)
fimalgoritmo
