import { createStore } from 'vuex'
import router from '@/router'

export default createStore({
  state: {
  },
  getters: {
    GET_TOKEN:state => {
      return sessionStorage.getItem("token")
    },
    GET_MENULIST:state => {
      return JSON.parse(sessionStorage.getItem("menuList"));
    },
    GET_USERINFO:state => {
      return JSON.parse(sessionStorage.getItem("userInfo"));
    }
  },
  mutations: {
    SET_TOKEN:(state,token)=>{
      sessionStorage.setItem("token",token);
    },
    SET_MENULIST:(state,menuList)=>{
      sessionStorage.setItem("menuList",JSON.stringify(menuList));
    },
    SET_USERINFO:(state,userInfo)=>{
      sessionStorage.setItem("userInfo",JSON.stringify(userInfo));
    },
  },
  actions: {
    // 安全退出
    logout(){
      window.sessionStorage.clear();
      router.replace("/login")
    }
  },
  modules: {
  }
})
