<template>
    <div class="container">
      <div class="row">
        <div class="col-lg-12 col-12">
          <div class="contact-form-wrap">
            <form id="contact-form" action="#" method="post">
                <div class="single-contact-form space-between">
                    <input type="text" name="nome" placeholder="Título*">
                </div>
                <div class="single-contact-form space-between">
                  <select class="form-select" name="tipo_produto">
                    <option>Tipo de produto</option>
                    <option>Material escolar</option>
                    <option>Uniforme escolar</option>
                  </select>
                  <select class="form-select" name="estado_conservacao">
                    <option>Estado de conservação</option>
                    <option>Novo</option>
                    <option>Usado</option>
                  </select>									
                </div>
                <div class="single-contact-form space-between">
                  <textarea name="descricao" placeholder="Descrição"></textarea>
                </div>
                <div class="single-contact-form space-between">
                  <select class="form-select" name="nome_escola">
                    <option>Nome da Escola</option>
                    <option>Alfa Objetivo</option>
                    <option>Colégio Municipal Maria Luiza de Melo</option>
                    <option>Dom Jaime</option>
                    <option>E.E.B Prof. Laércio Caldeira de Andrada</option>
                  </select>	
                  </div>								
                  <div class="single-contact-form space-between">
                    <input type="text" name="valor" placeholder="Valor*">			
                    <input type="text" name="tamanho" placeholder="Tamanho*">
                  </div>	
                  <div class="single-contact-form space-between">
                    <select class="form-select" name="status_anuncio">
                      <option>Status do anúncio</option>
                      <option>Aberto</option>
                      <option>Finalizado</option>
                      <option>Cancelado</option>
                    </select>
                    <input type="text" name="data_expiracao" placeholder="Anúncio expira em*">
                  </div>	
                  <div class="single-contact-form space-between">
                    <input type="file" name="anexo1">
                    <input type="file" name="anexo1">
                  </div>	
                </form>
            </div> 
        </div>
      </div>
    </div>
</template>

<script>
export default {
  name: 'FormProduct',
  props: {
    msg: String
  }
}
</script>

<style scoped>

</style>
