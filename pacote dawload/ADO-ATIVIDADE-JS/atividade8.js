
import { media,situacao } from "./atividade8Func";

let nota1 = 6;
let nota2 = 3;
let nota3 = 9;

let MediaNota = media(nota1,nota2,nota3);
let situacaoAluno= situacao(MediaNota);

console.log(`A média do Aluno é : ${MediaNota}`)
console.log(`Situação : ${situacaoAluno}`)


