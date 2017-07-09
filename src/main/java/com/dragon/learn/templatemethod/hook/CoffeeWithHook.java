package com.dragon.learn.templatemethod.hook;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by dragon on 17-7-9.
 */
public class CoffeeWithHook extends CaffeineBeverageWithHook {
    @Override
    void brew() {
        System.out.println("Dripping coffe through filter");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding Sugar and Milk");
    }

    @Override
    boolean customerWantsCondiments() {
        String answer = getUserInput();
        if(answer.toLowerCase().startsWith("y")){
            return true;
        }else {
            return false;
        }

    }


    public String getUserInput() {
        String answer = null;
        System.out.println("Would you like milk and suger with your coffee");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            answer = in.readLine();
        } catch (IOException e) {

        }
        if(answer == null){
            return "no";
        }
        return answer;
    }
}
