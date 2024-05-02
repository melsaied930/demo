# demo

- echo "# demo" >> README.md
- git init
- git add README.md
- git commit -m "first commit"
- git branch -M main
- git remote add origin git@github.com:melsaied930/demo.git
- git push -u origin main

# Spring Boot Developer Tools and IntelliJ

- #### To Enable Auto Make
    - Press 'Command+,'
    - Go to IntelliJ IDEA / Preferences / Advanced Settings.
    - Check “Allow auto-make to start even if the developed application is currently running” under the “Compiler”
      section.
- #### To Enable Auto Build
    - Go to IntelliJ IDEA / Preferences and search for “compiler”.
    - Check “Build project automatically” and click “Apply”
    - In Menu / Build / Build Project (CTRL + F9)
      If the static files are not reloaded, press CTRL+F9 to force a reload.
- ### Intellij Registry
    - Press SHIFT+CTRL+A (Win/*nix) or 'Command+SHIFT+A' (Mac) to open a pop-up windows,
    - type registry
    - Find and enabled this option compiler.automake.allow.when.app.running

# Spring Boot Actuator

- http://localhost:8080/actuator
- http://localhost:8080/actuator/health

# Documenting a Spring REST API Using OpenAPI 3.0

- http://localhost:8080/swagger-ui/index.html
- http://localhost:8080/api-docs
- http://localhost:8080/api-docs.yaml
- http://localhost:8080/actuator/metrics

