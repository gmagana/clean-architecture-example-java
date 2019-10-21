package com.company.CommandLineScript1;

import com.company.ClientAppContainer.ClientAppInjector;
import com.company.ClientBoundary.IInteractor;
import com.google.inject.Guice;
import com.google.inject.Injector;

public class Main {
    public static void main(String[] args) {
        System.out.println("===== CommandLineScript1 =====");

        Injector injector = Guice.createInjector(new ClientAppInjector());
        IInteractor interactor = injector.getInstance(IInteractor.class);
        interactor.SetAppInjector(injector);

        System.out.println(String.format("Pinging interactor: %s", interactor.GetHelloFromInteractor("Console Application")));
        System.out.println(String.format("Pinging interactor: %s", interactor.GetHelloFromInteractorPlugin("Console Application")));
        System.out.println(String.format("Pinging interactor: %s", interactor.GetHelloFromDataStore("Console Application")));
    }
}
