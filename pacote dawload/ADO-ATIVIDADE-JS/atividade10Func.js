export function diaSemana(dia) {
    const diasDaSemana = ["Domingo", "Segunda-feira", "Terça-feira", "Quarta-feira", "Quinta-feira", "Sexta-feira", "Sábado"];
    if (dia >= 0 && dia <= 6) {
      return diasDaSemana[dia];
    } else {
      return "Dia da semana inválido";
    }
  }
  
  export function mes(mes) {
    let  mesesDoAno = [
      "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho",
      "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"
    ];
    if (mes >= 1 && mes <= 12) {
      return mesesDoAno[mes - 1];
    } else {
      return "Mês inválido";
    }
  }
  
  export function msgEnvio(dia, diaSemana, mes, ano) {
    return `Enviado ${diaSemana}, ${dia} de ${mes} de ${ano}.`;
  }
  