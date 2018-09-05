package de.cw.sql;

import java.io.IOException;

public class Helper
{
    public static void whatever (String ip)
    {
        StringBuffer sb = new StringBuffer ();
        sb.append ("for x in $(ping -c ")
          .append (ip)
          .append (") do sed 's/\\./___/g'; done");
        
        dingens (sb.toString ());
    }
    
    private static void dingens (String cmd)
    {
        try {
            Runtime.getRuntime ().exec (cmd);
        }
        catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
