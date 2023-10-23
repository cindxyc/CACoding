package interface_adapter.clear_users;

import use_case.clear_users.ClearInputBoundary;
import use_case.signup.SignupInputData;

public class ClearController {

    final ClearInputBoundary clearUseCaseInteractor;
    public ClearController(ClearInputBoundary clearUseCaseInteractor) {
        this.clearUseCaseInteractor = clearUseCaseInteractor;
    }


    public void execute(String username, String password1, String password2) {
        SignupInputData clearInputData = new SignupInputData(
                null, null, null);

        clearUseCaseInteractor.execute(clearInputData);
    }
}