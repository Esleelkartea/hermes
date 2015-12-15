package bgc.gui.proy.abrir;
import bgc.gui.proy.automat.PanelSemanal;
import bgc.negocio.Dia;
import bgc.negocio.proyecto.Proyecto;
import bgc.negocio.proyecto.ProyectoAuto;
import java.awt.Frame;
import java.util.Hashtable;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import com.toedter.calendar.JCalendar;
/**
 * La clase VDetallesTipo proporciona la interfaz necesaria para albergar los paneles
 * para elegir la periodicidad del env�o de los mailings
 *
 * @author Campus - Telematika, S.L.
 *
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
public class VDetallesTipo extends javax.swing.JDialog {
    /**Array con los nombres de los d�as de la semana*/
    String[]dias={"Lunes","Martes","Miercoles","Jueves","Viernes","Sabado","Domingo"};
    /** Crea un nuevo JDialog VDetallesTipo */
    public VDetallesTipo(JInternalFrame parent, boolean modal,Proyecto p) {
	
	super(new Frame(),modal);
	padre=parent;
	initComponents();
	proy=p;
	inicializar();
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        panelFondo = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(216, 228, 198));
        jPanel1.setBackground(new java.awt.Color(216, 228, 198));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel1.setEnabled(false);
        jPanel1.setOpaque(false);
        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Diario");
        jRadioButton1.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jRadioButton1.setEnabled(false);
        jRadioButton1.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jRadioButton1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioButton1ItemStateChanged(evt);
            }
        });

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Semanal");
        jRadioButton2.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jRadioButton2.setEnabled(false);
        jRadioButton2.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jRadioButton2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioButton2ItemStateChanged(evt);
            }
        });

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setText("Mensual");
        jRadioButton3.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jRadioButton3.setEnabled(false);
        jRadioButton3.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jRadioButton3.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioButton3ItemStateChanged(evt);
            }
        });

        buttonGroup1.add(jRadioButton4);
        jRadioButton4.setText("Una sola vez");
        jRadioButton4.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jRadioButton4.setEnabled(false);
        jRadioButton4.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jRadioButton4.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioButton4ItemStateChanged(evt);
            }
        });

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jRadioButton1)
                    .add(jRadioButton2)
                    .add(jRadioButton3)
                    .add(jRadioButton4))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(52, 52, 52)
                .add(jRadioButton1)
                .add(48, 48, 48)
                .add(jRadioButton2)
                .add(46, 46, 46)
                .add(jRadioButton3)
                .add(53, 53, 53)
                .add(jRadioButton4)
                .addContainerGap(87, Short.MAX_VALUE))
        );

        jButton1.setText("Aceptar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        panelFondo.setBackground(new java.awt.Color(216, 228, 198));
        panelFondo.setEnabled(false);
        panelFondo.setOpaque(false);
        org.jdesktop.layout.GroupLayout panelFondoLayout = new org.jdesktop.layout.GroupLayout(panelFondo);
        panelFondo.setLayout(panelFondoLayout);
        panelFondoLayout.setHorizontalGroup(
            panelFondoLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 431, Short.MAX_VALUE)
        );
        panelFondoLayout.setVerticalGroup(
            panelFondoLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 362, Short.MAX_VALUE)
        );

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(panelFondo, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                        .add(jButton1)
                        .add(13, 13, 13)
                        .add(jButton2)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(panelFondo, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 26, Short.MAX_VALUE)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jButton1)
                            .add(jButton2)))
                    .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        pack();
    }// </editor-fold>//GEN-END:initComponents
    /**Cierra la ventana*/
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
// TODO add your handling code here:
	this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed
    /**Configura los paneles para un env�o mensual*/
    private void jRadioButton3ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton3ItemStateChanged
