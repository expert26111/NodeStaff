
package com.yoana.stateyoana;

/**
 *
 * @author Yoana
 */
public class ContextYoana extends StateChannel implements StateYoana
{ 
       private StateYoana yoanastate;
       private StateChannel channel;
       
       public StateYoana getYoanastate() 
       {
           return yoanastate;
       }

       public void setYoanastate(StateYoana yoanastate) 
       {
           this.yoanastate = yoanastate;
       }
       
        public void setYoanaChannel(StateChannel channel) 
       {
           this.channel = channel;
       }

       @Override
       public String doAction()
       {
          return  this.yoanastate.doAction();
       }

        @Override
        public int changeChanel() 
        {
           return this.channel.changeChanel();
        }

}
