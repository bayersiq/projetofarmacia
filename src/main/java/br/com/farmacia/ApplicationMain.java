package br.com.farmacia;

import br.com.farmacia.tela.TelaCadastro;
import br.com.farmacia.tela.TelaInicial;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@SpringBootApplication
public class ApplicationMain extends JFrame {


    private JPanel contentPane;

    public ApplicationMain() throws HeadlessException {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);

        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        JMenu mnNewMenu = new JMenu("Menu");
        menuBar.add(mnNewMenu);

        JMenuItem mntmNewMenuItem = new JMenuItem("Cadastro");
        mnNewMenu.add(mntmNewMenuItem);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        mntmNewMenuItem.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                TelaCadastro cadPes = new TelaCadastro();
                cadPes.setVisible(true);

            }
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
