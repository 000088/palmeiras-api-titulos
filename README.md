# palmeiras-api-titulos

# API de consultas dos títulos do Palmeiras
 Consta todos os títulos relevantes do Palmeiras, a partir de 1920 até o período atual.

# ACESSANDO OS ENDPOINTS
 URL incial : https://palmeiras-titulos.herokuapp.com/palmeiras
 
 #Lista todos os títulos relevantes conquistados pelo Palmeiras
  https://palmeiras-titulos.herokuapp.com/palmeiras/listaTitulos
  
  #Lista todos os títulos por categoria (nacional, estadual, interestadual, internacional).

  exemplo: https://palmeiras-titulos.herokuapp.com/palmeiras/titulos/categoria/internacional
  
  #Lista todos os títulos do ano escolhido.

  exemplo: https://palmeiras-titulos.herokuapp.com/palmeiras/titulos/ano/1993
  
  #Lista todos os títulos vencidos até o ano escolhido.

  exemplo:https://palmeiras-titulos.herokuapp.com/palmeiras/titulosVencidos/ate/1990
  
  #Lista todos os títulos vencidos a partir do ano escolhido.

  exemplo:https://palmeiras-titulos.herokuapp.com/palmeiras/titulosVencidos/apartir/1960
  
  #Lista todos os títulos vencidos entre anos diferentes.

  exemplo:https://palmeiras-titulos.herokuapp.com/palmeiras/titulosVencidos/entre/1950/1975
  
  #Retorna quantidade de títulos vencidos por categoria escolhida.

  #exemplo: https://palmeiras-titulos.herokuapp.com/palmeiras/qtdTitulos/categoria/nacional
