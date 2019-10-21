package com.company.Plugin;

import com.company.Interactor.IPlugin;

import javax.inject.Singleton;

@Singleton
public class Plugin implements IPlugin {
    public String GetHello(String myName) {
        return String.format("Hello from Plugin, %s!", myName);
    }
}
