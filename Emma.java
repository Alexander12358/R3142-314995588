public class Emma extends Creatures implements CameRunning{
    public Emma(String name) {
        super(name);
    }

    public String getName() {
        return name;
    }

    public String camerunning() {
        return "прибежала";
    }

    public void EmmaRanImmediately() {
        System.out.print("Тотчас"+" "+camerunning()+" "+toString()+".");
    }

    public void HobbledDarkness(String hobbled, String darkness){
        System.out.print(" "+toString()+" "+hobbled+" "+"в"+" "+darkness+".");
    }

    @Override
    public String toString(){
        return name;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || this.getClass() != obj.getClass()) {
            return false;
        }
        Emma emma = (Emma)obj;
        return this.getName() == emma.getName();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
