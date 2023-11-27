package com.taiye.ogunlade.java.ds.ThinkJava.chap8;

public class ArrayOfObjects {
    public static void main(String[] args) {
        Card threeOfClubs = new Card(3, 0);
        String[] suits = new String[]{"Clubs", "Diamonds", "Hearts", "Spades"};
        String[] ranks = {null, "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
        Card[] cards = new Card[52];

        Card.createCards(cards);


    }


    public static class Card {
        private final int rank;
        private final int suit;

        public Card(int rank, int suit) {
            this.rank = rank;
            this.suit = suit;
        }


        public static final String[] RANKS = {null, "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};

        public static final String[] SUITS = {null, "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};


        @Override
        public String toString() {
            return RANKS[this.rank] + " of " + SUITS[this.suit];
        }

        public boolean equals(Card that) {
            return this.rank == that.rank
                    && this.suit == that.suit;
        }


        public int getRank() {
            return rank;
        }

        public int getSuit() {
            return suit;
        }

        public static void createCards(Card[] cards) {
            int index = 0;
            if (cards[0] == null) {
                System.out.println("No card yet!");
            }

            for (int suit = 0; suit <= 3; suit++) {
                for (int rank = 0; rank <= 13; rank++) {
                    cards[index] = new Card(rank, suit);
                    index++;
                }
            }

        }

        public static void printDeck(Card[] cards) {
            for (int i = 0; i < cards.length; i++) {
                System.out.println(cards[i]);
            }
        }

        public static int search(Card[] cards, Card target) {
            for (int i = 0; i < cards.length; i++) {
                if (cards[i].equals(target)) {
                    return i;
                }
            }
            return -1;
        }

        public int compareTo(Card that) {
            if (this.suit < that.suit) {
                return -1;
            }
            if (this.suit > that.suit) {
                return 1;
            }
            if (this.rank < that.rank) {
                return -1;
            }

            return 0;
        }

        public static int binarySearch(Card[] cards, Card target) {
            int low = 0;
            int high = cards.length - 1;

            while (low <= high) {
                int mid = (low + high) / 2;
                int comp = cards[mid].compareTo(target);

                if (comp == 0) {
                    return mid;
                } else if (comp < 0) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
            return -1;
        }
    }
}
