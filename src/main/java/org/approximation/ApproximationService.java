package org.approximation;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class ApproximationService {

    public static String run(int numberOfIterations) {
        List<Card> cards = createDeck();
        List<Integer> probes = getListOfResults(numberOfIterations, cards);
        return getMainResult(probes, numberOfIterations);
    }

    private static List<Card> createDeck() {
        List<Card> cards = new ArrayList<>();
        for (Suit suit : Suit.values()) {
            for (Figure figure : Figure.values()) {
                Card card = new Card(suit, figure);
                cards.add(card);
            }
        }
        return cards;
    }

    private static List<Integer> getListOfResults(int numberOfIterations, List<Card> cards) {
        List<Integer> probes = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < numberOfIterations; i++) {
            probes.add(getPartialResult(cards, random));
        }
        return probes;
    }

    private static String getMainResult(List<Integer> probes, int numberOfIterations) {
        int sum = 0;
        for (Integer i : probes) {
            sum = sum + i;
        }
        return 100f / (sum / numberOfIterations) + "%";
    }

    private static int getPartialResult(List<Card> cards, Random random) {
        int counter = 1;
        while (!condition(cards, random)) {
            counter++;
        }
        return counter;
    }

    private static boolean condition(List<Card> cards, Random random) {
        return isFourOfKind(cards, random);
    }

    private static boolean isAceOfSpade(List<Card> cards, Random random) {
        int n = random.nextInt(52);
        return cards.get(n).getSuit().equals(Suit.SPADES) &&
                cards.get(n).getFigure().equals(Figure.ACE);
    }

    private static boolean isFourOfKind(List<Card> cards, Random random) {
        List<Integer> randoms = random.ints(0, 52)
                .distinct()
                .limit(4)
                .boxed()
                .collect(Collectors.toList());

        int n = randoms.get(0);
        int k = randoms.get(1);
        int l = randoms.get(2);
        int s = randoms.get(3);

        String cardN = cards.get(n).figure.name();
        String cardK = cards.get(k).figure.name();
        String cardL = cards.get(l).figure.name();
        String cardS = cards.get(s).figure.name();

        return cardN.equals(cardK) && cardN.equals(cardL) && cardN.equals(cardS);
    }
}
