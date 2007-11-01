/*
 * Copyright 2007 ETH Zurich
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 *
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and limitations under the License.
 */
package org.llrp.ltk.types;

import org.jdom.Namespace;


/**
 * Super Type for all numerical types!
 *
 * @author gasserb
 */
public abstract class LLRPNumberType extends LLRPType {
    protected boolean signed;

    /**
     * LLRPNumberType is super type of all types representing a number.
     *
     * @return Integer!
     */
    public abstract Integer toInteger();

    /**
     * compare two numbers.
     *
     * @param other to compare
     *
     * @return boolean
     */
    public boolean equals(LLRPNumberType other) {
        String a = this.encodeXML("value", Namespace.getNamespace("foo"))
                       .getValue();
        String b = other.encodeXML("value", Namespace.getNamespace("foo"))
                        .getValue();

        return a.equalsIgnoreCase(b);
    }

    public int hashCode() {
        return this.encodeXML("value", Namespace.getNamespace("foo")).getValue()
                   .hashCode();
    }
}
