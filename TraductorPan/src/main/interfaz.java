package main;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class interfaz {

    private JFrame frame;
    private JTextField txtTextoATraducir;
    private JTextArea txtAreaResultado;
    private JButton btnTraducirPan;
    private JButton btnTraducirEsp;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                interfaz window = new interfaz();
                window.frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public interfaz() {
        initialize();
    }

    private void initialize() {
        frame = new JFrame("Traductor Pan");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 350);
        frame.setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setBorder(new EmptyBorder(15, 20, 15, 20));
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        frame.setContentPane(panel);

        JLabel lblTitulo = new JLabel("Traductor Pan");
        lblTitulo.setAlignmentX(Component.CENTER_ALIGNMENT);
        lblTitulo.setFont(new Font("Segoe UI", Font.BOLD, 28));
        lblTitulo.setForeground(new Color(60, 63, 65));
        panel.add(lblTitulo);

        panel.add(Box.createRigidArea(new Dimension(0, 20)));

        txtTextoATraducir = new JTextField();
        txtTextoATraducir.setMaximumSize(new Dimension(Integer.MAX_VALUE, 35));
        txtTextoATraducir.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        txtTextoATraducir.setToolTipText("Escribe el texto aquí");
        txtTextoATraducir.setForeground(new Color(30, 30, 30));
        panel.add(txtTextoATraducir);

        panel.add(Box.createRigidArea(new Dimension(0, 15)));

        // Panel botones
        JPanel panelBotones = new JPanel();
        panelBotones.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 0));

        btnTraducirPan = new JButton("Traducir a Pan");
        btnTraducirPan.setFont(new Font("Segoe UI", Font.BOLD, 14));
        btnTraducirPan.setBackground(new Color(0, 123, 255));
        btnTraducirPan.setForeground(Color.WHITE);
        btnTraducirPan.setFocusPainted(false);
        btnTraducirPan.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        btnTraducirEsp = new JButton("Traducir a Español");
        btnTraducirEsp.setFont(new Font("Segoe UI", Font.BOLD, 14));
        btnTraducirEsp.setBackground(new Color(40, 167, 69));
        btnTraducirEsp.setForeground(Color.WHITE);
        btnTraducirEsp.setFocusPainted(false);
        btnTraducirEsp.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        panelBotones.add(btnTraducirPan);
        panelBotones.add(btnTraducirEsp);

        panel.add(panelBotones);

        panel.add(Box.createRigidArea(new Dimension(0, 20)));

        txtAreaResultado = new JTextArea(6, 30);
        txtAreaResultado.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        txtAreaResultado.setEditable(false);
        txtAreaResultado.setLineWrap(true);
        txtAreaResultado.setWrapStyleWord(true);
        txtAreaResultado.setBackground(new Color(245, 245, 245));
        txtAreaResultado.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(new Color(200, 200, 200)),
                BorderFactory.createEmptyBorder(10, 10, 10, 10)));
        JScrollPane scroll = new JScrollPane(txtAreaResultado);
        panel.add(scroll);

        // Acciones botones
        btnTraducirPan.addActionListener(e -> traducirATextoPan());
        btnTraducirEsp.addActionListener(e -> traducirATextoEsp());
    }

    private void traducirATextoPan() {
        String texto = txtTextoATraducir.getText().trim();
        if (texto.isEmpty()) {
            txtAreaResultado.setText("Por favor, ingresa algún texto.");
        } else {
            String traducido = Traductor.traducirFraseEspanolPan(texto);
            txtAreaResultado.setText(traducido);
        }
    }

    private void traducirATextoEsp() {
        String texto = txtTextoATraducir.getText().trim();
        if (texto.isEmpty()) {
            txtAreaResultado.setText("Por favor, ingresa algún texto en idioma Pan.");
        } else {
            String traducido = Traductor.traducirFrasePanAEspanol(texto);
            txtAreaResultado.setText(traducido);
        }
    }
}
