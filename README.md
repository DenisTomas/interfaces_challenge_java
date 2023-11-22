# interfaces_college_challenge_java

Este projeto simples implementa uma interface em Java para avaliar o desempenho dos alunos com base em suas notas. A classe `CadastroNota` realiza a avaliação e retorna o conceito correspondente com base nas notas fornecidas.

This simple project implements a Java interface to assess student performance based on their grades. The `CadastroNota` class performs the evaluation and returns the corresponding grade based on the provided grades.

## 🚀 Como Usar / How to Use

1. Clone este repositório para sua máquina local. / Clone this repository to your local machine.

2. Abra o projeto em seu ambiente de desenvolvimento Java. / Open the project in your Java development environment.

3. Execute a classe `Main` para interagir com o programa. / Run the `Main` class to interact with the program.

   **Instruções de Execução / Execution Instructions:**
   - Ao executar a aplicação, você será solicitado a inserir a nota do aluno. / When running the application, you will be prompted to enter the student's grade.
   - Insira a nota e clique em OK. / Enter the grade and click OK.
   - O programa calculará automaticamente o conceito e exibirá uma mensagem com o resultado. / The program will automatically calculate the grade and display a message with the result.

   **Exemplo de Execução / Example of Execution:**
   ```plaintext
   Insira a nota do aluno: [insira a nota aqui] / Enter the student's grade: [enter the grade here]
   [Mensagem de Resultado]: [Conceito correspondente] / [Result Message]: [Corresponding Grade]

## ⚙️ Estrutura do Código / Code Structure

### `ConceitoAluno` (Interface) / `GradeConcept` (Interface)

- Define constantes de conceitos para diferentes níveis de desempenho do aluno. / Defines constants of concepts for different levels of student performance.

### `CadastroNota` (Classe) / `GradeRegistration` (Class)

- Implementa a interface `ConceitoAluno`. / Implements the `GradeConcept` interface.
- Avalia a nota fornecida e retorna o conceito correspondente. / Evaluates the provided grade and returns the corresponding concept.

### `Main` (Classe) / `Main` (Class)

- Classe principal que interage com o usuário. / Main class that interacts with the user.
- Cria uma instância de `CadastroNota`. / Creates an instance of `GradeRegistration`.
- Solicita a entrada da nota do aluno via caixa de diálogo. / Requests input of the student's grade via a dialog box.
- Exibe o conceito calculado em uma mensagem de diálogo. / Displays the calculated concept in a dialog message.

## 🤝 Contribuições / Contributions

Contribuições para este projeto são bem-vindas. Se você tiver sugestões de melhoria ou encontrar algum problema, por favor, abra uma issue. / Contributions to this project are welcome. If you have suggestions for improvement or encounter any issues, please open an issue.

## 📝 Licença / License

Este projeto é licenciado sob a Licença MIT. / This project is licensed under the MIT License.

👤 Autor / Author

Este projeto foi criado por Denis Tomás. / This project was created by Denis Tomás.
