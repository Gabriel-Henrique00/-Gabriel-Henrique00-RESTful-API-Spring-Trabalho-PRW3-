API de Consertos de Carros
Esta API foi desenvolvida para gerenciar consertos de carros, oferecendo operações CRUD (Criar, Ler, Atualizar, Deletar) para os consertos.
Endpoints
1. Login
POST /login
Realiza o login do usuário e retorna um token JWT em caso de sucesso.

2. Consertos
POST /consertos
Cria um novo conserto.

GET /consertos
Lista todos os consertos.

GET /consertos/{id}
Exibe detalhes de um conserto específico.

PUT /consertos
Atualiza as informações de um conserto existente.

DELETE /consertos/{id}
Deleta um conserto específico/desativa.
