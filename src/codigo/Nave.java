/*
 * La nave del juego
 */
package codigo;

import java.awt.Image;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author Diego Álvarez
 */
public class Nave {
    
    public Image imagen = null;
    public int x = 0;
    public int y = 0;
    
    private boolean pulsadoIzquierda = false;
    private boolean pulsadoDerecha = false;
    
    public Nave(){
        try {
        imagen = ImageIO.read(getClass().getResource("/imagenes/nave.png"));
        }
        catch(IOException ramon){
        }
    }
}
