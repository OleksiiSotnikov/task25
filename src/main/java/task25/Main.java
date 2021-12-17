package task25;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {
    public static void main(String[] args) {
        ApplicationContext contextXML = new ClassPathXmlApplicationContext("beans.xml");
        ApplicationContext contextJava = new AnnotationConfigApplicationContext(Config.class);
        Deck deckXML = contextXML.getBean(Deck.class);
        Deck deckJava = contextJava.getBean(Deck.class);
        deckJava.mixCards();
        deckXML.mixCards();
        System.out.println(deckJava);
        System.out.println(deckXML);
    }
}