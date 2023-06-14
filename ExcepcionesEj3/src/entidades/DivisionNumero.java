/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author OvExX
 */
public class DivisionNumero {
    private String num1;
    private String num2;

    public DivisionNumero() {
    }
    
    public void parsearYdividir(){
        int primerNum = Integer.parseInt(num1);
        int segundoNum = Integer.parseInt(num2);
        double division = primerNum/segundoNum;
        System.out.println(num1+" dividido en "+num2+" da como resultado "+division);
    }
    
    public String getNum1() {
        return num1;
    }

    public void setNum1(String num1) {
        this.num1 = num1;
    }

    public String getNum2() {
        return num2;
    }

    public void setNum2(String num2) {
        this.num2 = num2;
    }
    
    
}
