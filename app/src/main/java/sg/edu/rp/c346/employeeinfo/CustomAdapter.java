package sg.edu.rp.c346.employeeinfo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter {
    Context parent_context;
    int layout_id;
    ArrayList<Info> versionList;

    public CustomAdapter(Context context, int resource, ArrayList<Info> objects){

        super(context,resource,objects);

        parent_context=context;
        layout_id= resource;
        versionList=objects;

    }

    public View getView (int position, View converView, ViewGroup parent){
        LayoutInflater inflater = (LayoutInflater)
                parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = inflater.inflate(layout_id, parent, false);

        TextView tvName = rowView.findViewById(R.id.textViewName);
        TextView tvRole = rowView.findViewById(R.id.textViewRole);
        TextView tvSalary = rowView.findViewById(R.id.textViewSalary);

        Info currentVersion = versionList.get(position);

        tvName.setText(currentVersion.getName());
        tvRole.setText(currentVersion.getRole());
        tvSalary.setText(currentVersion.getSalary());

        return rowView;
    }

}
