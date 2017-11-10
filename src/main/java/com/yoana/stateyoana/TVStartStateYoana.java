/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yoana.stateyoana;

/**
 *
 * @author Yoana
 */
public class TVStartStateYoana implements StateYoana
{

    @Override
    public String doAction()
    {
        return "ON";
       // System.out.println("TV is turned ON");
    }
   
}
