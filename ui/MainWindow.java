
package ui;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainWindow extends JFrame {

    public static final int DEFAULT_WIDTH = 500;

    public static final int DEFAULT_HEIGHT = 600;

    public static final int DEFAULT_WIDTH_BUTTON = 100;

    public static final int DEFAULT_HEIGHT_BUTTON = 50;

    public static final String DEFAULT_TITLE = "Java Checkers";

    public MainWindow() {

        // Setup the window
        super(DEFAULT_TITLE);
        super.setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
        super.setLocationByPlatform(true);

        // Setup button
        JButton startBtn = new JButton("Start game");
        startBtn.setSize(DEFAULT_WIDTH_BUTTON, DEFAULT_HEIGHT_BUTTON);
        startBtn.setFocusPainted(false);
        startBtn.setBackground(new Color(139, 69, 19));
        startBtn.setContentAreaFilled(false);
        startBtn.setOpaque(true);
        startBtn.setBorderPainted(false);
        startBtn.setFont(new Font("Arial", Font.PLAIN, 16));
        startBtn.setHorizontalAlignment(JButton.CENTER);
        startBtn.setVerticalAlignment(JButton.CENTER);

        // Add listener for button
        startBtn.addActionListener(e -> {

            // Create and open a window to display the checkers game
            CheckersWindow window = new CheckersWindow();
            window.setDefaultCloseOperation(CheckersWindow.EXIT_ON_CLOSE);
            window.setVisible(true);

            // Close current frame
            this.dispose();
        });

        JPanel panelButton = new JPanel();
        panelButton.setBackground(new Color(205, 133, 63));
        panelButton.setLayout(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.anchor = GridBagConstraints.CENTER;
        gbc.fill = GridBagConstraints.HORIZONTAL;

        JPanel buttons = new JPanel(new GridBagLayout());
        buttons.add(startBtn, gbc);

        gbc.weighty = 1;
        panelButton.add(buttons, gbc);

        this.add(panelButton);
    }
}
