package edu.joao.javabasics;
public class BoletimEstudantil {

    public static void main(String[] args) {

    int mediaFinal = 6;
        if (mediaFinal < 6)
            System.out.println("REPROVADO");
        else if (mediaFinal == 6)
            System.out.println("PROVA MINERVA");
        else
            System.out.println("APROVADO");
        
        byte idade = 123;
        short ano = 2021;
        int cep = 21070333; // se começar com zero, talvez tenha que ser outro tipo
        long cpf = 98765432109L; // se começar com zero, talvez tenha que ser outro tipo, tem que terminar com "L"
        float pi = 3.14F; // tem que encerrar com "F"
        double salario = 1275.33;
    }
}