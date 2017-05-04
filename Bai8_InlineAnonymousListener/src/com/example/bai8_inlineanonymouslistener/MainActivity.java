package com.example.bai8_inlineanonymouslistener;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {
	
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Lấy điều khiển
        bChuyenDoi = (Button)findViewById(R.id.button1);
        // Gắn bộ lắng nghe trực tiếp trông lệnh
        bChuyenDoi.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				//Lấy năm dương lịch
				
				
			}
		}   );
        
        
        
        
        
        
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    // Cac bien
    Button bChuyenDoi;
    EditText txtNamDuong;
    EditText txtNamAm;
    
}
