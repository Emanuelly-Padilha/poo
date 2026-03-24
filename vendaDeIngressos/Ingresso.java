package vendaDeIngressos;

/* 

## **Passo 2 – Crie o ingresso VIP**

1. Crie uma **subclasse de Ingresso** chamada `IngressoVIP`.
2. Esta classe precisa de:

   * **Taxa VIP** (atributo `double taxaVIP`).
3. No método `consultarValor()`:

   * Retorne **valor base + taxa VIP**.
4. Crie também um método `mostrarValoresAdicionais()` que imprime apenas a taxa VIP.

💡 Dica: você pode usar o **método da superclasse** para pegar o valor base e somar a taxa VIP.

---

## **Passo 3 – Crie o ingresso camarote inferior**

1. Crie uma **subclasse de Ingresso** chamada `IngressoCamaroteInferior`.
2. Esta classe precisa de:

   * **Localização** (atributo `String localizacao`).
3. O método `consultarValor()` retorna apenas o **valor base** (não há taxa VIP).
4. Crie um método `exibirLocalizacao()` que imprime a localização.

💡 Dica: este ingresso **não precisa de taxa VIP**, então apenas guarde a localização.

---

## **Passo 4 – Crie o ingresso camarote VIP**

1. Crie uma **subclasse de Ingresso** chamada `IngressoCamaroteVIP`.
2. Esta classe precisa de:

   * **Taxa VIP**
   * **Localização**
3. No método `consultarValor()`, retorne **valor base + taxa VIP**.
4. Crie métodos:

   * `mostrarValoresAdicionais()` → mostra a taxa VIP.
   * `exibirLocalizacao()` → mostra a localização.

💡 Dica: aqui você combina tudo que já fez no VIP e no camarote inferior.

---

## **Passo 5 – Preparar o main para testes**

1. Crie uma **classe `Main`** com o método `main`.

2. Dentro do `main`:

   * Crie **uma instância de cada tipo de ingresso**:

     * Ingresso normal
     * VIP
     * Camarote inferior
     * Camarote VIP

3. Para cada ingresso:

   * Chame o método `consultarValor()` → veja se o valor está correto.
   * Se for VIP, chame `mostrarValoresAdicionais()`.
   * Se for camarote, chame `exibirLocalizacao()`.

💡 Dica: isso vai garantir que **cada tipo de ingresso se comporte corretamente**.

---

## **Passo 6 – Tornar interativo com o usuário (opcional)**

1. Importe o `Scanner` para ler valores do usuário.
2. Pergunte ao usuário:

   * Valor base do ingresso
   * Taxa VIP, se for VIP
   * Localização, se for camarote
3. Crie os ingressos com os valores digitados pelo usuário.
4. Mostre os resultados usando os métodos que você criou.

💡 Dica: explique ao usuário como funciona cada tipo:

* “O ingresso VIP tem uma taxa adicional.”
* “O camarote possui localização, digite bloco e fila.”

---

## **Passo 7 – Testes finais**

1. Teste **todos os tipos de ingresso** com valores reais.
2. Teste também:

   * Ingresso VIP sem taxa (0)
   * Camarote com nomes diferentes
3. Veja se os métodos retornam corretamente:

   * Valor total
   * Taxa VIP
   * Localização

💡 Dica: isso vai garantir que o sistema está funcionando para qualquer combinação de ingresso.

---

Se você quiser, posso agora fazer um **roteiro de main passo a passo**, mostrando **exatamente a sequência de ações que você faria para cada ingresso**, mas ainda sem código pronto, só para você seguir.

Quer que eu faça isso?
 */

public class Ingresso {
    double valorBase; 

 
    public Ingresso(double valorBase) {
        this.valorBase = valorBase;
    }

   
    public double consultarValor() {
        return this.valorBase;
    }
}
