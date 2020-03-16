import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Core extends javax.swing.JFrame {


    public Core() {
        initComponents();
    }


    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        mailMamangerLabel = new java.awt.Label();
        nazwiskoTField = new javax.swing.JTextField();
        imieTField = new javax.swing.JTextField();
        dzialTField = new javax.swing.JTextField();
        hasloTField = new javax.swing.JTextField();
        wypelnijDane = new javax.swing.JLabel();
        nazwiskoLabel = new javax.swing.JLabel();
        deapratemntLabel = new javax.swing.JLabel();
        generujHasloLabel = new javax.swing.JLabel();
        coporateIncLabel = new javax.swing.JLabel();
        imieLabel1 = new javax.swing.JLabel();
        generujHasloButton = new javax.swing.JButton();
        mailTField = new javax.swing.JTextField();
        mailLabel = new javax.swing.JLabel();
        wygenerowaneHasloLabel = new javax.swing.JLabel();
        dodajDoListyButton = new javax.swing.JButton();
        listaUzytLabel = new java.awt.Label();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaUzytkownikowTField = new javax.swing.JTextArea();
        jScrollBar1 = new javax.swing.JScrollBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(790, 520));

        jPanel1.setPreferredSize(new java.awt.Dimension(790, 520));

        mailMamangerLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        mailMamangerLabel.setFont(new java.awt.Font("HP Simplified Light", 3, 36)); // NOI18N
        mailMamangerLabel.setText("Mail Manager");

        wypelnijDane.setText("Wypelnij poniższe dane:");

        nazwiskoLabel.setText("Podaj Nazwisko użytkownika:");

        deapratemntLabel.setText("Podaj Dział użytkownika:");

        generujHasloLabel.setText("Generuj hasło użytkownika:");

        coporateIncLabel.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        coporateIncLabel.setText("Corporate inc.");

        imieLabel1.setText("Podaj Imię użytkownika:");

        generujHasloButton.setText("Generuj !");
        generujHasloButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                generujHasloButtonMouseReleased(evt);
            }
        });

        mailLabel.setText("Mail nowego użytkownika:");

        wygenerowaneHasloLabel.setText("Hasło nowego użytkownika:");

        dodajDoListyButton.setText("Dodaj do listy użytkowników");
        dodajDoListyButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                dodajDoListyButtonMouseReleased(evt);
            }
        });

        listaUzytLabel.setText("Lista użytkowników: ");

        listaUzytkownikowTField.setColumns(20);
        listaUzytkownikowTField.setRows(5);
        jScrollPane1.setViewportView(listaUzytkownikowTField);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(coporateIncLabel)
                                        .addComponent(mailMamangerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(nazwiskoTField)
                                                        .addComponent(dzialTField, javax.swing.GroupLayout.DEFAULT_SIZE, 287, Short.MAX_VALUE)
                                                        .addComponent(generujHasloLabel)
                                                        .addComponent(wypelnijDane)
                                                        .addComponent(nazwiskoLabel)
                                                        .addComponent(deapratemntLabel)
                                                        .addComponent(imieTField, javax.swing.GroupLayout.DEFAULT_SIZE, 287, Short.MAX_VALUE)
                                                        .addComponent(imieLabel1)
                                                        .addComponent(generujHasloButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(mailTField)
                                        .addComponent(mailLabel)
                                        .addComponent(wygenerowaneHasloLabel)
                                        .addComponent(hasloTField, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(dodajDoListyButton, javax.swing.GroupLayout.DEFAULT_SIZE, 417, Short.MAX_VALUE)
                                        .addComponent(listaUzytLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(jScrollPane1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)

                                .addContainerGap(16, Short.MAX_VALUE))
        )));
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(38, 38, 38)
                                                .addComponent(mailLabel)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(mailTField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(13, 13, 13)
                                                .addComponent(wygenerowaneHasloLabel))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(mailMamangerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(coporateIncLabel)))
                                .addGap(9, 9, 9)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(wypelnijDane, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(hasloTField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(12, 12, 12)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(imieLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(imieTField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(dodajDoListyButton))
                                .addGap(13, 13, 13)
                                .addComponent(nazwiskoLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(nazwiskoTField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(listaUzytLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(deapratemntLabel)
                                                .addGap(4, 4, 4)
                                                .addComponent(dzialTField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(generujHasloLabel)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(generujHasloButton)
                                                .addGap(0, 135, Short.MAX_VALUE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(47, 47, 47)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

                                                        .addComponent(jScrollPane1))))
                                .addContainerGap())
        );

        mailMamangerLabel.getAccessibleContext().setAccessibleName("Mail Manager");

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>

    private void generujHasloButtonMouseReleased(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:

        Random random = new Random();
        StringBuilder sbMail = new StringBuilder();
        StringBuilder sbPassword = new StringBuilder();


        ////////////////////Mail section////////////////////////////////////
        userName = imieTField.getText();
        userSurname = nazwiskoTField.getText();
        userDept = dzialTField.getText();

        sbMail.append(userName.toLowerCase());
        sbMail.append(".");
        sbMail.append(userSurname.toLowerCase());
        sbMail.append("@");
        sbMail.append(userDept.toLowerCase());
        sbMail.append(".");
        sbMail.append("companyinc.com");

        userMail = sbMail.toString();

        mailTField.setText(userMail);

        /////////////////////Password section////////////////////////////////
        for (int i = 0; i < 9; i++) {
            sbPassword.append((char)(33+ random.nextInt(92)));
        }
        userPassword = sbPassword.toString();

        hasloTField.setText(userPassword);


    }

    private void dodajDoListyButtonMouseReleased(java.awt.event.MouseEvent evt) {

        systemUser =
                "M: " +
                        mailTField.getText() +
                        "H: " +
                        hasloTField.getText();
            usersList.add(systemUser);

            listaUzytkownikowTField.append(usersList.get(iterator)+"\n");

        listaUzytLabel.setText("Lista użytkowników"+"(łącznie"+usersList.size()+")"+": ");
        imieTField.setText("");
        nazwiskoTField.setText("");
        dzialTField.setText("");
        iterator++;

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
            java.util.logging.Logger.getLogger(Core.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Core.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Core.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Core.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Core().setVisible(true);
            }
        });
    }

    private javax.swing.JLabel coporateIncLabel;
    private javax.swing.JLabel deapratemntLabel;
    private javax.swing.JButton dodajDoListyButton;
    private javax.swing.JTextField dzialTField;
    private javax.swing.JButton generujHasloButton;
    private javax.swing.JLabel generujHasloLabel;
    private javax.swing.JTextField hasloTField;
    private javax.swing.JLabel imieLabel1;
    private javax.swing.JTextField imieTField;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private java.awt.Label listaUzytLabel;
    private javax.swing.JTextArea listaUzytkownikowTField;
    private javax.swing.JLabel mailLabel;
    private java.awt.Label mailMamangerLabel;
    private javax.swing.JTextField mailTField;
    private javax.swing.JLabel nazwiskoLabel;
    private javax.swing.JTextField nazwiskoTField;
    private javax.swing.JLabel wygenerowaneHasloLabel;
    private javax.swing.JLabel wypelnijDane;

    private String userName;
    private String userSurname;
    private String userDept;
    private String userMail;
    private String userPassword;
    private String systemUser;
    private int iterator=0;
    List <String> usersList = new ArrayList<>();

}
