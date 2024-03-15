import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckItTest {

    @Test
    public void predicateAndClauseCoverage(){
        assertTrue(CheckIt.checkIt(true, true, true));
        assertFalse(CheckIt.checkIt(false, false, false));
    }

    @Test
    public void combinatorialCoverage(){
        assertTrue(CheckIt.checkIt(true, true, true));
        assertTrue(CheckIt.checkIt(true, true, false));
        assertTrue(CheckIt.checkIt(true, false, true));
        assertTrue(CheckIt.checkIt(true, false, false));
        assertTrue(CheckIt.checkIt(false, true, true));
        assertFalse(CheckIt.checkIt(false, true, false));
        assertFalse(CheckIt.checkIt(false,false,true));
        assertFalse(CheckIt.checkIt(false,false,false));
    }

    @Test
    public void correlatedActiveClauseCoverage(){
        assertTrue(CheckIt.checkIt(true, true, false));
        assertTrue(CheckIt.checkIt(true, false, true));
        assertTrue(CheckIt.checkIt(true, false, false));

        assertFalse(CheckIt.checkIt(false, true, false));
        assertFalse(CheckIt.checkIt(false, false, true));
        assertFalse(CheckIt.checkIt(false, false, false));
    }

    @Test
    public void restrictedActiveClauseCoverage(){
        assertTrue(CheckIt.checkIt(true, true, false));
        assertTrue(CheckIt.checkIt(true, false, true));
        assertTrue(CheckIt.checkIt(true, false, false));

        assertFalse(CheckIt.checkIt(false, true, false));
        assertFalse(CheckIt.checkIt(false,false,true));
        assertFalse(CheckIt.checkIt(false,false,false));
    }

}