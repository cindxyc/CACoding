package interface_adapter.clear_users;

import use_case.clear_users.ClearInputBoundary;
import use_case.signup.SignupInputData;

public class ClearController {

    final ClearInputBoundary userClearUseCaseInteractor;
    public ClearController(ClearInputBoundary userClearUseCaseInteractor) {
        this.userClearUseCaseInteractor = userClearUseCaseInteractor;
    }


    public void execute(String username, String password1, String password2) {
        SignupInputData signupInputData = new SignupInputData(
                null, null, null);

        userClearUseCaseInteractor.execute(signupInputData);
    }
}