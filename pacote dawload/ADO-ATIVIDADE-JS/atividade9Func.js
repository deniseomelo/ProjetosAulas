export function imc(altura, peso) {
    let alturaMetros = altura / 100;
    return peso / (alturaMetros * alturaMetros);
}

export function situacao(imc) {
    if (imc >= 40) {
        return 'OBESIDADE GRAU III';
    } else if (imc >= 35 && imc < 39.9) {
        return 'OBESIDADE GRAU II';
    } else if (imc >= 30 && imc < 34.9) {
        return 'OBESIDADE GRAU I';
    } else if (imc >= 25 && imc < 29.9) {
        return 'SOBREPESO';
    } else if (imc >= 18.5 && imc < 24.9) {
        return 'PESO NORMAL';
    } else {
        return 'ABAIXO DO PESO';
    }
}