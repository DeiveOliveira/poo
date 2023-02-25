public class Jogador {
    private String nome;
    
    private int xp = 0;
    private int hp = 100;   
    private boolean envenenado = true;
    
    public Jogador(){
        
    }
    
    public Jogador(String nome){
        this.nome = nome;
    }

    public void receberDano(int pontos){
        this.hp -= pontos;
    }
    
    public void receCura(int pontos){
        this.hp += pontos;
    }
    
    public void receExperiencia(int pontos){
        this.xp += pontos;
    }
    public void receberAntidoto(){
        envenenado = !envenenado;
    }
    public int getXp(){
        return this.xp;
    }
    
    public int getHp(){
        return this.hp;
    }

    public boolean isEnvenenado(){
        return this.envenenado;
    }
    
    public String getNome() {
        return nome;
    }
}