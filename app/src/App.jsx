import "./App.css";
import { BrowserRouter, Route, Routes } from "react-router-dom";
import GetHomeController from "./controller/home/GetHomeController";
import GetCartController from "./controller/cart/GetCartController";
import GetRegisterController from "./controller/register/GetRegisterController";
import GetLoginController from "./controller/login/GetLoginController";

function App() {
    return (
        <BrowserRouter>
            <Routes>
                <Route path='/' element={<GetHomeController />} />
                <Route path='/cart' element={<GetCartController />} />
                <Route path='/register' element={<GetRegisterController />} />
                <Route path='/login' element={<GetLoginController />} />
            </Routes>
        </BrowserRouter>
    );
}

export default App;
