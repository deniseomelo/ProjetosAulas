export function situacaoFebre(temperatura){

        if (temperatura >= 41) {
            return 'HIPERTEMIA';
        } else if (temperatura >= 39.6 && temperatura < 41) {
            return 'FEBRE ALTA';
        } else if (temperatura >= 37.6 && temperatura < 39.6) {
            return 'FEBRE';
        } else if (temperatura >= 36 && temperatura < 37.6) {
            return 'NORMAL';
        } else {
            return 'HIPORTEMIA';
        }
    }

