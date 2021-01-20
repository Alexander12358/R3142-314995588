public enum HobbledOrCrawled {
    HOBBLED("заковыляла"), CRAWLED("поползла");
    private final String translation;

    HobbledOrCrawled(String translation){
        this.translation=translation;
    }

    public String getTranslation(){
        return translation;
    }
}