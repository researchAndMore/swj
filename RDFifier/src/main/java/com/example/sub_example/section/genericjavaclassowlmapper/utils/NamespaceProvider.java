package com.example.sub_example.section.genericjavaclassowlmapper.utils;

import lombok.Getter;
import lombok.Setter;

public class NamespaceProvider {

    private static NamespaceProvider instance;
    @Getter
    @Setter
    private String baseNamespace;
    private NamespaceProvider() {
        baseNamespace = WISERNamespaces.WISER_BASE;
    }

    public static synchronized NamespaceProvider getInstance() {
        if (instance == null) {
            instance = new NamespaceProvider();
        }
        return instance;
    }
}
