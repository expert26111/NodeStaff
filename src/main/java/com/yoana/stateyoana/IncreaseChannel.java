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
public class IncreaseChannel extends StateChannel
{
    //we assume channels are from 1 to 99
    
    
    
      @Override
        public int changeChanel() 
        {
           if(channelNumber == 99)
           {
               System.out.println("Warning System trying to increase channel already 99 you cna only decrease");
               return channelNumber;
               
           }else
           {
               System.out.println("Information System is increasing channel");
               channelNumber = channelNumber + 1;
               updateSomeVar(channelNumber);
               return channelNumber;
//                 increaseChannelNumber();
//                 System.out.println("the shit is "+getChannelNumber());
//                 return getChannelNumber();
           }
           
           
        }
    
}
