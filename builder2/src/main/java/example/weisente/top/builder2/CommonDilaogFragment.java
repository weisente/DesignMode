package example.weisente.top.builder2;

import android.app.DialogFragment;
import android.app.FragmentManager;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by san on 2017/12/29.
 */

public class CommonDilaogFragment extends DialogFragment {

    private String mTitle;
    private String mMessage;
    private String mPositive;
    private String mNegative;

    public static final String TITLE = "title";
    public static final String MESSAGE = "message";
    public static final String POSITIVE = "positive";
    public static final String NEGATIVE = "negative";


    public static CommonDilaogFragment newInstance(Builder builder){
        Bundle args = new Bundle();
        args.putString(TITLE, builder.mTitle);
        args.putString(MESSAGE, builder.mMessage);
        args.putString(POSITIVE, builder.mPositive);
        args.putString(NEGATIVE, builder.mNegative);

        CommonDilaogFragment fragment = new CommonDilaogFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mTitle = getArguments().getString(TITLE);
        mMessage = getArguments().getString(MESSAGE);
        mPositive = getArguments().getString(POSITIVE);
        mNegative = getArguments().getString(NEGATIVE);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_common, container);
        TextView tvTile = view.findViewById(R.id.tv_title);
        TextView tvMessage = view.findViewById(R.id.tv_message);
        Button btnPositive = view.findViewById(R.id.btn_positive);
        Button btnNegative = view.findViewById(R.id.btn_negative);
        tvTile.setText(mTitle);
        tvMessage.setText(mMessage);
        btnPositive.setText(mPositive);
        btnNegative.setText(mNegative);



        return view;

    }

    public static class Builder{

        private String mTitle;
        private String mMessage;
        private String mPositive;
        private String mNegative;
        private FragmentManager mFragmentManager;


        public Builder(FragmentManager fragmentManager){
            this.mFragmentManager = fragmentManager;
        }



        public Builder title(String title){
            mTitle = title;
            return this;
        }

        public Builder message(String message){
            mMessage = message;
            return this;
        }


        public Builder positive(String positive){
            mPositive = positive;
            return this;
        }

        public Builder negative(String negative) {
            mNegative = negative;
            return this;
        }

        public void build() {

            CommonDilaogFragment.newInstance(this).show(mFragmentManager," ");

        }

    }




}
