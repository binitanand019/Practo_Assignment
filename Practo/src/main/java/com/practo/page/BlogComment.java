package com.practo.page;

import com.practo.base.BasePage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by binitanand on 24/10/17.
 */
public class BlogComment extends BasePage {

    public BlogComment(WebDriver driver) {
        super(driver);
    }

    @FindBy(how = How.ID, using = "email")
    private WebElement EMAIL_ID;

    @FindBy(how = How.ID, using = "pass")
    private WebElement PASSWORD;

    @FindBy(how = How.ID, using = "loginbutton")
    private WebElement LOGIN_BUTTON;

    @FindBy(how = How.XPATH, using = "//span[text()='Compose post']")
    private WebElement COMPOSE_BLOG;

    @FindBy(how = How.XPATH, using = "//div[@id='placeholder-77s7']")
    private WebElement BLOG_TEXT;

    @FindBy(how = How.XPATH, using = "//span[text()='Post']")
    private WebElement POST_BUTTON;

    @FindBy(how = How.XPATH,using = "//div[@class='UFILikeLink _4x9- _4x9_ _48-k']")
    private WebElement LIKE_BUTTON;

    @FindBy(how =How.XPATH,using = "//div[@class='UFIAddCommentInput _1osb _2xww _5yk1']")
    private WebElement COMMENT;

    @FindBy(how = How.XPATH,using = "//a[@class='UFILikeLink UFIReactionLink']")
    private WebElement COMMENT_LIKE;

    @FindBy(how = How.XPATH,using = "//span[@class='UFICommentBody']/span")
    private  WebElement COMMENTED_TEXTS;

    public void login(String un, String pwd) {

        checkElementIsPresent(EMAIL_ID);
        EMAIL_ID.sendKeys(un);

        checkElementIsPresent(PASSWORD);
        PASSWORD.sendKeys(pwd);

        checkElementIsPresent(LOGIN_BUTTON);
        LOGIN_BUTTON.click();
    }

    public void blogCreation() {

        checkElementIsPresent(COMPOSE_BLOG);
        COMPOSE_BLOG.click();
        checkElementIsPresent(BLOG_TEXT);
        BLOG_TEXT.sendKeys("24 hours in Washington D.C.");
        checkElementIsPresent(POST_BUTTON);
        POST_BUTTON.click();

    }

    public void likePost() {

        checkElementIsPresent(LIKE_BUTTON);
        LIKE_BUTTON.click();

    }

    public void commentOnPost() {
        int count=2;
        for(int i=1;i<=count;i++) {
            if(i==1) {
                checkElementIsPresent(COMMENT);
                COMMENT.sendKeys("[Binit]:This is Awesome Blog,EveryOne should read it", Keys.RETURN);
                checkElementIsPresent(COMMENT_LIKE);
                COMMENT_LIKE.click();
            }
            else {
                checkElementIsPresent(COMMENT);
                COMMENT.sendKeys("[Anand]:Totally Agree.EveryOne should read it", Keys.RETURN);
                checkElementIsPresent(COMMENT_LIKE);
                COMMENT_LIKE.click();
            }

            }

    }

    public String getCommenttexts() {

        checkElementIsPresent(COMMENTED_TEXTS);
        String commentTexts = COMMENTED_TEXTS.getText();

        return commentTexts;

    }
}

