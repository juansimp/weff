package cmdf2011.weff.interfaz.activities;

import cmdf2011.weff.rest.PrioridadRest;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class TicketFugaActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.ticket_fuga_agua);
		
		PrioridadRest prioridadRest = new PrioridadRest();
		
		
		Spinner s = (Spinner) findViewById(R.id.prioridadSpinner);
		ArrayAdapter adapter = new ArrayAdapter(this,
				android.R.layout.simple_spinner_item, prioridadRest.findPrioridadAll(10).toArray());
		s.setAdapter(adapter);
		
	}

	public void cancelar(View v) {
		finish();
	}
}
