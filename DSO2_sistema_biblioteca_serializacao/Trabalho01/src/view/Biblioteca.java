package view;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.wb.swt.SWTResourceManager;

import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.DateTime;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.List;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.forms.widgets.FormToolkit;

public class Biblioteca{

	protected Shell shell;
	private Text nomeLivroNovoText;
	private Text nomeClienteText;
	String viewType;
	int dataDevolucao = 1;
	private final FormToolkit formToolkit = new FormToolkit(Display.getDefault());
	
	Button registrarButton,emprestarButton, devolverButton, removerButton;
	
	public Biblioteca(String viewType){
		this.viewType = viewType;
	}

	/**
	 * Open the window.
	 * @wbp.parser.entryPoint
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents(display);
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
	protected void createContents(Display display) {
		shell = new Shell();
		shell.setBackground(SWTResourceManager.getColor(SWT.COLOR_LIST_FOREGROUND));
		shell.setSize(922, 826);
		shell.setText("biblioteca");

		Label label = new Label(shell, SWT.NONE);
		label.setText("text on the label");

		label.setImage(SWTResourceManager.getImage("./img/books.png"));
		label.setBounds(471, 10, 350, 224);

		Label nome = new Label(shell, SWT.SHADOW_IN | SWT.CENTER);
		nome.setForeground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_LIGHT_SHADOW));
		nome.setFont(SWTResourceManager.getFont("Ubuntu", 33, SWT.NORMAL));
		nome.setTouchEnabled(true);
		nome.setText("Biblioteca online");
		nome.setBounds(91, 84, 341, 54);

		final List list = new List(shell, SWT.BORDER | SWT.V_SCROLL);
		list.setItems(new String[] { "livro 1", "livro 2", "livro 3", "livro 4", "livro 5"});
		list.setBounds(458, 259, 443, 251);

		final DateTime calendar = new DateTime(shell, SWT.CALENDAR);
		calendar.setBounds(62, 266, 319, 173);
		/*
		DateTime dataSelecionada = calendar.;

		Date dataAtual = Calendar.getInstance().getTime();
		
		if(dataAtual > calendar.getDay()){		
		 */
		final Label statusLabel = new Label(shell, SWT.NONE);
		statusLabel.setForeground(SWTResourceManager.getColor(255, 51, 102));
		statusLabel.setTouchEnabled(true);
		statusLabel.setFont(SWTResourceManager.getFont("Ubuntu", 14, SWT.ITALIC));
		statusLabel.setBounds(458, 569, 424, 122);
		statusLabel.setText("");
		calendar.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				System.out.println("calendar date changed");
			}
		});
		
		final Label tituloCalendarioLabel = new Label(shell, SWT.NORMAL);
		tituloCalendarioLabel.setTouchEnabled(true);
		tituloCalendarioLabel.setText("Selecione a data de emprestimo ou devolucao");
		tituloCalendarioLabel.setForeground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		tituloCalendarioLabel.setBounds(63, 247, 369, 18);
		
		final Label livroASerRemovidoDevolvidoLabel = new Label(shell, SWT.NONE);
		livroASerRemovidoDevolvidoLabel.setForeground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		livroASerRemovidoDevolvidoLabel.setBounds(28, 613, 212, 23);
		formToolkit.adapt(livroASerRemovidoDevolvidoLabel, true, true);
		livroASerRemovidoDevolvidoLabel.setEnabled(false);
			list.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseDown(MouseEvent e) {
					String livroASerRemovidoDevolvido = list.getItem(list.getSelectionIndex());
					livroASerRemovidoDevolvidoLabel.setText(" "+livroASerRemovidoDevolvido);
				}
			});

		nomeClienteText = new Text(shell, SWT.BORDER);
		nomeClienteText.setMessage("nome cliente");
		nomeClienteText.setBounds(28, 520, 212, 32);
		formToolkit.adapt(nomeClienteText, true, true);
		
		//Buttons
		emprestarButton = new Button(shell, SWT.NONE);
		emprestarButton.setBounds(28, 481, 135, 29);
		emprestarButton.setText("Emprestar Livro");
		emprestarButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
				String livroAEmprestar = list.getItem(list.getSelectionIndex());
				String identificador = livroAEmprestar.substring(livroAEmprestar.length() - 1);
				
				if (identificador.equals("#")) {
					statusLabel.setText("Livro: "+livroAEmprestar+"\nEmprestado por: "+nomeClienteText.getText()+"\nData devolucao: "
				+calendar.getDay()+ "/" + (calendar.getMonth() + 1) + "/"+ calendar.getYear()+
				"\nMulta: R$ "+(calendar.getDay() - dataDevolucao)+" reais.");
					if((calendar.getDay() - dataDevolucao) < 0){
						statusLabel.setText("Livro: "+livroAEmprestar+"\nEmprestado por: "+nomeClienteText.getText()+".\nData devolucao: "
								+calendar.getDay()+ "/" + (calendar.getMonth() + 1) + "/"+ calendar.getYear());
					}

				} else {
					if(nomeClienteText.getText().equals("")){
						statusLabel.setText("Primeiro insira o nome do cliente");
					}else{
					dataDevolucao = calendar.getDay();//usado p calcular a multa
					list.setItem(list.getSelectionIndex(), list.getItem(list.getSelectionIndex()) + "#");
					statusLabel.setText("Data de devolução " +dataDevolucao+ "/" + (calendar.getMonth() + 1) + "/"
							+ calendar.getYear());
					}
				}
				
			}
			
		});


		devolverButton = new Button(shell, SWT.NONE);
		devolverButton.setBounds(28, 578, 135, 29);
		devolverButton.setText("Devolver Livro");
		devolverButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
				String livroAEmprestar = list.getItem(list.getSelectionIndex());
				String identificador = livroAEmprestar.substring(livroAEmprestar.length() - 1);
				if (!identificador.equals("#")) {
					statusLabel.setText("Livro já está na estante");
				} else {
					String livroDevolucao = list.getItem(list.getSelectionIndex());
					String livro = livroDevolucao.substring(0, livroDevolucao.length() - 1);
					list.setItem(list.getSelectionIndex(), livro);
					if(dataDevolucao > calendar.getDay()){
						statusLabel.setText("Livro devolvido em " + calendar.getDay() + "/" + calendar.getMonth() + "/"
								+ calendar.getYear());
					}else{
						int multa = (calendar.getDay() - dataDevolucao);
						statusLabel.setText("Livro devolvido em " + calendar.getDay() + "/" + calendar.getMonth() + "/"
								+ calendar.getYear()+ " \nmulta de R$ "+multa+" reais.");
					}
				}
			}
		});
		
		if(viewType.equals("gerenteView")){
			nomeLivroNovoText = new Text(shell, SWT.BORDER);
			nomeLivroNovoText.setMessage("nome livro novo");
			nomeLivroNovoText.setBounds(28, 723, 212, 32);
			
			registrarButton = new Button(shell, SWT.NONE);
			registrarButton.setBounds(28, 681, 135, 34);
			registrarButton.setText("Registrar Livro");
			registrarButton.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseDown(MouseEvent e) {
					if(nomeLivroNovoText.getText().equals("")){
						statusLabel.setText("Primeiro insira o nome do livro");
					}else{
						list.add(nomeLivroNovoText.getText());
						statusLabel.setText("Novo livro registrado");
						nomeLivroNovoText.setText("");
					}
	
				}
					
			});
			
			removerButton = new Button(shell, SWT.NONE);
			removerButton.setBounds(179, 578, 138, 29);
			removerButton.setText("Remover Livro");
			removerButton.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseDown(MouseEvent e) {
					String remover = list.getItem(list.getSelectionIndex());
					String id = remover.substring(remover.length() - 1);
					System.out.println(id);
					if (id.equals("#")) {
						statusLabel.setText("O livro esta emprestado.\nNao pode ser removido !");
					}else{
						String livroADevolver = list.getItem(list.getSelectionIndex());
						list.remove(livroADevolver);
						statusLabel.setText("Livro removido !");
					}
	
				}
					
			});
		}
	}
}
