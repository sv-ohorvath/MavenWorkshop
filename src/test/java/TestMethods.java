public class TestMethods {

    public static String getURL(){
       return Matchers.driver.getCurrentUrl();
    }

    public static void typeEmail(String email) {
        Matchers.emailForm.sendKeys(email);
    }

    public static void typePassword(String password) {
        Matchers.passwordForm.sendKeys(password);
    }

    public static void clickSignIn() {
        Matchers.signInButton.click();
    }

    public static void login(String email, String password){
        TestMethods.typeEmail(email);
        TestMethods.typePassword(password);
        TestMethods.clickSignIn();
    }

    public static String loginError(){
       return Matchers.signInError.getText();
    }

    public static String getPageTitle(){
       return Matchers.driver.getTitle();
    }






}
