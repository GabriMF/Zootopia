import { createApp } from 'vue'
import App from './App.vue'
// import router from './router'
import vuetify from './plugins/vuetify'
import { loadFonts } from './plugins/webfontloader'
import { createPinia } from 'pinia'

loadFonts()

const app = createApp(App)
  app.use(createPinia())
  .use(vuetify)
  //app.use(router)
  app.mount('#app')
  import './sass/styles.scss'
