package org.wildstang.framework.hardware;


public class WsRemoteDigitalOutputConfig implements OutputConfig
{
   private String m_networktbl = "RemoteIO";
   private boolean m_default;

   public WsRemoteDigitalOutputConfig(String networktbl, boolean p_default)
   {
      m_networktbl = networktbl;
      m_default = p_default;
   }

   public String getTableName()
   {
      return m_networktbl;
   }

   public boolean getDefault()
   {
      return m_default;
   }

   @Override
   public String toString()
   {
      StringBuffer buf = new StringBuffer();

      buf.append("{\"networktbl\": ");
      buf.append(m_networktbl);
      buf.append("}");

      return buf.toString();
   }

}
