package miedificio;

import vista.MenuPrincipal;

public class MiEdificio {

    public static void main(String[] args) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception ex) {
            System.out.println("No se pudo aplicar el look and feel: " + ex.getMessage());
        }

        java.awt.EventQueue.invokeLater(() -> new MenuPrincipal().setVisible(true));
    }

}
