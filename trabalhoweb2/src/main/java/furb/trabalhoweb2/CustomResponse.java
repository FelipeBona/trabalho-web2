package furb.trabalhoweb2;

// A classe CustomResponse é usada para encapsular uma resposta customizada, contendo um status e uma mensagem.
public class CustomResponse {
    // Variável que armazena o status da resposta.
    private String status;
    
    // Variável que armazena a mensagem da resposta.
    private String mensagem;

    // Construtor que inicializa os atributos status e mensagem.
    public CustomResponse(String status, String mensagem) {
        this.status = status;
        this.mensagem = mensagem;
    }

    // Método getter para obter o valor do status.
	public String getStatus() {
		return status;
	}

    // Método setter para definir o valor do status.
	public void setStatus(String status) {
		this.status = status;
	}

    // Método getter para obter o valor da mensagem.
	public String getMensagem() {
		return mensagem;
	}

    // Método setter para definir o valor da mensagem.
	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
    
    // Getters e Setters (já inclusos acima)
}

//Este código define uma classe simples chamada CustomResponse,
//que contém dois atributos (status e mensagem) com seus respectivos métodos getters e setters. 
//O construtor é usado para inicializar esses atributos quando uma nova instância da classe é criada.
