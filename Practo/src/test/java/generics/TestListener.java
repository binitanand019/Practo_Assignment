package generics;

import com.practo.base.AutomationConstants;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

/**
 * Created by binitanand on 23/10/17.
 */


    public class TestListener implements ITestListener{


        public void onTestStart(ITestResult result) {
        }

        public void onTestSuccess(ITestResult result) {
        }

        public void onTestFailure(ITestResult result) {
            Utility.getScreenShot(AutomationConstants.SNAP_PATH);
        }

        public void onTestSkipped(ITestResult result) {
        }

        public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        }

        public void onStart(ITestContext context) {
        }

        public void onFinish(ITestContext context) {
        }

    }

