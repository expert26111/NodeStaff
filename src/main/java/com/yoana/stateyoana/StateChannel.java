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
public abstract class  StateChannel 
{
       public static  volatile int channelNumber = 0;
        
       
         public void updateSomeVar(int newvar)
         {
              channelNumber = newvar;
         }
       
        public abstract int changeChanel();
//        
//        public void increaseChannelNumber()
//        {
//            channelNumber = channelNumber + 1;
//        }
//        
//        public void decreaseChannelNumber()
//        {
//            channelNumber = channelNumber - 1;
//        }
//        
//        public int getChannelNumber()
//        {
//            return channelNumber;
//        }
//        
        
}
