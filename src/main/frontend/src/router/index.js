import { createRouter, createWebHistory } from 'vue-router'

const router = createRouter({
    history: createWebHistory(import.meta.env.BASE_URL),
    routes: [
      {
        path: '/',
        name: 'landingPage',
        component: () => import('../views/LandingView.vue'),
      },
      {
        path: '/home',
        name: 'home',
        component: () => import('../views/DashboardView.vue'),
      },
      {
        path: '/addanimal',
        name: 'addanimal',
        component: () => import('../views/FormNewAnimal.vue')
      }
    ]
})

export default router