public class Something{
    public void DoingSomething(String mutter, String tapping, String broom) {
        System.out.print(" "+toString()+" "+mutter+" "+"и"+" "+tapping+" "+broom+",");
    }

    @Override
    public String toString(){
        return "Что-то";
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