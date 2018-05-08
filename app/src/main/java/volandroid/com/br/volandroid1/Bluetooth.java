package volandroid.com.br.volandroid1;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.app.ListActivity;
import java.util.Set;

public class Bluetooth extends ListActivity {

    BluetoothAdapter mBluetoothAdapter;

    public Bluetooth(){
        mBluetoothAdapter = BluetoothAdapter.getDefaultAdapter();
    }//end build

    public BluetoothAdapter getBluetoothAdapter(){
        return mBluetoothAdapter;
    }//end getBluetoothAdapter

    //Verifica se o bt esta ativo
    public boolean checkBluetoothEnable(){

        if (!mBluetoothAdapter.isEnabled()) {
            return true;
        }//end if

        return false;

    }//end cleckBluetoothEnable


    public void checkBluetoothDevice(){

        BluetoothAdapter mBluetoothAdapter = BluetoothAdapter.getDefaultAdapter();

        if (mBluetoothAdapter == null) {
            // Device doesn't support Bluetooth
            System.exit(0);
        }//end if

    }//end checkBluetoothDevice


    public Set getListDevices(){

        Set<BluetoothDevice> pairedDevices = getBluetoothAdapter().getBondedDevices();

        return pairedDevices;
    }//end getListDevices

}//end class
