import static com.kazurayam.junit4ks.JUnitCustomKeywords.runWithJUnitRunner

import com.kazurayam.visualtesting.GlobalVariableHelpersTest
import com.kazurayam.visualtesting.HelpersTest
import com.kazurayam.visualtesting.HighlightElementsTest
import com.kazurayam.visualtesting.VTConfigTest
import com.kazurayam.visualtesting.VisualTestingListenerImplTest

runWithJUnitRunner(GlobalVariableHelpersTest.class)
runWithJUnitRunner(HelpersTest.class)
runWithJUnitRunner(HighlightElementsTest.class)
runWithJUnitRunner(VisualTestingListenerImplTest.class)
runWithJUnitRunner(VTConfigTest.class)
