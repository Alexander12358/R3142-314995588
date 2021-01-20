public class Felt extends Actions {
    public String MoominTrollsFelt(){
        return "стало";
    }
    public String MoominTrollsNotFelt(){
        return "не стало";
    }

    @Override
    public String toString(){
        return "чувствовать";
    }
    @Override
    public boolean equals(Object obj){
        return obj != null && this.getClass() == obj.getClass();
    }
    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
