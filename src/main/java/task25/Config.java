package task25;

import org.springframework.context.annotation.Bean;

import java.util.List;

public class Config {
    @Bean
    public Cards createCard1() {
        return new Cards("Ace", Suit.DIAMONDS);
    }

    @Bean
    public Cards createCard2() {
        return new Cards("Jack", Suit.CLUBS);
    }

    @Bean
    public Cards createCard3() {
        return new Cards("King", Suit.CLUBS);
    }

    @Bean
    public Cards createCard4() {
        return new Cards("Joker", Suit.SPADES);
    }

    @Bean
    public Deck createdDeck(List<Cards> cards) {
        return new Deck(cards);
    }
}
