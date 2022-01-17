package Projeto_Universidade_Bruno_Soares_Veríssimo;


import java.util.ArrayList;
import javax.swing.JOptionPane;


public class CadastroCurso extends javax.swing.JFrame {
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
    
    public CadastroCurso() {
        initComponents();
    }

    public CadastroCurso(ArrayList<Aluno> Estudantes, ArrayList<Tecnico> Tecnos,
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
        L2 = new javax.swing.JLabel();
        L3 = new javax.swing.JLabel();
        L4 = new javax.swing.JLabel();
        Codigo = new javax.swing.JTextField();
        nome = new javax.swing.JTextField();
        Duracao = new javax.swing.JTextField();
        Encerrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        L1.setText("Cadastrar Curso");

        L2.setText("Código: ");

        L3.setText("Nome: ");

        L4.setText("Duração: ");

        Encerrar.setText("Cadastrar");
        Encerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evento) {
                EncerrarActionPerformed(evento);
            }
        });

        javax.swing.GroupLayout P1Layout = new javax.swing.GroupLayout(P1);
        P1.setLayout(P1Layout);
        P1Layout.setHorizontalGroup(
            P1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(P1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(L1, javax.swing.GroupLayout.DEFAULT_SIZE, 376, Short.MAX_VALUE)
                    .addGroup(P1Layout.createSequentialGroup()
                        .addGroup(P1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(L2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(L3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(L4, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(P1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Codigo)
                            .addComponent(nome)
                            .addComponent(Duracao))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, P1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Encerrar)
                .addGap(155, 155, 155))
        );
        P1Layout.setVerticalGroup(
            P1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P1Layout.createSequentialGroup()
                .addComponent(L1)
                .addGap(18, 18, 18)
                .addGroup(P1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(L2)
                    .addComponent(Codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(P1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(L3)
                    .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(P1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(L4)
                    .addComponent(Duracao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(Encerrar)
                .addGap(0, 28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(P1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(P1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );  pack(); }
    private void EncerrarActionPerformed(java.awt.event.ActionEvent evento) {
        Curso cur=new Curso();
        cur.setCodigo(Integer.valueOf(Codigo.getText()));
        cur.setDuracao(Integer.valueOf(Duracao.getText()));
        cur.setNome(nome.getText());
        Grupo.add(cur);
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
            java.util.logging.Logger.getLogger(CadastroCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroCurso().setVisible(true); }
        });
    }
    private javax.swing.JLabel L1;
    private javax.swing.JLabel L2;
    private javax.swing.JLabel L3;
    private javax.swing.JLabel L4;
    private javax.swing.JPanel P1;
    private javax.swing.JTextField nome;
    private javax.swing.JTextField Codigo;
    private javax.swing.JTextField Duracao;
    private javax.swing.JButton Encerrar;
}
