package com.sctcs.jacobin.sfisct_17;

import java.util.ArrayList;
import java.util.List;


public class Candidates {

    private String name;
    private String designation;
    private String image_url;


    Candidates(String mname , String mdesignation , String mimage_id)
    {
        name=mname;
        designation=mdesignation;
        image_url=mimage_id;
    }

    public String getImage_url()
    {
        return image_url;
    }

    public String getDesignation() {
        return designation;
    }

    public String getName() {
        return name;
    }


    public static ArrayList<Candidates> return_candidates()
    {
        ArrayList<Candidates> candidates=new ArrayList<>();
        candidates.add(new Candidates("Aravind R","CHAIRMAN","https://i.imgur.com/TFslFsB.png"));
        candidates.add(new Candidates("Niranjana Karun","VICE CHAIRMAN","https://i.imgur.com/rMtBj3q.png"));
        candidates.add(new Candidates("Adwaith S S","GENERAL SEC.","https://i.imgur.com/RDoC7Jo.png"));
        candidates.add(new Candidates(" Michael Thomas John","ARTS CLUB SEC.","https://i.imgur.com/Z9g4aah.png"));
        candidates.add(new Candidates("Sravan C S","UUC-1","https://i.imgur.com/X8v6VxH.png"));
        candidates.add(new Candidates("Aravind Chandran","UUC-2","https://i.imgur.com/KstrPOK.png"));
        candidates.add(new Candidates("Shilpa Mohan","MAGAZINE EDITOR","https://i.imgur.com/k4OOK5Z.png"));
        candidates.add(new Candidates("Aswin Raj P","SPORTS CLUB SEC.","https://i.imgur.com/sROqoH2.png"));
        candidates.add(new Candidates("Aiswarya S V","LADY REP-1","https://i.imgur.com/WcYbNn9.png"));
        candidates.add(new Candidates("S R Sharanya","LADY REP-2","https://i.imgur.com/zjuG9tI.png"));
        candidates.add(new Candidates("Nithin M S","PG 1ST YEAR REP.","https://i.imgur.com/viyAMEE.png"));
        candidates.add(new Candidates("Reshmi L S","PG 2ND YEAR REP.","https://i.imgur.com/WdoI8HU.png"));
        candidates.add(new Candidates("Manudev R","MECH ASSOCIATION SEC.","https://i.imgur.com/BeiJ4Ms.png"));
        candidates.add(new Candidates("RajaLekshmi S","PROD ASSOCIATION SEC.","https://i.imgur.com/aICV07q.png"));
        candidates.add(new Candidates("Karthik S Prasad","AUTO ASSOCIATION SEC.","https://i.imgur.com/MaeLmvF.png"));
        candidates.add(new Candidates("Goutham Krishnan","EC ASSOCIATION SEC.","https://i.imgur.com/uZroqmQ.png"));
        candidates.add(new Candidates("Gautham G Ajith","CS ASSOCIATION SEC.","https://i.imgur.com/4DXOHqz.png"));
        candidates.add(new Candidates("Peeru Muhammed","BT ASSOCIATION SEC.","https://i.imgur.com/ubMIYAE.png"));
        candidates.add(new Candidates("Mohammed Bin Salim","1ST YEAR REP","https://i.imgur.com/hY9CTxo.png"));
        candidates.add(new Candidates("SivaSanker J S","2ND YEAR REP","https://i.imgur.com/ItcZaNe.png"));
        candidates.add(new Candidates("Arun Kumar U","3RD YEAR REP","https://i.imgur.com/YL4XvQY.png"));
        candidates.add(new Candidates("Padmesh V","4TH YEAR REP","https://i.imgur.com/r4kv3di.png"));
        candidates.add(new Candidates("ANDROID","1ST YEAR REP","https://developer.android.com/_static/images/android/touchicon-180.png"));
        candidates.add(new Candidates("ANDROID","1ST YEAR REP","https://developer.android.com/_static/images/android/touchicon-180.png"));
        candidates.add(new Candidates("ANDROID","1ST YEAR REP","https://developer.android.com/_static/images/android/touchicon-180.png"));



        return  candidates;
    }
}
