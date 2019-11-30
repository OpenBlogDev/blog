<template>
	<div class="home">
		<v-title title="Vue 组件 化"></v-title>
		<v-button @click="handleClick">点击按钮</v-button>
		
	</div> 
</template> 
<script> 
// 导入 组件 
import vTitle from '../vue/title.vue'; 
import vButton from '../vue/button.vue'; 

export default { 
	components: { 
		vTitle, 
		vButton,
	}, 
	methods: { 
		handleClick(e) { 
			console.log(e);
		} 
	}
} 
</script>


