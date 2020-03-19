package com.example.duplom;

import com.google.ar.core.Config;
import com.google.ar.core.Session;
import com.google.ar.sceneform.ux.ArFragment;

public class CustomArFragment extends ArFragment {

    @Override
    protected Config getSessionConfiguration(Session session) {
        Config config = new Config(session);
        this.getArSceneView().setupSession(session);
        ((ArImageActivity)getActivity()).setupDatabase(config,session);
        return config;
    }
}
