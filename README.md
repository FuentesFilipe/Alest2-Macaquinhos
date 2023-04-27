# Alest2-Macaquinhos

# Trabalho 1 da disciplina de Algoritmos e Estrutuda de Dados II, PUCRS.

Segue o enunciado:

# Os macaquinhos
Seu primo antropólogo e explorador da selva voltou contando histórias de seis meses observando macaquinhos em seu habitat natural. Ele descobriu que os macaquinhos são bem espertos (eles sabem a diferença entre par e ímpar, por exemplo) e adoram brincadeiras coletivas. Seu primo conta que eles tem uma versão primitiva de bingo que preenche tardes de brincadeira: eles enchem côcos com pedrinhas e de acordo com quantas pedrinhas estão dentro do côco, jogam o côco para este ou aquele macaquinho. Seu primo dá mais alguns detalhes:
 	Existem muitos macaquinhos;
 	Cada macaquinho enche seus côcos com pedrinhas, quantos côcos quiser e com quantas pedrinhas quiser; e Cada macaquinho sabe para quem tem que mandar um côco com número par de pedrinhas;   E é claro que também sabe para quem mandar os côcos com pedrinhas ímpares;
 	Uma rodada começa com o macaquinho O distribuindo todos os seus côcos, depois o macaquinho 1, depois 0 2 e assim por diante até o último macaquinho. Um côco pode fazer várias viagens entre macaquinhos em uma só rodada.
 	Depois de fazer um número enorme de rodadas, o macaquinho que tiver mais côcos é eleito o campeão do bando por uma semana, recebendo atenções especiais.
Agora você deve ler vários arquivos descrevendo as situações iniciais de côcos e macaquinhos e simular o jogo, informando qual o macaquinho vencedor. Felizmente os arquivos que descrevem o comportamento dos clientes são bem simples!
	
	Fazer 10000 rodadas
	Macaco 0 par -> 4 impar -> 3 : 11 :  178 84 1 111 159 22 54 132 201 51 44
	Macaco 1 par -> 0 impar -> 5 : 9 :  80 82 10 83 98 31 56 84 53
	Macaco 2 par -> 3 impar -> 4 : 7 :  65 194 35 132 191 202 62
	Macaco 3 par -> 0 impar -> 4 : 3 :  121 10 162
	Macaco 4 par -> 0 impar -> 5 : 5 :  16 110 125 113 35
	Macaco 5 par -> 2 impar -> 0 : 8 :  120 25 20 134 166 100 157 159

Acima está um dos arquivos para simulação de 6 macaquinhos: a primeira informação é o número de rodadas desejado, e depois cada linha contém a identificação do macaquinho e para quem ele vai mandar os côcos em caso par ou ímpar. Logo depois um número identifica quantos côcos o macaquinho tem no início do jogo e quantas pedrinhas tem em cada um deles. Então, o macaquinho 3 deve mandar côcos com número par de pedrinhas para o macaquinho 0 e com pedrinhas ímpares para o macaquinho 4. Ele inicia o jogo com apenas 3 côcos.
Agora que seu simulador está pronto você decidiu colocar suas ideias e descobertas em um relatório para mandar aos antropólogos da região e oferecer consultoria.
