package com.company.Interactor;

import com.company.ClientBoundary.IInteractor;
import com.google.inject.Injector;

import javax.inject.Singleton;

@Singleton
public class Interactor implements IInteractor {
    private Injector appInjector;

    public void SetAppInjector(Injector newInjector) {
        this.appInjector = newInjector;
    }

    public String GetHelloFromInteractor(String myName) {
        return String.format("Interactor here, hello '%s'!", myName);
    }

    public String GetHelloFromInteractorPlugin(String myName) {
        IPlugin plugin = this.appInjector.getInstance(IPlugin.class);
        return plugin.GetHello(myName);
    }

    public String GetHelloFromDataStore(String myName) {
        IDataStore dataStore = this.appInjector.getInstance(IDataStore.class);
        return dataStore.HelloOperation(myName);
    }
}
