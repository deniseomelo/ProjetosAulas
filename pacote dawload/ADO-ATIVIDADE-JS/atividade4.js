import { orcamento } from "./atividade4Func";
import prompt from 'prompt-sync';
let ler = prompt();



let totalGanhos = 1000;
let  totalGastos = 2000;

let situacao = orcamento(totalGanhos,totalGastos);

console.log(situacao);