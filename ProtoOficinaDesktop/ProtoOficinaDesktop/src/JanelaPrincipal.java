//obs: o import deve ser feito antes da classe!!!
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class JanelaPrincipal extends JFrame{

    // Lista para armazenar os registros temporariamente
    private ArrayList<String> registros = new ArrayList<>();

    // Componentes
    private JTextField tfNome;
    private JTextField tfCarro;
    private JTextField tfServico;
    private JButton btnCadastrar;
    private JTextArea taRegistros;

    public JanelaPrincipal(){
        setTitle("Oficina Elétrica - Registro de serviços");
        setSize(600, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); //centraliza janela

        //layout básico
        setLayout(new BorderLayout());

        //painel de formulário no topo
        JPanel painelFormulario = new JPanel();
        painelFormulario.setLayout(new GridLayout(4, 2, 5, 5));

        //campos e labels
        painelFormulario.add(new JLabel("Nome do Cliente:"));
        tfNome = new JTextField();
        painelFormulario.add(tfNome);

        painelFormulario.add(new JLabel("Carro (Modelo/Placa):"));
        tfCarro = new JTextField();
        painelFormulario.add(tfCarro);

        painelFormulario.add(new JLabel("Serviço desejado:"));
        tfServico = new JTextField();
        painelFormulario.add(tfServico);

        btnCadastrar = new JButton("Cadastrar");
        painelFormulario.add(btnCadastrar);

        // espaço vazio pra alinhar o grid
        painelFormulario.add(new JLabel());

        add(painelFormulario, BorderLayout.NORTH);

        // Área para mostrar registros
        taRegistros = new JTextArea();
        taRegistros.setEditable(false);
        JScrollPane scroll = new JScrollPane(taRegistros);
        add(scroll, BorderLayout.CENTER);

        // Listener do botão
        btnCadastrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cadastrar();
            }
        });
    }

    // Método para cadastrar
    private void cadastrar() {
        String nome = tfNome.getText();
        String carro = tfCarro.getText();
        String servico = tfServico.getText();

        if (nome.isEmpty() || carro.isEmpty() || servico.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Preencha todos os campos!", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String registro = "CLIENTE: " + nome + "\n" + "CARRO: " + carro + "\n" + "SERVIÇO: " + servico + "\n";
        registros.add(registro);

        // Atualiza a área de registros
        taRegistros.setText(String.join("\n", registros));

        // Limpa os campos
        tfNome.setText("");
        tfCarro.setText("");
        tfServico.setText("");
    }

}
