export function semaforo(cor){

    switch (cor.toLowerCase()) {
        case 'vermelho':
            return 'Espere';
        case 'verde':
            return 'Atravesse';
        default:
            return 'Farol inoperante';
    }
}
