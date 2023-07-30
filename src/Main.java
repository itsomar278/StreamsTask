import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Card> cards = new ArrayList<>();
        cards.add(new Card("1", "FingerPrint1",new Date(123, 0, 4)));
        cards.add(new Card("2", "FingerPrint2",new Date(123, 0, 4)));
        cards.add(new Card("3", "FingerPrint3",new Date(123, 0, 4)));
        cards.add(new Card("4", "FingerPrint1", new Date(123, 6, 4)));
        cards.add(new Card("5", "FingerPrint2", new Date(123, 6, 4)));

        Map<String, Card> uniqueCards = cards.stream()
                .collect(Collectors.toMap(card->card.getFingerPrint(), card -> card,
                        (Old, New) -> {
                           if (Old.getExpiryDate().after(New.getExpiryDate())) {
                                    return Old;
                                }
                                else {
                                    return New;
                                }
                        }
                ));

       List<Card> result = uniqueCards.values().stream().toList();
       for(int i = 0 ; i<uniqueCards.size();i++) {
           System.out.println(" Finger print : " + result.get(i).getFingerPrint() + " , Expiry Date : " + result.get(i).getExpiryDate());
       };
       }

    }
