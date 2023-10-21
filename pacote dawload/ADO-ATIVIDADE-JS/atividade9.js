import { imc, situacao } from "./atividade9Func.js";

let alturaPessoa = 180; 
let pesoPessoa = 80.5; 

let resultadoImc = imc(alturaPessoa, pesoPessoa);
let situacaoIMC = situacao(resultadoImc);

console.log(`Seu IMC é ${resultadoImc.toFixed(2)}`);
console.log(`Sua Classificação é ${situacaoIMC}`);


