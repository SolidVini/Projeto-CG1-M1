//A classe Shot é ativada quando a tecla Espaço é precionada
package spaceinvaders;

/**
 *
 * @author Vinicius
 */
import javax.swing.ImageIcon;

public class Shot extends Sprite {

    private final String shotImg = "src/images/tiro.png";
    private final int H_SPACE = 6;
    private final int V_SPACE = 1;

    public Shot() {
    }

    public Shot(int x, int y) {

        initTiro(x, y);
    }

    private void initTiro(int x, int y) {

        ImageIcon ii = new ImageIcon(shotImg);
        setImage(ii.getImage());
        
        setX(x + H_SPACE);
        setY(y - V_SPACE);
    }
}
