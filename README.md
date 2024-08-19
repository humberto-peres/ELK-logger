# 📜 Implementação de Programa com Registro de Logs

## 🔗 Relatório

[Ferramenta de visualizacao de logs (ELK).pdf](https://github.com/user-attachments/files/16653933/Ferramenta.de.visualizacao.de.logs.ELK.pdf)

## 🛠️ Descrição do Projeto

Este projeto consiste em um sistema de logging que permite o monitoramento e rastreamento de atividades em um aplicativo. O objetivo é fornecer logs informativos, de aviso e de erro para ajudar na análise e solução de problemas.

## 🔧 Funcionalidades

- **Página Inicial**: Registro de acesso à página inicial.
- **Página de Logs**: Registro de visualização da página de logs.
- **Página de Avisos**: Registro de acessos à página de avisos com alertas sobre possíveis problemas.
- **Página de Erros**: Registro de acessos à página de erros para identificar falhas críticas.
- **Processo de Login**: Simulação de um processo de login com logs detalhados sobre a entrada do usuário, validação de senha e mensagens informativas.

## 📈 Exemplos de Logs

### Página Inicial

```java
log.info("Página inicial acessada em {} - O usuário está na página inicial.", localDateTime);
```

### Página de Logs

```java
log.info("Página de logs acessada em {} - O usuário está visualizando os logs.", localDateTime);
```

### Página de Avisos

```java
log.warn("Página de aviso acessada em {} - Atenção: possivelmente há problemas na aplicação.", localDateTime);
```

### Página de Erros

```java
log.error("Página de erro acessada em {} - Erro crítico: verifique os detalhes do sistema.", localDateTime);
```

### Processo de Login

```java
log.info("Início do processo de login em {}", localDateTime);

if (name.isEmpty()) {
    log.error("Nenhum nome de usuário foi fornecido.");
} else {
    log.info("Senha válida fornecida.");
}
```

<h2 align="center"> 🧑🏻‍💻Desenvolvedores</h2>
<table align="center">
  <tr>
    <td align="center"><a href="https://rocketseat.com.br"><img style="border-radius: 50%;" src="https://avatars.githubusercontent.com/u/118866895?s=400&u=a12412e21705d58ab604be67c1e1431c80174b64&v=4" width="100px;" alt=""/><br /><sub><b>Humberto Peres da Rocha Filho</b></sub></a><br /><a href="https://rocketseat.com.br/" title="Rocketseat"></a></td>
    <td align="center"><a href="https://rocketseat.com.br"><img style="border-radius: 50%;" src="https://avatars.githubusercontent.com/u/119978954?v=4" width="100px;" alt=""/><br /><sub><b>Leandro Pellegrini Fodi</b></sub></a><br /><a href="https://rocketseat.com.br/" title="Rocketseat"></a></td>
  </tr>
</table>
