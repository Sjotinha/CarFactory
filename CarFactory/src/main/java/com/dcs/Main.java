package com.dcs;
public class Main {
    public static void main(String[] args) {
        System.out.println("Vamos criar um carro");
        millCarros();
    }
    public static void printar(Carro carro) {
        System.out.println("V:"+ carro.velocidade + " P:" + carro.peso + " T:" + carro.tamanho + " M:" +carro.marca);
    }
    private static void millCarros(){
        for (int i = 0; i < 10; i++){
            Carro carro = new Carro(90, 50, 60, Marca.fiat);
            printar(carro);
        }
    }
}