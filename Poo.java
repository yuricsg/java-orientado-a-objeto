
package com.mycompany.projetopoo;

public class ProjetoPoo {

    public static void main(String[] args) {
        Horista h = new Horista("João", 20);
        Mensalista m = new Mensalista("Marcos",33);
        
        
        h.realizarTarefa();
        m.realizarTarefa();
    }
}


package com.mycompany.projetopoo;
//Atributos
public class Funcionario {
    private String nome;
    private int idade;

//Construtor
    public Funcionario(String nome, 
            int idade) {
        this.nome = nome;
        this.idade = idade;
    }
    
    
    
//Métodos especiais
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    
    public void realizarTarefa(){
        System.out.println("Realizando uma tarefa...");
    }
}


package com.mycompany.projetopoo;

//Classe herança

import java.util.Scanner;

public class Horista extends Funcionario {
    private double salarioHora;

//Construtor
    public Horista(String nome, int idade) {
        super(nome, idade);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o salário por hora para o funcionário horista " + nome + ": ");
        this.salarioHora = scanner.nextDouble();
    }
    
    public double calcularSalario(int horasTrabalhadas){
        return salarioHora * horasTrabalhadas;
    }
    
    @Override
    public void realizarTarefa(){
       // Solicitar horas trabalhadas
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o número de horas trabalhadas para o funcionário horista " + this.getNome() + ": ");
        int horasTrabalhadas = scanner.nextInt();

        // Calcular salário
        double salario = calcularSalario(horasTrabalhadas);
        System.out.println("\nFuncionário horista " + getNome() + 
                " realizando tarefa por hora. " + 
                "\nSalário: R$" + salario);
    }
}


package com.mycompany.projetopoo;
//Classe herança

import java.util.Scanner;

public class Mensalista extends Funcionario{
    private double salarioMensal;
//Construtor
    public Mensalista(String nome, int idade) {
        super(nome, idade);
        // Solicitar informações adicionais durante a criação da instância
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o salário mensal para o funcionário mensalista " + nome + ": ");
        this.salarioMensal = scanner.nextDouble();
    }
    
    @Override
    public void realizarTarefa(){
         System.out.println("Funcionário mensalista " + getNome() 
                 + " realizando tarefa mensal." + 
                   "\nSalário: R$" + salarioMensal);
         
    }
}
