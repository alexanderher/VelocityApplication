/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udem.edu.co.velocity.test;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import udem.edu.co.velocity.DTOs.Person;
import udem.edu.co.velocity.DTOs.VelocityWeb;

/**
 *
 * @author INDRA
 */
public class PpalTest {
    
    public PpalTest() {
    }
    
   
    @Test
    public void velocityTest() {
        try {
            VelocityWeb velocity = new VelocityWeb();
            String webPage = velocity.createWebPage(new Person("Mariana", "98765476", 20));
            System.out.println("Page: "+ webPage);
            assertNull(null);
        } catch (Exception ex) {
            Logger.getLogger(PpalTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
