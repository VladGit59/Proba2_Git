package com.vovinp;


public class Main {

    public static void main(String[] args) {
        // write your code here
        Button button = new Button(new ButtonClickHandler());
        button.click();
        button.click();
        button.click();

        Button tvButton = new Button(new EventHandler() {
            private boolean on = false;

            public void execute() {
                if (on) {
                    System.out.println("TV on");
                    on = false;
                } else {
                    System.out.println("TV off");
                    on = true;
                }
            }
        });
        tvButton.click();
        tvButton.click();

        Button printButton = new Button(new EventHandler(){
            public void execute() {
                System.out.println("Print button was pushed");
            }
        });
        printButton.click();
    }
}

class ButtonClickHandler implements EventHandler {
    public void execute() {
        System.out.println("Кнопка нажата!");
    }
}

interface EventHandler {
    void execute();
}

class Button {
    EventHandler handler;

    Button(EventHandler action) {
        this.handler = action;
    }

    public void click() {
        handler.execute();
    }
}