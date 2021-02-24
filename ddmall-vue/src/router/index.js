import Vue from 'vue'
import Router from 'vue-router'
import tabbarHome from '@/views/home/tabbar-home'

Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/',
      name: 'tabbarHome',
      component: tabbarHome
    }
  ]
})
