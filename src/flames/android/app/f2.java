package flames.android.app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
public class f2 extends FlamesActivity{
	Button flames;
	int a,b;
	String s1=new String();
	String s2=new String();
	EditText str1,str2;
	 public void onCreate(Bundle savedInstanceState)
	 {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.f2s);
	        str1=(EditText)findViewById(R.id.str1r);
	        str2=(EditText)findViewById(R.id.str2r);
	        s1=str1.toString();
	        s2=str2.toString();
	        flames=(Button)findViewById(R.id.flames);
	        flames.setOnClickListener(new OnClickListener(){
	        public void onClick(View v){
	        	Intent i=new Intent(f2.this,Fthree.class);
	        	startActivity(i);	
	        }
	        });
	    }
}
