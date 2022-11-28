import axios from "axios";
import config from "../config.json";

// let authToken = localStorage.getItem('token');
// let header = {'Token': authToken};

// export const GetBooks = (post) => {
//     return axios.post(config.baseURL + `calendar/addCalendarEvent/`, post, { 
//         headers: header})
// }

export const GetBooks = () => {
    return axios.get(config.baseURL + `livre`)
}

export const GetGenre = () => {
    return axios.get(config.baseURL + `genre`)
}