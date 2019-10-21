package com.company.ClientBoundary;

import com.google.inject.Injector;

public interface IInteractor {
    void SetAppInjector(Injector newInjector);

    String GetHelloFromInteractor(String myName);

    String GetHelloFromInteractorPlugin(String myName);

    String GetHelloFromDataStore(String myName);
}
