/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihancrud.event;

import latihancrud.entity.Pelanggan;
import latihancrud.model.PelangganModel;

/**
 *
 * @author Kyoto
 */

/*
    Nama        : Benno Alif Anggara
    Kelas       : IF1
    NIM         : 10118024
*/
public interface PelangganListener {
    public void onChange(PelangganModel model);
    public void onInsert(Pelanggan pelanggan);
    public void onDelete();
    public void onUpdate(Pelanggan pelanggan);
}
