
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import OrderManager from "./components/OrderManager"

import 주문 from "./components/주문"
import DeliverManager from "./components/DeliverManager"


export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/orders',
                name: 'OrderManager',
                component: OrderManager
            },

            {
                path: '/주문',
                name: '주문',
                component: 주문
            },
            {
                path: '/delivers',
                name: 'DeliverManager',
                component: DeliverManager
            },




    ]
})
