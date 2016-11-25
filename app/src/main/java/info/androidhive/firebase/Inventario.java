package info.androidhive.firebase;

import java.util.concurrent.atomic.AtomicInteger;


public class Inventario {
    String Nome;
    String Tipo;
    float Preco;
    int Qt;
    private final static AtomicInteger Code  = new AtomicInteger(0);

    public Inventario(String nome, String tipo, float preco, int quantidade) {
        Nome = nome;
        Tipo = tipo;
        Preco = preco;
        Qt = quantidade;
        //Code = code;
    }

    public int getCode() {
        return Code.incrementAndGet();
    }

    //public void setCode(int code) {Code = code;}

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {Nome = nome;}

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String tipo) {
        Tipo = tipo;
    }

    public float getPreco() {return Preco;}

    public void setPreco(float preco) {Preco = preco;}

}
