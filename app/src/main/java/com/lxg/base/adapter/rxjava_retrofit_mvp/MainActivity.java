package com.lxg.base.adapter.rxjava_retrofit_mvp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.lxg.base.adapter.rxjava_retrofit_mvp.bean.Joke;
import com.lxg.base.adapter.rxjava_retrofit_mvp.model.JokeModel;
import com.lxg.base.adapter.rxjava_retrofit_mvp.presenter.JokePresenter;
import com.lxg.base.adapter.rxjava_retrofit_mvp.ui.view.JokeView;
import com.trello.rxlifecycle2.LifecycleTransformer;
import com.trello.rxlifecycle2.components.support.RxAppCompatActivity;

public class MainActivity extends RxAppCompatActivity implements JokeView{
    private TextView textView;
    private JokePresenter mPresenter;
    private StringBuilder mStringBuilder;
    private String jokeNames;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView) findViewById(R.id.text);
        mPresenter = new JokePresenter();
        JokeModel jokeModel = new JokeModel();
        mPresenter.setPresenter(this, jokeModel);
        mStringBuilder = new StringBuilder();
    }


    public void search(View view) {
        mPresenter.search("desc", 1, 10, "1418816972");
    }

    @Override
    public LifecycleTransformer bindLifecycle() {
        return bindToLifecycle();
    }

    @Override
    public void susses(Joke joke) {
        jokeNames = mStringBuilder.append(joke.getContent() + "\n\n\n").toString();

        textView.setText(jokeNames);
    }

    @Override
    public void fail(String errorMsg) {
        textView.setText(errorMsg);
    }

}
