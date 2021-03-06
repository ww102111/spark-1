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
package dbecho;

import javax.xml.stream.XMLStreamReader;

import org.apache.tuscany.sca.databinding.annotation.DataBinding;
import org.osoa.sca.annotations.Remotable;
import org.w3c.dom.Node;

/**
 * @version $Rev: 538844 $ $Date: 2007-05-17 10:12:08 +0100 (Thu, 17 May 2007) $
 */
@DataBinding("org.w3c.dom.Node")
@Remotable
public interface Interface2 {
    Node call(Node msg);
    @DataBinding("javax.xml.stream.XMLStreamReader")
    XMLStreamReader call1(XMLStreamReader msg);
}
