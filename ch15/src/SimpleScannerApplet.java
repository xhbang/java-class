
import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import java.net.*;

public class SimpleScannerApplet extends JApplet {
	// Declare the GUI components used by the Applet
	JTextField hostTextField = new JTextField("localhost", 10);

	JTextField portTextField = new JTextField("80", 4);

	JTextField resultsTextField = new JTextField(20);

	JButton scanButton = new JButton("Scan");

	JLabel hostLabel = new JLabel("Host name or IP address:");

	JLabel portLabel = new JLabel("Port number: ");

	JLabel resultsLabel = new JLabel("Results: ");

	JPanel mainPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));

	JPanel topPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));

	JPanel bottomPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));

	public SimpleScannerApplet() {
		// Layout the Applet's components
		Border etched = BorderFactory.createEtchedBorder();
		// Add a border to the main panel
		mainPanel.setBorder(BorderFactory.createTitledBorder(etched,
				"Simple Port Scanner"));
		// Host and port fields in top panel
		topPanel.add(hostLabel);
		topPanel.add(hostTextField);
		topPanel.add(portLabel);
		topPanel.add(portTextField);
		// Scan button and result field in bottom panel
		bottomPanel.add(scanButton);
		bottomPanel.add(resultsLabel);
		bottomPanel.add(resultsTextField);
		// Add top and bottom panels to main panel
		mainPanel.add(topPanel);
		mainPanel.add(bottomPanel);
		// Set up the button's event handler
		scanButton.addActionListener(new Scanner());
		// Add the main panel to the Applet's content pane
		getContentPane().add(mainPanel);
	}

	// The Scan button's event handler does the actual scanning
	private class Scanner implements ActionListener {
		// Declare fields used as scan parameters
		String host;

		InetAddress address;

		int port;

		String ip;

		// Handle the button's action event
		public void actionPerformed(ActionEvent ev) {
			out("Checking scan parameters ...");
			if (validParameters()) {
				out("Scanning ...");
				try {
					// Try to connect to the host/port
					System.out.println("out");
					Socket s = new Socket(address, port);
					// No exception: SUCCESS
					System.out.println("Port " + port + " is open on " + host + " (" + ip
							+ ").");
					out("Port " + port + " is open on " + host + " (" + ip
							+ ").");
					
					s.close();
				} catch (Exception ex) {
					// Could not connect
					if (ex instanceof SecurityException)
						out(ex.getMessage());
					else
						out("Port " + port + " is closed on" + host + " (" + ip
								+ ").");
				}
			}
		}

		// Validate scan parameters
		private boolean validParameters() {
			try {
				host = hostTextField.getText();
				String portString = portTextField.getText();
				// Convert host name to an InetAddress object
				address = InetAddress.getByName(host);
				// Get the host's IP address
				ip = address.getHostAddress();
				// Convert the portString to an int
				port = Integer.decode(portString).intValue();
				// Make sure that it's in range
				if (port > 65535)
					throw new ScannerException("Invalid port.");
			} catch (Exception e) {
				// Handle any validation-related exceptions
				out(e.getMessage());
				return false;
			}
			return true;
		}

		// Convenience method for writing results
		private void out(String msg) {
			resultsTextField.setText(msg);
		}
	}

	// Used to identify invalid scan parameters
	private class ScannerException extends Exception {
		public ScannerException(String msg) {
			super(msg);
		}
	}
}