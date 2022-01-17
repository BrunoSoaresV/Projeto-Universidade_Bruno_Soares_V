package Projeto_Universidade_Bruno_Soares_Veríssimo;

import java.util.ArrayList;
import javax.swing.JOptionPane;


public class CadastroDisciplina extends javax.swing.JFrame {
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
    public CadastroDisciplina() {
        initComponents();
    }	     
    public CadastroDisciplina (ArrayList<Aluno> Estudantes, ArrayList<Tecnico> Tecnos,
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
        codigo = new javax.swing.JTextField();
        nome = new javax.swing.JTextField();
        ch = new javax.swing.JTextField();
        Jlist = new javax.swing.JComboBox<>();
        cadastrar = new javax.swing.JButton();
        Voltar = new javax.swing.JButton();
        L5 = new javax.swing.JLabel();
        cursos = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        L1.setText("Código: ");

        L2.setText("Nome: ");

        L3.setText("Carga harária: ");

        L4.setText("Professor: ");

        Jlist.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleção de professores" }));
        Jlist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evento) {
                JlistActionPerformed(evento);
            }
        });

        cadastrar.setText("Cadastrar");
        cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evento) {
                cadastrarActionPerformed(evento);
            }
        });

        Voltar.setText("Voltar");
        Voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evento) {
                VoltarActionPerformed(evento);
            }
        });

        L5.setText("Curso: ");

        cursos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleção de cursos" }));

        javax.swing.GroupLayout P1Layout = new javax.swing.GroupLayout(P1);
        P1.setLayout(P1Layout);
        P1Layout.setHorizontalGroup(
            P1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(P1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(L5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(L1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(L2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(L3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(L4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(P1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(codigo)
                    .addComponent(nome)
                    .addComponent(ch)
                    .addComponent(Jlist, 0, 446, Short.MAX_VALUE)
                    .addComponent(cursos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(P1Layout.createSequentialGroup()
                .addComponent(cadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Voltar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(12, 12, 12))
        );
        P1Layout.setVerticalGroup(
            P1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(P1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(L1)
                    .addComponent(codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(P1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(L2)
                    .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(P1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(L3)
                    .addComponent(ch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(P1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(L4)
                    .addComponent(Jlist, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(P1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(L5)
                    .addComponent(cursos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(P1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cadastrar)
                    .addComponent(Voltar))
                .addContainerGap(35, Short.MAX_VALUE))
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
        );

        pack();
    }

    private void cadastrarActionPerformed(java.awt.event.ActionEvent evento) {
        if(Jlist.getSelectedItem().equals("Seleção de professores") || cursos.getSelectedItem().equals("Seleção de cursos")){
            JOptionPane.showMessageDialog(null, "Seleção de professores ou cursos");
        }else{
            Disciplina disci=new Disciplina();
            disci.setCarga_horaria(Integer.valueOf(ch.getText()));
            disci.setCodigo(Integer.valueOf(codigo.getText()));
            disci.setNome(nome.getText());
            disci.setProfessor(x((String) Jlist.getSelectedItem()));
            disci.setCurso(cx((String) cursos.getSelectedItem()));
            Materias.add(disci);
            JOptionPane.showMessageDialog(null, "Cadastrado!");
        }
    }

    private void JlistActionPerformed(java.awt.event.ActionEvent evento) {
        
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
            java.util.logging.Logger.getLogger(CadastroDisciplina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> {
            new CadastroDisciplina().setVisible(true);
        });
    }
    public void consulta15(){
        if(0<Docente.size()){
            for(int t=0;t<Docente.size();t++){
                Jlist.addItem(Docente.get(t).getNome());
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Não há registros.");
        }
        }
    public void consulta16(){
        if(0<Grupo.size()){
            for(int t=0;t<Grupo.size();t++){
                cursos.addItem(Grupo.get(t).getNome());
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Não há registros.");
        }
        }
    public Professor x(String nome){
        for(int t=0;t<Docente.size();t++){
            if(nome.equals(Docente.get(t).getNome())){
                return Docente.get(t);
            }
        }
        return null;
    }
    public Curso cx(String nome){
        for(int t=0;t<Grupo.size();t++){
            if(nome.equals(Grupo.get(t).getNome())){
                return Grupo.get(t);
            }
        }
        return null;
    }
    private javax.swing.JLabel L2;
    private javax.swing.JLabel L3;
    private javax.swing.JLabel L4;
    private javax.swing.JLabel L5;
    private javax.swing.JPanel P1;
    private javax.swing.JComboBox<String> Jlist;
    private javax.swing.JTextField nome;
    private javax.swing.JButton Voltar;
    private javax.swing.JButton cadastrar;
    private javax.swing.JTextField ch;
    private javax.swing.JTextField codigo;
    private javax.swing.JComboBox<String> cursos;
    private javax.swing.JLabel L1;
}