package glass.views;

import org.eclipse.swt.custom.CaretEvent;
import org.eclipse.swt.custom.CaretListener;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.ViewPart;

public class MovementView extends ViewPart {

	@Override
	public void createPartControl(Composite parent) {
		StyledText s = new StyledText(parent, 0);
		s.addCaretListener(new CaretListener() {

			@Override
			public void caretMoved(CaretEvent event) {
				System.out.println("movement");
			}
			
		});
	}

	@Override
	public void setFocus() {
		// TODO Auto-generated method stub
		
	}
	
}
