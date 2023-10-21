
export function calcular(peso){
    let precoPor100g = 3.50;
    let descontoPorKg = 0.50;

    if (peso <= 0) {
        return "PESO INVÁLIDO";
    } else {
        const precoTotal = (peso / 100) * precoPor100g;

       
        if (peso >= 1000) {
            let desconto = Math.floor(peso / 1000) * descontoPorKg;
            return `TOTAL A PAGAR: R$${(precoTotal - desconto).toFixed(2)}`;
        } else {
            return `TOTAL A PAGAR: R$${precoTotal.toFixed(2)}`;
        }
    }
}