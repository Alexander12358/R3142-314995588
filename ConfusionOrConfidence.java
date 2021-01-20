public enum ConfusionOrConfidence {
    CONFUSION("растерянности"),
    CONFIDENCE("уверенности");
    private final String translation;

    ConfusionOrConfidence(String translation){
        this.translation=translation;
    }

    public String getTranslation(){
        return translation;
    }
}
