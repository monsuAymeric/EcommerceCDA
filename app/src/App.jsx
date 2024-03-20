import "./App.css";
import { BrowserRouter, Route, Routes } from "react-router-dom";
import GetHomeController from "./controller/home/GetHomeController";
import GetCartController from "./controller/cart/GetCartController";
import GetRegisterController from "./controller/register/GetRegisterController";
import GetLoginController from "./controller/login/GetLoginController";
import GetAdminController from "./controller/admin/GetAdminController";
import GetReferenceFormController from "./controller/admin/GetReferenceFormController";

function App() {
    return (
        <BrowserRouter>
            <Routes>
                <Route path='/' element={<GetHomeController />} />
                <Route path='/cart' element={<GetCartController />} />
                <Route path='/register' element={<GetRegisterController />} />
                <Route path='/login' element={<GetLoginController />} />
                <Route path='/admin' element={<GetAdminController />} />
                <Route path='/refForm/' element={<GetReferenceFormController />} />
                <Route path='/refForm/:id' element={<GetReferenceFormController />} />
            </Routes>
        </BrowserRouter>
    );
}

export default App;
