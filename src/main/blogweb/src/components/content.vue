<template>
  <section :style="{display:'flex',height:'700px'}">
    <asides></asides>
    <sections></sections>
  </section>
</template>
<script>
import asides from "./aside";
import sections from "./section";
export default {
  data() {
    return {
     
    };
  },
  components: {
    'asides': asides,
    'sections': sections
  }
}
</script>
<style scoped>

</style>