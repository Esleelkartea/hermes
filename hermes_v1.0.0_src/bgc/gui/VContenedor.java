/*
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the Lesser GNU General Public License as
 * published by the Free Software Foundation; either version 2 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA 02111-1307
 * USA.
 */

package bgc.gui;
import bgc.gui.config.VOpciones;
import bgc.gui.gbd.VVisorGestor;
import bgc.gui.inicio.VInicio;
import bgc.gui.proy.abrir.VAbrir;
import bgc.gui.proy.automat.GestorAuto;
import bgc.gui.proy.automat.VAutomat;
import bgc.gui.proy.nuevo.VNuevoProy1;
import bgc.gui.wysiwyg.draganddrop.VHTMLDND;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;

/**
 * Ventana principal donde se carga la aplicaci�n Hermes
 * @author Campus-Telematika S.L.
 */
public class VContenedor extends javax.swing.JFrame implements MouseListener{
    
    /** Creates new form VContenedor */
    public VContenedor() {
        initComponents();
        
//        this.setIconImage(new ImageIcon(getClass().getResource("/hermes/imagenes/iconos_barra/icono_barra_enviando.gif")).getImage());
        VContenedor.VentanaActual=VContenedor.Inicio;
        this.setExtendedState(MAXIMIZED_BOTH);
        JFrame.setDefaultLookAndFeelDecorated(false);
        
        gestorAuto=new GestorAuto();
        
        VInicio v = new VInicio();
        this.jDesktopPane1.add(v);
        this.jDesktopPane1.setSelectedFrame(v);
        v.setVisible(true);
        
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        v.setLocation(screenSize.width/2-v.getSize().width/2, screenSize.height/2-v.getSize().height/20-180);
        jPanel1.setSize(new Dimension(1024,50));
        jLabel1.setSize(jPanel1.getSize());
        jPanel1.setLocation(0,0);
        prepararBotonera();
        
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Hermes");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setIconImage(new ImageIcon(getClass().getResource("/hermes/imagenes/iconos_barra/icono_barra.png")).getImage());
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowIconified(java.awt.event.WindowEvent evt) {
                formWindowIconified(evt);
            }
        });

        jDesktopPane1.setBackground(new java.awt.Color(216, 228, 198));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hermes/imagenes/botonera/fd_botonera.jpg")));
        jPanel1.add(jLabel1, java.awt.BorderLayout.CENTER);

        jPanel1.setBounds(0, 0, 760, 40);
        jDesktopPane1.add(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jDesktopPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 760, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jDesktopPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );
        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    /**
     * Prepara la barra de botonera superior
     */
    public void prepararBotonera() {
        botoneraNuevo=new JLabel(new ImageIcon(getClass().getResource("/hermes/imagenes/botonera/botNuevoProyecto_reposo.jpg")));
        botoneraNuevo.setLocation(90,0);
        botoneraNuevo.setSize(145,50);
        botoneraNuevo.addMouseListener(this);
        
        botoneraAbrir=new JLabel(new ImageIcon(getClass().getResource("/hermes/imagenes/botonera/botAbrirProyecto_reposo.jpg")));
        botoneraAbrir.setLocation(240,0);
        botoneraAbrir.setSize(145,50);
        botoneraAbrir.addMouseListener(this);
        
        botoneraBD=new JLabel(new ImageIcon(getClass().getResource("/hermes/imagenes/botonera/botGestionarBBDD_reposo.jpg")));
        botoneraBD.setLocation(390,0);
        botoneraBD.setSize(145,50);
        botoneraBD.addMouseListener(this);
        
        botoneraHTML=new JLabel(new ImageIcon(getClass().getResource("/hermes/imagenes/botonera/botCrearHTML_reposo.jpg")));
        botoneraHTML.setLocation(540,0);
        botoneraHTML.setSize(145,50);
        botoneraHTML.addMouseListener(this);
        
        botoneraAuto=new JLabel(new ImageIcon(getClass().getResource("/hermes/imagenes/botonera/botProyectosAuto_reposo.jpg")));
        botoneraAuto.setLocation(690,0);
        botoneraAuto.setSize(145,50);
        botoneraAuto.addMouseListener(this);
        
        botoneraConfig=new JLabel(new ImageIcon(getClass().getResource("/hermes/imagenes/botonera/botConfiguracion_reposo.jpg")));
        botoneraConfig.setLocation(840,0);
        botoneraConfig.setSize(145,50);
        botoneraConfig.addMouseListener(this);
        
        jLabel1.add(botoneraNuevo);
        jLabel1.add(botoneraAbrir);
        jLabel1.add(botoneraBD);
        jLabel1.add(botoneraHTML);
        jLabel1.add(botoneraAuto);
        jLabel1.add(botoneraConfig);
        
        linkCampus = new JLabel(new ImageIcon(getClass().getResource("/hermes/imagenes/botonera/logo_hermes.png")));
        linkCampus.setLocation(30,10);
        linkCampus.setSize(36,36);
        linkCampus.addMouseListener(this);
        jLabel1.add(linkCampus);
        
    }
    
    
    
    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
