package dataproviders;


import org.testng.annotations.DataProvider;

public class DataProviderClass {

    @DataProvider(name = "usersCredentialsAndExpectedErrors")
    public static Object[][] userInvalidCredentionals() {

        String login = "qatestllc@gmail.com";
        String password = "123456";
        String error = "Username and password combination was not found.";

        String login1 = "dancalya+7896@gmail.com";
        String password1 = "zxc123";
        String error1 = "Your account has been removed.";

        return new Object[][]{{login, password, error},
                {login1, password1, error1},
                {"dancalya+227@gmail.com", "123456", "You must confirm the email."},
                {"dancalya+229@gmail.com", "123456", "Account is waiting for approval by administrator."},
                {"dancalya+2@gmail.com", "123456", "Your account has been blocked."}};
    }

    @DataProvider(name = "validUserData")
    public static Object[][] userValidCredentionals() {
        return new Object[][]{{"qa@storied.co", "zxc123", "QA Storied"}};
    }

    @DataProvider(name = "SEO")
    public static Object[][] seoValues() {
        return new Object[][]{{"on","test description", "h1 test", "h2 test", "http://baseurl.com", "111", "111", "wait"}};
    }

    @DataProvider(name = "Sharing Options")
    public static Object[][] sharingOptionsValues() {
        return new Object[][]{{" ","graph title test", "description test", " ", " ", "twitter message", "Email", "email body"}};
     }
}

