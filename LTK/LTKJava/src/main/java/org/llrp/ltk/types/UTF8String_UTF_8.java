package org.llrp.ltk.types;

import org.jdom.Element;


public class UTF8String_UTF_8 extends UTF8String {
    protected UTF8String_UTF_8() {
        string = "";
    }

    /**
         * Creates a new UTF8String object.
         *
         * @param subList to be decoded
         */
    public UTF8String_UTF_8(LLRPBitList subList) {
        super(subList);
    }

    /**
     * Creates a new UTF8String object from jdom element - used for xml decoding
     *
     * @param element to be decoded
     */
    public UTF8String_UTF_8(Element element) {
        super(element);
    }

    /**
         * Creates a new UTF8String object.
         *
         * @param string to be represented
         */
    public UTF8String_UTF_8(String string) {
        super(string);
    }

    /**
     * length in number of bits used to represent this type.
     *
     * @return
     */
    public static Integer length() {
        return LENGTH;
    }
}
