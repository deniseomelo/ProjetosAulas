 export function calcular(tipo, qtd) {
  const precoIngresso = 28.50;

  if (tipo !== "meia" && tipo.toLowerCase() !== "inteira") {
      return -1;
  }

  let totalPagar = qtd * precoIngresso;

  if (tipo === "meia") {
      totalPagar /= 2;
  }

  return totalPagar;
}


