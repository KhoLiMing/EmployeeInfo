package sg.edu.rp.c346.employeeinfo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView ListEmployeeInfo;
    ArrayList ListofInfo;
    ArrayAdapter ToDoAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListEmployeeInfo=findViewById(R.id.ListOfEmployees);

        ListofInfo=new ArrayList<Info>();

        ListofInfo.add(new Info("John","Software Techical Leader", "3400.0"));
        ListofInfo.add(new Info("May","Programmer","2200.0"));

        ToDoAdapter=new CustomAdapter(this,R.layout.row,ListofInfo);

        ListEmployeeInfo.setAdapter(ToDoAdapter);




    }
}

