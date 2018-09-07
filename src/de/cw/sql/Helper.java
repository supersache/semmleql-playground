package de.cw.sql;

import java.io.IOException;

public class Helper
{
    private String cmd;
    
    public void setIp (String ip)
    {
        this.cmd = Helper.whatever (ip);
    }
    
    public static String whatever (String ip)
    {
        StringBuffer sb = new StringBuffer ();
        sb.append ("for x in $(ping -c ")
          .append (ip)
          .append (") do sed 's/\\./___/g'; done");
        
        return sb.toString ();
    }
    
    private void dingens ()
    {
        String cmd = this.cmd;
        
        try {
            Runtime.getRuntime ().exec (cmd);
        }
        catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
