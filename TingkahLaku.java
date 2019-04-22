
package manusia;

public class TingkahLaku extends Manusia{
    public int mata;
    protected int tangan;
    public int telinga;
    protected int mulut;
    protected int kaki;
    
  public TingkahLaku(){
  mata = 2;
  tangan = 2;
  kaki = 2;
  mulut = 1;
  telinga = 2;
  }
    void Berjalan(){
        System.out.println("Manusia berjalan menggunakan ="+ kaki + "kaki");
    }
    void Tangan(){
        System.out.println("Manusia Normal mempunyai ="+ tangan +   "buah tangan");
    }
    void Melihat(){
        System.out.println("Manusia Normal Melihat Dengan ="+ mata +    "Mata");
    }
    void Makan (){
        System.out.println("Manusia normal memiliki ="+ mulut + "mulut");
    }
    void Telinga (){
        System.out.println("Manusia Normal mendengar dan memiliki ="+ telinga + "dua buah telinga");
    }
    
}