// TODO add your handling code here:
        Object []botones={"Salir","Minimizar"};
        if(JOptionPane.showOptionDialog(null,"�Desea salir o minimizar la aplicaci�n?","Confirmaci�n de salida",JOptionPane.OK_CANCEL_OPTION,JOptionPane.WARNING_MESSAGE,null,botones,botones[0])==JOptionPane.OK_OPTION) {
            this.dispose();
            System.exit(0);
        }else {
            this.hide();
        }
    }//GEN-LAST:event_formWindowClosing
    
    private void formWindowIconified(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowIconified
// TODO add your handling code here:
        this.hide();
    }//GEN-LAST:event_formWindowIconified
    
    /**
     * 
     * @param e 
     */
   /* public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VContenedor().setVisible(true);
            }
        });
    }*/
    
    
    
    public void mouseReleased(java.awt.event.MouseEvent e) {
        
    }
    
    /**
     * 
     * @param e 
     */
    public void mousePressed(java.awt.event.MouseEvent e) {
        
    }
    
    /**
     * Se cambia la imagen de la botonera a reposada
     * @param e 
     */
    public void mouseExited(java.awt.event.MouseEvent e) {
        JLabel l=(JLabel)e.getSource();
        l.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
        if(l==botoneraNuevo) {
            if (VContenedor.VentanaActual==VContenedor.NuevoProyecto ) {
                l.setIcon(new ImageIcon(getClass().getResource("/hermes/imagenes/botonera/botNuevoProyecto_pulsado.jpg")));
            }else
                l.setIcon(new ImageIcon(getClass().getResource("/hermes/imagenes/botonera/botNuevoProyecto_reposo.jpg")));
        }
        if(l==botoneraAbrir) {
            if (VContenedor.VentanaActual==VContenedor.AbrirProyecto)
                
                l.setIcon(new ImageIcon(getClass().getResource("/hermes/imagenes/botonera/botAbrirProyecto_pulsado.jpg")));
            else
                l.setIcon(new ImageIcon(getClass().getResource("/hermes/imagenes/botonera/botAbrirProyecto_reposo.jpg")));
        }
        if(l==botoneraBD) {
            if (VContenedor.VentanaActual==VContenedor.GBBDD)
                l.setIcon(new ImageIcon(getClass().getResource("/hermes/imagenes/botonera/botGestionarBBDD_pulsado.jpg")));
            else
                l.setIcon(new ImageIcon(getClass().getResource("/hermes/imagenes/botonera/botGestionarBBDD_reposo.jpg")));
        }
        if(l==botoneraHTML) {
            if (VContenedor.VentanaActual==VContenedor.CrearHTML)
                l.setIcon(new ImageIcon(getClass().getResource("/hermes/imagenes/botonera/botCrearHTML_pulsado.jpg")));
            else
                l.setIcon(new ImageIcon(getClass().getResource("/hermes/imagenes/botonera/botCrearHTML_reposo.jpg")));
        }
        if(l==botoneraAuto) {
            if (VContenedor.VentanaActual==VContenedor.ProyectAuto)
                l.setIcon(new ImageIcon(getClass().getResource("/hermes/imagenes/botonera/botProyectosAuto_pulsado.jpg")));
            else
                l.setIcon(new ImageIcon(getClass().getResource("/hermes/imagenes/botonera/botProyectosAuto_reposo.jpg")));
        }
        if (l==botoneraConfig){
        if (VContenedor.VentanaActual==VContenedor.Configuracion)
                l.setIcon(new ImageIcon(getClass().getResource("/hermes/imagenes/botonera/botConfiguracion_pulsado.jpg")));
            else
                l.setIcon(new ImageIcon(getClass().getResource("/hermes/imagenes/botonera/botConfiguracion_reposo.jpg")));
        }
//        if(l==linkCampus) {
//            l.setIcon(new ImageIcon(getClass().getResource("/hermes/imagenes/botonera/campus_link.jpg")));
//        }
        
    }
    
    /**
     * Cambia la imagen de la botonera a activa
     * @param e 
     */
    public void mouseEntered(java.awt.event.MouseEvent e) {
        JLabel l=(JLabel)e.getSource();
        l.setCursor(new Cursor(Cursor.HAND_CURSOR));
        if(l==botoneraNuevo) {
            if (VContenedor.VentanaActual==VContenedor.NuevoProyecto )
                l.setIcon(new ImageIcon(getClass().getResource("/hermes/imagenes/botonera/botNuevoProyecto_pulsado.jpg")));
            else
                l.setIcon(new ImageIcon(getClass().getResource("/hermes/imagenes/botonera/botNuevoProyecto_sobre.jpg")));
        }
        if(l==botoneraAbrir) {
            if (VContenedor.VentanaActual==VContenedor.AbrirProyecto )
                l.setIcon(new ImageIcon(getClass().getResource("/hermes/imagenes/botonera/botAbrirProyecto_pulsado.jpg")));
            else
                l.setIcon(new ImageIcon(getClass().getResource("/hermes/imagenes/botonera/botAbrirProyecto_sobre.jpg")));
        }
        if(l==botoneraBD) {
            if (VContenedor.VentanaActual==VContenedor.GBBDD )
                l.setIcon(new ImageIcon(getClass().getResource("/hermes/imagenes/botonera/botGestionarBBDD_pulsado.jpg")));
            else
                l.setIcon(new ImageIcon(getClass().getResource("/hermes/imagenes/botonera/botGestionarBBDD_sobre.jpg")));
        }
        if(l==botoneraHTML) {
            if (VContenedor.VentanaActual==VContenedor.CrearHTML )
                l.setIcon(new ImageIcon(getClass().getResource("/hermes/imagenes/botonera/botCrearHTML_pulsado.jpg")));
            else
                l.setIcon(new ImageIcon(getClass().getResource("/hermes/imagenes/botonera/botCrearHTML_sobre.jpg")));
        }
        if(l==botoneraAuto) {
            if (VContenedor.VentanaActual==VContenedor.ProyectAuto )
                l.setIcon(new ImageIcon(getClass().getResource("/hermes/imagenes/botonera/botProyectosAuto_pulsado.jpg")));
            else
                l.setIcon(new ImageIcon(getClass().getResource("/hermes/imagenes/botonera/botProyectosAuto_sobre.jpg")));
        }
         if (l==botoneraConfig){
        if (VContenedor.VentanaActual==VContenedor.Configuracion)
                l.setIcon(new ImageIcon(getClass().getResource("/hermes/imagenes/botonera/botConfiguracion_sobre.jpg")));
            else
                l.setIcon(new ImageIcon(getClass().getResource("/hermes/imagenes/botonera/botConfiguracion_sobre.jpg")));
        }
//        if(l==linkCampus) {
//            l.setIcon(new ImageIcon(getClass().getResource("/hermes/imagenes/botonera/campus_link_over.jpg")));
//        }
    }
    
    
    
    /**
     * Actualiza la botonera marcando el boton seleccionado
     * @param nl numero de boton
     */
    public void actualizarBotonera(int nl) {
        switch (nl) {
            case 0:{
                botoneraNuevo.setIcon(new ImageIcon(getClass().getResource("/hermes/imagenes/botonera/botNuevoProyecto_reposo.jpg")));
                VContenedor.VentanaActual=VContenedor.Inicio;
                
                botoneraAbrir.setIcon(new ImageIcon(getClass().getResource("/hermes/imagenes/botonera/botAbrirProyecto_reposo.jpg")));
                botoneraBD.setIcon(new ImageIcon(getClass().getResource("/hermes/imagenes/botonera/botGestionarBBDD_reposo.jpg")));
                botoneraHTML.setIcon(new ImageIcon(getClass().getResource("/hermes/imagenes/botonera/botCrearHTML_reposo.jpg")));
                botoneraAuto.setIcon(new ImageIcon(getClass().getResource("/hermes/imagenes/botonera/botProyectosAuto_reposo.jpg")));
                botoneraConfig.setIcon(new ImageIcon(getClass().getResource("/hermes/imagenes/botonera/botConfiguracion_reposo.jpg")));
            }break;
            
            case 1:  {
                botoneraNuevo.setIcon(new ImageIcon(getClass().getResource("/hermes/imagenes/botonera/botNuevoProyecto_pulsado.jpg")));
                VContenedor.VentanaActual=VContenedor.NuevoProyecto;
                
                botoneraAbrir.setIcon(new ImageIcon(getClass().getResource("/hermes/imagenes/botonera/botAbrirProyecto_reposo.jpg")));
                botoneraBD.setIcon(new ImageIcon(getClass().getResource("/hermes/imagenes/botonera/botGestionarBBDD_reposo.jpg")));
                botoneraHTML.setIcon(new ImageIcon(getClass().getResource("/hermes/imagenes/botonera/botCrearHTML_reposo.jpg")));
                botoneraAuto.setIcon(new ImageIcon(getClass().getResource("/hermes/imagenes/botonera/botProyectosAuto_reposo.jpg")));
                botoneraConfig.setIcon(new ImageIcon(getClass().getResource("/hermes/imagenes/botonera/botConfiguracion_reposo.jpg")));
            }break;
            case 2:  {
                botoneraAbrir.setIcon(new ImageIcon(getClass().getResource("/hermes/imagenes/botonera/botAbrirProyecto_pulsado.jpg")));
                VContenedor.VentanaActual=VContenedor.AbrirProyecto;
                
                botoneraNuevo.setIcon(new ImageIcon(getClass().getResource("/hermes/imagenes/botonera/botNuevoProyecto_reposo.jpg")));
                botoneraBD.setIcon(new ImageIcon(getClass().getResource("/hermes/imagenes/botonera/botGestionarBBDD_reposo.jpg")));
                botoneraHTML.setIcon(new ImageIcon(getClass().getResource("/hermes/imagenes/botonera/botCrearHTML_reposo.jpg")));
                botoneraAuto.setIcon(new ImageIcon(getClass().getResource("/hermes/imagenes/botonera/botProyectosAuto_reposo.jpg")));
                botoneraConfig.setIcon(new ImageIcon(getClass().getResource("/hermes/imagenes/botonera/botConfiguracion_reposo.jpg")));
                
            }break;
            case 3:  {
                botoneraBD.setIcon(new ImageIcon(getClass().getResource("/hermes/imagenes/botonera/botGestionarBBDD_pulsado.jpg")));
                VContenedor.VentanaActual=VContenedor.GBBDD;
                
                botoneraNuevo.setIcon(new ImageIcon(getClass().getResource("/hermes/imagenes/botonera/botNuevoProyecto_reposo.jpg")));
                botoneraAbrir.setIcon(new ImageIcon(getClass().getResource("/hermes/imagenes/botonera/botAbrirProyecto_reposo.jpg")));
                botoneraHTML.setIcon(new ImageIcon(getClass().getResource("/hermes/imagenes/botonera/botCrearHTML_reposo.jpg")));
                botoneraAuto.setIcon(new ImageIcon(getClass().getResource("/hermes/imagenes/botonera/botProyectosAuto_reposo.jpg")));
                botoneraConfig.setIcon(new ImageIcon(getClass().getResource("/hermes/imagenes/botonera/botConfiguracion_reposo.jpg")));
            }break;
            case 4:  {
                botoneraHTML.setIcon(new ImageIcon(getClass().getResource("/hermes/imagenes/botonera/botCrearHTML_pulsado.jpg")));
                VContenedor.VentanaActual=VContenedor.CrearHTML;
                
                botoneraNuevo.setIcon(new ImageIcon(getClass().getResource("/hermes/imagenes/botonera/botNuevoProyecto_reposo.jpg")));
                botoneraAbrir.setIcon(new ImageIcon(getClass().getResource("/hermes/imagenes/botonera/botAbrirProyecto_reposo.jpg")));
                botoneraBD.setIcon(new ImageIcon(getClass().getResource("/hermes/imagenes/botonera/botGestionarBBDD_reposo.jpg")));
                botoneraAuto.setIcon(new ImageIcon(getClass().getResource("/hermes/imagenes/botonera/botProyectosAuto_reposo.jpg")));
                botoneraConfig.setIcon(new ImageIcon(getClass().getResource("/hermes/imagenes/botonera/botConfiguracion_reposo.jpg")));
            }break;
            case 5: {
                botoneraAuto.setIcon(new ImageIcon(getClass().getResource("/hermes/imagenes/botonera/botProyectosAuto_pulsado.jpg")));
                VContenedor.VentanaActual=VContenedor.ProyectAuto;
                
                botoneraNuevo.setIcon(new ImageIcon(getClass().getResource("/hermes/imagenes/botonera/botNuevoProyecto_reposo.jpg")));
                botoneraAbrir.setIcon(new ImageIcon(getClass().getResource("/hermes/imagenes/botonera/botAbrirProyecto_reposo.jpg")));
                botoneraBD.setIcon(new ImageIcon(getClass().getResource("/hermes/imagenes/botonera/botGestionarBBDD_reposo.jpg")));
                botoneraHTML.setIcon(new ImageIcon(getClass().getResource("/hermes/imagenes/botonera/botCrearHTML_reposo.jpg")));
                botoneraConfig.setIcon(new ImageIcon(getClass().getResource("/hermes/imagenes/botonera/botConfiguracion_reposo.jpg")));
            }break;
            case 6: {
                botoneraConfig.setIcon(new ImageIcon(getClass().getResource("/hermes/imagenes/botonera/botConfiguracion_pulsado.jpg")));
                VContenedor.VentanaActual=VContenedor.Configuracion;
                
                botoneraNuevo.setIcon(new ImageIcon(getClass().getResource("/hermes/imagenes/botonera/botNuevoProyecto_reposo.jpg")));
                botoneraAbrir.setIcon(new ImageIcon(getClass().getResource("/hermes/imagenes/botonera/botAbrirProyecto_reposo.jpg")));
                botoneraBD.setIcon(new ImageIcon(getClass().getResource("/hermes/imagenes/botonera/botGestionarBBDD_reposo.jpg")));
                botoneraHTML.setIcon(new ImageIcon(getClass().getResource("/hermes/imagenes/botonera/botCrearHTML_reposo.jpg")));
                botoneraAuto.setIcon(new ImageIcon(getClass().getResource("/hermes/imagenes/botonera/botProyectosAuto_reposo.jpg")));
            }break;
        }
        jPanel1.validate();
        jPanel1.repaint();
    }
    
    
    /**
     * 
     * @param e 
     */
    public void mouseClicked(java.awt.event.MouseEvent e) {
        JLabel l=(JLabel)e.getSource();
        
        if(l==botoneraNuevo) {
            if(VContenedor.VentanaActual!=VContenedor.NuevoProyecto) {
                l.setIcon(new ImageIcon(getClass().getResource("/hermes/imagenes/botonera/botNuevoProyecto_pulsado.jpg")));
                VContenedor.VentanaActual=VContenedor.NuevoProyecto;
                
                botoneraAbrir.setIcon(new ImageIcon(getClass().getResource("/hermes/imagenes/botonera/botAbrirProyecto_reposo.jpg")));
                botoneraBD.setIcon(new ImageIcon(getClass().getResource("/hermes/imagenes/botonera/botGestionarBBDD_reposo.jpg")));
                botoneraHTML.setIcon(new ImageIcon(getClass().getResource("/hermes/imagenes/botonera/botCrearHTML_reposo.jpg")));
                botoneraAuto.setIcon(new ImageIcon(getClass().getResource("/hermes/imagenes/botonera/botProyectosAuto_reposo.jpg")));
                botoneraConfig.setIcon(new ImageIcon(getClass().getResource("/hermes/imagenes/botonera/botConfiguracion_reposo.jpg")));
                
                
                VNuevoProy1 v=new VNuevoProy1(null);
                
                try{
                this.jDesktopPane1.getSelectedFrame().dispose();
                }catch(NullPointerException nexp)
                {
                int cont=Array.getLength(jDesktopPane1.getAllFrames());
                for (int i=0;i<cont;i++)
                {
                    jDesktopPane1.getAllFrames()[0].dispose();
                }
                }
                this.jDesktopPane1.setSelectedFrame(v);
                this.jDesktopPane1.add(v);
                Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
                v.setLocation(screenSize.width/2-v.getSize().width/2, screenSize.height/2-v.getSize().height/2);
                
                
                v.show();
                
            }
        }
        if(l==botoneraAbrir) {
            if(VContenedor.VentanaActual!=VContenedor.AbrirProyecto) {
                
                l.setIcon(new ImageIcon(getClass().getResource("/hermes/imagenes/botonera/botAbrirProyecto_pulsado.jpg")));
                VContenedor.VentanaActual=VContenedor.AbrirProyecto;
                
                botoneraNuevo.setIcon(new ImageIcon(getClass().getResource("/hermes/imagenes/botonera/botNuevoProyecto_reposo.jpg")));
                botoneraBD.setIcon(new ImageIcon(getClass().getResource("/hermes/imagenes/botonera/botGestionarBBDD_reposo.jpg")));
                botoneraHTML.setIcon(new ImageIcon(getClass().getResource("/hermes/imagenes/botonera/botCrearHTML_reposo.jpg")));
                botoneraAuto.setIcon(new ImageIcon(getClass().getResource("/hermes/imagenes/botonera/botProyectosAuto_reposo.jpg")));
                botoneraConfig.setIcon(new ImageIcon(getClass().getResource("/hermes/imagenes/botonera/botConfiguracion_reposo.jpg")));
                //------------------
                
                JFileChooser chooser = new JFileChooser();
                chooser.setDialogTitle("Abrir proyecto");
                FileFilter filtroObj = new FileFilter() {
                    public boolean accept(File f) {
                        return f.getName().toLowerCase().endsWith(".obj") || f.isDirectory();
                    }
                    public String getDescription() {
                        return "Proyectos Hermes";
                    }
                };
                chooser.setFileFilter(filtroObj);
                
                chooser.setCurrentDirectory(new java.io.File("C:\\Archivos de programa\\Campus-Telematika\\Hermes"));
                int resultado = chooser.showOpenDialog(this.getParent());
                if (resultado == JFileChooser.APPROVE_OPTION){
                    File ficheroSeleccionado = chooser.getSelectedFile();
                    
                    VAbrir v = new VAbrir(ficheroSeleccionado);
                   try{
                this.jDesktopPane1.getSelectedFrame().dispose();
                }catch(NullPointerException nexp)
                {
                int cont=Array.getLength(jDesktopPane1.getAllFrames());
                for (int i=0;i<cont;i++)
                {
                    jDesktopPane1.getAllFrames()[0].dispose();
                }
                }
                    this.jDesktopPane1.setSelectedFrame(v);
                    this.jDesktopPane1.add(v);
                    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
                    v.setLocation(screenSize.width/2-v.getSize().width/2, screenSize.height/2-v.getSize().height/2);
                    v.show();
                }
                
                
                //------------------
            }
        }if(l==botoneraBD) {
            if(VContenedor.VentanaActual!=VContenedor.GBBDD) {
                l.setIcon(new ImageIcon(getClass().getResource("/hermes/imagenes/botonera/botGestionarBBDD_pulsado.jpg")));
                VContenedor.VentanaActual=VContenedor.GBBDD;
                
                botoneraNuevo.setIcon(new ImageIcon(getClass().getResource("/hermes/imagenes/botonera/botNuevoProyecto_reposo.jpg")));
                botoneraAbrir.setIcon(new ImageIcon(getClass().getResource("/hermes/imagenes/botonera/botAbrirProyecto_reposo.jpg")));
                botoneraHTML.setIcon(new ImageIcon(getClass().getResource("/hermes/imagenes/botonera/botCrearHTML_reposo.jpg")));
                botoneraAuto.setIcon(new ImageIcon(getClass().getResource("/hermes/imagenes/botonera/botProyectosAuto_reposo.jpg")));
                botoneraConfig.setIcon(new ImageIcon(getClass().getResource("/hermes/imagenes/botonera/botConfiguracion_reposo.jpg")));
                //---------------
                VVisorGestor v = new VVisorGestor(jDesktopPane1);
                try{
                this.jDesktopPane1.getSelectedFrame().dispose();
                }catch(NullPointerException nexp)
                {
                int cont=Array.getLength(jDesktopPane1.getAllFrames());
                for (int i=0;i<cont;i++)
                {
                    jDesktopPane1.getAllFrames()[0].dispose();
                }
                }
                this.jDesktopPane1.setSelectedFrame(v);
                this.jDesktopPane1.add(v);
                
                Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
                v.setLocation(screenSize.width/2-v.getSize().width/2, screenSize.height/2-v.getSize().height/2);
                v.show();
                //--------------
            }
        }if(l==botoneraHTML) {
            if(VContenedor.VentanaActual!=VContenedor.CrearHTML) {
                l.setIcon(new ImageIcon(getClass().getResource("/hermes/imagenes/botonera/botCrearHTML_pulsado.jpg")));
                VContenedor.VentanaActual=VContenedor.CrearHTML;
                
                botoneraNuevo.setIcon(new ImageIcon(getClass().getResource("/hermes/imagenes/botonera/botNuevoProyecto_reposo.jpg")));
                botoneraAbrir.setIcon(new ImageIcon(getClass().getResource("/hermes/imagenes/botonera/botAbrirProyecto_reposo.jpg")));
                botoneraBD.setIcon(new ImageIcon(getClass().getResource("/hermes/imagenes/botonera/botGestionarBBDD_reposo.jpg")));
                botoneraAuto.setIcon(new ImageIcon(getClass().getResource("/hermes/imagenes/botonera/botProyectosAuto_reposo.jpg")));
                botoneraConfig.setIcon(new ImageIcon(getClass().getResource("/hermes/imagenes/botonera/botConfiguracion_reposo.jpg")));
                //-------------------
                
                VHTMLDND v = new VHTMLDND();
              try{
                this.jDesktopPane1.getSelectedFrame().dispose();
                }catch(NullPointerException nexp)
                {
                int cont=Array.getLength(jDesktopPane1.getAllFrames());
                for (int i=0;i<cont;i++)
                {
                    jDesktopPane1.getAllFrames()[0].dispose();
                }
                }
                this.jDesktopPane1.setSelectedFrame(v);
                this.jDesktopPane1.add(v);
                Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
                v.setSize(screenSize.width-80,screenSize.height-120);
                v.setLocation(screenSize.width/2-v.getSize().width/2, screenSize.height/2-v.getSize().height/2);
                
                v.show();
                
                //-------------------
            }
        }if(l==botoneraAuto) {
            if(VContenedor.VentanaActual!=VContenedor.ProyectAuto) {
                l.setIcon(new ImageIcon(getClass().getResource("/hermes/imagenes/botonera/botProyectosAuto_pulsado.jpg")));
                VContenedor.VentanaActual=VContenedor.ProyectAuto;
                
                botoneraNuevo.setIcon(new ImageIcon(getClass().getResource("/hermes/imagenes/botonera/botNuevoProyecto_reposo.jpg")));
                botoneraAbrir.setIcon(new ImageIcon(getClass().getResource("/hermes/imagenes/botonera/botAbrirProyecto_reposo.jpg")));
                botoneraBD.setIcon(new ImageIcon(getClass().getResource("/hermes/imagenes/botonera/botGestionarBBDD_reposo.jpg")));
                botoneraHTML.setIcon(new ImageIcon(getClass().getResource("/hermes/imagenes/botonera/botCrearHTML_reposo.jpg")));
                botoneraConfig.setIcon(new ImageIcon(getClass().getResource("/hermes/imagenes/botonera/botConfiguracion_reposo.jpg")));
                //---------------
                
                VAutomat v=new VAutomat();
                try{
                this.jDesktopPane1.getSelectedFrame().dispose();
                }catch(NullPointerException nexp)
                {
                int cont=Array.getLength(jDesktopPane1.getAllFrames());
                for (int i=0;i<cont;i++)
                {
                    jDesktopPane1.getAllFrames()[0].dispose();
                }
                }
                //this.jDesktopPane1.setSelectedFrame(v);
                this.jDesktopPane1.add(v);
                Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
                v.setLocation(screenSize.width/2-v.getSize().width/2, screenSize.height/2-v.getSize().height/2);
                v.show();
                
                //---------------
            }
        }
        
        if(l==botoneraConfig) {
            if(VContenedor.VentanaActual!=VContenedor.Configuracion) {
                l.setIcon(new ImageIcon(getClass().getResource("/hermes/imagenes/botonera/botConfiguracion_pulsado.jpg")));
                VContenedor.VentanaActual=VContenedor.Configuracion;
                
                botoneraNuevo.setIcon(new ImageIcon(getClass().getResource("/hermes/imagenes/botonera/botNuevoProyecto_reposo.jpg")));
                botoneraAbrir.setIcon(new ImageIcon(getClass().getResource("/hermes/imagenes/botonera/botAbrirProyecto_reposo.jpg")));
                botoneraBD.setIcon(new ImageIcon(getClass().getResource("/hermes/imagenes/botonera/botGestionarBBDD_reposo.jpg")));
                botoneraHTML.setIcon(new ImageIcon(getClass().getResource("/hermes/imagenes/botonera/botCrearHTML_reposo.jpg")));
                botoneraAuto.setIcon(new ImageIcon(getClass().getResource("/hermes/imagenes/botonera/botProyectosAuto_reposo.jpg")));
                //---------------
                
                VOpciones v=new VOpciones();
                try {
                    this.jDesktopPane1.getSelectedFrame().dispose();
                } catch (NullPointerException nex) {
                }
                //this.jDesktopPane1.setSelectedFrame(v);
                this.jDesktopPane1.add(v);
                Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
                v.setLocation(screenSize.width/2-v.getSize().width/2, screenSize.height/2-v.getSize().height/2);
                v.show();
                
                //---------------
            }
        }
        
        if (l==linkCampus)
        {
         Runtime rtt=Runtime.getRuntime();
        try {
            rtt.exec("cmd /c start  http://www.campus-telematika.com");;
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JDesktopPane jDesktopPane1;
    public javax.swing.JLabel jLabel1;
    public javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
    JLabel botoneraNuevo;
    JLabel botoneraAbrir;
    JLabel botoneraBD;
    JLabel botoneraHTML;
    JLabel botoneraAuto;
    JLabel botoneraConfig;
    JLabel linkCampus;
    public static GestorAuto gestorAuto;
    public static int VentanaActual;
    public static final int Inicio=0;
    public static final int NuevoProyecto=1;
    public static final int AbrirProyecto=2;
    public static final int GBBDD=3;
    public static final int CrearHTML=4;
    public static final int ProyectAuto=5;
    public static final int Configuracion=6;
}
