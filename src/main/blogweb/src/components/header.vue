<template>
  <header>
    <div class="headerTop">
      <div class="headerContent">
        <Row type="flex" justify="center">
          <i-col :lg="5" :md="5" :sm="5" :xs="5">
            <h2>
              <a href="#">博客后台管理</a>
            </h2>
          </i-col>
          <i-col :lg="12" :md="12" :sm="12" :xs="12">

          </i-col>
          <i-col :lg="6" :md="6" :sm="6" :xs="6">
            <Row type="flex" justify="center" class="logiInformation">
              <i-col :lg="6" :md="6" :sm="6" :xs="6">
                <div>
                  <Icon type="ios-contacts" color="antiquewhite" size="15"/>在线:
                  <a>{{onlineNumber}}</a>
                </div>
              </i-col>
              <i-col :lg="7" :md="7" :sm="7" :xs="7">
                <div>
                  
                  <a> 
                    <Icon type="md-person" color="antiquewhite" size="15"/>
                    {{logPerson}}
                  </a>
                </div>
              </i-col>
              <i-col :lg="5" :md="5" :sm="5" :xs="5">
                <div>
                  <Icon type="md-exit" color="antiquewhite" size="15"/>
                  <a>退出</a>
                </div>
              </i-col>
              <i-col :lg="5" :md="5" :sm="5" :xs="5">
                <div>
                  <Icon type="md-settings" color="antiquewhite" size="15"/>
                  <a>设置</a>
                </div>
              </i-col>
            </Row>
          </i-col>
        </Row>
      </div>
    </div>
  </header>
</template>
<script>
export default {
  data() {
    return {
      onlineNumber: 5,
      logPerson: "我保佑你"
    };
  }
};
</script>
<style scoped>
header {
  margin-bottom: 10px;
}
/* header::before {
    background: #000 linear-gradient(to left, #4cd964, #5ac8fa, #007aff, #34aadc, #5856d6, #ff2d55);
    content: "";
    height: 5px;
    position: absolute;
    top: 0;
    width: 100%;
} */
.headerTop {
  height: 35px;
  line-height: 35px;
  background: #3399ff;
}
.logiInformation .ivu-col[data-v-29e8c3c6] > div {
  text-align: center;
  color: white;
}
</style>