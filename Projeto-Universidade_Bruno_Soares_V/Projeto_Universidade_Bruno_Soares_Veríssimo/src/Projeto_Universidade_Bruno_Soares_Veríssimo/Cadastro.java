package Projeto_Universidade_Bruno_Soares_Veríssimo;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class Cadastro extends javax.swing.JFrame {
	ArrayList<Tecnico> Tecno = new ArrayList();
    ArrayList<Aluno> Estudante = new ArrayList();
    ArrayList<Funcionario> Servidor = new ArrayList();
    ArrayList<Professor> Docente=new ArrayList();
    ArrayList<Curso> Grupo =  new ArrayList();
    ArrayList<Disciplina> Materias = new ArrayList();
    private String Nome1;
    private String Endereco1;
    private String Telefone1;
    private String cpf;
    private String ctps;
    private double Salario1;
 
    public Cadastro() {
        initComponents();
    }

    public Cadastro(String Nome1, String cpf, String Endereco1, String Telefone1, String ctps, 
    	    double Salario1, ArrayList<Aluno> Estudantes, ArrayList<Tecnico> Tecnos,
    	    ArrayList<Funcionario> Servidores, ArrayList<Professor> Docentes, ArrayList<Curso> Grupos, 
    	    ArrayList<Disciplina> Materias1) {
    	    initComponents();
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
        L2 = new javax.swing.JLabel();
        L3 = new javax.swing.JLabel();
        L4 = new javax.swing.JLabel();
        L5 = new javax.swing.JLabel();
        L6 = new javax.swing.JLabel();
        c2 = new javax.swing.JCheckBox();
        Encerrar = new javax.swing.JButton();
        nome = new javax.swing.JTextField();
        endereco = new javax.swing.JTextField();
        telefone = new javax.swing.JTextField();
        CPF = new javax.swing.JTextField();
        CTPS = new javax.swing.JTextField();
        salario = new javax.swing.JTextField();
        L7 = new javax.swing.JLabel();
        c1 = new javax.swing.JCheckBox();
        c3 = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        L1.setText("Nome: ");

        L2.setText("Endereço: ");

        L3.setText("Telefone: ");

        L4.setText("CPF: ");

        L5.setText("CTPS: ");

        L6.setText("Salario: ");

        c2.setText("Professor ");
        c2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evento) {
                c2ActionPerformed(evento);
            }
        });

        Encerrar.setText("Cadastrar");
        Encerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evento) {
                EncerrarActionPerformed(evento);
            }
        });

        L7.setText("Função exercida: ");

        c1.setText("Funcionário ");
        c1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evento) {
                c1ActionPerformed(evento);
            }
        });

        c3.setText("Técnico ");
        c3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evento) {
                c3ActionPerformed(evento);
            }
        });

        javax.swing.GroupLayout P1Layout = new javax.swing.GroupLayout(P1);
        P1.setLayout(P1Layout);
        P1Layout.setHorizontalGroup(
            P1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P1Layout.createSequentialGroup()
                .addGroup(P1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(P1Layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(L7, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(P1Layout.createSequentialGroup()
                        .addGap(299, 299, 299)
                        .addComponent(Encerrar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(P1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(P1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(P1Layout.createSequentialGroup()
                        .addGroup(P1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(L1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(L2, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
                            .addComponent(L3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(L4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(L5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(L6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(P1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nome)
                            .addComponent(endereco)
                            .addComponent(telefone)
                            .addComponent(CPF)
                            .addComponent(CTPS)
                            .addComponent(salario, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(20, 20, 20))
                    .addGroup(P1Layout.createSequentialGroup()
                        .addComponent(c1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addComponent(c2, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                        .addComponent(c3, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34))))
        );
        P1Layout.setVerticalGroup(
            P1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(P1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(L1)
                    .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(P1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(L2)
                    .addComponent(endereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(P1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(L3)
                    .addComponent(telefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(P1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(L4)
                    .addComponent(CPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(P1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(L5)
                    .addComponent(CTPS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(P1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(L6)
                    .addComponent(salario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(L7)
                .addGap(18, 18, 18)
                .addGroup(P1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(c2)
                    .addComponent(c1)
                    .addComponent(c3))
                .addGap(18, 18, 18)
                .addComponent(Encerrar)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }

    private void c1ActionPerformed(java.awt.event.ActionEvent evento) {
        c2.setSelected(false);
        c3.setSelected(false);
    }

    private void c2ActionPerformed(java.awt.event.ActionEvent evento) {
        
        c1.setSelected(false);
        c3.setSelected(false);
    }

    private void EncerrarActionPerformed(java.awt.event.ActionEvent evento) {
          Nome1=nome.getText();
          Endereco1=endereco.getText();
          Telefone1=telefone.getText();
          cpf=CPF.getText();
          ctps=CTPS.getText();
          Salario1=Double.valueOf(salario.getText());
          
        if(c1.isSelected()==true || c2.isSelected()==true || c3.isSelected()==true){ 
            if(c1.isSelected()==true){
                Funcionario funcionario = new Funcionario();
                funcionario.setNome(nome.getText());
                funcionario.setCpf(CPF.getText());
                funcionario.setEndereco(endereco.getText());
                funcionario.setTelefone(telefone.getText());
                funcionario.setCtps(CTPS.getText());
                funcionario.setSalario(Double.valueOf(salario.getText()));
                Servidor.add(funcionario);
                JOptionPane.showMessageDialog(null,"Cadastro realizado!");
            }
            if(c2.isSelected()==true){
                Doc Professor = new Doc();
                Professor.setLocationRelativeTo(null);
                Professor.setVisible(true); 
                dispose();
            }
            if(c3.isSelected()==true){
                Tecnologo t= new Tecnologo();
                t.setLocationRelativeTo(null);
                t.setVisible(true); 
                dispose();
            }
       }else{
           JOptionPane.showMessageDialog(null,"Qual é a sua função?");
       }
    }
    private void c3ActionPerformed(java.awt.event.ActionEvent evento) {
        c1.setSelected(false);
        c2.setSelected(false);
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
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cadastro().setVisible(true);
            }
        });
    }
    private javax.swing.JLabel L1;
    private javax.swing.JLabel L2;
    private javax.swing.JLabel L3;
    private javax.swing.JLabel L4;
    private javax.swing.JLabel L5;
    private javax.swing.JLabel L6;
    private javax.swing.JLabel L7;
    private javax.swing.JCheckBox c1;
    private javax.swing.JCheckBox c2;
    private javax.swing.JCheckBox c3;
    private javax.swing.JTextField CPF;
    private javax.swing.JTextField CTPS;
    private javax.swing.JTextField endereco;
    private javax.swing.JButton Encerrar;
    private javax.swing.JPanel P1;
    private javax.swing.JTextField nome;
    private javax.swing.JTextField salario;
    private javax.swing.JTextField telefone;
}