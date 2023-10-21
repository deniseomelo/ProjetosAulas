export function media (nota1,nota2,nota3){
    return (nota1+nota2+nota3) / 3;   
}
export function situacao(media){
     
    if(media >= 8){
        return 'APROVADO COM SUCESSO'
    } else if(media >= 6 && media < 8){
        return 'APROVADO'
    } else if(media >= 3 && media  < 6){
        return 'RECUPERAÇAO'
    } else if(media < 3){
        return 'REPROVADO'
    } else {
        return 'DESISTENTE'
    }
    
}