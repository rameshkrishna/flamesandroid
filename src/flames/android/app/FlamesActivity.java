package flames.android.app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class FlamesActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        Button two;
        two=(Button)findViewById(R.id.two);
        two.setOnClickListener(new OnClickListener(){
        public void onClick(View v){
        	Intent i=new Intent(FlamesActivity.this,f2.class);
        	startActivity(i);
        	
        }
        });
        
    }
}