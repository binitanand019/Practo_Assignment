package com.practo.scripts;

import com.practo.base.BaseTest;
import com.practo.page.BrokenLinks;
import org.testng.annotations.Test;

/**
 * Created by binitanand on 24/10/17.
 */
public class BrokenLinkValidation extends BaseTest {

    @Test
    public void brokenLinkValidation() {

        BrokenLinks bk = new BrokenLinks(driver);
        bk.isLinksBroken();

    }
}
