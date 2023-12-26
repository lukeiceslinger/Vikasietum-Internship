public class PhraseOMatic{
    public static void main(String[] args){
        String[] wordListOne = {"24/7","multi- Tiar","30,OOO foot","B-to-B","win-win","front- end", "web-based","pervasive", "smart", "six- sigma", "cri tical-path" , "dynamic" };
        String[] wordListTwo = {"empowered", "sticky", "value-added.", "oriented", "centric", "distributed","clustered", "networked", "targeted", "branded", "outaide-the-box", "positioned","focused", "leveraged", "aligned", "shared", "cooperative", "accelerated"};
        String[] wordListThree = {"solution", "architecture", "strategy", "mindshare", "portal" , "mission", "paradigm", "space", "vision", "process", "tipping-point", "core competency"};

        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;

        int randOne = (int) (Math.random() * oneLength);
        int randTwo = (int) (Math.random() * twoLength);
        int randThree = (int) (Math.random() * threeLength);

        String phrase = wordListOne[randOne] + " " + wordListTwo[randTwo] + " " + wordListThree[randThree];

        System.out.println("The randomly generated phrase: " + phrase);
    }
}