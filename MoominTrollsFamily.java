public class MoominTrollsFamily extends Creatures implements Forgot{
    public MoominTrollsFamily(String name) {
        super(name);
    }

    public String getName() {
        return name;
    }

    public String forgot() {
        return "забыли";
    }

    public void MoominTrollsFeltUncomfortable(String instant, String felt, String uncomfortable) {
        System.out.print(" и на какое-то"+" "+instant+" "+toString()+" "+felt+" "+uncomfortable+".");
    }

    public void TheyLook(String confusion, String look) {
        System.out.print(" Они"+" "+"в"+" "+confusion+" "+look+" "+"ей вслед"+",");
    }

    public void TheyForgot() {
        System.out.print(" А потом"+" "+"они"+" "+"обо всем"+" "+forgot()+".");
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || this.getClass() != obj.getClass()) {
            return false;
        }
        MoominTrollsFamily moomintrollsfamily = (MoominTrollsFamily) obj;
        return this.getName() == moomintrollsfamily.getName();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
