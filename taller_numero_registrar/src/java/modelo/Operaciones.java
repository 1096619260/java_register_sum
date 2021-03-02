/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author oscar sanabria
 */
public class Operaciones {
 int num1;
      int num2;
         int result;
    public Operaciones(int num1, int num2, int result) {
        this.num1 = num1;
        this.num2 = num2;
        this.result = 0;
    }

  
    


    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }
    
  public void sumar(){
        this.result=this.num1+this.num2;
    }
    
     public int mostrar(){
         
         return this.result;
     }
   
}