// TODO add your handling code here:
	this.panelFondo.removeAll();
	if(pdia!=null) pdia=null;
	if(psem!=null) psem=null;
	if(pun!=null)  pun=null;
	panelFondo.revalidate();
	this.repaint();
    }//GEN-LAST:event_jRadioButton3ItemStateChanged
    /**Inicializa el contenido de los diferentes componentes de la ventana*/
    public void inicializar() {
	switch( ((ProyectoAuto)proy).getTipoEnv() ) {
	    case ProyectoAuto.DIARIO:{
		jRadioButton1.setSelected(true);
		((JSpinner)((JPanel) ((JPanel)pdia.getComponent(0)).getComponent(1)).getComponent(0)).setValue( new Integer((((ProyectoAuto)proy).getDia(0)).getHora()) );
		((JSpinner)((JPanel) ((JPanel)pdia.getComponent(0)).getComponent(1)).getComponent(2)).setValue( new Integer((((ProyectoAuto)proy).getDia(0)).getMin()) );
	    }break;
	    case ProyectoAuto.MENSUAL:{
		jRadioButton3.setSelected(true);
	    }break;
	    case ProyectoAuto.SEMANAL:{
		jRadioButton2.setSelected(true);
		for(int i=0;i<((ProyectoAuto)proy).getDias();i++) {
		    switch ((((ProyectoAuto)proy).getDia(i)).getDia())
		    {
			    case 0: psem.getCheckLunes().setSelected(true); break;
			    case 1: psem.getCheckMartes().setSelected(true); break;
			    case 2: psem.getCheckMiercoles().setSelected(true); break;
			    case 3: psem.getCheckJueves().setSelected(true); break;
			    case 4: psem.getCheckViernes().setSelected(true); break;
			    case 5: psem.getCheckSabado().setSelected(true); break;
			    case 6: psem.getCheckDomingo().setSelected(true); break;
		    }
		    JPanel c=((JPanel)panelesHoras.get(dias[ (((ProyectoAuto)proy).getDia(i)).getDia()]));
		    c.setVisible(true);
		    ((JSpinner)c.getComponent(0)).setValue( new Integer((((ProyectoAuto)proy).getDia(i)).getHora()) );
		    ((JSpinner)c.getComponent(2)).setValue( new Integer((((ProyectoAuto)proy).getDia(i)).getMin()) );
		}
	    }break;
	    case ProyectoAuto.UNA_VEZ:{
		jRadioButton4.setSelected(true);
		((JCalendar)((JPanel)pun.getComponent(0)).getComponent(0)).getDayChooser().setDay(  ((Dia)((ProyectoAuto)proy).getDia(0)).getFecha().getDia()  );
		((JCalendar)((JPanel)pun.getComponent(0)).getComponent(0)).getMonthChooser().setMonth( ((Dia)((ProyectoAuto)proy).getDia(0)).getFecha().getMes()  );
		((JCalendar)((JPanel)pun.getComponent(0)).getComponent(0)).getYearChooser().setYear( ((Dia)((ProyectoAuto)proy).getDia(0)).getFecha().getAnyo()   );
		
		((JSpinner)((JPanel) ((JPanel)pun.getComponent(0)).getComponent(1)).getComponent(0)).setValue( new Integer(((Dia)((ProyectoAuto)proy).getDia(0)).getHora()) );
		((JSpinner)((JPanel) ((JPanel)pun.getComponent(0)).getComponent(1)).getComponent(2)).setValue( new Integer(((Dia)((ProyectoAuto)proy).getDia(0)).getMin()) );
	    }break;
	}
    }
    /**Determina la periodicidad escogida y cierra la ventana*/    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
// TODO add your handling code here:
	if(pdia!=null) {
	    
	    ((ProyectoAuto)proy).eliminarDias();
	 
	    Dia d=new Dia();
	    d.setDia(0);
	    d.setHora(pdia.getHora());
	    d.setMin(pdia.getMin());
	    ((ProyectoAuto)proy).setTipoEnv(ProyectoAuto.DIARIO);
	    ((ProyectoAuto)proy).anyadirDia(d);
	} else if(psem!=null) {
	    
	    ((ProyectoAuto)proy).eliminarDias();
	   
	    ((ProyectoAuto)proy).setTipoEnv(ProyectoAuto.SEMANAL);
	    Dia[]AD=psem.getDiasSelec();
	    for(int i=0;i<7;i++) {
		if (AD[i]!=null)
		    ((ProyectoAuto)proy).anyadirDia(AD[i]);
	    }
	} else if (pun!=null) {
	    ((ProyectoAuto)proy).eliminarDias();
	    ((ProyectoAuto)proy).setTipoEnv(ProyectoAuto.UNA_VEZ);
	    Dia d=new Dia();
	    d.setFecha(pun.obtenerFecha());
	    d.setHora(pun.obtenerHora()[0]);
	    d.setMin(pun.obtenerHora()[1]);
	    
	    d.setDia(d.getFecha().obtenerDiaSemana());
	    ((ProyectoAuto)proy).anyadirDia(d);
	    
	    
	}
	this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed
     /**Configura los paneles para un env�o de una sola vez*/
    private void jRadioButton4ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton4ItemStateChanged
// TODO add your handling code here:
	this.panelFondo.removeAll();
	if(pdia!=null) pdia=null;
	if(psem!=null) psem=null;
	if(pun!=null)  pun=null;
	pun=new PanelUnico();
	pun.setSize(450,360);
	panelFondo.add(pun,0);
	pun.setVisible(true);
	panelFondo.revalidate();
	this.repaint();
    }//GEN-LAST:event_jRadioButton4ItemStateChanged
     /**Configura los paneles para un env�o diario*/
    private void jRadioButton1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton1ItemStateChanged
// TODO add your handling code here:
	this.panelFondo.removeAll();
	if(pdia!=null) pdia=null;
	if(psem!=null) psem=null;
	if(pun!=null)  pun=null;
	pdia=new PanelDiario();
	pdia.setSize(450,360);
	panelFondo.add(pdia,0);
	pdia.setVisible(true);
	panelFondo.revalidate();
	this.repaint();
    }//GEN-LAST:event_jRadioButton1ItemStateChanged
     /**Configura los paneles para un env�o semanal*/
    private void jRadioButton2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton2ItemStateChanged
// TODO add your handling code here:
	this.panelFondo.removeAll();
	if(pdia!=null) pdia=null;
	if(psem!=null) psem=null;
	if(pun!=null)  pun=null;
	psem=new PanelSemanal();
	psem.setSize(450,360);
	panelFondo.add(psem,0);
	psem.setVisible(true);
	panelFondo.revalidate();
	this.repaint();
    }//GEN-LAST:event_jRadioButton2ItemStateChanged
    /**Tabla de mapeo para los paneles con las horas*/ 
    private Hashtable panelesHoras;
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JPanel panelFondo;
    // End of variables declaration//GEN-END:variables
    /**Interfaz para env�os semanales*/
    PanelSemanal psem;
    /**Interfaz para env�os diarios*/
    PanelDiario pdia;
    /**Interfaz para env�os de una sola vez*/
    PanelUnico pun;
    /**Proyecto del que se leen las caracteristicas*/
    Proyecto proy;
    /**Contenedor de VDetallesTipo*/
    JInternalFrame padre;
}