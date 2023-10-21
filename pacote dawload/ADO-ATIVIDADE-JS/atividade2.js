import prompt from 'prompt-sync';
import { semaforo } from './atividade2Func';
let ler = prompt()


let corSemaforo = 'Vermelho'; 
let acaoPedestre = semaforo(corSemaforo);
console.log(acaoPedestre);
