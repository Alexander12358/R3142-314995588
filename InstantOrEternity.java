public enum InstantOrEternity {
    INSTANT("мгновение"), ETERNITY("вечность");
    private final String translation;

    InstantOrEternity(String translation){
        this.translation=translation;
    }

    public String getTranslation(){
        return translation;
    }

}
