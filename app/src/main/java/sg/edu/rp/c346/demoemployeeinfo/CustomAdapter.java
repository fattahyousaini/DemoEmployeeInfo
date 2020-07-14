package sg.edu.rp.c346.demoemployeeinfo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter<Employee>{

    Context parent_context;
    int layout_id;
    private ArrayList<Employee> alToDo;

    public CustomAdapter(Context context, int resource, ArrayList<Employee> objects) {
        super(context, resource, objects);

        parent_context = context;
        layout_id = resource;
        alToDo = objects;

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Obtain the LayoutInflater object
        LayoutInflater inflater = (LayoutInflater) parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        // "Inflate" the View for each row
        View rowView = inflater.inflate(layout_id, parent, false);

        // Obtain the UI components and do the necessary binding
        TextView tvName = rowView.findViewById(R.id.tvName);
        TextView tvRole = rowView.findViewById(R.id.tvRole);
        TextView tvIncome = rowView.findViewById(R.id.tvIncome);

        // Obtain the Android Version information based on the position
        // Set values to the TextView to display the corresponding information

        Employee employInfo = alToDo.get(position);


        tvName.setText(employInfo.getName());
        tvRole.setText(employInfo.getRole());
        tvIncome.setText(employInfo.getIncome() + "");

        return rowView;
    }
}
