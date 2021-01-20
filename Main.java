public class Main {
    public static void main(String[] args){
        Emma emma = new Emma("Эмма");
        MoominTrollsFamily moominTrollsFamily = new MoominTrollsFamily("семейству муми-троллей");
        Broom broom = new Broom();
        Darkness darkness = new Darkness();
        Felt felt = new Felt();
        Immediately immediately = new Immediately();
        Look look = new Look();
        Mutter mutter = new Mutter();
        Something something = new Something();
        Tapping tapping = new Tapping();
        Uncomfortable uncomfortable = new Uncomfortable();
        ConfusionOrConfidence confusion = ConfusionOrConfidence.CONFUSION;
        HobbledOrCrawled hobbled = HobbledOrCrawled.HOBBLED;
        InstantOrEternity instant = InstantOrEternity.INSTANT;

        emma.EmmaRanImmediately();
        something.DoingSomething(mutter.toString(), tapping.toString(), broom.toString());
        emma.HobbledDarkness(hobbled.getTranslation(), darkness.toString());
        moominTrollsFamily.TheyLook(confusion.getTranslation(), look.toString());
        moominTrollsFamily.MoominTrollsFeltUncomfortable(instant.getTranslation(), felt.MoominTrollsFelt(), uncomfortable.toString());
        moominTrollsFamily.TheyForgot();
    }
}