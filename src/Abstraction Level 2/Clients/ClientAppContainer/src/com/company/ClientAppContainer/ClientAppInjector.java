package com.company.ClientAppContainer;

import com.company.ClientBoundary.IInteractor;
import com.company.DataStore.DataStore;
import com.company.Interactor.IDataStore;
import com.company.Interactor.IPlugin;
import com.company.Interactor.Interactor;
import com.company.Plugin.Plugin;
import com.google.inject.AbstractModule;

public class ClientAppInjector extends AbstractModule {

    @Override
    protected void configure() {
        // Bind implementations to interfaces
        bind(IInteractor.class).to(Interactor.class);
        bind(IDataStore.class).to(DataStore.class);

        // Add all Plugin instances here
        bind(IPlugin.class).to(Plugin.class);
    }
}
