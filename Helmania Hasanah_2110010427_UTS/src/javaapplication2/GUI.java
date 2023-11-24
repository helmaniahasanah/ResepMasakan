/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javaapplication2;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import model.Resep;

/**
 *
 * @author HELMA
 */


class GUI extends JFrame{
    /**
     *
     * Creates new form GUI
     */
    ArrayList<Resep> semuaResep = new ArrayList<Resep>();
    String status= "";
    
    //  untuk menampilkan resep pada tabel
    public final void tampilResep(){
        DefaultTableModel tableResepMasakan = (DefaultTableModel)tabelResep.getModel();
        tableResepMasakan.setRowCount(0); // 
        Object[] row = new Object[4];


        for(int i = 0; i < semuaResep.size(); i++){
            row[0] = semuaResep.get(i).getId();
            row[1] = semuaResep.get(i).getNama();
            row[2] = semuaResep.get(i).getBahan();
            row[3] = semuaResep.get(i).getCaranya();
           
           tableResepMasakan.addRow(row);
        }

    }
    //  untuk mengisi daftar resep awal
     public final void isiResep(){
         semuaResep.add(new Resep(1,"SotoBanjar" , "Bahan Kuah:\n" +
"1. Daging Ayam dan Tulang:\n" +
"   - Daging ayam potong-potong dan tulang ayam, sekitar 500 gram.\n" +
"\n" +
"2. Air:\n" +
"   - Secukupnya untuk merebus daging.\n" +
"\n" +
"3. Serai:\n" +
"   - 2 batang, memarkan.\n" +
"\n" +
"4. Daun Jeruk Purut:\n" +
"   - 3-4 lembar.\n" +
"\n" +
"5. Lengkuas:\n" +
"   - 2 cm, memarkan.\n" +
"\n" +
"6. Jahe:\n" +
"   - 1 cm, memarkan.\n" +
"\n" +
"7. Garam dan Merica:\n" +
"   - Secukupnya untuk memberi rasa.\n" +
"\n" +
                 
" Bahan Pelengkap:\n" + // bahan untuk memasak
                 
"1. Bihun: \n" +
"   - Bihun, rendam air panas hingga lembut.\n" +
"\n" +
"2. Kentang Goreng:\n" +
"   - Kentang, potong dadu dan goreng.\n" +
"\n" +
"3. Telur Rebus:\n" +
"   - Telur rebus, belah dua.\n" +
"\n" +
"4. Tauge (kecambah):\n" +
"   - Secukupnya, seduh dengan air panas.\n" +
"\n" +
"5. Daun Bawang:\n" +
"   - Iris halus.\n" +
"\n" +
"6. Kerupuk:\n" +
"   - Kerupuk, pilih jenis kerupuk sesuai selera.\n" +
"\n" +
"7. Bawang Goreng:\n" +
"   - Bawang goreng, sebagai taburan."
 
                 ," Cara Memasak:\n" +  //cara untuk memasak
"\n" +
"1. Rebus Daging Ayam:\n" +
"   - Rebus daging ayam dan tulang dalam air hingga matang. Angkat dan tiriskan.\n" +
"\n" +
"2. Buat Kuah:\n" +
"   - Rebus air bersama dengan serai, daun jeruk purut, lengkuas, dan jahe. Masukkan daging ayam yang sudah direbus. Tambahkan garam dan merica sesuai selera. Biarkan kuah mendidih dan beri rasa.\n" +
"\n" +
"3. Sajikan Pelengkap:\n" +
"   - Siapkan bihun, kentang goreng, telur rebus, tauge, dan kerupuk di mangkuk saji.\n" +
"\n" +
"4. Tuang Kuah:\n" +
"   - Tuangkan kuah panas ke dalam mangkuk saji yang berisi pelengkap.\n" +
"\n" +
"5. Taburi Bawang Goreng dan Daun Bawang:\n" +
"   - Taburi bawang goreng dan daun bawang di atas soto sebagai hiasan.\n" +
"\n" +
"6. Sajikan:\n" +
"   - Soto Banjar siap disajikan. Nikmati hangat-hangat bersama keluarga."));
         
         
         semuaResep.add(new Resep(2,"Ketupat" , "Bahan:\n" +
"1. Ketan: \n" +
"   - Ketan putih, sekitar 1 kg.\n" +
"\n" +
"2. Daun Kelapa:\n" +
"   - Daun kelapa yang telah dipotong-potong menjadi lembaran kecil untuk membungkus ketan.\n" +
"\n" +
                 
"Alat:\n" +
"1. Penyaring Air:\n" +
"   - Untuk mencuci ketan.\n" +
"\n" +
                 
                 
"2. Anyaman Ketupat:\n" +
"   - Untuk membentuk ketupat." ,"Cara Membuat Ketupat:\n" +
"\n" +
"1. Siapkan Ketan:\n" +
"   - Cuci ketan hingga bersih.\n" +
"\n" +
"2. Rendam Ketan:\n" +
"   - Rendam ketan dalam air selama sekitar 1-2 jam.\n" +
"\n" +
"3. Tiriskan Ketan:\n" +
"   - Setelah direndam, tiriskan ketan agar tidak terlalu basah.\n" +
"\n" +
"4. Bentuk Ketupat:\n" +
"   - Gunakan anyaman ketupat untuk membentuk ketan menjadi segitiga. Letakkan ketan yang sudah dianyam pada selembar daun kelapa yang sudah dipotong-potong.\n" +
"\n" +
"5. Bungkus Ketupat:\n" +
"   - Bungkus ketan dengan daun kelapa hingga membentuk segitiga rapat.\n" +
"\n" +
"6. Kencangkan Ujungnya:*\n" +
"   - Pastikan ujung ketupat terkencang agar ketan tidak keluar saat dimasak.\n" +
"\n" +
"7. Rebus Ketupat:\n" +
"   - Rebus air dalam panci besar. Masukkan ketupat yang sudah dibentuk ke dalam air mendidih. Rebus selama 2-3 jam hingga ketupat matang.\n" +
"\n" +
"8. Angkat dan Dinginkan:\n" +
"   - Angkat ketupat dari air rebusan dan dinginkan sebentar.\n" +
"\n" +
"9. Potong dan Sajikan:\n" +
"   - Setelah dingin, potong ketupat dari daun kelapa. Ketupat siap disajikan dan dinikmati bersama hidangan khas seperti opor ayam, rendang, atau kuah ketupat."));
     } 
     public void reset(){ //untuk mereset input form
      tfId.setText("");
      tfNama.setText("");
      taBahan.setText("");
      taCaranya.setText("");
      
        tfId.setEnabled(false);
        tfNama.setEnabled(false);
        taBahan.setEnabled(false);
        taCaranya.setEnabled(false);
      labelmode.setText("-");
}
     public int buatId(){  //untuk membuat ID baru pada resep
       Resep resepTerakhir = semuaResep.get(semuaResep.size() - 1); 
       int idIndex = resepTerakhir.getId();
       int id = idIndex + 1;
       return id;
   }
    public GUI() {
        initComponents();
        isiResep();
        tampilResep();
        
    }
          
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane4 = new javax.swing.JScrollPane();
        jFrame1 = new javax.swing.JFrame();
        jFrame2 = new javax.swing.JFrame();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tfId = new javax.swing.JTextField();
        tfNama = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        taBahan = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        taCaranya = new javax.swing.JTextArea();
        btnsimpan = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        labelmode = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnKeluar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tabelResep = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        btnTambah = new javax.swing.JButton();
        btnUbah = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame2Layout = new javax.swing.GroupLayout(jFrame2.getContentPane());
        jFrame2.getContentPane().setLayout(jFrame2Layout);
        jFrame2Layout.setHorizontalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame2Layout.setVerticalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 153));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("id");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Nama");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Bahan");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Caranya");

        tfId.setEnabled(false);

        tfNama.setEnabled(false);

        taBahan.setColumns(20);
        taBahan.setRows(5);
        taBahan.setEnabled(false);
        jScrollPane1.setViewportView(taBahan);

        taCaranya.setColumns(20);
        taCaranya.setRows(5);
        taCaranya.setEnabled(false);
        jScrollPane2.setViewportView(taCaranya);

        btnsimpan.setText("SIMPAN");
        btnsimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsimpanActionPerformed(evt);
            }
        });

        btnReset.setText("RESET");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        labelmode.setText("-");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(110, 110, 110))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tfNama, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 23, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelmode))
                        .addGap(27, 27, 27))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel1)
                                .addGap(44, 44, 44)
                                .addComponent(tfId, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnsimpan)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnReset)))
                        .addGap(17, 17, 17))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(tfId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(labelmode, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnsimpan)
                    .addComponent(btnReset))
                .addContainerGap())
        );

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 25)); // NOI18N
        jLabel5.setText("RESEP MASAKAN");

        btnKeluar.setText("KELUAR");
        btnKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKeluarActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(153, 255, 255));

        tabelResep.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "id", "Nama", "Bahan", "Caranya"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelResep.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelResepMouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(tabelResep);
        if (tabelResep.getColumnModel().getColumnCount() > 0) {
            tabelResep.getColumnModel().getColumn(0).setMaxWidth(50);
        }

        jPanel2.setBackground(new java.awt.Color(255, 204, 204));

        btnTambah.setText("TAMBAH");
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });

        btnUbah.setText("UBAH");
        btnUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUbahActionPerformed(evt);
            }
        });

        btnHapus.setText("HAPUS");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(btnTambah)
                .addGap(35, 35, 35)
                .addComponent(btnUbah)
                .addGap(31, 31, 31)
                .addComponent(btnHapus)
                .addContainerGap(100, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTambah)
                    .addComponent(btnUbah)
                    .addComponent(btnHapus))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(455, 455, 455)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnKeluar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(32, 32, 32)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(23, 23, 23))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnKeluar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tabelResepMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelResepMouseClicked
       int i = tabelResep.getSelectedRow();
       TableModel model = tabelResep.getModel();
       tfId.setText(model.getValueAt(i, 0).toString());
        tfNama.setText(model.getValueAt(i, 1).toString());
        taBahan.setText(model.getValueAt(i, 2).toString());
        taCaranya.setText(model.getValueAt(i, 3).toString());
        
        tfId.setEnabled(true);
        tfNama.setEnabled(true);
        taBahan.setEnabled(true);
        taCaranya.setEnabled(true);
        
        tfId.setEditable(false);
         tfNama.setEditable(false);
          taBahan.setEditable(false);
           taCaranya.setEditable(false);
           
          labelmode.setText("mode baca"); //untuk membaca teks
        // TODO add your handling code here:
    }//GEN-LAST:event_tabelResepMouseClicked

    private void btnUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUbahActionPerformed

     int i = tabelResep.getSelectedRow(); 
       if(i>=0){     
        status="UBAH"; 
        labelmode.setText("mode ubah"); //untuk mengubah mode
         tfNama.setEditable(true);
          taBahan.setEditable(true);
           taCaranya.setEditable(true);
       }else{
           JOptionPane.showMessageDialog(this, "Pilih resep terlebih dahulu", "UBAH" ,JOptionPane.ERROR_MESSAGE); 
       }
    
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUbahActionPerformed

    private void btnsimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsimpanActionPerformed
    String nama=tfNama.getText();
    String bahan=taBahan.getText();
    String caranya=taCaranya.getText();
        if(status=="TAMBAH"){  //untuk menambah
      int id=buatId();
      semuaResep.add( new Resep(id,nama,bahan,caranya));      
    }else{
     int i = tabelResep.getSelectedRow();
     int id = Integer.parseInt(tfId.getText());
     semuaResep.set(i, new Resep(id,nama,bahan,caranya));
     
    }
        tampilResep();
     reset();
     // TODO add your handling code here:
    }//GEN-LAST:event_btnsimpanActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
   
      int i = tabelResep.getSelectedRow();
  if(i>=0){
      int konfirmasi = JOptionPane.showConfirmDialog(this, "Yakin ingin menghapus data ini?", "Hapus", JOptionPane.YES_NO_OPTION);
  if(konfirmasi==0){
     semuaResep.remove(i);
    tampilResep();
    reset();
  }
  }else{
      JOptionPane.showMessageDialog(this, "Pilih resep terlebih dahulu", "HAPUS" ,JOptionPane.ERROR_MESSAGE);
  }
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHapusActionPerformed

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
labelmode.setText("mode tambah");
        status="TAMBAH";
        tfId.setText("");
        tfNama.setText("");
        taBahan.setText("");
        taCaranya.setText("");
        
        tfNama.setEditable(true);
        taBahan.setEditable(true);
        taCaranya.setEditable(true);
           
        tfId.setEnabled(true);
        tfNama.setEnabled(true);
        taBahan.setEnabled(true);
        taCaranya.setEnabled(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTambahActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        reset();
        // TODO add your handling code here:
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKeluarActionPerformed
         
      int konfirmasi = JOptionPane.showConfirmDialog(this, "Yakin ingin Keluar?", "Keluar", JOptionPane.YES_NO_OPTION);
  if(konfirmasi==0){
      System.exit(0);
  }
        // TODO add your handling code here:
    }//GEN-LAST:event_btnKeluarActionPerformed

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
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new GUI().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnKeluar;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnTambah;
    private javax.swing.JButton btnUbah;
    private javax.swing.JButton btnsimpan;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JLabel labelmode;
    private javax.swing.JTextArea taBahan;
    private javax.swing.JTextArea taCaranya;
    private javax.swing.JTable tabelResep;
    private javax.swing.JTextField tfId;
    private javax.swing.JTextField tfNama;
    // End of variables declaration//GEN-END:variables
}

