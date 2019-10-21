package com.company.DataStore;

import com.company.Interactor.IDataStore;

public class DataStore implements IDataStore {
    public String HelloOperation(String myName) {
        return String.format("Data store, reporting for duty, %s!", myName);
    }
}
