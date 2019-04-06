import junitparams.JUnitParamsRunner;
import junitparams.Parameters;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;


@RunWith(JUnitParamsRunner.class)

public class NumberOfWordsAnalyzerTest {
    private NumberOfWordsAnalyzer analyzer;

    @Before
    public void setUp() {
        analyzer = new NumberOfWordsAnalyzer();
    }

    @Test
    public void analyseTest() {
    }

    @Test
    public void interpretTest() {
    }
}