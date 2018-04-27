package ma.lydec.client.releve.entities;

import android.content.Context;
import android.content.res.AssetManager;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.channels.AsynchronousServerSocketChannel;
import ma.lydec.client.releve.dao.dbtournee;



/**
 * Created by Oumaima on 26/04/2018.
 */

public class chargement  {

    private final Context context;

    public chargement (Context context) {
        this.context = context;
    }

    public void charger()
    {
        String[] tourneeLine = new String[58];
        String[] cr = new String[63];

        dbtournee  db = new dbtournee(context);
        PdaTournee pda=new PdaTournee();

        // lire le sdonnes du fichier et les stocker dans ArrayList tourneeLine
        try {
            // AssetManager mngr = context.getAssets();
            // InputStream ouma = mngr.open("pda.txt");
            InputStream ouma = context.getAssets().open("pda.txt");
            InputStreamReader isr = new InputStreamReader(ouma);
            BufferedReader br = new BufferedReader(isr);
            int i = 0;
            try {
                String line;
                while ((line = br.readLine()) != null) {
                    tourneeLine[i] = line.toString();
                    i++;
                }
            } catch (IOException ex) {
                ex.printStackTrace();
                // Toast.makeText(chargement.this,"Error Reading File", Toast.LENGTH_LONG).show();
            }

        } catch (Exception e) {
            e.printStackTrace();
            //   Toast.makeText(chargement.this,"Error Opening File", Toast.LENGTH_LONG).show();
        }


        if(db.dataSelect(150,"frnCod").size()==0)

            for (int i = 2; i < tourneeLine.length; i++) {
                cr = tourneeLine[i].split("-");
                // db.dataInserttournee(150,cr[0],cr[1],cr[3],cr[4],cr[5],cr[6],cr[7]);
                setTournee(cr);
                db.dataInserttournee(150,pda.getFrnCod(),pda.getCliNom(),pda.getCptNum(),String.valueOf(pda.getRefSec()),String.valueOf(pda.getRefTrn()),String.valueOf(pda.getRefOrd()),String.valueOf(pda.getRefTournee()));
            }

    }

    public PdaTournee setTournee(String[] cr) {
        PdaTournee tournee = new PdaTournee();
        try {
            tournee = new PdaTournee();
            tournee.setFrnCod(cr[0]);
            tournee.setPolNum(cr[1]);
            tournee.setPolEtat(cr[2]);
            tournee.setCliId(Integer.parseInt(cr[3]));
            tournee.setLocId(Integer.parseInt(cr[4]));
            tournee.setCliNom(cr[5]);
            tournee.setCptNum(cr[6]);
            tournee.setAdrCons(cr[7]);
            tournee.setNumGsm(cr[8]);
            tournee.setRefSec(Integer.parseInt(cr[9]));
            tournee.setRefTrn(Integer.parseInt(cr[10]));
            tournee.setRefOrd(Integer.parseInt(cr[11]));
            tournee.setLocIdg(cr[12]);
            tournee.setPolTypc(cr[13]);
            tournee.setCptFils(cr[14]);
            tournee.setCptTens(cr[15]);
            tournee.setCptAmp(cr[16]);
            tournee.setCptCal(Integer.parseInt(cr[17]));
            tournee.setCptSys(Integer.parseInt(cr[18]));
            tournee.setTypeBr(cr[19]);
            tournee.setEmpCpt(cr[20]);
            tournee.setCptRoue(cr[21]);
            tournee.setCptCoef(cr[22]);
            tournee.setPlombe(cr[23]);
            tournee.setMarque(cr[24]);
            tournee.setRlvProd(cr[25]);
            tournee.setRefTournee(Integer.parseInt(cr[26]));
            tournee.setRefFolio(Integer.parseInt(cr[27]));
            tournee.setNvFolio(Integer.parseInt(cr[28]));
            tournee.setRlvADate(cr[29]);
            /** Insertion des dates */

            /** Date 1 */
            if (!"".equals(cr[30])) {
                tournee.setRlvNDate1(cr[30]);
            } else {
                tournee.setRlvNDate1(cr[30]);
            }

            /** Date 2 */
            if (!"".equals(cr[31])){
                tournee.setRlvNDate2(cr[31]);
            } else {
                tournee.setRlvNDate2(cr[31]);
            }

            tournee.setRlvAIdx(Integer.parseInt(cr[32]));
            tournee.setRlvNIdx1(Integer.parseInt(cr[33]));
            tournee.setRlvNIdx2(Integer.parseInt(cr[34]));
            tournee.setRlvCons1(Integer.parseInt(cr[35]));
            tournee.setRlvCons2(Integer.parseInt(cr[36]));
            tournee.setRefAbs(cr[37]);
            tournee.setRlvObs(cr[38]);
            tournee.setRlvECpt(cr[39]);
            tournee.setRlvAnoc(cr[40]);
            tournee.setRlvCode(cr[41]);
            tournee.setConsNa1(Integer.parseInt(cr[42]));
            tournee.setConsN1a1(Integer.parseInt(cr[43]));
            tournee.setConsM1(Integer.parseInt(cr[44]));
            tournee.setConsM2(Integer.parseInt(cr[45]));
            tournee.setConsMoy(Integer.parseInt(cr[46]));
            tournee.setRlvTypc(cr[47]);
            tournee.setPuit(cr[48]);
            tournee.setNbrAbs(Integer.parseInt(cr[49]));
            tournee.setMatrRlv(Integer.parseInt(cr[50]));
            tournee.setMatrResp(Integer.parseInt(cr[51]));
            tournee.setFraude(cr[52]);
            tournee.setCptCoupe(cr[53]);
            tournee.setDatePose(cr[54]);
            tournee.setNvClient(Integer.parseInt(cr[55]));
            if (cr.length > 56) {
                tournee.setNumCycle(Integer.parseInt(cr[56]));
            }
            if (cr.length > 57) {
                tournee.setCdRelecture(Integer.parseInt(cr[57]));
            }
            if (cr.length > 58) {
                tournee.setPolUsag(cr[58]);
            }
            // /mektoubi 11
            if (cr.length > 60) {

                String rap = cr[60];
                if (rap.equals("0") || rap.trim().equals("") || rap.equals("null")) {
                    System.out.println("no");
                    tournee.setRap(0);
                } else {
                    tournee.setRap(Integer.parseInt(rap));
                }

            }

            if (cr.length > 61) {

                String fraudeInt = cr[61];
                if (fraudeInt.equals("0") || fraudeInt.trim().equals("") || fraudeInt.equals("null")) {
                    tournee.setFraudeInt(0);
                } else {
                    tournee.setFraudeInt(Integer.parseInt(fraudeInt));
                }

            }
            if (cr.length > 62) {
                String numFlux = cr[62];
                tournee.setNumFlux(Integer.parseInt(numFlux));
            }

            if (cr.length > 63) {
                String facNum = cr[63];
                tournee.setFacNum(Integer.parseInt(facNum));
            }

            return tournee;
        } catch (Exception e) {
            e.printStackTrace();
            return tournee;
        }
    }


}

///////////////////////////



