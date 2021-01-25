package com.rest.demo.business;

import com.rest.demo.bean.Greeting;

public class GreetingBusiness {
    public Greeting greeting(String message, String auteur) {
        Greeting grt = new Greeting();
        grt.setAuteur(auteur);
        grt.setMessage("Hello  " + message);
        return grt;
    }

    public Greeting badGreeting() {
        Greeting grt = new Greeting();
        grt.setMessage("name est obligatoire. Merci de le renseigner");
        return grt;
    }
}
