package Tests;

import Tests.Actions.action;

public class testScenarios extends action {

        public void gmailAutomate(){
            navigateURL("http://mail.google.com");
            waitDriverForGivenSeconds(3);
            loginGmail();
            waitDriverForGivenSeconds(2);
            enterPassword();
            waitDriverForGivenSeconds(5);
            composeEmail();
            waitDriverForGivenSeconds(3);
            CloseAndQuitDriver();

        }

    }


