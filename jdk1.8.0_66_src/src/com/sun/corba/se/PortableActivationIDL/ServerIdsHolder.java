package com.sun.corba.se.PortableActivationIDL;


/**
* com/sun/corba/se/PortableActivationIDL/ServerIdsHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from c:/re/workspace/8-2-build-windows-amd64-cygwin/jdk8u66/5298/corba/src/share/classes/com/sun/corba/se/PortableActivationIDL/activation.idl
* Monday, November 9, 2015 10:52:06 AM PST
*/


/** Sequence of server Ids, used for queries about servers.
    */
public final class ServerIdsHolder implements org.omg.CORBA.portable.Streamable
{
  public String value[] = null;

  public ServerIdsHolder ()
  {
  }

  public ServerIdsHolder (String[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = com.sun.corba.se.PortableActivationIDL.ServerIdsHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    com.sun.corba.se.PortableActivationIDL.ServerIdsHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return com.sun.corba.se.PortableActivationIDL.ServerIdsHelper.type ();
  }

}