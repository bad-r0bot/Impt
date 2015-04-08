package com.example.jim.impt;

import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import org.json.JSONArray;
import org.json.JSONException;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import org.json.JSONObject;

/**
 * Created by Jim on 08/04/2015.
 */
public class HoofdschermFragment extends Fragment {


    // Variabelen die nodig zijn voor de app.
    public static int serverPort = 4444;
    public static String serverIP = "127.0.0.1";
    public static ArrayList<String> Slotlist;
    public static String slotnaam;
    public static String informatiebeknopt = null;
    public static int selectie;


    public void retrieveData() {
        // Haal data op uit de server.
        Slotlist = new ArrayList<String>();
        JSONObject jsonobject = new JSONObject();
        try{
            jsonobject.put("","");
        }
        catch(JSONException e){
            e.printStackTrace();
        }
        String response = null;
    }
}