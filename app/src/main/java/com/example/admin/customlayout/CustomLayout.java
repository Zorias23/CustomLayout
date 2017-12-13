package com.example.admin.customlayout;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.LinearLayout;

/**
 * Created by Admin on 12/12/2017.
 */

public class CustomLayout extends LinearLayout{
    int textViewWidth;
    int editTextWidth;
    int buttonWidth;
    Context context;
    public CustomLayout(Context context, AttributeSet attrs) {
        super(context);
        this.context = context;
        TypedArray typedArray = context.obtainStyledAttributes(attrs, R.styleable.custom_options, 0, 0);
        textViewWidth = typedArray.getInt(R.styleable.custom_options_textViewWidth, 200);
        editTextWidth = typedArray.getInt(R.styleable.custom_options_editTextWidth, 200);
        buttonWidth = typedArray.getInt(R.styleable.custom_options_buttonWidth, 200);
        inflate(context,R.layout.custom_layout,this);
    }

}
