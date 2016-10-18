/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.    
 */

package calculator.idl;

/**
* calculator/idl/CalculatorCORBAServiceHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from CalculatorCORBA.idl
* roda, 15 padziernik 2008 15:59:26 CEST
*/

public final class CalculatorCORBAServiceHolder implements org.omg.CORBA.portable.Streamable
{
  public calculator.idl.CalculatorCORBAService value = null;

  public CalculatorCORBAServiceHolder ()
  {
  }

  public CalculatorCORBAServiceHolder (calculator.idl.CalculatorCORBAService initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = calculator.idl.CalculatorCORBAServiceHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    calculator.idl.CalculatorCORBAServiceHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return calculator.idl.CalculatorCORBAServiceHelper.type ();
  }

}