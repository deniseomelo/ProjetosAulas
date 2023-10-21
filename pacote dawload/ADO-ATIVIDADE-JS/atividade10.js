import { diaSemana,mes,msgEnvio } from "./atividade10Func";


let diaInformado = 22; 
let mesInformado = 10; 
let anoInformado = 1989; 

let diaDaSemanaTexto = diaSemana(diaInformado);
let nomeDoMes = mes(mesInformado);
let mensagem = msgEnvio(diaInformado, diaDaSemanaTexto, nomeDoMes, anoInformado);
console.log(mensagem);
