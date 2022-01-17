package Projeto_Universidade_Bruno_Soares_Veríssimo;

import java.util.ArrayList;
import javax.swing.JOptionPane;


public class CadastroAluno extends javax.swing.JFrame {
	ArrayList<Tecnico> Tecno = new ArrayList();
    ArrayList<Aluno> Estudante = new ArrayList();
    ArrayList<Funcionario> Servidor = new ArrayList();
    ArrayList<Professor> Docente=new ArrayList();
    ArrayList<Curso> Grupo =  new ArrayList();
    ArrayList<Disciplina> Materias = new ArrayList();
    private String Nome1;
    private String Endereco1;
    private String Telefone1;
    private String CPF;
    private String ctps;
    private double Salario1;
    
    public CadastroAluno() {
        initComponents();
    }

    public CadastroAluno(ArrayList<Aluno> Estudantes, ArrayList<Tecnico> Tecnos,
    	    ArrayList<Funcionario> Servidores, ArrayList<Professor> Docentes, ArrayList<Curso> Grupos, 
    	    ArrayList<Disciplina> Materias1) {
    		Estudante=Estudantes;
    	     Tecno=Tecnos;
    	     Servidor=Servidores;
    	     Docente=Docentes;
    	     Grupo=Grupos;
    	     Materias=Materias1;
    }
    
    private void initComponents() {
    	P1 = new javax.swing.JPanel();
        L1 = new javax.swing.JLabel();
        P2 = new javax.swing.JPanel();
        L2 = new javax.swing.JLabel();
        L3 = new javax.swing.JLabel();
        L4 = new javax.swing.JLabel();
        L5 = new javax.swing.JLabel();
        Cadastrar = new javax.swing.JButton();
        nome = new javax.swing.JTextField();
        Matricula = new javax.swing.JTextField();
        cpf = new javax.swing.JTextField();

        javax.swing.GroupLayout P1Layout = new javax.swing.GroupLayout(P1);
        P1.setLayout(P1Layout);
        P1Layout.setHorizontalGroup(
            P1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        P1Layout.setVerticalGroup(
            P1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        L1.setText("L1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        L2.setText("Cadastrar alunos");

        L3.setText("Nome:");

        L4.setText("Matrícula: ");

        L5.setText("CPF: ");

        Cadastrar.setText("Cadastrar");
        Cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evento) {
                CadastrarActionPerformed(evento);
            }
        });

        javax.swing.GroupLayout P2Layout = new javax.swing.GroupLayout(P2);
        P2.setLayout(P2Layout);
        P2Layout.setHorizontalGroup(
            P2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(P2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(L2, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(P2Layout.createSequentialGroup()
                        .addGroup(P2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(L5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(L4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                            .addComponent(L3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(26, 26, 26)
                        .addGroup(P2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nome)
                            .addComponent(Matricula)
                            .addComponent(cpf, javax.swing.GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE))))
                .addContainerGap())
            .addGroup(P2Layout.createSequentialGroup()
                .addGap(148, 148, 148)
                .addComponent(Cadastrar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        P2Layout.setVerticalGroup(
            P2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(L2)
                .addGap(18, 18, 18)
                .addGroup(P2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(L3)
                    .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(P2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(L4)
                    .addComponent(Matricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(P2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(L5)
                    .addComponent(cpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addComponent(Cadastrar)
                .addContainerGap(74, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(P2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(P2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }

    private void CadastrarActionPerformed(java.awt.event.ActionEvent evento) {
        Aluno al = new Aluno();
        al.setNome(nome.getText());
        al.setMatricula(Matricula.getText());
        al.setCPF(cpf.getText());
        Estudante.add(al);
        JOptionPane.showMessageDialog(null, "Cadastro realizado!");
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
            java.util.logging.Logger.getLogger(CadastroAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroAluno().setVisible(true);
            }
        });
    }
    private javax.swing.JLabel L4;
    private javax.swing.JLabel L5;
    private javax.swing.JPanel P1;
    private javax.swing.JPanel P2;
    private javax.swing.JTextField Matricula;
    private javax.swing.JTextField nome;
    private javax.swing.JButton Cadastrar;
    private javax.swing.JTextField cpf;
    private javax.swing.JLabel L1;
    private javax.swing.JLabel L2;
    private javax.swing.JLabel L3;
}