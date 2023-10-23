package use_case.clear_users;

// TODO Complete me

import use_case.login.LoginOutputBoundary;
import use_case.login.LoginUserDataAccessInterface;
import use_case.signup.SignupInputData;

public class ClearInteractor implements ClearInputBoundary {
    final ClearUserDataAccessInterface userDataAccessObject;
    final ClearOutputBoundary userPresenter;

    public ClearInteractor(ClearUserDataAccessInterface userDataAccessInterface,
                           ClearOutputBoundary clearOutputBoundary) {
        this.userDataAccessObject = userDataAccessInterface;
        this.userPresenter = clearOutputBoundary;
    }

    @Override
    public void execute(SignupInputData signupInputData) {
        String username = null;
        String password = null;
    }
}
