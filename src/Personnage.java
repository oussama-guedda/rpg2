public class Personnage {
    private int HP;
    private int Niveau ;
    private boolean alive ;

    public Personnage(){
       this.HP = 1000;
       this.Niveau = 1;
       this.alive = true;
    }
    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public int getNiveau() {
        return Niveau;
    }

    public void setNiveau(int niveau) {
        Niveau = niveau;
    }

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Personnage{" +
                "HP=" + HP +
                ", Niveau=" + Niveau +
                ", alive=" + alive +
                '}';
    }
}
