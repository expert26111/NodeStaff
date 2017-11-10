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
public class TVOFFStateYoana implements StateYoana
{

        @Override
        public String doAction() 
        {
            return "OFF";
            //System.out.println("TV is turned OFF");
        }
    
}
