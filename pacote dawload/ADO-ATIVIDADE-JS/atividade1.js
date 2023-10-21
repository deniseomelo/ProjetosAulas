
import { calcular } from './atividade1Func.js';
import prompt from 'prompt-sync';
let ler = prompt(); // Certifique-se de que o caminho do arquivo está correto


const tipoIngresso = "meia"; // ou "inteira"
const quantidadeIngressos = 2;
const total = calcular(tipoIngresso, quantidadeIngressos);

console.log("Total a pagar: R$" + total.toFixed(2));
