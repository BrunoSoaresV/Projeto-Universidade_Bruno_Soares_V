package Projeto_Universidade_Bruno_Soares_Veríssimo;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class Doc extends javax.swing.JFrame {
    ArrayList<Tecnico>  Tecno=new ArrayList();
    ArrayList<Aluno> Estudante=new ArrayList();
    ArrayList<Funcionario> Servidor=new ArrayList();
    ArrayList<Professor> Docente=new ArrayList();
    ArrayList<Curso> Grupo = new ArrayList();
    ArrayList<Disciplina> Materias = new ArrayList();
    private String Nome;
    private String Endereco;
    private String Telefone;
    private String CPF;
    private String CTPS;
    private double Salario;
  
    public Doc() {
        initComponents();
    }
    public Doc(String Nome1, String cpf, String Endereco1, String Telefone1, String ctps, 
    	    double salario, ArrayList<Aluno> Estudantes, ArrayList<Tecnico> Tecnos,
    	    ArrayList<Funcionario> Servidores, ArrayList<Professor> Docentes, ArrayList<Curso> Grupos, 
    	    ArrayList<Disciplina> Materias1) {
    	    initComponents();
    	     Nome=Nome1;
    	     Endereco=Endereco1;
    	     Telefone=Telefone1;
    	     CPF=cpf;
    	     CTPS=ctps;
    	     Salario=salario;
    	     Estudante=Estudantes;
    	     Tecno=Tecnos;
    	     Servidor=Servidores;
    	     Docente=Docentes;
    	     Grupo=Grupos;
    	     Materias=Materias1;
    }

    private void initComponents() {
    	Panel1 = new javax.swing.JPanel();
        Label1 = new javax.swing.JLabel();
        Label2 = new javax.swing.JLabel();
        Representacao = new javax.swing.JTextField();
        Atuacao = new javax.swing.JTextField();
        Encerrar = new javax.swing.JButton();
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        Label1.setText("Representação: ");
        Label2.setText("Área de pesquisa: ");
        Encerrar.setText("Cadastrar");
        Encerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evento) {
                EncerrarActionPerformed(evento);
            }
        });

        javax.swing.GroupLayout Panel1Layout = new javax.swing.GroupLayout(Panel1);
        Panel1.setLayout(Panel1Layout);
        Panel1Layout.setHorizontalGroup(
            Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Label1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Label2, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Representacao)
                    .addComponent(Atuacao))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel1Layout.createSequentialGroup()
                .addContainerGap(311, Short.MAX_VALUE)
                .addComponent(Encerrar)
                .addGap(307, 307, 307))
        );
        Panel1Layout.setVerticalGroup(
            Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label1)
                    .addComponent(Representacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label2)
                    .addComponent(Atuacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(Encerrar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
    private void EncerrarActionPerformed(java.awt.event.ActionEvent evento) {
        Professor Doc=new Professor(Nome,Endereco,Telefone,CPF,CTPS, Salario, Representacao.getText(), Atuacao.getText());
        Docente.add(Doc);
        JOptionPane.showMessageDialog(null,"Cadastro realizado!");
    }

    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Doc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Doc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Doc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Doc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Doc().setVisible(true);
            }
        });
    }
    private javax.swing.JButton Encerrar;
    private javax.swing.JLabel Label1;
    private javax.swing.JLabel Label2;
    private javax.swing.JTextField Atuacao;
    private javax.swing.JPanel Panel1;
    private javax.swing.JTextField Representacao;
}