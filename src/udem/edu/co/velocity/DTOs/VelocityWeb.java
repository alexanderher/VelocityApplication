/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udem.edu.co.velocity.DTOs;

import java.io.StringWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;
import org.apache.velocity.exception.ParseErrorException;
import org.apache.velocity.exception.ResourceNotFoundException;

/**
 *
 * @author INDRA
 */
public class VelocityWeb {
    VelocityEngine velocity;
    /**
     * Contructor sin parametros para inicializar el objeto
     */
    public VelocityWeb() {
        try {
            velocity = new VelocityEngine();
            velocity.init();
        } catch (Exception ex) {
            System.out.println("No pude iniciar el velocity");
            Logger.getLogger(VelocityWeb.class.getName()).log(Level.SEVERE, null, ex);
        }
    }        
    
    public String createWebPage(Person person) throws Exception {
        System.out.println("ok");
                
        System.out.println("ok3");
        
        Template t = velocity.getTemplate("resources\\web.vm");

        VelocityContext velocityContext = new VelocityContext();
        velocityContext.put("name",person.getName());
        velocityContext.put("identification",person.getIdentification());
        velocityContext.put("edge",person.getEdge());

        StringWriter sw = new StringWriter();
        t.merge(velocityContext, sw);

        return sw.toString();   
        
    }
}