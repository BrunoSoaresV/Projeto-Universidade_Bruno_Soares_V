package Projeto_Universidade_Bruno_Soares_Veríssimo;


import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class Tecnologo extends javax.swing.JFrame {
    ArrayList<Tecnico> Tecno = new ArrayList();
    ArrayList<Aluno> Estudante = new ArrayList();
    ArrayList<Funcionario> Servidor = new ArrayList();
    ArrayList<Professor> Docente=new ArrayList();
    ArrayList<Curso> Grupo =  new ArrayList();
    ArrayList<Disciplina> Materias = new ArrayList();
    private String Nome;
    private String Endereco;
    private String Telefone;
    private String CPF;
    private String CTPS;
    private double Salario;
   
    public Tecnologo() {
        initComponents();
    }
    Tecnologo(String Nome1, String cpf, String Endereco1, String Telefone1, String ctps, 
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

        Label1 = new javax.swing.JLabel();
        Representacao  = new javax.swing.JTextField();
        Cadastrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Label1.setText("Representação: ");

        Cadastrar.setText("Cadastrar");
        Cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evento) {
                CadastrarActionPerformed(evento);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Label1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Representacao)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(270, 270, 270)
                .addComponent(Cadastrar)
                .addContainerGap(278, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label1)
                    .addComponent(Representacao , javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addComponent(Cadastrar)
                .addContainerGap(24, Short.MAX_VALUE)));
        pack();
    }
    private void CadastrarActionPerformed(java.awt.event.ActionEvent evento) {
        Tecnico t=new Tecnico(Nome, Endereco, Telefone, CPF, CTPS, Salario,Representacao.getText());
        Tecno.add(t);
        JOptionPane.showMessageDialog(null,"Cadastro efutuado!");
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
            java.util.logging.Logger.getLogger(Tecnologo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tecnologo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tecnologo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tecnologo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tecnologo().setVisible(true); } });
    }
    private javax.swing.JLabel Label1;
    private javax.swing.JTextField Representacao ;
    private javax.swing.JButton Cadastrar;
}