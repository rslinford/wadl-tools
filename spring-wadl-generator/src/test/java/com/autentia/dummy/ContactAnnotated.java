/**
 *    Copyright 2013 Autentia Real Business Solution S.L.
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */
package com.autentia.dummy;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
public class ContactAnnotated {

    public static final String EXPECTED_SCHEMA = "<?xml version=\"1.0\" standalone=\"yes\"?>\n" +
            "<xs:schema version=\"1.0\" xmlns:xs=\"http://www.w3.org/2001/XMLSchema\">\n" +
            '\n' +
            "  <xs:element name=\"contactAnnotated\" type=\"contactAnnotated\"/>\n" +
            '\n' +
            "  <xs:complexType name=\"contactAnnotated\">\n" +
            "    <xs:sequence>\n" +
            "      <xs:element name=\"name\" type=\"xs:string\" minOccurs=\"0\"/>\n" +
            "      <xs:element name=\"email\" type=\"xs:string\" minOccurs=\"0\"/>\n" +
            "    </xs:sequence>\n" +
            "  </xs:complexType>\n" +
            "</xs:schema>\n\n";

    public static final String EXPECTED_COLLECTION_SCHEMA = "<?xml version=\"1.0\" standalone=\"yes\"?>\n" +
            "<xs:schema version=\"1.0\" xmlns:xs=\"http://www.w3.org/2001/XMLSchema\">\n" +
            '\n' +
            "  <xs:element name=\"contactAnnotatedCollection\" type=\"contactAnnotatedCollection\"/>\n" +
            '\n' +
            "  <xs:complexType name=\"contactAnnotatedCollection\">\n" +
            "    <xs:sequence>\n" +
            "      <xs:element name=\"contactAnnotated\" type=\"contactAnnotated\" minOccurs=\"0\" maxOccurs=\"unbounded\"/>\n" +
            "    </xs:sequence>\n" +
            "  </xs:complexType>\n" +
            "</xs:schema>\n\n";

    private final String name;
    private final String email;

    public ContactAnnotated(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public ContactAnnotated() {
        this("unknown name", "unknown email");
    }

}
