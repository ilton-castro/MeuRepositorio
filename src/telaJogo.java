
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ilton
 */
public class telaJogo extends javax.swing.JFrame {

    /**
     * Creates new form telaJogo
     */
    public telaJogo() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panPric = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtOpcao1 = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();
        txtOpcao2 = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        txtOpcao3 = new javax.swing.JSpinner();
        lblOpcao1 = new javax.swing.JLabel();
        lblOpcao2 = new javax.swing.JLabel();
        lblOpcao3 = new javax.swing.JLabel();
        lblResultado = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        btnResp = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Jframe1");
        setResizable(false);

        panPric.setForeground(new java.awt.Color(102, 255, 102));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("1 - São operadores de atribuição no JAVA +=,-=,*=,/= e %=?");

        txtOpcao1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtOpcao1.setModel(new javax.swing.SpinnerNumberModel(0, 0, 2, 1));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("2 - Quais são os operadores lógicos no java?");

        txtOpcao2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtOpcao2.setModel(new javax.swing.SpinnerNumberModel(0, 0, 4, 1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setText("3 - São operadores unários no JAVA ++ e --?");

        txtOpcao3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtOpcao3.setModel(new javax.swing.SpinnerNumberModel(0, 0, 2, 1));

        lblOpcao1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblOpcao1.setForeground(new java.awt.Color(255, 0, 0));

        lblOpcao2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblOpcao2.setForeground(new java.awt.Color(255, 0, 51));

        lblOpcao3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblOpcao3.setForeground(new java.awt.Color(255, 0, 0));

        lblResultado.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblResultado.setForeground(new java.awt.Color(255, 51, 51));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setText(" Digite 1 para CERTO ou 2 para Errado");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setText(" Digite 1 para CERTO ou 2 para Errado");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setText("Escolha a opção correta entre as alternativa de 1 a 4.");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setText("1 - &&&, ||, ^, !");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel9.setText("2 - ||, ^, !, &&");

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel10.setText("3 - ||, ^, !!, &&");

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel11.setText("4 - &&, ^, !, |||");

        btnResp.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnResp.setText("Confirma resposta");
        btnResp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRespActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panPricLayout = new javax.swing.GroupLayout(panPric);
        panPric.setLayout(panPricLayout);
        panPricLayout.setHorizontalGroup(
            panPricLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panPricLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panPricLayout.createSequentialGroup()
                .addGroup(panPricLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panPricLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 511, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panPricLayout.createSequentialGroup()
                        .addGroup(panPricLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(panPricLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(panPricLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(btnResp))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(panPricLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(panPricLayout.createSequentialGroup()
                                    .addGap(462, 462, 462)
                                    .addGroup(panPricLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(txtOpcao2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtOpcao3, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(panPricLayout.createSequentialGroup()
                                    .addGap(48, 48, 48)
                                    .addGroup(panPricLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel8)
                                        .addComponent(jLabel7)
                                        .addComponent(jLabel9)
                                        .addComponent(jLabel10)
                                        .addComponent(jLabel11))))
                            .addGroup(panPricLayout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtOpcao1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panPricLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panPricLayout.createSequentialGroup()
                                .addComponent(lblOpcao3, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                                .addGap(104, 104, 104))
                            .addComponent(lblOpcao1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblOpcao2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        panPricLayout.setVerticalGroup(
            panPricLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panPricLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panPricLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtOpcao1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblOpcao1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panPricLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panPricLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtOpcao2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7))
                    .addComponent(lblOpcao2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel11)
                .addGap(17, 17, 17)
                .addGroup(panPricLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panPricLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(txtOpcao3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblOpcao3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(panPricLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblResultado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnResp, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/jogo tela principal.png"))); // NOI18N

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/tecla iniciar pergunta .PNG"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panPric, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(110, 110, 110)
                        .addComponent(jLabel12)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, 22)
                .addComponent(panPric, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRespActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRespActionPerformed
           // Iniciando o programa de perguntas e resposta
        //Variavel pontos
        int pontos = 0;
        
        //Recebimento dos dados que serão recebidos pelo mentodo get
        int opcao1 = Integer.parseInt(txtOpcao1.getValue().toString());
        int opcao2 = Integer.parseInt(txtOpcao2.getValue().toString());
        int opcao3 = Integer.parseInt(txtOpcao3.getValue().toString());

        // Primeira questão onde sera realizado uma comparação e será printado na tela se está correto ou não o resultado e também será pontudado por cada resposta correta 
        if((txtOpcao1.getValue().equals(1))){
           //Nesse ponto será a tribuido a pontuação para usuário de 10 pontos
           pontos=pontos + 10;
           //Será printado para usuário os parabéns e a pontuação 
           lblOpcao1.setText("Parabéns acertou " + pontos  + " Pontos");
           
        }
        else{
            lblOpcao1.setText("Errou tente depois");
            // Será difivido a pontuação por dois 
            pontos=pontos/2;
            // Será exibido uma caixa de texto informando para usuário a pontuação e finalizando pois o mesmo errou.
            JOptionPane.showMessageDialog(null, "Sua pontuação foi: " + pontos + "  Por esse motivo o jogo será FINALIZADO!");
            // Após tecla OK na caixa de texto será fechado o jogo.
            System.exit(0);
            
        }
            // Segunda questão onde sera realizado uma comparação e será printado na tela se está correto ou não o resultado e também será pontudado por cada resposta correta 
            if((txtOpcao2.getValue().equals(2))){
                //Nesse ponto será a tribuido a pontuação para usuário de 10 pontos
                pontos=pontos + 10;
                //Será printado para usuário os parabéns e a pontuação 
                lblOpcao2.setText("Parabéns acertou " + pontos + " Pontos");
                
            }
            else{
                lblOpcao2.setText("Errou tente depois"); 
                // Será difivido a pontuação por dois 
                pontos=pontos/2;
                // Será exibido uma caixa de texto informando para usuário a pontuação e finalizando pois o mesmo errou.
                //JOptionPane.showMessageDialog(null, "Sua pontuação foi: " + pontos + " Por esse motivo o jogo será FINALIZADO!");
                // Após tecla OK na caixa de texto será fechado o jogo.
                //System.exit(0);
            }
                // Terceira questão onde sera realizado uma comparação e será printado na tela se está correto ou não o resultado e também será pontudado por cada resposta correta 
                if((txtOpcao3.getValue().equals(1))){
                    //Nesse ponto será a tribuido a pontuação para usuário de 10 pontos
                    pontos=pontos + 10;
                    //Será printado para usuário os parabéns e a pontuação 
                    lblOpcao3.setText("Parabéns acertou " + pontos  + " Pontos");
                    
                }
                else{
                    lblOpcao3.setText("Errou tente depois");
                     // Será difivido a pontuação por dois 
                    pontos=pontos/2;
                    // Será exibido uma caixa de texto informando para usuário a pontuação e finalizando pois o mesmo errou.
                    //JOptionPane.showMessageDialog(null, "Sua pontuação foi: " + pontos + " Por esse motivo o jogo será FINALIZADO!");
                    // Após tecla OK na caixa de texto será fechado o jogo.
                    //System.exit(0);           

                }
        
        // Aqui vamos mostra a pontuação do jogado e informa se o mesmo deve ir ou não para a proxima fase
        if(pontos == 30){
        lblResultado.setText("Você acerto tudo " + pontos + " Parabéns!!! ");
        //Criando um objeto
        telaJogo2 tela = new telaJogo2();
        //Mensagem informando para usuário 
        JOptionPane.showMessageDialog(null, "Seja bem vindo a segunda fase!!!");
        //Chama a tela e deixa visivel
        tela.setVisible(true);
        //Fecha a tela    
            dispose();
        }
        else if (pontos >= 10){
        lblResultado.setText("Sua pontuação é " + pontos + " atingiu a média!!!");
        //Criando um objeto
        telaJogo2 tela = new telaJogo2();
        //Mensagem informando para usuário
        JOptionPane.showMessageDialog(null, "Seja bem vindo a segunda fase!!!");
        //Chama a tela e deixa visivel
        tela.setVisible(true);
        //Fecha a tela    
            dispose();
        
        }
        else{
        //Mensagem informando para usuário que é o fim do jogo
        lblResultado.setText("Sua pontuação não foi o suficente  GAME OVER!!!");
        JOptionPane.showMessageDialog(null, "Sua pontuação não foi o suficente  GAME OVER!!!");
        System.exit(0);
        }
    }//GEN-LAST:event_btnRespActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(telaJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaJogo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnResp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblOpcao1;
    private javax.swing.JLabel lblOpcao2;
    private javax.swing.JLabel lblOpcao3;
    private javax.swing.JLabel lblResultado;
    private javax.swing.JPanel panPric;
    private javax.swing.JSpinner txtOpcao1;
    private javax.swing.JSpinner txtOpcao2;
    private javax.swing.JSpinner txtOpcao3;
    // End of variables declaration//GEN-END:variables
}
