package WorldClock;

import java.awt.LayoutManager;
import java.util.concurrent.TimeUnit;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

/**
 * The WorldClockGUI class acts as the view and controller.
 * 
 * @author Brandon Jackson
 *
 */
public class WorldClockGUI {

	// Separating decorations for security and readability reasons
	private static JLabel cupertinoLabel;
	private static JLabel shanghaiLabel;
	private static JLabel argentinaAndBuenos_AiresLabel;
	private static JLabel parisLabel;
	
	private JPanel controlsPanel;
	private JFrame window;

	/**
	 * Creates and displays the GUI; constructs a maze to start things off.
	 */
	public WorldClockGUI() {
		createAndDisplayGUI();
	}

	private static void runClocks() {
		while (true) {
			cupertinoLabel.setText("Cupertino " + WorldClock.getCupertino());
			shanghaiLabel.setText("Shanghai " + WorldClock.getShanghai());
			argentinaAndBuenos_AiresLabel.setText("Argentina/Buenos " + WorldClock.getArgentinaAndBuenos_Aires());
			parisLabel.setText("Paris " + WorldClock.getParis());
			try {
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	private void createAndDisplayGUI() {
		cupertinoLabel = new JLabel("Initializing");
		shanghaiLabel = new JLabel("Initializing");
		argentinaAndBuenos_AiresLabel = new JLabel("Initializing");
		parisLabel = new JLabel("Initializing");
		
		controlsPanel = new JPanel();
		controlsPanel.add(cupertinoLabel);
		controlsPanel.add(shanghaiLabel);
		controlsPanel.add(argentinaAndBuenos_AiresLabel);
		controlsPanel.add(parisLabel);

		controlsPanel.setLayout((LayoutManager) new BoxLayout(controlsPanel, BoxLayout.PAGE_AXIS));
		
		window = new JFrame();
		window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		window.setContentPane(controlsPanel);
		window.pack();
		window.setSize(200, 100);
		// speedSlider.requestFocusInWindow();
		window.setVisible(true);
	}

	public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new WorldClockGUI();
			}
		});
		try {
			TimeUnit.SECONDS.sleep(5);
			runClocks();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
