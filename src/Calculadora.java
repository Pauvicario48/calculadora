import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class Calculadora {

	protected Shell shell;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Calculadora window = new Calculadora();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shell = new Shell();
		shell.setSize(450, 348);
		shell.setText("SWT Application");
		
		Button button = new Button(shell, SWT.NONE);
		button.setBounds(0, 98, 40, 40);
		button.setText("7");
		
		Button button_1 = new Button(shell, SWT.NONE);
		button_1.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		button_1.setText("5");
		button_1.setBounds(46, 144, 40, 40);
		
		Button button_2 = new Button(shell, SWT.NONE);
		button_2.setText("8");
		button_2.setBounds(46, 98, 40, 40);
		
		Button button_3 = new Button(shell, SWT.NONE);
		button_3.setText("9");
		button_3.setBounds(92, 98, 40, 40);
		
		Button button_4 = new Button(shell, SWT.NONE);
		button_4.setText("6");
		button_4.setBounds(92, 144, 40, 40);
		
		Button button_5 = new Button(shell, SWT.NONE);
		button_5.setText("1");
		button_5.setBounds(0, 190, 40, 40);
		
		Button button_6 = new Button(shell, SWT.NONE);
		button_6.setText("2");
		button_6.setBounds(46, 190, 40, 40);
		
		Button button_7 = new Button(shell, SWT.NONE);
		button_7.setText("3");
		button_7.setBounds(92, 190, 40, 40);
		
		Button button_8 = new Button(shell, SWT.NONE);
		button_8.setText("4");
		button_8.setBounds(0, 144, 40, 40);
		
		Button button_5_2 = new Button(shell, SWT.NONE);
		button_5_2.setText("=");
		button_5_2.setBounds(46, 236, 86, 40);
		
		Button button_5_3 = new Button(shell, SWT.NONE);
		button_5_3.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		button_5_3.setText("-");
		button_5_3.setBounds(138, 236, 40, 40);
		
		Button button_5_4 = new Button(shell, SWT.NONE);
		button_5_4.setText("+");
		button_5_4.setBounds(138, 190, 40, 40);
		
		Button button_5_5 = new Button(shell, SWT.NONE);
		button_5_5.setText("*");
		button_5_5.setBounds(138, 144, 40, 40);
		
		Button button_5_6 = new Button(shell, SWT.NONE);
		button_5_6.setText("/");
		button_5_6.setBounds(138, 98, 40, 40);
		
		Button button_5_1 = new Button(shell, SWT.NONE);
		button_5_1.setText("0");
		button_5_1.setBounds(0, 236, 40, 40);

	}
}
