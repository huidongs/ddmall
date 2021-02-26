// The Vue build version to load with the `import` command
// (runtime-only or standalone) has been set in webpack.base.conf with an alias.
import Vue from 'vue';
import App from './App.vue';
import router from './router';
import 'vant/lib/icon/local.css';
import '@/assets/scss/global.scss';
import '@/assets/scss/iconfont/iconfont.css';

import VueCountdown from '@chenfengyuan/vue-countdown';
import store from './store'


import filters from '@/filter';

Vue.component(VueCountdown.name, VueCountdown);
Vue.use(filters);


import { Lazyload, Icon, Cell, CellGroup, loading, Button, Toast } from 'vant';
Vue.use(Icon);
Vue.use(Cell);
Vue.use(CellGroup);
// Vue.use(loading);
Vue.use(Button);
Vue.use(Toast);
Vue.use(Lazyload, {
  preLoad: 1.3,
  error: require('@/assets/images/goods_default.png'),
  loading: require('@/assets/images/goods_default.png'),
  attempt: 1,
  listenEvents: ['scroll'],
  lazyComponent: true
});


Vue.config.productionTip = false;
/* Vue 的$mount()为手动挂载，在项目中可用于延时挂载（例如在挂载之前要进行一些其他操作、判断等），之后要手动挂载上。new Vue时，el和$mount并没有本质上的不同。*/

new Vue({
  router,
  store,
  render: h => h(App)
}).$mount('#app');

