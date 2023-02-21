package com.galvanize;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CreditCardMaskTest {

    @Test
    public void origionalTest() {
        assertEquals("############5616", CreditCardMask.maskify("4556364607935616"));
        assertEquals("#######5616",      CreditCardMask.maskify(     "64607935616"));
        assertEquals("1",                CreditCardMask.maskify(               "1"));
        assertEquals("",                 CreditCardMask.maskify(                ""));

        // "What was the name of your first pet?"
        assertEquals("##ippy",                                    CreditCardMask.maskify("Skippy")                                  );
        assertEquals("####################################man!",  CreditCardMask.maskify("Nananananananananananananananana Batman!"));
    }

    @Test
    public void refactoredTest() {
        assertEquals("############5616", CreditCardMask.maskifyRefactored("4556364607935616"));
        assertEquals("#######5616",      CreditCardMask.maskifyRefactored(     "64607935616"));
        assertEquals("1",                CreditCardMask.maskifyRefactored(               "1"));
        assertEquals("",                 CreditCardMask.maskifyRefactored(                ""));

        // "What was the name of your first pet?"
        assertEquals("##ippy",                                    CreditCardMask.maskifyRefactored("Skippy")                                  );
        assertEquals("####################################man!",  CreditCardMask.maskifyRefactored("Nananananananananananananananana Batman!"));
    }

    @Test
    public void oneLineTest() {
        assertEquals("############5616", CreditCardMask.maskifyOneLine("4556364607935616"));
        assertEquals("#######5616",      CreditCardMask.maskifyOneLine(     "64607935616"));
        assertEquals("1",                CreditCardMask.maskifyOneLine(               "1"));
        assertEquals("",                 CreditCardMask.maskifyOneLine(                ""));

        // "What was the name of your first pet?"
        assertEquals("##ippy",                                    CreditCardMask.maskifyOneLine("Skippy")                                  );
        assertEquals("####################################man!",  CreditCardMask.maskifyOneLine("Nananananananananananananananana Batman!"));
    }
}