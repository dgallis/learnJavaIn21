import java.applet.*;
import java.awt.*;

public class HelloAgainApplet extends Applet {
	Font f = new Font("TimesRoman", Font.BOLD, 36);
	
	public void paint(Graphics g) {
		g.setFont(f);
		g.setColor(Color.red);
		g.drawString("Hello again!", 50, 40);
	}
}
