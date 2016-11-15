package com.prueba.lgramir.testprueba;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


public class thirdFragment extends Fragment {


    private Button mSaltButton;

    private TextView mQuestionTextView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup parent, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.activity_three, parent, false);

        mQuestionTextView = (TextView) v.findViewById(R.id.question_text_view);

        mSaltButton = (Button) v.findViewById(R.id.salt_button);
        mSaltButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), extraActivity.class);
                startActivity(intent);

            }
        });


        return v;
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
    }

}
