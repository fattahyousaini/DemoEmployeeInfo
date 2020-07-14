package sg.edu.rp.c346.demoemployeeinfo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lv;
    TextView tvName, tvRole, tvIncome;
    ArrayAdapter aa;
    ArrayList<Employee> al;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvName = findViewById(R.id.tvName);
        tvRole = findViewById(R.id.tvRole);
        tvIncome = findViewById(R.id.tvIncome);


        lv = (ListView)this.findViewById(R.id.listList);

        al = new ArrayList<Employee>();
        Employee item1 = new Employee("John", "Software Technical Leader", 3400.0);
        Employee item2 =  new Employee("May", "Programmer", 2200.0);
        al.add(item1);
        al.add(item2);

        aa = new CustomAdapter(this, R.layout.row, al);
        lv.setAdapter(aa);



    }
}
