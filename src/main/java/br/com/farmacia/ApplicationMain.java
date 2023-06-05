package br.com.farmacia;

import br.com.farmacia.tela.TelaCadastro;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

@SpringBootApplication
public class ApplicationMain extends JFrame {


    private JPanel contentPane;

    public ApplicationMain() throws HeadlessException {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);

        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        JMenu mnNewMenu = new JMenu("Menu");
        menuBar.add(mnNewMenu);

        JMenuItem menuItem = new JMenuItem("Cadastro");
        mnNewMenu.add(menuItem);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        menuItem.addActionListener(e -> {
            TelaCadastro cadPes = new TelaCadastro();
            cadPes.setVisible(true);

        });

        setContentPane(contentPane);
    }
    public static void main(String[] args) {
        var ctx = new SpringApplicationBuilder(ApplicationMain.class)
                .headless(false).run(args);

        EventQueue.invokeLater(() -> {

            var ex = ctx.getBean(ApplicationMain.class);
            ex.setVisible(true);
        });
    }

}
