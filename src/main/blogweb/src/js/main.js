import '../css/main.css'
//main.js文件改成:
//导入Vue
import Vue from "vue";
//导入首页
import Main from "../vue/main.vue"
new Vue({
    el:"#app",
    render:h=>h(Main)
})

