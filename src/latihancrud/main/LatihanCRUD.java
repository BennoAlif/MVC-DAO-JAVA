/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihancrud.main;

import java.sql.SQLException;
import javax.swing.SwingUtilities;
import latihancrud.database.KingBarbershopDatabase;
import latihancrud.entity.Pelanggan;
import latihancrud.error.PelangganException;
import latihancrud.service.PelangganDao;
import latihancrud.view.PelangganView;

/**
 *
 * @author Kyoto
 */

/*
    Nama        : Benno Alif Anggara
    Kelas       : IF1
    NIM         : 10118024
*/
public class LatihanCRUD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException, PelangganException{
        // TODO code application logic here
        
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    PelangganView pelanggan = new PelangganView();
                    pelanggan.loadDatabase();
                    pelanggan.setVisible(true);
                } catch (SQLException ex) {
                } catch (PelangganException ex) {
                }

            }
        });
    }
    
}
