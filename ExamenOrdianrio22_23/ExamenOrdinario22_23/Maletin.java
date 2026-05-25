public class Maletin implements ITaller {
    private int tornillos;
    private int clavos;
    public Maletin() {
        this.tornillos = MAX_TORNILLOS;
        this.clavos = MAX_CLAVOS;
    }
    public int getTornillos() {
        return this.tornillos;
    }
    public int getClavos() {
        return this.clavos;
    }
    public void setTornillos(int tornillos) {
        this.tornillos = tornillos;
    }
    public void setClavos(int clavos) {
        this.clavos = clavos;
    }
    public String toString() {
        return "Maletin{" + "tornillos=" + tornillos + ", clavos=" + clavos + '}';
    }
}
