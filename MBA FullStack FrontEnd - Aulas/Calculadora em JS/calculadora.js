let numero1 = parseFloat(prompt("Digite o primeiro número:"));
let numero2 = parseFloat(prompt("Digite o segundo número:"));


let soma = numero1 + numero2;
let subtracao = numero1 - numero2;
let multiplicacao = numero1 * numero2;
let divisao = null; // será definida caso possível


if (numero2 !== 0) {
  divisao = numero1 / numero2;
} else {
  console.log("⚠️ Erro: não é possível dividir por zero.");
}


console.log(`📌 Números escolhidos: ${numero1} e ${numero2}`);
console.log(`➕ Soma: ${soma}`);
console.log(`➖ Subtração: ${subtracao}`);
console.log(`✖️ Multiplicação: ${multiplicacao}`);
if (divisao !== null) {
  console.log(`➗ Divisão: ${divisao}`);
}


let escolha = prompt(
  "Qual operação deseja realizar?\nDigite:\n1 - Adição\n2 - Subtração\n3 - Multiplicação\n4 - Divisão"
);

switch (escolha) {
  case "1":
    console.log(`Resultado da Adição: ${soma}`);
    break;
  case "2":
    console.log(`Resultado da Subtração: ${subtracao}`);
    break;
  case "3":
    console.log(`Resultado da Multiplicação: ${multiplicacao}`);
    break;
  case "4":
    if (numero2 !== 0) {
      console.log(`Resultado da Divisão: ${divisao}`);
    } else {
      console.log("⚠️ Não é possível dividir por zero!");
    }
    break;
  default:
    console.log("Opção inválida! Escolha entre 1, 2, 3 ou 4.");
}
