import * as types from './mutatioin-types'

export default {
  [types.CHANGE_HEADER] (state,payload) {
    state.showHeader=payload.showHeader;
    state.title=payload.title;
  }
}