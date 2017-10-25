package com.practo.scripts;

import com.practo.base.BaseTest;
import com.practo.page.BlogComment;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by binitanand on 24/10/17.
 */
public class FBBlogCommentLike extends BaseTest {

    @Test(priority = 1)
    public void fbBlogCommentLikevalidation() {

        BlogComment bc = new BlogComment(driver);
        bc.blogCreation();
        bc.likePost();
        bc.commentOnPost();
        Assert.assertEquals(bc.getCommenttexts(), "[Binit]:This is Awesome Blog,EveryOne should read it");
    }
}