package br.com.rd.rdevs.ExercicioJavalang;

public class ExercicioJavalang {
    public static void main(String[] args) {
        String teste = " Batata Doce ";
        String num = "0123456789";
        String vazio = "";
        System.out.println(teste.contains("Batata"));
        String [] apaga;
        apaga = teste.split(" ");
        System.out.println(apaga[1]);
        System.out.println(apaga[2]);
        vazio.isEmpty();
        System.out.println(vazio.isEmpty() + " " + teste.isEmpty());
        System.out.println(teste.length());

        for (int i = 0; i < teste.length(); i++) {
            System.out.println(teste.charAt(i));
        }
        for (int i = teste.length()-1; i >= 0; i--) {
            System.out.println(teste.charAt(i));
        }


        String valor = "762";
        int init = 0;
        int aux = 1;

        for (int i =  valor.length()-1; i >=0; i--,aux*=10) {
            init += (valor.charAt(i)-'0') * aux;
        }
        System.out.println(init);
    }
}
/*
2. (opcional) Escreva um método que usa os métodos charAt e length de uma String para
imprimir a mesma caractere a caractere, com cada caractere em uma linha diferente.

3. (opcional) Reescreva o método do exercício anterior, mas modificando ele para que imprima a String de
trás para a frente e em uma linha só. Teste-a para "Socorram-me, subi no ônibus em Marrocos" e "anotaram a data da maratona".

4. Converta uma String para um número sem usar as bibliotecas do java que já fazem isso. Isso é, uma String x = "762" deve gerar um int i = 762.
•	Para ajudar, saiba que um char pode ser "transformado" em int com o mesmo valor numérico.
*/