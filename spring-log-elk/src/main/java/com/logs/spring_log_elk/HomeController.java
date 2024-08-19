package com.logs.spring_log_elk;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.Scanner;

@RestController
@Slf4j
public class HomeController {

    @GetMapping("/")
    public String HomePage() {
        LocalDateTime localDateTime = LocalDateTime.now();
        log.info("Página inicial acessada em {} - O usuário está na página inicial.", localDateTime);
        return "Bem-vindo à página inicial";
    }

    @GetMapping("/logs")
    public String LogsPage() {
        LocalDateTime localDateTime = LocalDateTime.now();
        log.info("Página de logs acessada em {} - O usuário está visualizando os logs.", localDateTime);
        return "Bem-vindo à página de logs";
    }

    @GetMapping("/warn")
    public String WarnPage() {
        LocalDateTime localDateTime = LocalDateTime.now();
        log.warn("Página de aviso acessada em {} - Atenção: possivelmente há problemas na aplicação.", localDateTime);
        return "Bem-vindo à página de aviso";
    }

    @GetMapping("/er")
    public String ErrorPage() {
        LocalDateTime localDateTime = LocalDateTime.now();
        log.error("Página de erro acessada em {} - Erro crítico: verifique os detalhes do sistema.", localDateTime);
        return "Bem-vindo à página de erro";
    }

    @GetMapping("/login")
    public String LoginPage() {
        LocalDateTime localDateTime = LocalDateTime.now();
        log.info("Início do processo de login em {}", localDateTime);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite seu usuário: ");
        String name = scanner.nextLine();

        if (name.isEmpty()) {
            log.error("Nenhum nome de usuário foi fornecido.");
        } else {
            String password = "";

            while (password.length() < 5 || password.chars().allMatch(Character::isDigit)) {
                System.out.print("Digite sua senha com no mínimo 5 caracteres: ");
                password = scanner.nextLine();

                if (password.length() < 5) {
                    log.warn("A senha fornecida é muito curta.");
                } else if (password.chars().allMatch(Character::isDigit)) {
                    log.warn("Usuário utilizando uma senha padrão somente com números!");
                } else {
                    log.info("Senha válida fornecida.");
                    break;
                }
            }
            log.info("O usuário fez login com sucesso.");
        }
        return "Login processado com sucesso";
    }
}
