package Projeto_Universidade_Bruno_Soares_Veríssimo;

import java.util.ArrayList;
import javax.swing.DefaultListModel;

public class Consulta extends javax.swing.JFrame {
    ArrayList<Tecnico> Tecno=new ArrayList();
    ArrayList<Aluno> Estudante=new ArrayList();
    ArrayList<Funcionario> Servidor=new ArrayList();
    ArrayList<Professor> Docente=new ArrayList();
    ArrayList<Curso> Grupo = new ArrayList();
    ArrayList<Disciplina> Materias = new ArrayList();
    
    public Consulta() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    public Consulta(ArrayList<Aluno> Estudantes, ArrayList<Tecnico> Tecnos, 
    	    ArrayList<Funcionario> Servidores, ArrayList<Professor> Docentes,ArrayList<Curso> Grupos,
    	    int ar,ArrayList<Disciplina> Materias1) {
    	        initComponents();
    	        Estudante=Estudantes;
    	        Tecno=Tecnos;
    	        Servidor=Servidores;
    	        Docente=Docentes;
    	        Grupo=Grupos;
    	        Materias=Materias1;
    	        Consulta(ar);
    }

    private void initComponents() {

        Panel1 = new javax.swing.JPanel();
        Pane1 = new javax.swing.JScrollPane();
        JList = new javax.swing.JList<>();
        Voltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Pane1.setViewportView(JList);

        Voltar.setText("Voltar");
        Voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evento) {
                VoltarActionPerformed(evento);
            }
        });

        javax.swing.GroupLayout Panel1Layout = new javax.swing.GroupLayout(Panel1);
        Panel1.setLayout(Panel1Layout);
        Panel1Layout.setHorizontalGroup(
            Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Pane1)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel1Layout.createSequentialGroup()
                .addContainerGap(284, Short.MAX_VALUE)
                .addComponent(Voltar)
                .addGap(272, 272, 272))
        );
        Panel1Layout.setVerticalGroup(
            Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Pane1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Voltar)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }
    private void VoltarActionPerformed(java.awt.event.ActionEvent evento) {
    }
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Consulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> {
            new Consulta().setVisible(true);
        });
    }
    public void Consulta(int ar){
         DefaultListModel list = new  DefaultListModel ();
        switch(ar){
            case 1:
                        for(int t=0; t<Estudante.size(); t++){
                        list.addElement(Estudante.get(t));
                        }
                        JList.setModel(list);
            break;
            case 2:
                        for(int t=0;t<Tecno.size();t++){
                        list.addElement(Tecno.get(t));
                        }
                        JList.setModel(list);
            break;
            case 3:
                        for(int t=0;t<Servidor.size();t++){
                        list.addElement(Servidor.get(t));
                        }
                        JList.setModel(list);
            break;
            case 4:
                        for(int t=0;t<Docente.size();t++){
                        list.addElement(Docente.get(t));
                        }
                        JList.setModel(list);
            break;
            case 5:
                        for(int t=0;t<Grupo.size();t++){
                        list.addElement(Grupo.get(t));
                        }
                        JList.setModel(list);
            break;
            case 6:
                        for(int t=0;t<Materias.size();t++){
                        list.addElement(Materias.get(t));
                        }
                        JList.setModel(list);
            break;
        }
    }
    private javax.swing.JScrollPane Pane1;
    private javax.swing.JList<String> JList;
    private javax.swing.JPanel Panel1;
    private javax.swing.JButton Voltar;
}