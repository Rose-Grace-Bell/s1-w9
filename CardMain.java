public class CardMain{
    public static void main(String[] args) {
        Card c1 = new Card(10,3);
        Card c2 = new Card(9,2);
        boolean isb = c1.outranks(c2);
        boolean oisb = c2.outranks(c1);
        System.out.println(isb);
        System.out.println(oisb);
        
    }

}