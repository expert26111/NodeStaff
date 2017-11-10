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
public class DecreaseChannel extends StateChannel
{
    
//        private int channelNumberD;
        
//        public DecreaseChannel()
//        {
//            channelNumberD = channelNumber;
//        }
    
    
      @Override
        public int changeChanel() 
        {
           if(channelNumber == 0)
           {
               System.out.println("Warning System trying to decrease channel already 0 you can only increase");
               return channelNumber;
               
           }else
           {
                 System.out.println("Information System is decreasing channel");
                
                channelNumber = channelNumber - 1;
                updateSomeVar(channelNumber);
                return channelNumber;
//               channelNumber = channelNumber - 1;
//               return channelNumber;
//                 decreaseChannelNumber();
//                 return getChannelNumber();
           }
           
           
        }
    
}
