<template>
  <div id="app">
      <headers></headers>
      <contents></contents>
      <!-- <footers></footers>      -->
  </div>
</template>

<script>
import headers from './components/header';
import footers from './components/footer';
import contents from './components/content'
export default {
  name: 'App',
  components:{
    'headers':headers,
    'footers':footers,
    'contents':contents,

  }
}
</script>
<style>
body{
  background-color: #f5f7f9;
}
a{
  color: #f5f7f9;
}
a:hover {
  color: aqua;
}
</style>
<style scoped>


</style>
