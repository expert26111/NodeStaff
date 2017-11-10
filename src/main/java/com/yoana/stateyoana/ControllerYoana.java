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
public class ControllerYoana 
{
    
        //private String stateyoana;
        private static ContextYoana yoanahomework = new ContextYoana();
        private static boolean stateN = false;
        public static int DIDNOTCHANGECHANNEL = 999;
//        public String getStateyoana() 
//        {
//            return stateyoana;
//        }
//
//        public void setStateyoana(String stateyoana)
//        {
//            this.stateyoana = stateyoana;
//        }
        
         public static String getStateString(boolean state)
         {
                if(state)
                {
                    stateN = state;
                    StateYoana TVStartState = new TVStartStateYoana();
                    yoanahomework.setYoanastate(TVStartState);
                }else
                {
                    stateN = state;
                    StateYoana TVOFFState = new TVOFFStateYoana();
                    yoanahomework.setYoanastate(TVOFFState);
                }
                  return yoanahomework.doAction();
         }
         
            public static int getChannel(int number)
         {
             if(stateN)
                {
                       if(number == 1)
                       {
                          IncreaseChannel chan = new IncreaseChannel();
                          yoanahomework.setYoanaChannel(chan);
                        //  chan.changeChanel();
                       }else
                       {
                           DecreaseChannel chan = new DecreaseChannel();
                           yoanahomework.setYoanaChannel(chan);
                       }
                         return yoanahomework.changeChanel();
                }else
             {
                 System.out.println("Error trying to change channel and remote is OFF");
                 return DIDNOTCHANGECHANNEL;
             }
         }
    
}
