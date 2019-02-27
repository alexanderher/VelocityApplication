/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udem.edu.co.velocity.DTOs;

/**
 *
 * @author INDRA
 */
public class Person {
    private String name;
    private String identification;
    private int edge;

    public Person() {
    }

    public Person(String name, String identification, int edge) {
        this.name = name;
        this.identification = identification;
        this.edge = edge;
    }
    
    //getters and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdentification() {
        return identification;
    }

    public void setIdentification(String identification) {
        this.identification = identification;
    }

    public int getEdge() {
        return edge;
    }

    public void setEdge(int edge) {
        this.edge = edge;
    }
    
}
