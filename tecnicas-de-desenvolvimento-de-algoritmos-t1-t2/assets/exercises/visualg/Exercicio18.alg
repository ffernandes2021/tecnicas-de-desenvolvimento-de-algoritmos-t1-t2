algoritmo "Exercicio18"
    var vet: vetor [0..149] de real
    peso: real
    i, posicao: inteiro
inicio
    para i de 0 ate 149 faca
        escreva("Digite o peso: ")
        leia(peso)
        vet[i] <- peso
    fimpara
    peso <- vet[0]
    para i de 0 ate 149 faca
        se vet[i] < peso entao
            peso <- vet[i]
            posicao <- i
        fimse
    fimpara
    escreva("Na posição",posicao," está o menor peso, que é",peso)
fimalgoritmo