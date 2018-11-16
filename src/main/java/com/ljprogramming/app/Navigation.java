package com.ljprogramming.app;

public final class Navigation {

    private static Navigation instance;

    public Navigation(){
    }

    public static Navigation getInstance(){
        if(instance == null){
            instance = new Navigation();
        }

        return instance;
    }

    public void loadScreen(String viewName){

    }

}
