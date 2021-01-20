public abstract class Creatures {
    public String name;
    public Creatures(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public abstract String toString();

    @Override
    public boolean equals(Object obj){
        return obj != null && this.getClass() == obj.getClass();
    }
    @Override
    public int hashCode() {
        return super.hashCode();
    }
}