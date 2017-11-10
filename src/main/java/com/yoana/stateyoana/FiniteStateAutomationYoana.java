
package com.yoana.stateyoana;

/**
 *
 * @author Yoana
 */
public class FiniteStateAutomationYoana 
{
    public static void main(String[] args) 
    {
        
       ContextYoana yoanahomework = new ContextYoana();
       StateYoana TVStartState = new TVStartStateYoana();
       StateYoana TVOFFState = new TVStartStateYoana();
       
       yoanahomework.setYoanastate(TVStartState);
       yoanahomework.doAction();
       
       
       	
      yoanahomework.setYoanastate(TVOFFState);
      yoanahomework.doAction();
        
    }
      
    
}
