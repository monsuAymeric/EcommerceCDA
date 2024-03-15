import "./App.css";
import { BrowserRouter, Route, Routes } from "react-router-dom";
import GetHomeController from "./controller/home/GetHomeController";
import GetCartController from "./controller/cart/GetCartController";

function App() {
    return (
        <BrowserRouter>
            <Routes>
                <Route path='/' element={<GetHomeController />} />
                <Route path='/cart' element={<GetCartController />} />
            </Routes>
        </BrowserRouter>
    );
}

export default App;
