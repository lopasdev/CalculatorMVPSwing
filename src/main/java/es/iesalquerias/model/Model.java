/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.iesalquerias.model;

/**
 *
 * @author lopas
 */

public class Model {
    private double n1; 
    private double n2;
    private double res;
    private String operation;
    
    public double getN1() {
        return n1;
    }

    public void setN1(double n1) {
        this.n1 = n1;
    }

    public double getN2() {
        return n2;
    }

    public void setN2(double n2) {
        this.n2 = n2;
    }

    public double getRes() {
        return res;
    }

    public void setRes(double res) {
        this.res = res;
    }

    public String getOperacion() {
        return operation;
    }

    public void setOperacion(String operacion) {
        this.operation = operacion;
    }
    
}