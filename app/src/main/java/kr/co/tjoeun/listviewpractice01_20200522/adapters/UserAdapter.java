package kr.co.tjoeun.listviewpractice01_20200522.adapters;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

import kr.co.tjoeun.listviewpractice01_20200522.R;
import kr.co.tjoeun.listviewpractice01_20200522.datas.User;


public class UserAdapter extends ArrayAdapter<User> {

    Context mContext;
    List<User> mList;
    LayoutInflater inf;

    public UserAdapter(@NonNull Context context, int resource, @NonNull List<User> objects) {
        super(context, resource, objects);
        mContext = context;
        mList = objects;
        inf = LayoutInflater.from(mContext);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View row = convertView;

        if (row == null) {
            row = inf.inflate(R.layout.user_list_item, null);
        }

        TextView nameTxt = row.findViewById(R.id.nameTxt);
        TextView addressTxt = row.findViewById(R.id.addressTxt);

        User data = mList.get(position);

        nameTxt.setText(data.getName());
        addressTxt.setText(data.getAddress());

        return row;
    }
}














