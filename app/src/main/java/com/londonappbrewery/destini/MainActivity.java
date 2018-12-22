package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    int mstoryIndex=0;
    TextView mstoryTextView;
    Button mbuttonTop,mbuttonBottom;
    private StoryAnswer[] mstoryobj=new StoryAnswer[]{
            new StoryAnswer(R.string.T1_Story, R.string.T1_Ans1, R.string.T1_Ans2),
            new StoryAnswer(R.string.T2_Story, R.string.T2_Ans1, R.string.T2_Ans2),
            new StoryAnswer(R.string.T3_Story, R.string.T3_Ans1, R.string.T3_Ans2),
            new StoryAnswer(R.string.T4_End, 0,0),
            new StoryAnswer(R.string.T5_End, 0,0),
            new StoryAnswer(R.string.T6_End,0,0),

    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        mstoryTextView=(TextView)findViewById(R.id.storyTextView);
        mbuttonTop=(Button)findViewById(R.id.buttonTop);
        mbuttonBottom=(Button)findViewById(R.id.buttonBottom);



        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        mbuttonTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            updatetop();
            }
        });
mbuttonBottom.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
      updateBottom();
    }
});




        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:


    }
    void updatetop()
    {
        if (mstoryIndex == 0)
        {
            mstoryTextView.setText(mstoryobj[2].getMstoryid());
            mbuttonTop.setText(mstoryobj[2].getMtopid());
            mbuttonBottom.setText(mstoryobj[2].getMbottomid());

        }

        if(mstoryIndex==1)
        {
            mstoryTextView.setText(mstoryobj[5].getMstoryid());
            mbuttonTop.setVisibility(View.GONE);
            mbuttonBottom.setVisibility(View.GONE);

        }
        if(mstoryIndex==2)
        {
            mstoryTextView.setText(mstoryobj[2].getMstoryid());
            mbuttonTop.setText(mstoryobj[2].getMtopid());
            mbuttonBottom.setText(mstoryobj[2].getMbottomid());
        }
        if(mstoryIndex==3)
        {
            mstoryTextView.setText(mstoryobj[5].getMstoryid());
            mbuttonTop.setVisibility(View.GONE);
            mbuttonBottom.setVisibility(View.GONE);
        }
        mstoryIndex++;
    }
    void updateBottom()
    {
        if(mstoryIndex==0)
        {
            mstoryTextView.setText(mstoryobj[1].getMstoryid());
            mbuttonTop.setText(mstoryobj[1].getMtopid());
            mbuttonBottom.setText(mstoryobj[1].getMbottomid());
        }
        if(mstoryIndex==1)
        {
            mstoryTextView.setText(mstoryobj[4].getMstoryid());
            mbuttonTop.setVisibility(View.GONE);
            mbuttonBottom.setVisibility(View.GONE);
        }
        if(mstoryIndex==2)
        {
            mstoryTextView.setText(mstoryobj[3].getMstoryid());
            mbuttonTop.setVisibility(View.GONE);
            mbuttonBottom.setVisibility(View.GONE);
        }
        if(mstoryIndex==3)
        {
            mstoryTextView.setText(mstoryobj[4].getMstoryid());
            mbuttonTop.setVisibility(View.GONE);
            mbuttonBottom.setVisibility(View.GONE);
        }
        mstoryIndex=mstoryIndex+2;
    }
}
