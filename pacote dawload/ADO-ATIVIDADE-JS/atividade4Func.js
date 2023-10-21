export function orcamento(ganhos, gastos){
    if(ganhos >= gastos){
        return 'Você está dentro do orçamento!'
    }
    else {
        return 'Você está fora do orçamento! não gaste mais!!!'
    }
}