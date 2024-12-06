package Materia.Models.Stack;

import java.util.EmptyStackException;

import Materia.Models.NodeGeneric;

public class StackGeneric <T>{

    private NodeGeneric<T> top; //Moo Generico
    private int size; //variable tamaño O(1)

    //CREA UNA PILA INSTACIANDO EL NODO TOP COMO NULL Y TAMAÑO EN 0.
    public StackGeneric(){
        this.top=null;
        this.size=0;
    }

    //Metodo para apagar un elemto a la pila.
    public void push(T data){
        NodeGeneric<T> newNode=new NodeGeneric<>(data);
        newNode.setNext(top);
        top=newNode;
        size++;
    }

    public T pop(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        T value = top.getValue();
        top=top.getNext();
        size--;
        return value;
    }

    public T peek(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        return top.getValue();
    }
     
    public boolean isEmpty(){
        return top == null;
    }
    
}
