package kr.co.tjoeun.listviewpractice01_20200522;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import kr.co.tjoeun.listviewpractice01_20200522.adapters.UserAdapter;
import kr.co.tjoeun.listviewpractice01_20200522.databinding.ActivityMainBinding;
import kr.co.tjoeun.listviewpractice01_20200522.datas.User;

public class MainActivity extends BaseActivity {

    ActivityMainBinding binding;

    List<User> userList = new ArrayList<>();
    UserAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        setupEvents();
        setValues();
    }

    @Override
    public void setupEvents() {

    }

    @Override
    public void setValues() {
        addUsers();
        mAdapter = new UserAdapter(mContext, R.layout.user_list_item, userList);
        binding.userListView.setAdapter(mAdapter);
    }

    void addUsers() {
        userList.add(new User("조경진", "서울시 은평구"));
        userList.add(new User("강희진", "인천시 남동구"));
        userList.add(new User("구현정", "서울시 종로구"));
        userList.add(new User("김정민", "서울시 도봉구"));
        userList.add(new User("김하늬", "서울시 성북구"));
        userList.add(new User("문희원", "서울시 은평구"));
        userList.add(new User("송세인", "서울시 은평구"));
        userList.add(new User("위건", "서울시 성동구"));
        userList.add(new User("유혜원", "서울시 은평구"));
        userList.add(new User("이다연", "서울시 은평구"));
        userList.add(new User("황보석", "인천시 남동구"));
    }
}
