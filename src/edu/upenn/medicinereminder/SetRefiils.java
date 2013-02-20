package edu.upenn.medicinereminder;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class SetRefiils {

	public class SetRefills extends Activity {

		@Override
		protected void onCreate(Bundle savedInstanceState) {
			super.onCreate(savedInstanceState);
			setContentView(R.layout.activity_set_refills);
		}

		@Override
		public boolean onCreateOptionsMenu(Menu menu) {
			// Inflate the menu; this adds items to the action bar if it is present.
			getMenuInflater().inflate(R.menu.activity_set_refills, menu);
			return true;
		}

	}
}
